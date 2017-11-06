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
 * <p>DestinationPortDetailsType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="DestinationPortDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DestinationPort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EstimatedArrival" type="{}DateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DestinationPortDetailsType", propOrder = {
    "destinationPort",
    "estimatedArrival"
})
public class DestinationPortDetailsType {

    @XmlElement(name = "DestinationPort")
    protected String destinationPort;
    @XmlElement(name = "EstimatedArrival")
    protected DateTime estimatedArrival;

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

    /**
     * 获取estimatedArrival属性的值。
     *
     * @return
     *     possible object is
     *     {@link DateTime }
     *
     */
    public DateTime getEstimatedArrival() {
        return estimatedArrival;
    }

    /**
     * 设置estimatedArrival属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *
     */
    public void setEstimatedArrival(DateTime value) {
        this.estimatedArrival = value;
    }

}
