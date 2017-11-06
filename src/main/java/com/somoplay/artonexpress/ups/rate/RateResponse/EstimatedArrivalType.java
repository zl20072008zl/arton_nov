//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.10.28 时间 03:47:50 PM EDT
//


package com.somoplay.artonexpress.ups.rate.RateResponse;

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
 *         &lt;element name="Arrival" type="{}PickupType"/&gt;
 *         &lt;element name="BusinessDaysInTransit" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Pickup" type="{}PickupType"/&gt;
 *         &lt;element name="DayOfWeek" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerCenterCutoff" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DelayCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HolidayCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RestDays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TotalTransitDays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "arrival",
    "businessDaysInTransit",
    "pickup",
    "dayOfWeek",
    "customerCenterCutoff",
    "delayCount",
    "holidayCount",
    "restDays",
    "totalTransitDays"
})
public class EstimatedArrivalType {

    @XmlElement(name = "Arrival", required = true)
    protected PickupType arrival;
    @XmlElement(name = "BusinessDaysInTransit", required = true)
    protected String businessDaysInTransit;
    @XmlElement(name = "Pickup", required = true)
    protected PickupType pickup;
    @XmlElement(name = "DayOfWeek")
    protected String dayOfWeek;
    @XmlElement(name = "CustomerCenterCutoff")
    protected String customerCenterCutoff;
    @XmlElement(name = "DelayCount")
    protected String delayCount;
    @XmlElement(name = "HolidayCount")
    protected String holidayCount;
    @XmlElement(name = "RestDays")
    protected String restDays;
    @XmlElement(name = "TotalTransitDays")
    protected String totalTransitDays;

    /**
     * 获取arrival属性的值。
     *
     * @return
     *     possible object is
     *     {@link PickupType }
     *
     */
    public PickupType getArrival() {
        return arrival;
    }

    /**
     * 设置arrival属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link PickupType }
     *
     */
    public void setArrival(PickupType value) {
        this.arrival = value;
    }

    /**
     * 获取businessDaysInTransit属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBusinessDaysInTransit() {
        return businessDaysInTransit;
    }

    /**
     * 设置businessDaysInTransit属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBusinessDaysInTransit(String value) {
        this.businessDaysInTransit = value;
    }

    /**
     * 获取pickup属性的值。
     *
     * @return
     *     possible object is
     *     {@link PickupType }
     *
     */
    public PickupType getPickup() {
        return pickup;
    }

    /**
     * 设置pickup属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link PickupType }
     *
     */
    public void setPickup(PickupType value) {
        this.pickup = value;
    }

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

}
