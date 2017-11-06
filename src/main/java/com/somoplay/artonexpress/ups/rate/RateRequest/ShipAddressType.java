//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.10.28 时间 03:47:50 PM EDT
//


package com.somoplay.artonexpress.ups.rate.RateRequest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ShipAddressType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="ShipAddressType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AddressLine1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AddressLine2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AddressLine3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StateProvinceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipAddressType", propOrder = {
    "addressLine1",
    "addressLine2",
    "addressLine3",
    "city",
    "stateProvinceCode",
    "postalCode",
    "countryCode"
})
public class ShipAddressType {

    @XmlElement(name = "AddressLine1")
    protected String addressLine1;
    @XmlElement(name = "AddressLine2")
    protected String addressLine2;
    @XmlElement(name = "AddressLine3")
    protected String addressLine3;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "StateProvinceCode")
    protected String stateProvinceCode;
    @XmlElement(name = "PostalCode")
    protected String postalCode;
    @XmlElement(name = "CountryCode", required = true)
    protected String countryCode;

    /**
     * 获取addressLine1属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAddressLine1() {
        return addressLine1;
    }

    /**
     * 设置addressLine1属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAddressLine1(String value) {
        this.addressLine1 = value;
    }

    /**
     * 获取addressLine2属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAddressLine2() {
        return addressLine2;
    }

    /**
     * 设置addressLine2属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAddressLine2(String value) {
        this.addressLine2 = value;
    }

    /**
     * 获取addressLine3属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAddressLine3() {
        return addressLine3;
    }

    /**
     * 设置addressLine3属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAddressLine3(String value) {
        this.addressLine3 = value;
    }

    /**
     * 获取city属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置city属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * 获取stateProvinceCode属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStateProvinceCode() {
        return stateProvinceCode;
    }

    /**
     * 设置stateProvinceCode属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStateProvinceCode(String value) {
        this.stateProvinceCode = value;
    }

    /**
     * 获取postalCode属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * 设置postalCode属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * 获取countryCode属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * 设置countryCode属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

}
