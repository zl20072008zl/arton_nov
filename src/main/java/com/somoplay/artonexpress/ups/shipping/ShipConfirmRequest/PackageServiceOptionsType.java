//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.10.28 时间 03:38:23 PM EDT
//


package com.somoplay.artonexpress.ups.shipping.ShipConfirmRequest;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="DeliveryConfirmation" type="{}PackageServiceOptionsDeliveryConfirmationType" minOccurs="0"/&gt;
 *         &lt;element name="InsuredValue" type="{}InsuredValueType" minOccurs="0"/&gt;
 *         &lt;element name="COD" type="{}PackageServiceOptionsCODType" minOccurs="0"/&gt;
 *         &lt;element name="AccessPointCOD" type="{}PackageServiceOptionsAccessPointCODType" minOccurs="0"/&gt;
 *         &lt;element name="VerbalConfirmation" type="{}VerbalConfirmationType" minOccurs="0"/&gt;
 *         &lt;element name="ShipperReleaseIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Notification" type="{}PackageServiceOptionsNotificationType" minOccurs="0"/&gt;
 *         &lt;element name="HazMat" type="{}HazMatType" maxOccurs="3" minOccurs="0"/&gt;
 *         &lt;element name="DryIce" type="{}DryIceType" minOccurs="0"/&gt;
 *         &lt;element name="UPSPremiumCareIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProactiveIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PackageIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ClinicalTrialsID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "deliveryConfirmation",
    "insuredValue",
    "cod",
    "accessPointCOD",
    "verbalConfirmation",
    "shipperReleaseIndicator",
    "notification",
    "hazMat",
    "dryIce",
    "upsPremiumCareIndicator",
    "proactiveIndicator",
    "packageIdentifier",
    "clinicalTrialsID"
})
public class PackageServiceOptionsType {

    @XmlElement(name = "DeliveryConfirmation")
    protected PackageServiceOptionsDeliveryConfirmationType deliveryConfirmation;
    @XmlElement(name = "InsuredValue")
    protected InsuredValueType insuredValue;
    @XmlElement(name = "COD")
    protected PackageServiceOptionsCODType cod;
    @XmlElement(name = "AccessPointCOD")
    protected PackageServiceOptionsAccessPointCODType accessPointCOD;
    @XmlElement(name = "VerbalConfirmation")
    protected VerbalConfirmationType verbalConfirmation;
    @XmlElement(name = "ShipperReleaseIndicator")
    protected String shipperReleaseIndicator;
    @XmlElement(name = "Notification")
    protected PackageServiceOptionsNotificationType notification;
    @XmlElement(name = "HazMat")
    protected List<HazMatType> hazMat;
    @XmlElement(name = "DryIce")
    protected DryIceType dryIce;
    @XmlElement(name = "UPSPremiumCareIndicator")
    protected String upsPremiumCareIndicator;
    @XmlElement(name = "ProactiveIndicator")
    protected String proactiveIndicator;
    @XmlElement(name = "PackageIdentifier")
    protected String packageIdentifier;
    @XmlElement(name = "ClinicalTrialsID")
    protected String clinicalTrialsID;

    /**
     * 获取deliveryConfirmation属性的值。
     *
     * @return
     *     possible object is
     *     {@link PackageServiceOptionsDeliveryConfirmationType }
     *
     */
    public PackageServiceOptionsDeliveryConfirmationType getDeliveryConfirmation() {
        return deliveryConfirmation;
    }

    /**
     * 设置deliveryConfirmation属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link PackageServiceOptionsDeliveryConfirmationType }
     *
     */
    public void setDeliveryConfirmation(PackageServiceOptionsDeliveryConfirmationType value) {
        this.deliveryConfirmation = value;
    }

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
     * 获取cod属性的值。
     *
     * @return
     *     possible object is
     *     {@link PackageServiceOptionsCODType }
     *
     */
    public PackageServiceOptionsCODType getCOD() {
        return cod;
    }

    /**
     * 设置cod属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link PackageServiceOptionsCODType }
     *
     */
    public void setCOD(PackageServiceOptionsCODType value) {
        this.cod = value;
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
     * 获取shipperReleaseIndicator属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getShipperReleaseIndicator() {
        return shipperReleaseIndicator;
    }

    /**
     * 设置shipperReleaseIndicator属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setShipperReleaseIndicator(String value) {
        this.shipperReleaseIndicator = value;
    }

    /**
     * 获取notification属性的值。
     *
     * @return
     *     possible object is
     *     {@link PackageServiceOptionsNotificationType }
     *
     */
    public PackageServiceOptionsNotificationType getNotification() {
        return notification;
    }

    /**
     * 设置notification属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link PackageServiceOptionsNotificationType }
     *
     */
    public void setNotification(PackageServiceOptionsNotificationType value) {
        this.notification = value;
    }

    /**
     * Gets the value of the hazMat property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hazMat property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHazMat().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HazMatType }
     *
     *
     */
    public List<HazMatType> getHazMat() {
        if (hazMat == null) {
            hazMat = new ArrayList<HazMatType>();
        }
        return this.hazMat;
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
     * 获取packageIdentifier属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPackageIdentifier() {
        return packageIdentifier;
    }

    /**
     * 设置packageIdentifier属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPackageIdentifier(String value) {
        this.packageIdentifier = value;
    }

    /**
     * 获取clinicalTrialsID属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getClinicalTrialsID() {
        return clinicalTrialsID;
    }

    /**
     * 设置clinicalTrialsID属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setClinicalTrialsID(String value) {
        this.clinicalTrialsID = value;
    }

}
