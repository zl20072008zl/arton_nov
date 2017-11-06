//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.10.28 时间 03:47:50 PM EDT
//


package com.somoplay.artonexpress.ups.rate.RateResponse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ServiceSummaryType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="ServiceSummaryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Service" type="{}CodeDescriptionType"/&gt;
 *         &lt;element name="GuaranteedIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Disclaimer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EstimatedArrival" type="{}EstimatedArrivalType"/&gt;
 *         &lt;element name="SaturdayDelivery" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SaturdayDeliveryDisclaimer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceSummaryType", propOrder = {
    "service",
    "guaranteedIndicator",
    "disclaimer",
    "estimatedArrival",
    "saturdayDelivery",
    "saturdayDeliveryDisclaimer"
})
public class ServiceSummaryType {

    @XmlElement(name = "Service", required = true)
    protected CodeDescriptionType service;
    @XmlElement(name = "GuaranteedIndicator")
    protected String guaranteedIndicator;
    @XmlElement(name = "Disclaimer")
    protected String disclaimer;
    @XmlElement(name = "EstimatedArrival", required = true)
    protected EstimatedArrivalType estimatedArrival;
    @XmlElement(name = "SaturdayDelivery")
    protected String saturdayDelivery;
    @XmlElement(name = "SaturdayDeliveryDisclaimer")
    protected String saturdayDeliveryDisclaimer;

    /**
     * 获取service属性的值。
     *
     * @return
     *     possible object is
     *     {@link CodeDescriptionType }
     *
     */
    public CodeDescriptionType getService() {
        return service;
    }

    /**
     * 设置service属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link CodeDescriptionType }
     *
     */
    public void setService(CodeDescriptionType value) {
        this.service = value;
    }

    /**
     * 获取guaranteedIndicator属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getGuaranteedIndicator() {
        return guaranteedIndicator;
    }

    /**
     * 设置guaranteedIndicator属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setGuaranteedIndicator(String value) {
        this.guaranteedIndicator = value;
    }

    /**
     * 获取disclaimer属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDisclaimer() {
        return disclaimer;
    }

    /**
     * 设置disclaimer属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDisclaimer(String value) {
        this.disclaimer = value;
    }

    /**
     * 获取estimatedArrival属性的值。
     *
     * @return
     *     possible object is
     *     {@link EstimatedArrivalType }
     *
     */
    public EstimatedArrivalType getEstimatedArrival() {
        return estimatedArrival;
    }

    /**
     * 设置estimatedArrival属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link EstimatedArrivalType }
     *
     */
    public void setEstimatedArrival(EstimatedArrivalType value) {
        this.estimatedArrival = value;
    }

    /**
     * 获取saturdayDelivery属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSaturdayDelivery() {
        return saturdayDelivery;
    }

    /**
     * 设置saturdayDelivery属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSaturdayDelivery(String value) {
        this.saturdayDelivery = value;
    }

    /**
     * 获取saturdayDeliveryDisclaimer属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSaturdayDeliveryDisclaimer() {
        return saturdayDeliveryDisclaimer;
    }

    /**
     * 设置saturdayDeliveryDisclaimer属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSaturdayDeliveryDisclaimer(String value) {
        this.saturdayDeliveryDisclaimer = value;
    }

}
