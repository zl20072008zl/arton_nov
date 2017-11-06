//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.10.28 时间 03:47:50 PM EDT
//


package com.somoplay.artonexpress.ups.track.TrackRequest;

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
 *         &lt;choice&gt;
 *           &lt;element ref="{}TrackingNumber"/&gt;
 *           &lt;element ref="{}ShipmentIdentificationNumber"/&gt;
 *           &lt;element ref="{}CandidateBookmark"/&gt;
 *           &lt;sequence&gt;
 *             &lt;element ref="{}ReferenceNumber"/&gt;
 *             &lt;element ref="{}PickupDateRange" minOccurs="0"/&gt;
 *             &lt;element ref="{}ShipperNumber" minOccurs="0"/&gt;
 *             &lt;element ref="{}DestinationPostalCode" minOccurs="0"/&gt;
 *             &lt;element ref="{}DestinationCountryCode" minOccurs="0"/&gt;
 *             &lt;element ref="{}OriginPostalCode" minOccurs="0"/&gt;
 *             &lt;element ref="{}OriginCountryCode" minOccurs="0"/&gt;
 *             &lt;element name="ShipmentType" type="{}CodeType" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="IncludeMailInnovationIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TrackingOption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UPSWorldWideExpressFreightShipment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{}IncludeFreight" minOccurs="0"/&gt;
 *         &lt;element ref="{}ShipperAccountInfo" minOccurs="0"/&gt;
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
    "trackingNumber",
    "shipmentIdentificationNumber",
    "candidateBookmark",
    "referenceNumber",
    "pickupDateRange",
    "shipperNumber",
    "destinationPostalCode",
    "destinationCountryCode",
    "originPostalCode",
    "originCountryCode",
    "shipmentType",
    "includeMailInnovationIndicator",
    "trackingOption",
    "upsWorldWideExpressFreightShipment",
    "includeFreight",
    "shipperAccountInfo"
})
@XmlRootElement(name = "TrackRequest")
public class TrackRequest {

    @XmlElement(name = "Request", required = true)
    protected Request request;
    @XmlElement(name = "TrackingNumber")
    protected String trackingNumber;
    @XmlElement(name = "ShipmentIdentificationNumber")
    protected String shipmentIdentificationNumber;
    @XmlElement(name = "CandidateBookmark")
    protected String candidateBookmark;
    @XmlElement(name = "ReferenceNumber")
    protected ReferenceNumber referenceNumber;
    @XmlElement(name = "PickupDateRange")
    protected PickupDateRange pickupDateRange;
    @XmlElement(name = "ShipperNumber")
    protected String shipperNumber;
    @XmlElement(name = "DestinationPostalCode")
    protected String destinationPostalCode;
    @XmlElement(name = "DestinationCountryCode")
    protected String destinationCountryCode;
    @XmlElement(name = "OriginPostalCode")
    protected String originPostalCode;
    @XmlElement(name = "OriginCountryCode")
    protected String originCountryCode;
    @XmlElement(name = "ShipmentType")
    protected CodeType shipmentType;
    @XmlElement(name = "IncludeMailInnovationIndicator")
    protected String includeMailInnovationIndicator;
    @XmlElement(name = "TrackingOption")
    protected String trackingOption;
    @XmlElement(name = "UPSWorldWideExpressFreightShipment")
    protected String upsWorldWideExpressFreightShipment;
    @XmlElement(name = "IncludeFreight")
    protected String includeFreight;
    @XmlElement(name = "ShipperAccountInfo")
    protected ShipperAccountInfo shipperAccountInfo;

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
     * 获取candidateBookmark属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCandidateBookmark() {
        return candidateBookmark;
    }

    /**
     * 设置candidateBookmark属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCandidateBookmark(String value) {
        this.candidateBookmark = value;
    }

    /**
     * 获取referenceNumber属性的值。
     *
     * @return
     *     possible object is
     *     {@link ReferenceNumber }
     *
     */
    public ReferenceNumber getReferenceNumber() {
        return referenceNumber;
    }

    /**
     * 设置referenceNumber属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link ReferenceNumber }
     *
     */
    public void setReferenceNumber(ReferenceNumber value) {
        this.referenceNumber = value;
    }

    /**
     * 获取pickupDateRange属性的值。
     *
     * @return
     *     possible object is
     *     {@link PickupDateRange }
     *
     */
    public PickupDateRange getPickupDateRange() {
        return pickupDateRange;
    }

    /**
     * 设置pickupDateRange属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link PickupDateRange }
     *
     */
    public void setPickupDateRange(PickupDateRange value) {
        this.pickupDateRange = value;
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

    /**
     * 获取destinationPostalCode属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDestinationPostalCode() {
        return destinationPostalCode;
    }

    /**
     * 设置destinationPostalCode属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDestinationPostalCode(String value) {
        this.destinationPostalCode = value;
    }

    /**
     * 获取destinationCountryCode属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDestinationCountryCode() {
        return destinationCountryCode;
    }

    /**
     * 设置destinationCountryCode属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDestinationCountryCode(String value) {
        this.destinationCountryCode = value;
    }

    /**
     * 获取originPostalCode属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOriginPostalCode() {
        return originPostalCode;
    }

    /**
     * 设置originPostalCode属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOriginPostalCode(String value) {
        this.originPostalCode = value;
    }

    /**
     * 获取originCountryCode属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOriginCountryCode() {
        return originCountryCode;
    }

    /**
     * 设置originCountryCode属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOriginCountryCode(String value) {
        this.originCountryCode = value;
    }

    /**
     * 获取shipmentType属性的值。
     *
     * @return
     *     possible object is
     *     {@link CodeType }
     *
     */
    public CodeType getShipmentType() {
        return shipmentType;
    }

    /**
     * 设置shipmentType属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *
     */
    public void setShipmentType(CodeType value) {
        this.shipmentType = value;
    }

    /**
     * 获取includeMailInnovationIndicator属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIncludeMailInnovationIndicator() {
        return includeMailInnovationIndicator;
    }

    /**
     * 设置includeMailInnovationIndicator属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIncludeMailInnovationIndicator(String value) {
        this.includeMailInnovationIndicator = value;
    }

    /**
     * 获取trackingOption属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTrackingOption() {
        return trackingOption;
    }

    /**
     * 设置trackingOption属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTrackingOption(String value) {
        this.trackingOption = value;
    }

    /**
     * 获取upsWorldWideExpressFreightShipment属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUPSWorldWideExpressFreightShipment() {
        return upsWorldWideExpressFreightShipment;
    }

    /**
     * 设置upsWorldWideExpressFreightShipment属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUPSWorldWideExpressFreightShipment(String value) {
        this.upsWorldWideExpressFreightShipment = value;
    }

    /**
     * 获取includeFreight属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIncludeFreight() {
        return includeFreight;
    }

    /**
     * 设置includeFreight属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIncludeFreight(String value) {
        this.includeFreight = value;
    }

    /**
     * 获取shipperAccountInfo属性的值。
     *
     * @return
     *     possible object is
     *     {@link ShipperAccountInfo }
     *
     */
    public ShipperAccountInfo getShipperAccountInfo() {
        return shipperAccountInfo;
    }

    /**
     * 设置shipperAccountInfo属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link ShipperAccountInfo }
     *
     */
    public void setShipperAccountInfo(ShipperAccountInfo value) {
        this.shipperAccountInfo = value;
    }

}
