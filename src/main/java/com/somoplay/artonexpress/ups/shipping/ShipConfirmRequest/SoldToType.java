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
 * <p>SoldToType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="SoldToType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Option" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CompanyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AttentionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TaxIdentificationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Address" type="{}SoldToAddressType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SoldToType", propOrder = {
    "option",
    "companyName",
    "attentionName",
    "taxIdentificationNumber",
    "phoneNumber",
    "address"
})
public class SoldToType {

    @XmlElement(name = "Option")
    protected String option;
    @XmlElement(name = "CompanyName")
    protected String companyName;
    @XmlElement(name = "AttentionName")
    protected String attentionName;
    @XmlElement(name = "TaxIdentificationNumber")
    protected String taxIdentificationNumber;
    @XmlElement(name = "PhoneNumber")
    protected String phoneNumber;
    @XmlElement(name = "Address")
    protected SoldToAddressType address;

    /**
     * 获取option属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOption() {
        return option;
    }

    /**
     * 设置option属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOption(String value) {
        this.option = value;
    }

    /**
     * 获取companyName属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * 设置companyName属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * 获取attentionName属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAttentionName() {
        return attentionName;
    }

    /**
     * 设置attentionName属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAttentionName(String value) {
        this.attentionName = value;
    }

    /**
     * 获取taxIdentificationNumber属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTaxIdentificationNumber() {
        return taxIdentificationNumber;
    }

    /**
     * 设置taxIdentificationNumber属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTaxIdentificationNumber(String value) {
        this.taxIdentificationNumber = value;
    }

    /**
     * 获取phoneNumber属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * 设置phoneNumber属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * 获取address属性的值。
     *
     * @return
     *     possible object is
     *     {@link SoldToAddressType }
     *
     */
    public SoldToAddressType getAddress() {
        return address;
    }

    /**
     * 设置address属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link SoldToAddressType }
     *
     */
    public void setAddress(SoldToAddressType value) {
        this.address = value;
    }

}
