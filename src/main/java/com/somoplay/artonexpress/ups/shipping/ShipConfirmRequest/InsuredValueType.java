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
 * <p>InsuredValueType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="InsuredValueType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Type" type="{}InsuredValueCodeDescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MonetaryValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsuredValueType", propOrder = {
    "type",
    "currencyCode",
    "monetaryValue"
})
public class InsuredValueType {

    @XmlElement(name = "Type")
    protected InsuredValueCodeDescriptionType type;
    @XmlElement(name = "CurrencyCode")
    protected String currencyCode;
    @XmlElement(name = "MonetaryValue")
    protected String monetaryValue;

    /**
     * 获取type属性的值。
     *
     * @return
     *     possible object is
     *     {@link InsuredValueCodeDescriptionType }
     *
     */
    public InsuredValueCodeDescriptionType getType() {
        return type;
    }

    /**
     * 设置type属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link InsuredValueCodeDescriptionType }
     *
     */
    public void setType(InsuredValueCodeDescriptionType value) {
        this.type = value;
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

}
