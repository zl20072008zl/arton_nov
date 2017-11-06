//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.10.28 时间 03:38:23 PM EDT
//


package com.somoplay.artonexpress.ups.shipping.ShipConfirmRequest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ShipperFiledType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="ShipperFiledType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PreDepartureITNNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExemptionLegend" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EEIShipmentReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipperFiledType", propOrder = {
    "code",
    "description",
    "preDepartureITNNumber",
    "exemptionLegend",
    "eeiShipmentReferenceNumber"
})
public class ShipperFiledType {

    @XmlElement(name = "Code")
    protected String code;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "PreDepartureITNNumber")
    protected String preDepartureITNNumber;
    @XmlElement(name = "ExemptionLegend")
    protected String exemptionLegend;
    @XmlElement(name = "EEIShipmentReferenceNumber")
    protected String eeiShipmentReferenceNumber;

    /**
     * 获取code属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置code属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCode(String value) {
        this.code = value;
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
     * 获取preDepartureITNNumber属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPreDepartureITNNumber() {
        return preDepartureITNNumber;
    }

    /**
     * 设置preDepartureITNNumber属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPreDepartureITNNumber(String value) {
        this.preDepartureITNNumber = value;
    }

    /**
     * 获取exemptionLegend属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getExemptionLegend() {
        return exemptionLegend;
    }

    /**
     * 设置exemptionLegend属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setExemptionLegend(String value) {
        this.exemptionLegend = value;
    }

    /**
     * 获取eeiShipmentReferenceNumber属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEEIShipmentReferenceNumber() {
        return eeiShipmentReferenceNumber;
    }

    /**
     * 设置eeiShipmentReferenceNumber属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEEIShipmentReferenceNumber(String value) {
        this.eeiShipmentReferenceNumber = value;
    }

}
