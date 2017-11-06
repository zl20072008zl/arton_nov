//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.10.28 时间 03:38:22 PM EDT
//


package com.somoplay.artonexpress.ups.shipping.LabelRecoveryRequest;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}Request"/&gt;
 *         &lt;element name="LabelSpecification" type="{}LabelSpecificationType" minOccurs="0"/&gt;
 *         &lt;element name="Translate" type="{}TranslateType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LabelDelivery" type="{}LabelDeliveryType" minOccurs="0"/&gt;
 *         &lt;element name="MailInnovationsTrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="TrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="ReferenceNumber" type="{}ReferenceNumberType"/&gt;
 *             &lt;element name="ShipperNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;/sequence&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "request",
    "labelSpecification",
    "translate",
    "labelDelivery",
    "mailInnovationsTrackingNumber",
    "trackingNumber",
    "referenceNumber",
    "shipperNumber"
})
@XmlRootElement(name = "LabelRecoveryRequest")
public class LabelRecoveryRequest {

    @XmlElement(name = "Request", required = true)
    protected Request request;
    @XmlElement(name = "LabelSpecification")
    protected LabelSpecificationType labelSpecification;
    @XmlElement(name = "Translate")
    protected List<TranslateType> translate;
    @XmlElement(name = "LabelDelivery")
    protected LabelDeliveryType labelDelivery;
    @XmlElement(name = "MailInnovationsTrackingNumber")
    protected String mailInnovationsTrackingNumber;
    @XmlElement(name = "TrackingNumber")
    protected String trackingNumber;
    @XmlElement(name = "ReferenceNumber")
    protected ReferenceNumberType referenceNumber;
    @XmlElement(name = "ShipperNumber")
    protected String shipperNumber;

    /**
     * 获取request属性的值。
     *
     * @return
     *     possible object is
     *     {@link Request }
     *
     */
    public Request getRequest() {
        return request;
    }

    /**
     * 设置request属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Request }
     *
     */
    public void setRequest(Request value) {
        this.request = value;
    }

    /**
     * 获取labelSpecification属性的值。
     *
     * @return
     *     possible object is
     *     {@link LabelSpecificationType }
     *
     */
    public LabelSpecificationType getLabelSpecification() {
        return labelSpecification;
    }

    /**
     * 设置labelSpecification属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link LabelSpecificationType }
     *
     */
    public void setLabelSpecification(LabelSpecificationType value) {
        this.labelSpecification = value;
    }

    /**
     * Gets the value of the translate property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the translate property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTranslate().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TranslateType }
     *
     *
     */
    public List<TranslateType> getTranslate() {
        if (translate == null) {
            translate = new ArrayList<TranslateType>();
        }
        return this.translate;
    }

    /**
     * 获取labelDelivery属性的值。
     *
     * @return
     *     possible object is
     *     {@link LabelDeliveryType }
     *
     */
    public LabelDeliveryType getLabelDelivery() {
        return labelDelivery;
    }

    /**
     * 设置labelDelivery属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link LabelDeliveryType }
     *
     */
    public void setLabelDelivery(LabelDeliveryType value) {
        this.labelDelivery = value;
    }

    /**
     * 获取mailInnovationsTrackingNumber属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMailInnovationsTrackingNumber() {
        return mailInnovationsTrackingNumber;
    }

    /**
     * 设置mailInnovationsTrackingNumber属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMailInnovationsTrackingNumber(String value) {
        this.mailInnovationsTrackingNumber = value;
    }

    /**
     * 获取trackingNumber属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTrackingNumber() {
        return trackingNumber;
    }

    /**
     * 设置trackingNumber属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTrackingNumber(String value) {
        this.trackingNumber = value;
    }

    /**
     * 获取referenceNumber属性的值。
     *
     * @return
     *     possible object is
     *     {@link ReferenceNumberType }
     *
     */
    public ReferenceNumberType getReferenceNumber() {
        return referenceNumber;
    }

    /**
     * 设置referenceNumber属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link ReferenceNumberType }
     *
     */
    public void setReferenceNumber(ReferenceNumberType value) {
        this.referenceNumber = value;
    }

    /**
     * 获取shipperNumber属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getShipperNumber() {
        return shipperNumber;
    }

    /**
     * 设置shipperNumber属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setShipperNumber(String value) {
        this.shipperNumber = value;
    }

}
