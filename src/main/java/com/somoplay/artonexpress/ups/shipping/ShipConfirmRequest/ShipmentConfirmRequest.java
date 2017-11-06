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
 *         &lt;element name="Request" type="{}RequestType"/&gt;
 *         &lt;element name="Shipment" type="{}ShipmentType"/&gt;
 *         &lt;element name="LabelSpecification" type="{}LabelSpecificationType" minOccurs="0"/&gt;
 *         &lt;element name="ReceiptSpecification" type="{}ReceiptSpecificationType" minOccurs="0"/&gt;
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
    "shipment",
    "labelSpecification",
    "receiptSpecification"
})
@XmlRootElement(name = "ShipmentConfirmRequest")
public class ShipmentConfirmRequest {

    @XmlElement(name = "Request", required = true)
    protected RequestType request;
    @XmlElement(name = "Shipment", required = true)
    protected ShipmentType shipment;
    @XmlElement(name = "LabelSpecification")
    protected LabelSpecificationType labelSpecification;
    @XmlElement(name = "ReceiptSpecification")
    protected ReceiptSpecificationType receiptSpecification;

    /**
     * 获取request属性的值。
     *
     * @return
     *     possible object is
     *     {@link RequestType }
     *
     */
    public RequestType getRequest() {
        return request;
    }

    /**
     * 设置request属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link RequestType }
     *
     */
    public void setRequest(RequestType value) {
        this.request = value;
    }

    /**
     * 获取shipment属性的值。
     *
     * @return
     *     possible object is
     *     {@link ShipmentType }
     *
     */
    public ShipmentType getShipment() {
        return shipment;
    }

    /**
     * 设置shipment属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link ShipmentType }
     *
     */
    public void setShipment(ShipmentType value) {
        this.shipment = value;
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
     * 获取receiptSpecification属性的值。
     *
     * @return
     *     possible object is
     *     {@link ReceiptSpecificationType }
     *
     */
    public ReceiptSpecificationType getReceiptSpecification() {
        return receiptSpecification;
    }

    /**
     * 设置receiptSpecification属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link ReceiptSpecificationType }
     *
     */
    public void setReceiptSpecification(ReceiptSpecificationType value) {
        this.receiptSpecification = value;
    }

}
