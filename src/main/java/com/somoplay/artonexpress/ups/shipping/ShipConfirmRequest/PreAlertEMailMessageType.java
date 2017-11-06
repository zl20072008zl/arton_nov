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
 * <p>PreAlertEMailMessageType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="PreAlertEMailMessageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EMailAddress" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="UndeliverableEMailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PreAlertEMailMessageType", propOrder = {
    "eMailAddress",
    "undeliverableEMailAddress"
})
public class PreAlertEMailMessageType {

    @XmlElement(name = "EMailAddress", required = true)
    protected String eMailAddress;
    @XmlElement(name = "UndeliverableEMailAddress")
    protected String undeliverableEMailAddress;

    /**
     * 获取eMailAddress属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEMailAddress() {
        return eMailAddress;
    }

    /**
     * 设置eMailAddress属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEMailAddress(String value) {
        this.eMailAddress = value;
    }

    /**
     * 获取undeliverableEMailAddress属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUndeliverableEMailAddress() {
        return undeliverableEMailAddress;
    }

    /**
     * 设置undeliverableEMailAddress属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUndeliverableEMailAddress(String value) {
        this.undeliverableEMailAddress = value;
    }

}
