//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.10.28 时间 03:38:23 PM EDT
//


package com.somoplay.artonexpress.ups.shipping.ShipConfirmResponse;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RateChart" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{}BaseServiceCharge" minOccurs="0"/&gt;
 *         &lt;element ref="{}TransportationCharges"/&gt;
 *         &lt;element ref="{}ServiceOptionsCharges"/&gt;
 *         &lt;element ref="{}ItemizedCharges" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}TaxCharges" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}TotalCharges"/&gt;
 *         &lt;element ref="{}TotalChargesWithTaxes" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "rateChart",
    "baseServiceCharge",
    "transportationCharges",
    "serviceOptionsCharges",
    "itemizedCharges",
    "taxCharges",
    "totalCharges",
    "totalChargesWithTaxes"
})
@XmlRootElement(name = "ShipmentCharges")
public class ShipmentCharges {

    @XmlElement(name = "RateChart", required = true)
    protected String rateChart;
    @XmlElement(name = "BaseServiceCharge")
    protected MonetaryType baseServiceCharge;
    @XmlElement(name = "TransportationCharges", required = true)
    protected MonetaryType transportationCharges;
    @XmlElement(name = "ServiceOptionsCharges", required = true)
    protected MonetaryType serviceOptionsCharges;
    @XmlElement(name = "ItemizedCharges")
    protected List<MonetaryType> itemizedCharges;
    @XmlElement(name = "TaxCharges")
    protected List<TaxChargeType> taxCharges;
    @XmlElement(name = "TotalCharges", required = true)
    protected MonetaryType totalCharges;
    @XmlElement(name = "TotalChargesWithTaxes")
    protected MonetaryType totalChargesWithTaxes;

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
     * 获取baseServiceCharge属性的值。
     *
     * @return
     *     possible object is
     *     {@link MonetaryType }
     *
     */
    public MonetaryType getBaseServiceCharge() {
        return baseServiceCharge;
    }

    /**
     * 设置baseServiceCharge属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link MonetaryType }
     *
     */
    public void setBaseServiceCharge(MonetaryType value) {
        this.baseServiceCharge = value;
    }

    /**
     * 获取transportationCharges属性的值。
     *
     * @return
     *     possible object is
     *     {@link MonetaryType }
     *
     */
    public MonetaryType getTransportationCharges() {
        return transportationCharges;
    }

    /**
     * 设置transportationCharges属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link MonetaryType }
     *
     */
    public void setTransportationCharges(MonetaryType value) {
        this.transportationCharges = value;
    }

    /**
     * 获取serviceOptionsCharges属性的值。
     *
     * @return
     *     possible object is
     *     {@link MonetaryType }
     *
     */
    public MonetaryType getServiceOptionsCharges() {
        return serviceOptionsCharges;
    }

    /**
     * 设置serviceOptionsCharges属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link MonetaryType }
     *
     */
    public void setServiceOptionsCharges(MonetaryType value) {
        this.serviceOptionsCharges = value;
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
     * {@link MonetaryType }
     *
     *
     */
    public List<MonetaryType> getItemizedCharges() {
        if (itemizedCharges == null) {
            itemizedCharges = new ArrayList<MonetaryType>();
        }
        return this.itemizedCharges;
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
     *     {@link MonetaryType }
     *
     */
    public MonetaryType getTotalCharges() {
        return totalCharges;
    }

    /**
     * 设置totalCharges属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link MonetaryType }
     *
     */
    public void setTotalCharges(MonetaryType value) {
        this.totalCharges = value;
    }

    /**
     * 获取totalChargesWithTaxes属性的值。
     *
     * @return
     *     possible object is
     *     {@link MonetaryType }
     *
     */
    public MonetaryType getTotalChargesWithTaxes() {
        return totalChargesWithTaxes;
    }

    /**
     * 设置totalChargesWithTaxes属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link MonetaryType }
     *
     */
    public void setTotalChargesWithTaxes(MonetaryType value) {
        this.totalChargesWithTaxes = value;
    }

}
