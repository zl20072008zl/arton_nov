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
 * <p>RatedPackageType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="RatedPackageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="TransportationCharges" type="{}ChargesType" minOccurs="0"/&gt;
 *           &lt;element name="BaseServiceCharge" type="{}ChargesType" minOccurs="0"/&gt;
 *           &lt;element name="ServiceOptionsCharges" type="{}ChargesType" minOccurs="0"/&gt;
 *           &lt;element name="ItemizedCharges" type="{}ChargesType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element name="TotalCharges" type="{}ChargesType"/&gt;
 *           &lt;element name="NegotiatedCharges" type="{}NegotiatedChargesType" minOccurs="0"/&gt;
 *           &lt;element name="Weight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *           &lt;element name="BillingWeight" type="{}WeightType" minOccurs="0"/&gt;
 *           &lt;element name="Accessorial" type="{}AccessorialType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RatedPackageType", propOrder = {
    "transportationCharges",
    "baseServiceCharge",
    "serviceOptionsCharges",
    "itemizedCharges",
    "totalCharges",
    "negotiatedCharges",
    "weight",
    "billingWeight",
    "accessorial"
})
public class RatedPackageType {

    @XmlElement(name = "TransportationCharges")
    protected ChargesType transportationCharges;
    @XmlElement(name = "BaseServiceCharge")
    protected ChargesType baseServiceCharge;
    @XmlElement(name = "ServiceOptionsCharges")
    protected ChargesType serviceOptionsCharges;
    @XmlElement(name = "ItemizedCharges")
    protected List<ChargesType> itemizedCharges;
    @XmlElement(name = "TotalCharges", required = true)
    protected ChargesType totalCharges;
    @XmlElement(name = "NegotiatedCharges")
    protected NegotiatedChargesType negotiatedCharges;
    @XmlElement(name = "Weight")
    protected String weight;
    @XmlElement(name = "BillingWeight")
    protected WeightType billingWeight;
    @XmlElement(name = "Accessorial")
    protected List<AccessorialType> accessorial;

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
     * 获取negotiatedCharges属性的值。
     *
     * @return
     *     possible object is
     *     {@link NegotiatedChargesType }
     *
     */
    public NegotiatedChargesType getNegotiatedCharges() {
        return negotiatedCharges;
    }

    /**
     * 设置negotiatedCharges属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link NegotiatedChargesType }
     *
     */
    public void setNegotiatedCharges(NegotiatedChargesType value) {
        this.negotiatedCharges = value;
    }

    /**
     * 获取weight属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getWeight() {
        return weight;
    }

    /**
     * 设置weight属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setWeight(String value) {
        this.weight = value;
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
     * Gets the value of the accessorial property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accessorial property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccessorial().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccessorialType }
     *
     *
     */
    public List<AccessorialType> getAccessorial() {
        if (accessorial == null) {
            accessorial = new ArrayList<AccessorialType>();
        }
        return this.accessorial;
    }

}
