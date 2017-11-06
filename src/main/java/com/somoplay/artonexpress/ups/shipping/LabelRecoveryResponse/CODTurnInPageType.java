//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.10.28 时间 03:38:22 PM EDT
//


package com.somoplay.artonexpress.ups.shipping.LabelRecoveryResponse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CODTurnInPageType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="CODTurnInPageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Image" type="{}ImageType2"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CODTurnInPageType", propOrder = {
    "image"
})
public class CODTurnInPageType {

    @XmlElement(name = "Image", required = true)
    protected ImageType2 image;

    /**
     * 获取image属性的值。
     *
     * @return
     *     possible object is
     *     {@link ImageType2 }
     *
     */
    public ImageType2 getImage() {
        return image;
    }

    /**
     * 设置image属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link ImageType2 }
     *
     */
    public void setImage(ImageType2 value) {
        this.image = value;
    }

}
