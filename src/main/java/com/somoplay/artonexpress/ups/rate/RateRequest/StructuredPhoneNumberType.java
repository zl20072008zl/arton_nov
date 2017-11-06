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
 * <p>StructuredPhoneNumberType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="StructuredPhoneNumberType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PhoneCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PhoneDialPlanNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PhoneLineNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PhoneExtension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StructuredPhoneNumberType", propOrder = {
    "phoneCountryCode",
    "phoneDialPlanNumber",
    "phoneLineNumber",
    "phoneExtension"
})
public class StructuredPhoneNumberType {

    @XmlElement(name = "PhoneCountryCode")
    protected String phoneCountryCode;
    @XmlElement(name = "PhoneDialPlanNumber", required = true)
    protected String phoneDialPlanNumber;
    @XmlElement(name = "PhoneLineNumber", required = true)
    protected String phoneLineNumber;
    @XmlElement(name = "PhoneExtension")
    protected String phoneExtension;

    /**
     * 获取phoneCountryCode属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPhoneCountryCode() {
        return phoneCountryCode;
    }

    /**
     * 设置phoneCountryCode属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPhoneCountryCode(String value) {
        this.phoneCountryCode = value;
    }

    /**
     * 获取phoneDialPlanNumber属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPhoneDialPlanNumber() {
        return phoneDialPlanNumber;
    }

    /**
     * 设置phoneDialPlanNumber属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPhoneDialPlanNumber(String value) {
        this.phoneDialPlanNumber = value;
    }

    /**
     * 获取phoneLineNumber属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPhoneLineNumber() {
        return phoneLineNumber;
    }

    /**
     * 设置phoneLineNumber属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPhoneLineNumber(String value) {
        this.phoneLineNumber = value;
    }

    /**
     * 获取phoneExtension属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPhoneExtension() {
        return phoneExtension;
    }

    /**
     * 设置phoneExtension属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPhoneExtension(String value) {
        this.phoneExtension = value;
    }

}
