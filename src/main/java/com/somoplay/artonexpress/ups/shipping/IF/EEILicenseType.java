//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.10.28 时间 03:38:22 PM EDT
//


package com.somoplay.artonexpress.ups.shipping.IF;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>EEILicenseType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="EEILicenseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LicenseLineValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ECCNNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EEILicenseType", propOrder = {
    "number",
    "code",
    "licenseLineValue",
    "eccnNumber"
})
public class EEILicenseType {

    @XmlElement(name = "Number")
    protected String number;
    @XmlElement(name = "Code")
    protected String code;
    @XmlElement(name = "LicenseLineValue")
    protected String licenseLineValue;
    @XmlElement(name = "ECCNNumber")
    protected String eccnNumber;

    /**
     * 获取number属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNumber() {
        return number;
    }

    /**
     * 设置number属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNumber(String value) {
        this.number = value;
    }

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
     * 获取licenseLineValue属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLicenseLineValue() {
        return licenseLineValue;
    }

    /**
     * 设置licenseLineValue属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLicenseLineValue(String value) {
        this.licenseLineValue = value;
    }

    /**
     * 获取eccnNumber属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getECCNNumber() {
        return eccnNumber;
    }

    /**
     * 设置eccnNumber属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setECCNNumber(String value) {
        this.eccnNumber = value;
    }

}
