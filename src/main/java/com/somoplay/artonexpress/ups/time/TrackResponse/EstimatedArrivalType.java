//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.10.28 时间 03:47:51 PM EDT
//


package com.somoplay.artonexpress.ups.time.TrackResponse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>EstimatedArrivalType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="EstimatedArrivalType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DayOfWeek" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Time" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PickupDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PickupTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BusinessTransitDays" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TotalTransitDays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerCenterCutoff" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RestDays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HolidayCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DelayCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EstimatedArrivalType", propOrder = {
    "dayOfWeek",
    "com/somoplay/artonexpress/ups/time",
    "date",
    "pickupDate",
    "pickupTime",
    "businessTransitDays",
    "totalTransitDays",
    "customerCenterCutoff",
    "restDays",
    "holidayCount",
    "delayCount"
})
public class EstimatedArrivalType {

    @XmlElement(name = "DayOfWeek", required = true)
    protected String dayOfWeek;
    @XmlElement(name = "Time", required = true)
    protected String time;
    @XmlElement(name = "Date", required = true)
    protected String date;
    @XmlElement(name = "PickupDate", required = true)
    protected String pickupDate;
    @XmlElement(name = "PickupTime", required = true)
    protected String pickupTime;
    @XmlElement(name = "BusinessTransitDays", required = true)
    protected String businessTransitDays;
    @XmlElement(name = "TotalTransitDays")
    protected String totalTransitDays;
    @XmlElement(name = "CustomerCenterCutoff")
    protected String customerCenterCutoff;
    @XmlElement(name = "RestDays")
    protected String restDays;
    @XmlElement(name = "HolidayCount")
    protected String holidayCount;
    @XmlElement(name = "DelayCount")
    protected String delayCount;

    /**
     * 获取dayOfWeek属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDayOfWeek() {
        return dayOfWeek;
    }

    /**
     * 设置dayOfWeek属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDayOfWeek(String value) {
        this.dayOfWeek = value;
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
     * 获取date属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDate() {
        return date;
    }

    /**
     * 设置date属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDate(String value) {
        this.date = value;
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
     * 获取pickupTime属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPickupTime() {
        return pickupTime;
    }

    /**
     * 设置pickupTime属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPickupTime(String value) {
        this.pickupTime = value;
    }

    /**
     * 获取businessTransitDays属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBusinessTransitDays() {
        return businessTransitDays;
    }

    /**
     * 设置businessTransitDays属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBusinessTransitDays(String value) {
        this.businessTransitDays = value;
    }

    /**
     * 获取totalTransitDays属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTotalTransitDays() {
        return totalTransitDays;
    }

    /**
     * 设置totalTransitDays属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTotalTransitDays(String value) {
        this.totalTransitDays = value;
    }

    /**
     * 获取customerCenterCutoff属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCustomerCenterCutoff() {
        return customerCenterCutoff;
    }

    /**
     * 设置customerCenterCutoff属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCustomerCenterCutoff(String value) {
        this.customerCenterCutoff = value;
    }

    /**
     * 获取restDays属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRestDays() {
        return restDays;
    }

    /**
     * 设置restDays属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRestDays(String value) {
        this.restDays = value;
    }

    /**
     * 获取holidayCount属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getHolidayCount() {
        return holidayCount;
    }

    /**
     * 设置holidayCount属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setHolidayCount(String value) {
        this.holidayCount = value;
    }

    /**
     * 获取delayCount属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDelayCount() {
        return delayCount;
    }

    /**
     * 设置delayCount属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDelayCount(String value) {
        this.delayCount = value;
    }

}
