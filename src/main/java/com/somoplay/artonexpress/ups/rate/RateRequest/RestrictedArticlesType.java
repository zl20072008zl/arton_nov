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
 * <p>RestrictedArticlesType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="RestrictedArticlesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AlcoholicBeveragesIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DiagnosticSpecimensIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PerishablesIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PlantsIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SeedsIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SpecialExceptionsIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TobaccoIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RestrictedArticlesType", propOrder = {
    "alcoholicBeveragesIndicator",
    "diagnosticSpecimensIndicator",
    "perishablesIndicator",
    "plantsIndicator",
    "seedsIndicator",
    "specialExceptionsIndicator",
    "tobaccoIndicator"
})
public class RestrictedArticlesType {

    @XmlElement(name = "AlcoholicBeveragesIndicator")
    protected String alcoholicBeveragesIndicator;
    @XmlElement(name = "DiagnosticSpecimensIndicator")
    protected String diagnosticSpecimensIndicator;
    @XmlElement(name = "PerishablesIndicator")
    protected String perishablesIndicator;
    @XmlElement(name = "PlantsIndicator")
    protected String plantsIndicator;
    @XmlElement(name = "SeedsIndicator")
    protected String seedsIndicator;
    @XmlElement(name = "SpecialExceptionsIndicator")
    protected String specialExceptionsIndicator;
    @XmlElement(name = "TobaccoIndicator")
    protected String tobaccoIndicator;

    /**
     * 获取alcoholicBeveragesIndicator属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAlcoholicBeveragesIndicator() {
        return alcoholicBeveragesIndicator;
    }

    /**
     * 设置alcoholicBeveragesIndicator属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAlcoholicBeveragesIndicator(String value) {
        this.alcoholicBeveragesIndicator = value;
    }

    /**
     * 获取diagnosticSpecimensIndicator属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDiagnosticSpecimensIndicator() {
        return diagnosticSpecimensIndicator;
    }

    /**
     * 设置diagnosticSpecimensIndicator属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDiagnosticSpecimensIndicator(String value) {
        this.diagnosticSpecimensIndicator = value;
    }

    /**
     * 获取perishablesIndicator属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPerishablesIndicator() {
        return perishablesIndicator;
    }

    /**
     * 设置perishablesIndicator属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPerishablesIndicator(String value) {
        this.perishablesIndicator = value;
    }

    /**
     * 获取plantsIndicator属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPlantsIndicator() {
        return plantsIndicator;
    }

    /**
     * 设置plantsIndicator属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPlantsIndicator(String value) {
        this.plantsIndicator = value;
    }

    /**
     * 获取seedsIndicator属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSeedsIndicator() {
        return seedsIndicator;
    }

    /**
     * 设置seedsIndicator属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSeedsIndicator(String value) {
        this.seedsIndicator = value;
    }

    /**
     * 获取specialExceptionsIndicator属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSpecialExceptionsIndicator() {
        return specialExceptionsIndicator;
    }

    /**
     * 设置specialExceptionsIndicator属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSpecialExceptionsIndicator(String value) {
        this.specialExceptionsIndicator = value;
    }

    /**
     * 获取tobaccoIndicator属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTobaccoIndicator() {
        return tobaccoIndicator;
    }

    /**
     * 设置tobaccoIndicator属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTobaccoIndicator(String value) {
        this.tobaccoIndicator = value;
    }

}
