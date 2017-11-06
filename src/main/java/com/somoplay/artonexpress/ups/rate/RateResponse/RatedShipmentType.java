//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.10.28 时间 03:47:50 PM EDT
//


package com.somoplay.artonexpress.ups.rate.RateResponse;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RatedShipmentType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="RatedShipmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Disclaimer" type="{}DisclaimerType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Service" type="{}CodeDescriptionType"/&gt;
 *         &lt;element name="RateChart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RatedShipmentWarning" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="BillableWeightCalculationMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RatingMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillingWeight" type="{}WeightType"/&gt;
 *         &lt;element name="TransportationCharges" type="{}ChargesType"/&gt;
 *         &lt;element name="BaseServiceCharge" type="{}ChargesType" minOccurs="0"/&gt;
 *         &lt;element name="ItemizedCharges" type="{}ChargesType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ServiceOptionsCharges" type="{}ChargesType"/&gt;
 *         &lt;element name="TaxCharges" type="{}TaxChargeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TotalCharges" type="{}ChargesType"/&gt;
 *         &lt;element name="TotalChargesWithTaxes" type="{}ChargesType" minOccurs="0"/&gt;
 *         &lt;element name="GuaranteedDaysToDelivery" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ScheduledDeliveryTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RatedPackage" type="{}RatedPackageType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="NegotiatedRates" type="{}NegotiatedRatesType" minOccurs="0"/&gt;
 *         &lt;element name="TimeInTransit" type="{}TimeInTransitResponseType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RatedShipmentType", propOrder = {
    "disclaimer",
    "service",
    "rateChart",
    "ratedShipmentWarning",
    "billableWeightCalculationMethod",
    "ratingMethod",
    "billingWeight",
    "transportationCharges",
    "baseServiceCharge",
    "itemizedCharges",
    "serviceOptionsCharges",
    "taxCharges",
    "totalCharges",
    "totalChargesWithTaxes",
    "guaranteedDaysToDelivery",
    "scheduledDeliveryTime",
    "ratedPackage",
    "negotiatedRates",
    "timeInTransit"
})
public class RatedShipmentType {

    @XmlElement(name = "Disclaimer")
    protected List<DisclaimerType> disclaimer;
    @XmlElement(name = "Service", required = true)
    protected CodeDescriptionType service;
    @XmlElement(name = "RateChart")
    protected String rateChart;
    @XmlElement(name = "RatedShipmentWarning")
    protected List<String> ratedShipmentWarning;
    @XmlElement(name = "BillableWeightCalculationMethod")
    protected String billableWeightCalculationMethod;
    @XmlElement(name = "RatingMethod")
    protected String ratingMethod;
    @XmlElement(name = "BillingWeight", required = true)
    protected WeightType billingWeight;
    @XmlElement(name = "TransportationCharges", required = true)
    protected ChargesType transportationCharges;
    @XmlElement(name = "BaseServiceCharge")
    protected ChargesType baseServiceCharge;
    @XmlElement(name = "ItemizedCharges")
    protected List<ChargesType> itemizedCharges;
    @XmlElement(name = "ServiceOptionsCharges", required = true)
    protected ChargesType serviceOptionsCharges;
    @XmlElement(name = "TaxCharges")
    protected List<TaxChargeType> taxCharges;
    @XmlElement(name = "TotalCharges", required = true)
    protected ChargesType totalCharges;
    @XmlElement(name = "TotalChargesWithTaxes")
    protected ChargesType totalChargesWithTaxes;
    @XmlElement(name = "GuaranteedDaysToDelivery", required = true)
    protected String guaranteedDaysToDelivery;
    @XmlElement(name = "ScheduledDeliveryTime", required = true)
    protected String scheduledDeliveryTime;
    @XmlElement(name = "RatedPackage", required = true)
    protected List<RatedPackageType> ratedPackage;
    @XmlElement(name = "NegotiatedRates")
    protected NegotiatedRatesType negotiatedRates;
    @XmlElement(name = "TimeInTransit")
    protected TimeInTransitResponseType timeInTransit;

    /**
     * Gets the value of the disclaimer property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disclaimer property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisclaimer().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisclaimerType }
     *
     *
     */
    public List<DisclaimerType> getDisclaimer() {
        if (disclaimer == null) {
            disclaimer = new ArrayList<DisclaimerType>();
        }
        return this.disclaimer;
    }

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
     * 获取rateChart属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRateChart() {
        return rateChart;
    }

    /**
     * 设置rateChart属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRateChart(String value) {
        this.rateChart = value;
    }

    /**
     * Gets the value of the ratedShipmentWarning property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ratedShipmentWarning property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRatedShipmentWarning().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     *
     *
     */
    public List<String> getRatedShipmentWarning() {
        if (ratedShipmentWarning == null) {
            ratedShipmentWarning = new ArrayList<String>();
        }
        return this.ratedShipmentWarning;
    }

