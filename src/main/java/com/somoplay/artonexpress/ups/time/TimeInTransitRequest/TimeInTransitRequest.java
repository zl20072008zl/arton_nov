//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.10.28 时间 03:47:51 PM EDT
//


package com.somoplay.artonexpress.ups.time.TimeInTransitRequest;

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
 *         &lt;element name="TransitFrom" type="{}TransitFromType"/&gt;
 *         &lt;element name="TransitTo" type="{}TransitToType"/&gt;
 *         &lt;element name="ShipmentWeight" type="{}WeightType" minOccurs="0"/&gt;
 *         &lt;element name="TotalPackagesInShipment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PickupDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InvoiceLineTotal" type="{}MonetaryType" minOccurs="0"/&gt;
 *         &lt;element name="DocumentsOnlyIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MaximumListSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "transitFrom",
    "transitTo",
    "shipmentWeight",
    "totalPackagesInShipment",
    "pickupDate",
    "com/somoplay/artonexpress/ups/time",
    "invoiceLineTotal",
    "documentsOnlyIndicator",
    "maximumListSize"
})
@XmlRootElement(name = "TimeInTransitRequest")
public class TimeInTransitRequest {

    @XmlElement(name = "Request", required = true)
    protected Request request;
    @XmlElement(name = "TransitFrom", required = true)
    protected TransitFromType transitFrom;
    @XmlElement(name = "TransitTo", required = true)
    protected TransitToType transitTo;
    @XmlElement(name = "ShipmentWeight")
    protected WeightType shipmentWeight;
    @XmlElement(name = "TotalPackagesInShipment")
    protected String totalPackagesInShipment;
    @XmlElement(name = "PickupDate", required = true)
    protected String pickupDate;
    @XmlElement(name = "Time")
    protected String time;
    @XmlElement(name = "InvoiceLineTotal")
    protected MonetaryType invoiceLineTotal;
    @XmlElement(name = "DocumentsOnlyIndicator")
    protected String documentsOnlyIndicator;
    @XmlElement(name = "MaximumListSize")
    protected String maximumListSize;

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
     * 获取transitFrom属性的值。
     *
     * @return
     *     possible object is
     *     {@link TransitFromType }
     *
     */
    public TransitFromType getTransitFrom() {
        return transitFrom;
    }

    /**
     * 设置transitFrom属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link TransitFromType }
     *
     */
    public void setTransitFrom(TransitFromType value) {
        this.transitFrom = value;
    }

    /**
     * 获取transitTo属性的值。
     *
     * @return
     *     possible object is
     *     {@link TransitToType }
     *
     */
    public TransitToType getTransitTo() {
        return transitTo;
    }

    /**
     * 设置transitTo属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link TransitToType }
     *
     */
    public void setTransitTo(TransitToType value) {
        this.transitTo = value;
    }

    /**
     * 获取shipmentWeight属性的值。
     *
     * @return
     *     possible object is
     *     {@link WeightType }
     *
     */
    public WeightType getShipmentWeight() {
        return shipmentWeight;
    }

    /**
     * 设置shipmentWeight属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link WeightType }
     *
     */
    public void setShipmentWeight(WeightType value) {
        this.shipmentWeight = value;
    }

    /**
     * 获取totalPackagesInShipment属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTotalPackagesInShipment() {
        return totalPackagesInShipment;
    }

    /**
     * 设置totalPackagesInShipment属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTotalPackagesInShipment(String value) {
        this.totalPackagesInShipment = value;
    }

    /**
     * 获取pickupDate属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPickupDate() {
        return pickupDate;
    }

    /**
     * 设置pickupDate属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPickupDate(String value) {
        this.pickupDate = value;
    }

    /**
     * 获取time属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTime() {
        return time;
    }

    /**
     * 设置time属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTime(String value) {
        this.time = value;
    }

    /**
     * 获取invoiceLineTotal属性的值。
     *
     * @return
     *     possible object is
     *     {@link MonetaryType }
     *
     */
    public MonetaryType getInvoiceLineTotal() {
        return invoiceLineTotal;
    }

    /**
     * 设置invoiceLineTotal属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link MonetaryType }
     *
     */
    public void setInvoiceLineTotal(MonetaryType value) {
        this.invoiceLineTotal = value;
    }

    /**
     * 获取documentsOnlyIndicator属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDocumentsOnlyIndicator() {
        return documentsOnlyIndicator;
    }

    /**
     * 设置documentsOnlyIndicator属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDocumentsOnlyIndicator(String value) {
        this.documentsOnlyIndicator = value;
    }

    /**
     * 获取maximumListSize属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMaximumListSize() {
        return maximumListSize;
    }

    /**
     * 设置maximumListSize属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMaximumListSize(String value) {
        this.maximumListSize = value;
    }

}
