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
 * <p>DryIceType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="DryIceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RegulationSet" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DryIceWeight" type="{}DryIceWeightType"/&gt;
 *         &lt;element name="MedicalUseIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AuditRequired" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DryIceType", propOrder = {
    "regulationSet",
    "dryIceWeight",
    "medicalUseIndicator",
    "auditRequired"
})
public class DryIceType {

    @XmlElement(name = "RegulationSet", required = true)
    protected String regulationSet;
    @XmlElement(name = "DryIceWeight", required = true)
    protected DryIceWeightType dryIceWeight;
    @XmlElement(name = "MedicalUseIndicator")
    protected String medicalUseIndicator;
    @XmlElement(name = "AuditRequired")
    protected String auditRequired;

    /**
     * 获取regulationSet属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRegulationSet() {
        return regulationSet;
    }

    /**
     * 设置regulationSet属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRegulationSet(String value) {
        this.regulationSet = value;
    }

    /**
     * 获取dryIceWeight属性的值。
     *
     * @return
     *     possible object is
     *     {@link DryIceWeightType }
     *
     */
    public DryIceWeightType getDryIceWeight() {
        return dryIceWeight;
    }

    /**
     * 设置dryIceWeight属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link DryIceWeightType }
     *
     */
    public void setDryIceWeight(DryIceWeightType value) {
        this.dryIceWeight = value;
    }

    /**
     * 获取medicalUseIndicator属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMedicalUseIndicator() {
        return medicalUseIndicator;
    }

    /**
     * 设置medicalUseIndicator属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMedicalUseIndicator(String value) {
        this.medicalUseIndicator = value;
    }

    /**
     * 获取auditRequired属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAuditRequired() {
        return auditRequired;
    }

    /**
     * 设置auditRequired属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAuditRequired(String value) {
        this.auditRequired = value;
    }

}
