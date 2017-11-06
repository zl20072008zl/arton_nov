//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.10.28 时间 03:47:51 PM EDT
//


package com.somoplay.artonexpress.ups.track.TrackResponse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AppointmentType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="AppointmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Made" type="{}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="Requested" type="{}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="BeginTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppointmentType", propOrder = {
    "made",
    "requested",
    "beginTime",
    "endTime"
})
public class AppointmentType {

    @XmlElement(name = "Made")
    protected DateTime made;
    @XmlElement(name = "Requested")
    protected DateTime requested;
    @XmlElement(name = "BeginTime")
    protected String beginTime;
    @XmlElement(name = "EndTime")
    protected String endTime;

    /**
     * 获取made属性的值。
     *
     * @return
     *     possible object is
     *     {@link DateTime }
     *
     */
    public DateTime getMade() {
        return made;
    }

    /**
     * 设置made属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *
     */
    public void setMade(DateTime value) {
        this.made = value;
    }

    /**
     * 获取requested属性的值。
     *
     * @return
     *     possible object is
     *     {@link DateTime }
     *
     */
    public DateTime getRequested() {
        return requested;
    }

    /**
     * 设置requested属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *
     */
    public void setRequested(DateTime value) {
        this.requested = value;
    }

    /**
     * 获取beginTime属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBeginTime() {
        return beginTime;
    }

    /**
     * 设置beginTime属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBeginTime(String value) {
        this.beginTime = value;
    }

    /**
     * 获取endTime属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * 设置endTime属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEndTime(String value) {
        this.endTime = value;
    }

}
