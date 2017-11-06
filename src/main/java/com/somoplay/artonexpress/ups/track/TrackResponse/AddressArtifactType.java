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
 * <p>AddressArtifactType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="AddressArtifactType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StreetNumberLow" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StreetPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StreetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StreetSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StreetType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PoliticalDivision2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PoliticalDivision1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PostcodePrimaryLow" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressArtifactType", propOrder = {
    "streetNumberLow",
    "streetPrefix",
    "streetName",
    "streetSuffix",
    "streetType",
    "politicalDivision2",
    "politicalDivision1",
    "postcodePrimaryLow",
    "countryCode"
})
public class AddressArtifactType {

    @XmlElement(name = "StreetNumberLow")
    protected String streetNumberLow;
    @XmlElement(name = "StreetPrefix")
    protected String streetPrefix;
    @XmlElement(name = "StreetName")
    protected String streetName;
    @XmlElement(name = "StreetSuffix")
    protected String streetSuffix;
    @XmlElement(name = "StreetType")
    protected String streetType;
    @XmlElement(name = "PoliticalDivision2")
    protected String politicalDivision2;
    @XmlElement(name = "PoliticalDivision1")
    protected String politicalDivision1;
    @XmlElement(name = "PostcodePrimaryLow")
    protected String postcodePrimaryLow;
    @XmlElement(name = "CountryCode")
    protected String countryCode;

    /**
     * 获取streetNumberLow属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStreetNumberLow() {
        return streetNumberLow;
    }

    /**
     * 设置streetNumberLow属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStreetNumberLow(String value) {
        this.streetNumberLow = value;
    }

    /**
     * 获取streetPrefix属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStreetPrefix() {
        return streetPrefix;
    }

    /**
     * 设置streetPrefix属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStreetPrefix(String value) {
        this.streetPrefix = value;
    }

    /**
     * 获取streetName属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStreetName() {
        return streetName;
    }

    /**
     * 设置streetName属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStreetName(String value) {
        this.streetName = value;
    }

    /**
     * 获取streetSuffix属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStreetSuffix() {
        return streetSuffix;
    }

    /**
     * 设置streetSuffix属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStreetSuffix(String value) {
        this.streetSuffix = value;
    }

    /**
     * 获取streetType属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStreetType() {
        return streetType;
    }

    /**
     * 设置streetType属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStreetType(String value) {
        this.streetType = value;
    }

    /**
     * 获取politicalDivision2属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPoliticalDivision2() {
        return politicalDivision2;
    }

    /**
     * 设置politicalDivision2属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPoliticalDivision2(String value) {
        this.politicalDivision2 = value;
    }

    /**
     * 获取politicalDivision1属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPoliticalDivision1() {
        return politicalDivision1;
    }

    /**
     * 设置politicalDivision1属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPoliticalDivision1(String value) {
        this.politicalDivision1 = value;
    }

    /**
     * 获取postcodePrimaryLow属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPostcodePrimaryLow() {
        return postcodePrimaryLow;
    }

    /**
     * 设置postcodePrimaryLow属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPostcodePrimaryLow(String value) {
        this.postcodePrimaryLow = value;
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
