//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.10.28 时间 03:47:51 PM EDT
//


package com.somoplay.artonexpress.ups.time.TrackResponse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TransitToAddressArtifactFormatType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="TransitToAddressArtifactFormatType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PoliticalDivision3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PoliticalDivision2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PoliticalDivision1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PostcodePrimaryLow" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{}ResidentialAddressIndicator" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransitToAddressArtifactFormatType", propOrder = {
    "politicalDivision3",
    "politicalDivision2",
    "politicalDivision1",
    "countryCode",
    "postcodePrimaryLow",
    "residentialAddressIndicator"
})
public class TransitToAddressArtifactFormatType {

    @XmlElement(name = "PoliticalDivision3")
    protected String politicalDivision3;
    @XmlElement(name = "PoliticalDivision2")
    protected String politicalDivision2;
    @XmlElement(name = "PoliticalDivision1")
    protected String politicalDivision1;
    @XmlElement(name = "CountryCode")
    protected String countryCode;
    @XmlElement(name = "PostcodePrimaryLow")
    protected String postcodePrimaryLow;
    @XmlElement(name = "ResidentialAddressIndicator")
    protected String residentialAddressIndicator;

    /**
     * 获取politicalDivision3属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPoliticalDivision3() {
        return politicalDivision3;
    }

    /**
     * 设置politicalDivision3属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPoliticalDivision3(String value) {
        this.politicalDivision3 = value;
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
     * 获取residentialAddressIndicator属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getResidentialAddressIndicator() {
        return residentialAddressIndicator;
    }

    /**
     * 设置residentialAddressIndicator属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setResidentialAddressIndicator(String value) {
        this.residentialAddressIndicator = value;
    }

}
