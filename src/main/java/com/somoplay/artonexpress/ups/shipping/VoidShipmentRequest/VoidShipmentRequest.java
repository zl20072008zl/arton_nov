//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.10.28 时间 03:38:23 PM EDT
//


package com.somoplay.artonexpress.ups.shipping.VoidShipmentRequest;

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
 *         &lt;choice&gt;
 *           &lt;element name="ShipmentIdentificationNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;element name="ExpandedVoidShipment" type="{}ExpandedVoidShipmentType"/&gt;
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
    "shipmentIdentificationNumber",
    "expandedVoidShipment"
})
@XmlRootElement(name = "VoidShipmentRequest")
public class VoidShipmentRequest {

    @XmlElement(name = "Request", required = true)
    protected RequestType request;
    @XmlElement(name = "ShipmentIdentificationNumber")
    protected String shipmentIdentificationNumber;
    @XmlElement(name = "ExpandedVoidShipment")
    protected ExpandedVoidShipmentType expandedVoidShipment;

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
     * 获取shipmentIdentificationNumber属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getShipmentIdentificationNumber() {
        return shipmentIdentificationNumber;
    }

    /**
     * 设置shipmentIdentificationNumber属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setShipmentIdentificationNumber(String value) {
        this.shipmentIdentificationNumber = value;
    }

    /**
     * 获取expandedVoidShipment属性的值。
     *
     * @return
     *     possible object is
     *     {@link ExpandedVoidShipmentType }
     *
     */
    public ExpandedVoidShipmentType getExpandedVoidShipment() {
        return expandedVoidShipment;
    }

    /**
     * 设置expandedVoidShipment属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link ExpandedVoidShipmentType }
     *
     */
    public void setExpandedVoidShipment(ExpandedVoidShipmentType value) {
        this.expandedVoidShipment = value;
    }

}
