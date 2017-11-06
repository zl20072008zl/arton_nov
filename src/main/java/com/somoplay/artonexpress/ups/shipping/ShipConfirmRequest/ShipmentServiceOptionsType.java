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
 * <p>ShipmentServiceOptionsType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="ShipmentServiceOptionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SaturdayDelivery" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SaturdayPickupIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="COD" type="{}ShipmentServiceOptionsCODType" minOccurs="0"/&gt;
 *         &lt;element name="AccessPointCOD" type="{}ShipmentServiceOptionsAccessPointCODType" minOccurs="0"/&gt;
 *         &lt;element name="DeliverToAddresseeOnlyIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DirectDeliveryOnlyIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Notification" type="{}ShipmentServiceOptionsNotificationType" maxOccurs="3" minOccurs="0"/&gt;
 *         &lt;element name="LabelDelivery" type="{}LabelDeliveryType" minOccurs="0"/&gt;
 *         &lt;element name="InternationalForms" type="{}InternationalFormsType" minOccurs="0"/&gt;
 *         &lt;element name="ReturnOfDocumentIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryConfirmation" type="{}ShipmentServiceOptionsDeliveryConfirmationType" minOccurs="0"/&gt;
 *         &lt;element name="ImportControlIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LabelMethod" type="{}LabelMethodType" minOccurs="0"/&gt;
 *         &lt;element name="CommercialInvoiceRemovalIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UPScarbonneutralIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PreAlertNotification" type="{}PreAlertNotificationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ExchangeForwardIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HoldForPickupIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DropoffAtUPSFacilityIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LiftGateForPickUpIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LiftGateForDeliveryIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SDLShipmentIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EPRAReleaseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RestrictedArticles" type="{}RestrictedArticlesType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentServiceOptionsType", propOrder = {
    "saturdayDelivery",
    "saturdayPickupIndicator",
    "cod",
    "accessPointCOD",
    "deliverToAddresseeOnlyIndicator",
    "directDeliveryOnlyIndicator",
    "notification",
    "labelDelivery",
    "internationalForms",
    "returnOfDocumentIndicator",
    "deliveryConfirmation",
    "importControlIndicator",
    "labelMethod",
    "commercialInvoiceRemovalIndicator",
    "upScarbonneutralIndicator",
    "preAlertNotification",
    "exchangeForwardIndicator",
    "holdForPickupIndicator",
    "dropoffAtUPSFacilityIndicator",
    "liftGateForPickUpIndicator",
    "liftGateForDeliveryIndicator",
    "sdlShipmentIndicator",
    "epraReleaseCode",
    "restrictedArticles"
})
public class ShipmentServiceOptionsType {

    @XmlElement(name = "SaturdayDelivery")
    protected String saturdayDelivery;
    @XmlElement(name = "SaturdayPickupIndicator")
    protected String saturdayPickupIndicator;
    @XmlElement(name = "COD")
    protected ShipmentServiceOptionsCODType cod;
    @XmlElement(name = "AccessPointCOD")
    protected ShipmentServiceOptionsAccessPointCODType accessPointCOD;
    @XmlElement(name = "DeliverToAddresseeOnlyIndicator")
    protected String deliverToAddresseeOnlyIndicator;
    @XmlElement(name = "DirectDeliveryOnlyIndicator")
    protected String directDeliveryOnlyIndicator;
    @XmlElement(name = "Notification")
    protected List<ShipmentServiceOptionsNotificationType> notification;
    @XmlElement(name = "LabelDelivery")
    protected LabelDeliveryType labelDelivery;
    @XmlElement(name = "InternationalForms")
    protected InternationalFormsType internationalForms;
    @XmlElement(name = "ReturnOfDocumentIndicator")
    protected String returnOfDocumentIndicator;
    @XmlElement(name = "DeliveryConfirmation")
    protected ShipmentServiceOptionsDeliveryConfirmationType deliveryConfirmation;
    @XmlElement(name = "ImportControlIndicator")
    protected String importControlIndicator;
    @XmlElement(name = "LabelMethod")
    protected LabelMethodType labelMethod;
    @XmlElement(name = "CommercialInvoiceRemovalIndicator")
    protected String commercialInvoiceRemovalIndicator;
    @XmlElement(name = "UPScarbonneutralIndicator")
    protected String upScarbonneutralIndicator;
    @XmlElement(name = "PreAlertNotification")
    protected List<PreAlertNotificationType> preAlertNotification;
    @XmlElement(name = "ExchangeForwardIndicator")
    protected String exchangeForwardIndicator;
    @XmlElement(name = "HoldForPickupIndicator")
    protected String holdForPickupIndicator;
    @XmlElement(name = "DropoffAtUPSFacilityIndicator")
    protected String dropoffAtUPSFacilityIndicator;
    @XmlElement(name = "LiftGateForPickUpIndicator")
    protected String liftGateForPickUpIndicator;
    @XmlElement(name = "LiftGateForDeliveryIndicator")
    protected String liftGateForDeliveryIndicator;
    @XmlElement(name = "SDLShipmentIndicator")
    protected String sdlShipmentIndicator;
    @XmlElement(name = "EPRAReleaseCode")
    protected String epraReleaseCode;
    @XmlElement(name = "RestrictedArticles")
    protected RestrictedArticlesType restrictedArticles;

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
     * 获取saturdayPickupIndicator属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSaturdayPickupIndicator() {
        return saturdayPickupIndicator;
    }

