//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.10.28 时间 03:38:22 PM EDT
//


package com.somoplay.artonexpress.ups.shipping.ShipAcceptResponse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MonetaryType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="MonetaryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{}CurrencyCode" minOccurs="0"/&gt;
 *         &lt;element ref="{}MonetaryValue"/&gt;
 *         &lt;element name="SubType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonetaryType", propOrder = {
    "code",
    "description",
    "currencyCode",
    "monetaryValue",
    "subType"
})
public class MonetaryType {

    @XmlElement(name = "Code")
    protected String code;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "CurrencyCode")
    protected String currencyCode;
    @XmlElement(name = "MonetaryValue", required = true)
    protected String monetaryValue;
    @XmlElement(name = "SubType")
    protected String subType;

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
     * 获取currencyCode属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * 设置currencyCode属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * 获取monetaryValue属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMonetaryValue() {
        return monetaryValue;
    }

    /**
     * 设置monetaryValue属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMonetaryValue(String value) {
        this.monetaryValue = value;
    }

    /**
     * 获取subType属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSubType() {
        return subType;
    }

    /**
     * 设置subType属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSubType(String value) {
        this.subType = value;
    }

}
