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
 * <p>TrackingCandidateType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="TrackingCandidateType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DestinationPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DestinationCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PickupDateRange" type="{}PickupDateRangeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackingCandidateType", propOrder = {
    "trackingNumber",
    "destinationPostalCode",
    "destinationCountryCode",
    "pickupDateRange"
})
public class TrackingCandidateType {

    @XmlElement(name = "TrackingNumber", required = true)
    protected String trackingNumber;
    @XmlElement(name = "DestinationPostalCode")
    protected String destinationPostalCode;
    @XmlElement(name = "DestinationCountryCode")
    protected String destinationCountryCode;
    @XmlElement(name = "PickupDateRange")
    protected PickupDateRangeType pickupDateRange;

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
     * 获取pickupDateRange属性的值。
     *
     * @return
     *     possible object is
     *     {@link PickupDateRangeType }
     *
     */
    public PickupDateRangeType getPickupDateRange() {
        return pickupDateRange;
    }

    /**
     * 设置pickupDateRange属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link PickupDateRangeType }
     *
     */
    public void setPickupDateRange(PickupDateRangeType value) {
        this.pickupDateRange = value;
    }

}
