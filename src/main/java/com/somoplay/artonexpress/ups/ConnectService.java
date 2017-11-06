package com.somoplay.artonexpress.ups;

import com.somoplay.artonexpress.ups.access.AccessRequest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by limingyang on 2017/10/28.
 */
public class ConnectService {
    public static String contactService(String xmlInputString, String endpoint_url) throws Exception {
        String outputStr = null;
        OutputStream outputStream = null;
        try {

            URL url = new URL(endpoint_url);

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            System.out.println("Client established connection with " + url.toString());
            // Setup HTTP POST parameters
            connection.setDoOutput(true);
            connection.setDoInput(true);
            connection.setUseCaches(false);

            outputStream = connection.getOutputStream();
            outputStream.write(xmlInputString.getBytes());
            outputStream.flush();
            outputStream.close();
            System.out.println("Http status = " + connection.getResponseCode() + " " + connection.getResponseMessage());

            outputStr = readURLConnection(connection);
            connection.disconnect();
//            System.out.println("outputStr:"+ outputStr);
        } catch (Exception e) {
            System.out.println("Error sending data to server");
            throw e;
        } finally {
            if (outputStream != null) {
                outputStream.close();
                outputStream = null;
            }
        }
        return outputStr;
    }

    public static String readURLConnection(URLConnection uc) throws Exception {
        StringBuffer buffer = new StringBuffer();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(uc.getInputStream()));
            int letter = 0;
            while ((letter = reader.read()) != -1) {
                buffer.append((char) letter);
            }
            reader.close();
        } catch (Exception e) {
            System.out.println("Could not read from URL: " + e.toString());
            throw e;
        } finally {
            if (reader != null) {
                reader.close();
                reader = null;
            }
        }
        return buffer.toString();
    }

    public static void populateAccessRequest(AccessRequest accessRequest){
        accessRequest.setAccessLicenseNumber("2D0E8F7B97F312C8");
        accessRequest.setUserId("lmywilks");
        accessRequest.setPassword("Lmy121314");
    }
}
