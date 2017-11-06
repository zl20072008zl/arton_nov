//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.10.28 时间 03:47:51 PM EDT
//


package com.somoplay.artonexpress.ups.track.TrackResponse;

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
 *         &lt;element name="AlternateTrackingInfo" type="{}AlternateTrackingInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ActivityLocation" type="{}ActivityLocationType" minOccurs="0"/&gt;
 *         &lt;element ref="{}Status" minOccurs="0"/&gt;
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Time" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryDateFromManifestIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{}NextScheduleActivity" minOccurs="0"/&gt;
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
    "alternateTrackingInfo",
    "activityLocation",
    "status",
    "date",
    "com/somoplay/artonexpress/ups/time",
    "deliveryDateFromManifestIndicator",
    "nextScheduleActivity"
})
@XmlRootElement(name = "Activity")
public class Activity {

    @XmlElement(name = "AlternateTrackingInfo")
    protected List<AlternateTrackingInfoType> alternateTrackingInfo;
    @XmlElement(name = "ActivityLocation")
    protected ActivityLocationType activityLocation;
    @XmlElement(name = "Status")
    protected Status status;
    @XmlElement(name = "Date")
    protected String date;
    @XmlElement(name = "Time")
    protected String time;
    @XmlElement(name = "DeliveryDateFromManifestIndicator")
    protected String deliveryDateFromManifestIndicator;
    @XmlElement(name = "NextScheduleActivity")
    protected NextScheduleActivity nextScheduleActivity;

    /**
     * Gets the value of the alternateTrackingInfo property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternateTrackingInfo property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternateTrackingInfo().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlternateTrackingInfoType }
     *
     *
     */
    public List<AlternateTrackingInfoType> getAlternateTrackingInfo() {
        if (alternateTrackingInfo == null) {
            alternateTrackingInfo = new ArrayList<AlternateTrackingInfoType>();
        }
        return this.alternateTrackingInfo;
    }

    /**
     * 获取activityLocation属性的值。
     *
     * @return
     *     possible object is
     *     {@link ActivityLocationType }
     *
     */
    public ActivityLocationType getActivityLocation() {
        return activityLocation;
    }

    /**
     * 设置activityLocation属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link ActivityLocationType }
     *
     */
    public void setActivityLocation(ActivityLocationType value) {
        this.activityLocation = value;
    }

    /**
     * 获取status属性的值。
     *
     * @return
     *     possible object is
     *     {@link Status }
     *
     */
    public Status getStatus() {
        return status;
    }

    /**
     * 设置status属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Status }
     *
     */
    public void setStatus(Status value) {
        this.status = value;
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
     * 获取deliveryDateFromManifestIndicator属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDeliveryDateFromManifestIndicator() {
        return deliveryDateFromManifestIndicator;
    }

    /**
     * 设置deliveryDateFromManifestIndicator属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDeliveryDateFromManifestIndicator(String value) {
        this.deliveryDateFromManifestIndicator = value;
    }

    /**
     * 获取nextScheduleActivity属性的值。
     *
     * @return
     *     possible object is
     *     {@link NextScheduleActivity }
     *
     */
    public NextScheduleActivity getNextScheduleActivity() {
        return nextScheduleActivity;
    }

    /**
     * 设置nextScheduleActivity属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link NextScheduleActivity }
     *
     */
    public void setNextScheduleActivity(NextScheduleActivity value) {
        this.nextScheduleActivity = value;
    }

}
