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
 * <p>RateInformationType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="RateInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NegotiatedRatesIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RateChartIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UserLevelDiscountIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateInformationType", propOrder = {
    "negotiatedRatesIndicator",
    "rateChartIndicator",
    "userLevelDiscountIndicator"
})
public class RateInformationType {

    @XmlElement(name = "NegotiatedRatesIndicator")
    protected String negotiatedRatesIndicator;
    @XmlElement(name = "RateChartIndicator")
    protected String rateChartIndicator;
    @XmlElement(name = "UserLevelDiscountIndicator")
    protected String userLevelDiscountIndicator;

    /**
     * 获取negotiatedRatesIndicator属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNegotiatedRatesIndicator() {
        return negotiatedRatesIndicator;
    }

    /**
     * 设置negotiatedRatesIndicator属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNegotiatedRatesIndicator(String value) {
        this.negotiatedRatesIndicator = value;
    }

    /**
     * 获取rateChartIndicator属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRateChartIndicator() {
        return rateChartIndicator;
    }

    /**
     * 设置rateChartIndicator属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRateChartIndicator(String value) {
        this.rateChartIndicator = value;
    }

    /**
     * 获取userLevelDiscountIndicator属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUserLevelDiscountIndicator() {
        return userLevelDiscountIndicator;
    }

    /**
     * 设置userLevelDiscountIndicator属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUserLevelDiscountIndicator(String value) {
        this.userLevelDiscountIndicator = value;
    }

}
