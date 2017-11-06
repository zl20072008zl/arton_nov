package com.somoplay.artonexpress.canadapost;

import ca.canadapost.cpcdp.ncshipping.generated.messages.Messages;
import com.sun.jersey.api.client.ClientResponse;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.IOUtils;

import javax.xml.bind.JAXBContext;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Iterator;

/**
 * Created by limingyang on 2017/10/31.
 */
public class CpLabel {
    private CpService cpService = new CpService();
    private String stream;

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public void getLabel(String link) {
        ClientResponse resp = cpService.getArtifact(link);
        InputStream respIS = resp.getEntityInputStream();

        try {
            String mediaStr = resp.getType().toString();

            if ( mediaStr.contains("application/pdf") ) {
                // Writing binary response to file

                byte[] imageBytes = IOUtils.toByteArray(respIS);
                respIS.read(imageBytes, 0, imageBytes.length);
                respIS.close();
                String imageStr = Base64.encodeBase64String(imageBytes);
                setStream(imageStr);

            }  else {
                // Example of using JAXB to parse xml error response
                JAXBContext jc;
                jc = JAXBContext.newInstance(Messages.class);
                Object entity = jc.createUnmarshaller().unmarshal(respIS);

                Messages messageData = (Messages) entity;
                for (Iterator<Messages.Message> iter = messageData.getMessage().iterator(); iter.hasNext();) {
                    Messages.Message aMessage = (Messages.Message) iter.next();
                    System.out.println("Error Code: " + aMessage.getCode());
                    System.out.println("Error Msg: " + aMessage.getDescription());
                }
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        cpService.close();
    }
}