    /**
     * 设置saturdayPickupIndicator属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSaturdayPickupIndicator(String value) {
        this.saturdayPickupIndicator = value;
    }

    /**
     * 获取cod属性的值。
     *
     * @return
     *     possible object is
     *     {@link ShipmentServiceOptionsCODType }
     *
     */
    public ShipmentServiceOptionsCODType getCOD() {
        return cod;
    }

    /**
     * 设置cod属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link ShipmentServiceOptionsCODType }
     *
     */
    public void setCOD(ShipmentServiceOptionsCODType value) {
        this.cod = value;
    }

    /**
     * 获取accessPointCOD属性的值。
     *
     * @return
     *     possible object is
     *     {@link ShipmentServiceOptionsAccessPointCODType }
     *
     */
    public ShipmentServiceOptionsAccessPointCODType getAccessPointCOD() {
        return accessPointCOD;
    }

    /**
     * 设置accessPointCOD属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link ShipmentServiceOptionsAccessPointCODType }
     *
     */
    public void setAccessPointCOD(ShipmentServiceOptionsAccessPointCODType value) {
        this.accessPointCOD = value;
    }

    /**
     * 获取deliverToAddresseeOnlyIndicator属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDeliverToAddresseeOnlyIndicator() {
        return deliverToAddresseeOnlyIndicator;
    }

    /**
     * 设置deliverToAddresseeOnlyIndicator属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDeliverToAddresseeOnlyIndicator(String value) {
        this.deliverToAddresseeOnlyIndicator = value;
    }

    /**
     * 获取directDeliveryOnlyIndicator属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDirectDeliveryOnlyIndicator() {
        return directDeliveryOnlyIndicator;
    }

    /**
     * 设置directDeliveryOnlyIndicator属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDirectDeliveryOnlyIndicator(String value) {
        this.directDeliveryOnlyIndicator = value;
    }

    /**
     * Gets the value of the notification property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notification property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotification().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentServiceOptionsNotificationType }
     *
     *
     */
    public List<ShipmentServiceOptionsNotificationType> getNotification() {
        if (notification == null) {
            notification = new ArrayList<ShipmentServiceOptionsNotificationType>();
        }
        return this.notification;
    }

    /**
     * 获取labelDelivery属性的值。
     *
     * @return
     *     possible object is
     *     {@link LabelDeliveryType }
     *
     */
    public LabelDeliveryType getLabelDelivery() {
        return labelDelivery;
    }

    /**
     * 设置labelDelivery属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link LabelDeliveryType }
     *
     */
    public void setLabelDelivery(LabelDeliveryType value) {
        this.labelDelivery = value;
    }

    /**
     * 获取internationalForms属性的值。
     *
     * @return
     *     possible object is
     *     {@link InternationalFormsType }
     *
     */
    public InternationalFormsType getInternationalForms() {
        return internationalForms;
    }

    /**
     * 设置internationalForms属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link InternationalFormsType }
     *
     */
    public void setInternationalForms(InternationalFormsType value) {
        this.internationalForms = value;
    }

    /**
     * 获取returnOfDocumentIndicator属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getReturnOfDocumentIndicator() {
        return returnOfDocumentIndicator;
    }

    /**
     * 设置returnOfDocumentIndicator属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setReturnOfDocumentIndicator(String value) {
        this.returnOfDocumentIndicator = value;
    }

    /**
     * 获取deliveryConfirmation属性的值。
     *
     * @return
     *     possible object is
     *     {@link ShipmentServiceOptionsDeliveryConfirmationType }
     *
     */
    public ShipmentServiceOptionsDeliveryConfirmationType getDeliveryConfirmation() {
        return deliveryConfirmation;
    }

