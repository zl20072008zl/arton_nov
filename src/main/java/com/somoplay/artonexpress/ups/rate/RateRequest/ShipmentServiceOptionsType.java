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
 * <p>ShipmentServiceOptionsType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="ShipmentServiceOptionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SaturdayPickup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SaturdayDelivery" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AccessPointCOD" type="{}ShipmentServiceOptionsAccessPointCODType" minOccurs="0"/&gt;
 *         &lt;element name="DeliverToAddresseeOnlyIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DirectDeliveryOnlyIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="COD" type="{}CODType" minOccurs="0"/&gt;
 *         &lt;element name="ReturnOfDocumentIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryConfirmation" type="{}DeliveryConfirmationType" minOccurs="0"/&gt;
 *         &lt;element name="UPScarbonneutralIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CertificateOfOriginIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PickupOptions" type="{}PickupOptionsType" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryOptions" type="{}DeliveryOptionsType" minOccurs="0"/&gt;
 *         &lt;element name="RestrictedArticles" type="{}RestrictedArticlesType" minOccurs="0"/&gt;
 *         &lt;element name="ShipperExportDeclarationIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CommercialInvoiceRemovalIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ImportControl" type="{}ImportControlType" minOccurs="0"/&gt;
 *         &lt;element name="ReturnService" type="{}ReturnServiceType" minOccurs="0"/&gt;
 *         &lt;element name="SDLShipmentIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EPRAIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "saturdayPickup",
    "saturdayDelivery",
    "accessPointCOD",
    "deliverToAddresseeOnlyIndicator",
    "directDeliveryOnlyIndicator",
    "cod",
    "returnOfDocumentIndicator",
    "deliveryConfirmation",
    "upScarbonneutralIndicator",
    "certificateOfOriginIndicator",
    "pickupOptions",
    "deliveryOptions",
    "restrictedArticles",
    "shipperExportDeclarationIndicator",
    "commercialInvoiceRemovalIndicator",
    "importControl",
    "returnService",
    "sdlShipmentIndicator",
    "epraIndicator"
})
public class ShipmentServiceOptionsType {

    @XmlElement(name = "SaturdayPickup")
    protected String saturdayPickup;
    @XmlElement(name = "SaturdayDelivery")
    protected String saturdayDelivery;
    @XmlElement(name = "AccessPointCOD")
    protected ShipmentServiceOptionsAccessPointCODType accessPointCOD;
    @XmlElement(name = "DeliverToAddresseeOnlyIndicator")
    protected String deliverToAddresseeOnlyIndicator;
    @XmlElement(name = "DirectDeliveryOnlyIndicator")
    protected String directDeliveryOnlyIndicator;
    @XmlElement(name = "COD")
    protected CODType cod;
    @XmlElement(name = "ReturnOfDocumentIndicator")
    protected String returnOfDocumentIndicator;
    @XmlElement(name = "DeliveryConfirmation")
    protected DeliveryConfirmationType deliveryConfirmation;
    @XmlElement(name = "UPScarbonneutralIndicator")
    protected String upScarbonneutralIndicator;
    @XmlElement(name = "CertificateOfOriginIndicator")
    protected String certificateOfOriginIndicator;
    @XmlElement(name = "PickupOptions")
    protected PickupOptionsType pickupOptions;
    @XmlElement(name = "DeliveryOptions")
    protected DeliveryOptionsType deliveryOptions;
    @XmlElement(name = "RestrictedArticles")
    protected RestrictedArticlesType restrictedArticles;
    @XmlElement(name = "ShipperExportDeclarationIndicator")
    protected String shipperExportDeclarationIndicator;
    @XmlElement(name = "CommercialInvoiceRemovalIndicator")
    protected String commercialInvoiceRemovalIndicator;
    @XmlElement(name = "ImportControl")
    protected ImportControlType importControl;
    @XmlElement(name = "ReturnService")
    protected ReturnServiceType returnService;
    @XmlElement(name = "SDLShipmentIndicator")
    protected String sdlShipmentIndicator;
    @XmlElement(name = "EPRAIndicator")
    protected String epraIndicator;

    /**
     * 获取saturdayPickup属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSaturdayPickup() {
        return saturdayPickup;
    }

    /**
     * 设置saturdayPickup属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSaturdayPickup(String value) {
        this.saturdayPickup = value;
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
     * 获取certificateOfOriginIndicator属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCertificateOfOriginIndicator() {
        return certificateOfOriginIndicator;
    }

    /**
     * 设置certificateOfOriginIndicator属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCertificateOfOriginIndicator(String value) {
        this.certificateOfOriginIndicator = value;
    }

    /**
     * 获取pickupOptions属性的值。
     *
     * @return
     *     possible object is
     *     {@link PickupOptionsType }
     *
     */
    public PickupOptionsType getPickupOptions() {
        return pickupOptions;
    }

    /**
     * 设置pickupOptions属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link PickupOptionsType }
     *
     */
    public void setPickupOptions(PickupOptionsType value) {
        this.pickupOptions = value;
    }

    /**
     * 获取deliveryOptions属性的值。
     *
     * @return
     *     possible object is
     *     {@link DeliveryOptionsType }
     *
     */
    public DeliveryOptionsType getDeliveryOptions() {
        return deliveryOptions;
    }

    /**
     * 设置deliveryOptions属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link DeliveryOptionsType }
     *
     */
    public void setDeliveryOptions(DeliveryOptionsType value) {
        this.deliveryOptions = value;
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

    /**
     * 获取shipperExportDeclarationIndicator属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getShipperExportDeclarationIndicator() {
        return shipperExportDeclarationIndicator;
    }

    /**
     * 设置shipperExportDeclarationIndicator属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setShipperExportDeclarationIndicator(String value) {
        this.shipperExportDeclarationIndicator = value;
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
     * 获取importControl属性的值。
     *
     * @return
     *     possible object is
     *     {@link ImportControlType }
     *
     */
    public ImportControlType getImportControl() {
        return importControl;
    }

    /**
     * 设置importControl属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link ImportControlType }
     *
     */
    public void setImportControl(ImportControlType value) {
        this.importControl = value;
    }

    /**
     * 获取returnService属性的值。
     *
     * @return
     *     possible object is
     *     {@link ReturnServiceType }
     *
     */
    public ReturnServiceType getReturnService() {
        return returnService;
    }

    /**
     * 设置returnService属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link ReturnServiceType }
     *
     */
    public void setReturnService(ReturnServiceType value) {
        this.returnService = value;
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
     * 获取epraIndicator属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEPRAIndicator() {
        return epraIndicator;
    }

    /**
     * 设置epraIndicator属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEPRAIndicator(String value) {
        this.epraIndicator = value;
    }

}
