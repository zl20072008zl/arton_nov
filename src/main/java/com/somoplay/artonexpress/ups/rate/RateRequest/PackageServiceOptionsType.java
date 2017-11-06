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
 * <p>PackageServiceOptionsType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="PackageServiceOptionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InsuredValue" type="{}InsuredValueType" minOccurs="0"/&gt;
 *         &lt;element name="AccessPointCOD" type="{}PackageServiceOptionsAccessPointCODType" minOccurs="0"/&gt;
 *         &lt;element name="COD" type="{}CODType" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryConfirmation" type="{}DeliveryConfirmationType" minOccurs="0"/&gt;
 *         &lt;element name="ShipperDeclaredValue" type="{}ShipperDeclaredValueType" minOccurs="0"/&gt;
 *         &lt;element name="ProactiveIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Insurance" type="{}InsuranceType" minOccurs="0"/&gt;
 *         &lt;element name="VerbalConfirmation" type="{}VerbalConfirmationType" minOccurs="0"/&gt;
 *         &lt;element name="UPSPremiumCareIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HazMat" type="{}HazMatType" minOccurs="0"/&gt;
 *         &lt;element name="DryIce" type="{}DryIceType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackageServiceOptionsType", propOrder = {
    "insuredValue",
    "accessPointCOD",
    "cod",
    "deliveryConfirmation",
    "shipperDeclaredValue",
    "proactiveIndicator",
    "insurance",
    "verbalConfirmation",
    "upsPremiumCareIndicator",
    "hazMat",
    "dryIce"
})
public class PackageServiceOptionsType {

    @XmlElement(name = "InsuredValue")
    protected InsuredValueType insuredValue;
    @XmlElement(name = "AccessPointCOD")
    protected PackageServiceOptionsAccessPointCODType accessPointCOD;
    @XmlElement(name = "COD")
    protected CODType cod;
    @XmlElement(name = "DeliveryConfirmation")
    protected DeliveryConfirmationType deliveryConfirmation;
    @XmlElement(name = "ShipperDeclaredValue")
    protected ShipperDeclaredValueType shipperDeclaredValue;
    @XmlElement(name = "ProactiveIndicator")
    protected String proactiveIndicator;
    @XmlElement(name = "Insurance")
    protected InsuranceType insurance;
    @XmlElement(name = "VerbalConfirmation")
    protected VerbalConfirmationType verbalConfirmation;
    @XmlElement(name = "UPSPremiumCareIndicator")
    protected String upsPremiumCareIndicator;
    @XmlElement(name = "HazMat")
    protected HazMatType hazMat;
    @XmlElement(name = "DryIce")
    protected DryIceType dryIce;

    /**
     * 获取insuredValue属性的值。
     *
     * @return
     *     possible object is
     *     {@link InsuredValueType }
     *
     */
    public InsuredValueType getInsuredValue() {
        return insuredValue;
    }

    /**
     * 设置insuredValue属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link InsuredValueType }
     *
     */
    public void setInsuredValue(InsuredValueType value) {
        this.insuredValue = value;
    }

    /**
     * 获取accessPointCOD属性的值。
     *
     * @return
     *     possible object is
     *     {@link PackageServiceOptionsAccessPointCODType }
     *
     */
    public PackageServiceOptionsAccessPointCODType getAccessPointCOD() {
        return accessPointCOD;
    }

    /**
     * 设置accessPointCOD属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link PackageServiceOptionsAccessPointCODType }
     *
     */
    public void setAccessPointCOD(PackageServiceOptionsAccessPointCODType value) {
        this.accessPointCOD = value;
    }

    /**
     * 获取cod属性的值。
     *
     * @return
     *     possible object is
     *     {@link CODType }
     *
     */
    public CODType getCOD() {
        return cod;
    }

    /**
     * 设置cod属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link CODType }
     *
     */
    public void setCOD(CODType value) {
        this.cod = value;
    }

    /**
     * 获取deliveryConfirmation属性的值。
     *
     * @return
     *     possible object is
     *     {@link DeliveryConfirmationType }
     *
     */
    public DeliveryConfirmationType getDeliveryConfirmation() {
        return deliveryConfirmation;
    }

    /**
     * 设置deliveryConfirmation属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link DeliveryConfirmationType }
     *
     */
    public void setDeliveryConfirmation(DeliveryConfirmationType value) {
        this.deliveryConfirmation = value;
    }

    /**
     * 获取shipperDeclaredValue属性的值。
     *
     * @return
     *     possible object is
     *     {@link ShipperDeclaredValueType }
     *
     */
    public ShipperDeclaredValueType getShipperDeclaredValue() {
        return shipperDeclaredValue;
    }

    /**
     * 设置shipperDeclaredValue属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link ShipperDeclaredValueType }
     *
     */
    public void setShipperDeclaredValue(ShipperDeclaredValueType value) {
        this.shipperDeclaredValue = value;
    }

    /**
     * 获取proactiveIndicator属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProactiveIndicator() {
        return proactiveIndicator;
    }

    /**
     * 设置proactiveIndicator属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProactiveIndicator(String value) {
        this.proactiveIndicator = value;
    }

    /**
     * 获取insurance属性的值。
     *
     * @return
     *     possible object is
     *     {@link InsuranceType }
     *
     */
    public InsuranceType getInsurance() {
        return insurance;
    }

    /**
     * 设置insurance属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link InsuranceType }
     *
     */
    public void setInsurance(InsuranceType value) {
        this.insurance = value;
    }

    /**
     * 获取verbalConfirmation属性的值。
     *
     * @return
     *     possible object is
     *     {@link VerbalConfirmationType }
     *
     */
    public VerbalConfirmationType getVerbalConfirmation() {
        return verbalConfirmation;
    }

    /**
     * 设置verbalConfirmation属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link VerbalConfirmationType }
     *
     */
    public void setVerbalConfirmation(VerbalConfirmationType value) {
        this.verbalConfirmation = value;
    }

    /**
     * 获取upsPremiumCareIndicator属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUPSPremiumCareIndicator() {
        return upsPremiumCareIndicator;
    }

    /**
     * 设置upsPremiumCareIndicator属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUPSPremiumCareIndicator(String value) {
        this.upsPremiumCareIndicator = value;
    }

    /**
     * 获取hazMat属性的值。
     *
     * @return
     *     possible object is
     *     {@link HazMatType }
     *
     */
    public HazMatType getHazMat() {
        return hazMat;
    }

    /**
     * 设置hazMat属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link HazMatType }
     *
     */
    public void setHazMat(HazMatType value) {
        this.hazMat = value;
    }

    /**
     * 获取dryIce属性的值。
     *
     * @return
     *     possible object is
     *     {@link DryIceType }
     *
     */
    public DryIceType getDryIce() {
        return dryIce;
    }

    /**
     * 设置dryIce属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link DryIceType }
     *
     */
    public void setDryIce(DryIceType value) {
        this.dryIce = value;
    }

}
