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
 * <p>CarrierActivityInformationType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="CarrierActivityInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CarrierId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Arrival" type="{}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="Departure" type="{}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="OriginPort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DestinationPort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarrierActivityInformationType", propOrder = {
    "carrierId",
    "description",
    "status",
    "arrival",
    "departure",
    "originPort",
    "destinationPort"
})
public class CarrierActivityInformationType {

    @XmlElement(name = "CarrierId")
    protected String carrierId;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "Arrival")
    protected DateTime arrival;
    @XmlElement(name = "Departure")
    protected DateTime departure;
    @XmlElement(name = "OriginPort")
    protected String originPort;
    @XmlElement(name = "DestinationPort")
    protected String destinationPort;

    /**
     * 获取carrierId属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCarrierId() {
        return carrierId;
    }

    /**
     * 设置carrierId属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCarrierId(String value) {
        this.carrierId = value;
    }

    /**
     * 获取description属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置description属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * 获取status属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置status属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * 获取arrival属性的值。
     *
     * @return
     *     possible object is
     *     {@link DateTime }
     *
     */
    public DateTime getArrival() {
        return arrival;
    }

    /**
     * 设置arrival属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *
     */
    public void setArrival(DateTime value) {
        this.arrival = value;
    }

    /**
     * 获取departure属性的值。
     *
     * @return
     *     possible object is
     *     {@link DateTime }
     *
     */
    public DateTime getDeparture() {
        return departure;
    }

    /**
     * 设置departure属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *
     */
    public void setDeparture(DateTime value) {
        this.departure = value;
    }

    /**
     * 获取originPort属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOriginPort() {
        return originPort;
    }

    /**
     * 设置originPort属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOriginPort(String value) {
        this.originPort = value;
    }

    /**
     * 获取destinationPort属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDestinationPort() {
        return destinationPort;
    }

    /**
     * 设置destinationPort属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDestinationPort(String value) {
        this.destinationPort = value;
    }

}
