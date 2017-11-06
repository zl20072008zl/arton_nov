//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.10.28 时间 03:47:50 PM EDT
//


package com.somoplay.artonexpress.ups.rate.RateRequest;

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
 *         &lt;element name="PickupType" type="{}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="CustomerClassification" type="{}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="Shipment" type="{}ShipmentType"/&gt;
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
    "pickupType",
    "customerClassification",
    "shipment"
})
@XmlRootElement(name = "RatingServiceSelectionRequest")
public class RatingServiceSelectionRequest {

    @XmlElement(name = "Request", required = true)
    protected RequestType request;
    @XmlElement(name = "PickupType")
    protected CodeType pickupType;
    @XmlElement(name = "CustomerClassification")
    protected CodeType customerClassification;
    @XmlElement(name = "Shipment", required = true)
    protected ShipmentType shipment;

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
     * 获取pickupType属性的值。
     *
     * @return
     *     possible object is
     *     {@link CodeType }
     *
     */
    public CodeType getPickupType() {
        return pickupType;
    }

    /**
     * 设置pickupType属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *
     */
    public void setPickupType(CodeType value) {
        this.pickupType = value;
    }

    /**
     * 获取customerClassification属性的值。
     *
     * @return
     *     possible object is
     *     {@link CodeType }
     *
     */
    public CodeType getCustomerClassification() {
        return customerClassification;
    }

    /**
     * 设置customerClassification属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *
     */
    public void setCustomerClassification(CodeType value) {
        this.customerClassification = value;
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

}