    /**
     * 设置deliveryConfirmation属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link ShipmentServiceOptionsDeliveryConfirmationType }
     *
     */
    public void setDeliveryConfirmation(ShipmentServiceOptionsDeliveryConfirmationType value) {
        this.deliveryConfirmation = value;
    }

    /**
     * 获取importControlIndicator属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getImportControlIndicator() {
        return importControlIndicator;
    }

    /**
     * 设置importControlIndicator属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setImportControlIndicator(String value) {
        this.importControlIndicator = value;
    }

    /**
     * 获取labelMethod属性的值。
     *
     * @return
     *     possible object is
     *     {@link LabelMethodType }
     *
     */
    public LabelMethodType getLabelMethod() {
        return labelMethod;
    }

    /**
     * 设置labelMethod属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link LabelMethodType }
     *
     */
    public void setLabelMethod(LabelMethodType value) {
        this.labelMethod = value;
    }

    /**
     * 获取commercialInvoiceRemovalIndicator属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCommercialInvoiceRemovalIndicator() {
        return commercialInvoiceRemovalIndicator;
    }

    /**
     * 设置commercialInvoiceRemovalIndicator属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCommercialInvoiceRemovalIndicator(String value) {
        this.commercialInvoiceRemovalIndicator = value;
    }

    /**
     * 获取upScarbonneutralIndicator属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUPScarbonneutralIndicator() {
        return upScarbonneutralIndicator;
    }

    /**
     * 设置upScarbonneutralIndicator属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUPScarbonneutralIndicator(String value) {
        this.upScarbonneutralIndicator = value;
    }

    /**
     * Gets the value of the preAlertNotification property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preAlertNotification property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreAlertNotification().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PreAlertNotificationType }
     *
     *
     */
    public List<PreAlertNotificationType> getPreAlertNotification() {
        if (preAlertNotification == null) {
            preAlertNotification = new ArrayList<PreAlertNotificationType>();
        }
        return this.preAlertNotification;
    }

    /**
     * 获取exchangeForwardIndicator属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getExchangeForwardIndicator() {
        return exchangeForwardIndicator;
    }

    /**
     * 设置exchangeForwardIndicator属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setExchangeForwardIndicator(String value) {
        this.exchangeForwardIndicator = value;
    }

    /**
     * 获取holdForPickupIndicator属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getHoldForPickupIndicator() {
        return holdForPickupIndicator;
    }

    /**
     * 设置holdForPickupIndicator属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setHoldForPickupIndicator(String value) {
        this.holdForPickupIndicator = value;
    }

    /**
     * 获取dropoffAtUPSFacilityIndicator属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDropoffAtUPSFacilityIndicator() {
        return dropoffAtUPSFacilityIndicator;
    }

    /**
     * 设置dropoffAtUPSFacilityIndicator属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDropoffAtUPSFacilityIndicator(String value) {
        this.dropoffAtUPSFacilityIndicator = value;
    }

    /**
     * 获取liftGateForPickUpIndicator属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLiftGateForPickUpIndicator() {
        return liftGateForPickUpIndicator;
    }

    /**
     * 设置liftGateForPickUpIndicator属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLiftGateForPickUpIndicator(String value) {
        this.liftGateForPickUpIndicator = value;
    }

    /**
     * 获取liftGateForDeliveryIndicator属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLiftGateForDeliveryIndicator() {
        return liftGateForDeliveryIndicator;
    }

    /**
     * 设置liftGateForDeliveryIndicator属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLiftGateForDeliveryIndicator(String value) {
        this.liftGateForDeliveryIndicator = value;
    }

    /**
     * 获取sdlShipmentIndicator属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSDLShipmentIndicator() {
        return sdlShipmentIndicator;
    }

    /**
     * 设置sdlShipmentIndicator属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSDLShipmentIndicator(String value) {
        this.sdlShipmentIndicator = value;
    }

    /**
     * 获取epraReleaseCode属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEPRAReleaseCode() {
        return epraReleaseCode;
    }

    /**
     * 设置epraReleaseCode属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEPRAReleaseCode(String value) {
        this.epraReleaseCode = value;
    }

    /**
     * 获取restrictedArticles属性的值。
     *
     * @return
     *     possible object is
     *     {@link RestrictedArticlesType }
     *
     */
    public RestrictedArticlesType getRestrictedArticles() {
        return restrictedArticles;
    }

    /**
     * 设置restrictedArticles属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link RestrictedArticlesType }
     *
     */
    public void setRestrictedArticles(RestrictedArticlesType value) {
        this.restrictedArticles = value;
    }

}
