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
 * <p>PackageCOD complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="PackageCOD"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}CODAmount" minOccurs="0"/&gt;
 *         &lt;element name="ControlNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CODStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackageCOD", propOrder = {
    "codAmount",
    "controlNumber",
    "codStatus"
})
public class PackageCOD {

    @XmlElement(name = "CODAmount")
    protected MonetaryType codAmount;
    @XmlElement(name = "ControlNumber")
    protected String controlNumber;
    @XmlElement(name = "CODStatus")
    protected String codStatus;

    /**
     * 获取codAmount属性的值。
     *
     * @return
     *     possible object is
     *     {@link MonetaryType }
     *
     */
    public MonetaryType getCODAmount() {
        return codAmount;
    }

    /**
     * 设置codAmount属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link MonetaryType }
     *
     */
    public void setCODAmount(MonetaryType value) {
        this.codAmount = value;
    }

    /**
     * 获取controlNumber属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getControlNumber() {
        return controlNumber;
    }

    /**
     * 设置controlNumber属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setControlNumber(String value) {
        this.controlNumber = value;
    }

    /**
     * 获取codStatus属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCODStatus() {
        return codStatus;
    }

    /**
     * 设置codStatus属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCODStatus(String value) {
        this.codStatus = value;
    }

}
