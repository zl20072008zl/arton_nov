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
 * <p>InsuranceType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="InsuranceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BasicFlexibleParcelIndicator" type="{}InsuranceValueType" minOccurs="0"/&gt;
 *         &lt;element name="ExtendedFlexibleParcelIndicator" type="{}InsuranceValueType" minOccurs="0"/&gt;
 *         &lt;element name="TimeInTransitFlexibleParcelIndicator" type="{}InsuranceValueType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsuranceType", propOrder = {
    "basicFlexibleParcelIndicator",
    "extendedFlexibleParcelIndicator",
    "timeInTransitFlexibleParcelIndicator"
})
public class InsuranceType {

    @XmlElement(name = "BasicFlexibleParcelIndicator")
    protected InsuranceValueType basicFlexibleParcelIndicator;
    @XmlElement(name = "ExtendedFlexibleParcelIndicator")
    protected InsuranceValueType extendedFlexibleParcelIndicator;
    @XmlElement(name = "TimeInTransitFlexibleParcelIndicator")
    protected InsuranceValueType timeInTransitFlexibleParcelIndicator;

    /**
     * 获取basicFlexibleParcelIndicator属性的值。
     *
     * @return
     *     possible object is
     *     {@link InsuranceValueType }
     *
     */
    public InsuranceValueType getBasicFlexibleParcelIndicator() {
        return basicFlexibleParcelIndicator;
    }

    /**
     * 设置basicFlexibleParcelIndicator属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link InsuranceValueType }
     *
     */
    public void setBasicFlexibleParcelIndicator(InsuranceValueType value) {
        this.basicFlexibleParcelIndicator = value;
    }

    /**
     * 获取extendedFlexibleParcelIndicator属性的值。
     *
     * @return
     *     possible object is
     *     {@link InsuranceValueType }
     *
     */
    public InsuranceValueType getExtendedFlexibleParcelIndicator() {
        return extendedFlexibleParcelIndicator;
    }

    /**
     * 设置extendedFlexibleParcelIndicator属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link InsuranceValueType }
     *
     */
    public void setExtendedFlexibleParcelIndicator(InsuranceValueType value) {
        this.extendedFlexibleParcelIndicator = value;
    }

    /**
     * 获取timeInTransitFlexibleParcelIndicator属性的值。
     *
     * @return
     *     possible object is
     *     {@link InsuranceValueType }
     *
     */
    public InsuranceValueType getTimeInTransitFlexibleParcelIndicator() {
        return timeInTransitFlexibleParcelIndicator;
    }

    /**
     * 设置timeInTransitFlexibleParcelIndicator属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link InsuranceValueType }
     *
     */
    public void setTimeInTransitFlexibleParcelIndicator(InsuranceValueType value) {
        this.timeInTransitFlexibleParcelIndicator = value;
    }

}
