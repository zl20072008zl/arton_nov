//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.10.28 时间 03:38:23 PM EDT
//


package com.somoplay.artonexpress.ups.shipping.ShipConfirmRequest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PackageServiceOptionsNotificationType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="PackageServiceOptionsNotificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NotificationCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="EMailMessage" type="{}PackageServiceOptionsNotificationEMailMessageType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackageServiceOptionsNotificationType", propOrder = {
    "notificationCode",
    "eMailMessage"
})
public class PackageServiceOptionsNotificationType {

    @XmlElement(name = "NotificationCode", required = true)
    protected String notificationCode;
    @XmlElement(name = "EMailMessage", required = true)
    protected PackageServiceOptionsNotificationEMailMessageType eMailMessage;

    /**
     * 获取notificationCode属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNotificationCode() {
        return notificationCode;
    }

    /**
     * 设置notificationCode属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNotificationCode(String value) {
        this.notificationCode = value;
    }

    /**
     * 获取eMailMessage属性的值。
     *
     * @return
     *     possible object is
     *     {@link PackageServiceOptionsNotificationEMailMessageType }
     *
     */
    public PackageServiceOptionsNotificationEMailMessageType getEMailMessage() {
        return eMailMessage;
    }

    /**
     * 设置eMailMessage属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link PackageServiceOptionsNotificationEMailMessageType }
     *
     */
    public void setEMailMessage(PackageServiceOptionsNotificationEMailMessageType value) {
        this.eMailMessage = value;
    }

}