    /**
     * 获取billableWeightCalculationMethod属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBillableWeightCalculationMethod() {
        return billableWeightCalculationMethod;
    }

    /**
     * 设置billableWeightCalculationMethod属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBillableWeightCalculationMethod(String value) {
        this.billableWeightCalculationMethod = value;
    }

    /**
     * 获取ratingMethod属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRatingMethod() {
        return ratingMethod;
    }

    /**
     * 设置ratingMethod属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRatingMethod(String value) {
        this.ratingMethod = value;
    }

    /**
     * 获取billingWeight属性的值。
     *
     * @return
     *     possible object is
     *     {@link WeightType }
     *
     */
    public WeightType getBillingWeight() {
        return billingWeight;
    }

    /**
     * 设置billingWeight属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link WeightType }
     *
     */
    public void setBillingWeight(WeightType value) {
        this.billingWeight = value;
    }

    /**
     * 获取transportationCharges属性的值。
     *
     * @return
     *     possible object is
     *     {@link ChargesType }
     *
     */
    public ChargesType getTransportationCharges() {
        return transportationCharges;
    }

    /**
     * 设置transportationCharges属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link ChargesType }
     *
     */
    public void setTransportationCharges(ChargesType value) {
        this.transportationCharges = value;
    }

    /**
     * 获取baseServiceCharge属性的值。
     *
     * @return
     *     possible object is
     *     {@link ChargesType }
     *
     */
    public ChargesType getBaseServiceCharge() {
        return baseServiceCharge;
    }

    /**
     * 设置baseServiceCharge属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link ChargesType }
     *
     */
    public void setBaseServiceCharge(ChargesType value) {
        this.baseServiceCharge = value;
    }

    /**
     * Gets the value of the itemizedCharges property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemizedCharges property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemizedCharges().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChargesType }
     *
     *
     */
    public List<ChargesType> getItemizedCharges() {
        if (itemizedCharges == null) {
            itemizedCharges = new ArrayList<ChargesType>();
        }
        return this.itemizedCharges;
    }

    /**
     * 获取serviceOptionsCharges属性的值。
     *
     * @return
     *     possible object is
     *     {@link ChargesType }
     *
     */
    public ChargesType getServiceOptionsCharges() {
        return serviceOptionsCharges;
    }

    /**
     * 设置serviceOptionsCharges属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link ChargesType }
     *
     */
    public void setServiceOptionsCharges(ChargesType value) {
        this.serviceOptionsCharges = value;
    }

    /**
     * Gets the value of the taxCharges property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxCharges property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxCharges().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxChargeType }
     *
     *
     */
    public List<TaxChargeType> getTaxCharges() {
        if (taxCharges == null) {
            taxCharges = new ArrayList<TaxChargeType>();
        }
        return this.taxCharges;
    }

    /**
     * 获取totalCharges属性的值。
     *
     * @return
     *     possible object is
     *     {@link ChargesType }
     *
     */
    public ChargesType getTotalCharges() {
        return totalCharges;
    }

    /**
     * 设置totalCharges属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link ChargesType }
     *
     */
    public void setTotalCharges(ChargesType value) {
        this.totalCharges = value;
    }

    /**
     * 获取totalChargesWithTaxes属性的值。
     *
     * @return
     *     possible object is
     *     {@link ChargesType }
     *
     */
    public ChargesType getTotalChargesWithTaxes() {
        return totalChargesWithTaxes;
    }

    /**
     * 设置totalChargesWithTaxes属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link ChargesType }
     *
     */
    public void setTotalChargesWithTaxes(ChargesType value) {
        this.totalChargesWithTaxes = value;
    }

    /**
     * 获取guaranteedDaysToDelivery属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getGuaranteedDaysToDelivery() {
        return guaranteedDaysToDelivery;
    }

    /**
     * 设置guaranteedDaysToDelivery属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setGuaranteedDaysToDelivery(String value) {
        this.guaranteedDaysToDelivery = value;
    }

    /**
     * 获取scheduledDeliveryTime属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getScheduledDeliveryTime() {
        return scheduledDeliveryTime;
    }

    /**
     * 设置scheduledDeliveryTime属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setScheduledDeliveryTime(String value) {
        this.scheduledDeliveryTime = value;
    }

    /**
     * Gets the value of the ratedPackage property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ratedPackage property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRatedPackage().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RatedPackageType }
     *
     *
     */
    public List<RatedPackageType> getRatedPackage() {
        if (ratedPackage == null) {
            ratedPackage = new ArrayList<RatedPackageType>();
        }
        return this.ratedPackage;
    }

    /**
     * 获取negotiatedRates属性的值。
     *
     * @return
     *     possible object is
     *     {@link NegotiatedRatesType }
     *
     */
    public NegotiatedRatesType getNegotiatedRates() {
        return negotiatedRates;
    }

    /**
     * 设置negotiatedRates属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link NegotiatedRatesType }
     *
     */
    public void setNegotiatedRates(NegotiatedRatesType value) {
        this.negotiatedRates = value;
    }

    /**
     * 获取timeInTransit属性的值。
     *
     * @return
     *     possible object is
     *     {@link TimeInTransitResponseType }
     *
     */
    public TimeInTransitResponseType getTimeInTransit() {
        return timeInTransit;
    }

    /**
     * 设置timeInTransit属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link TimeInTransitResponseType }
     *
     */
    public void setTimeInTransit(TimeInTransitResponseType value) {
        this.timeInTransit = value;
    }

}
