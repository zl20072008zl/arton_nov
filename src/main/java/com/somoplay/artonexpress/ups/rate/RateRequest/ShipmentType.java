//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.10.28 时间 03:47:50 PM EDT
//


package com.somoplay.artonexpress.ups.rate.RateRequest;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ShipmentType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="ShipmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OriginRecordTransactionTimestamp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Shipper" type="{}ShipperType"/&gt;
 *         &lt;element name="ShipTo" type="{}ShipToType"/&gt;
 *         &lt;element name="ShipFrom" type="{}ShipFromType" minOccurs="0"/&gt;
 *         &lt;element name="AlternateDeliveryAddress" type="{}AlternateDeliveryAddressType" minOccurs="0"/&gt;
 *         &lt;element name="ShipmentIndicationType" type="{}IndicationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PaymentDetails" type="{}PaymentDetailsType" minOccurs="0"/&gt;
 *         &lt;element name="GoodsNotInFreeCirculationIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Service" type="{}CodeDescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="DocumentsOnly" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumOfPieces" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipmentTotalWeight" type="{}ShipmentWeightType" minOccurs="0"/&gt;
 *         &lt;element name="Package" type="{}PackageType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ShipmentServiceOptions" type="{}ShipmentServiceOptionsType" minOccurs="0"/&gt;
 *         &lt;element name="RateInformation" type="{}RateInformationType" minOccurs="0"/&gt;
 *         &lt;element name="InvoiceLineTotal" type="{}InvoiceLineTotalType" minOccurs="0"/&gt;
 *         &lt;element name="RatingMethodRequestedIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TaxInformationIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryTimeInformation" type="{}TimeInTransitRequestType" minOccurs="0"/&gt;
 *         &lt;element name="PromotionalDiscountInformation" type="{}PromotionalDiscountInformationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentType", propOrder = {
    "originRecordTransactionTimestamp",
    "shipper",
    "shipTo",
    "shipFrom",
    "alternateDeliveryAddress",
    "shipmentIndicationType",
    "paymentDetails",
    "goodsNotInFreeCirculationIndicator",
    "service",
    "documentsOnly",
    "numOfPieces",
    "shipmentTotalWeight",
    "_package",
    "shipmentServiceOptions",
    "rateInformation",
    "invoiceLineTotal",
    "ratingMethodRequestedIndicator",
    "taxInformationIndicator",
    "deliveryTimeInformation",
    "promotionalDiscountInformation"
})
public class ShipmentType {

    @XmlElement(name = "OriginRecordTransactionTimestamp")
    protected String originRecordTransactionTimestamp;
    @XmlElement(name = "Shipper", required = true)
    protected ShipperType shipper;
    @XmlElement(name = "ShipTo", required = true)
    protected ShipToType shipTo;
    @XmlElement(name = "ShipFrom")
    protected ShipFromType shipFrom;
    @XmlElement(name = "AlternateDeliveryAddress")
    protected AlternateDeliveryAddressType alternateDeliveryAddress;
    @XmlElement(name = "ShipmentIndicationType")
    protected List<IndicationType> shipmentIndicationType;
    @XmlElement(name = "PaymentDetails")
    protected PaymentDetailsType paymentDetails;
    @XmlElement(name = "GoodsNotInFreeCirculationIndicator")
    protected String goodsNotInFreeCirculationIndicator;
    @XmlElement(name = "Service")
    protected CodeDescriptionType service;
    @XmlElement(name = "DocumentsOnly")
    protected String documentsOnly;
    @XmlElement(name = "NumOfPieces")
    protected String numOfPieces;
    @XmlElement(name = "ShipmentTotalWeight")
    protected ShipmentWeightType shipmentTotalWeight;
    @XmlElement(name = "Package")
    protected List<PackageType> _package;
    @XmlElement(name = "ShipmentServiceOptions")
    protected ShipmentServiceOptionsType shipmentServiceOptions;
    @XmlElement(name = "RateInformation")
    protected RateInformationType rateInformation;
    @XmlElement(name = "InvoiceLineTotal")
    protected InvoiceLineTotalType invoiceLineTotal;
    @XmlElement(name = "RatingMethodRequestedIndicator")
    protected String ratingMethodRequestedIndicator;
    @XmlElement(name = "TaxInformationIndicator")
    protected String taxInformationIndicator;
    @XmlElement(name = "DeliveryTimeInformation")
    protected TimeInTransitRequestType deliveryTimeInformation;
    @XmlElement(name = "PromotionalDiscountInformation")
    protected PromotionalDiscountInformationType promotionalDiscountInformation;

    /**
     * 获取originRecordTransactionTimestamp属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOriginRecordTransactionTimestamp() {
        return originRecordTransactionTimestamp;
    }

    /**
     * 设置originRecordTransactionTimestamp属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOriginRecordTransactionTimestamp(String value) {
        this.originRecordTransactionTimestamp = value;
    }

    /**
     * 获取shipper属性的值。
     *
     * @return
     *     possible object is
     *     {@link ShipperType }
     *
     */
    public ShipperType getShipper() {
        return shipper;
    }

    /**
     * 设置shipper属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link ShipperType }
     *
     */
    public void setShipper(ShipperType value) {
        this.shipper = value;
    }

    /**
     * 获取shipTo属性的值。
     *
     * @return
     *     possible object is
     *     {@link ShipToType }
     *
     */
    public ShipToType getShipTo() {
        return shipTo;
    }

    /**
     * 设置shipTo属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link ShipToType }
     *
     */
    public void setShipTo(ShipToType value) {
        this.shipTo = value;
    }

    /**
     * 获取shipFrom属性的值。
     *
     * @return
     *     possible object is
     *     {@link ShipFromType }
     *
     */
    public ShipFromType getShipFrom() {
        return shipFrom;
    }

    /**
     * 设置shipFrom属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link ShipFromType }
     *
     */
    public void setShipFrom(ShipFromType value) {
        this.shipFrom = value;
    }

    /**
     * 获取alternateDeliveryAddress属性的值。
     *
     * @return
     *     possible object is
     *     {@link AlternateDeliveryAddressType }
     *
     */
    public AlternateDeliveryAddressType getAlternateDeliveryAddress() {
        return alternateDeliveryAddress;
    }

    /**
     * 设置alternateDeliveryAddress属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link AlternateDeliveryAddressType }
     *
     */
    public void setAlternateDeliveryAddress(AlternateDeliveryAddressType value) {
        this.alternateDeliveryAddress = value;
    }

    /**
     * Gets the value of the shipmentIndicationType property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipmentIndicationType property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipmentIndicationType().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndicationType }
     *
     *
     */
    public List<IndicationType> getShipmentIndicationType() {
        if (shipmentIndicationType == null) {
            shipmentIndicationType = new ArrayList<IndicationType>();
        }
        return this.shipmentIndicationType;
    }

    /**
     * 获取paymentDetails属性的值。
     *
     * @return
     *     possible object is
     *     {@link PaymentDetailsType }
     *
     */
    public PaymentDetailsType getPaymentDetails() {
        return paymentDetails;
    }

    /**
     * 设置paymentDetails属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link PaymentDetailsType }
     *
     */
    public void setPaymentDetails(PaymentDetailsType value) {
        this.paymentDetails = value;
    }

    /**
     * 获取goodsNotInFreeCirculationIndicator属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getGoodsNotInFreeCirculationIndicator() {
        return goodsNotInFreeCirculationIndicator;
    }

    /**
     * 设置goodsNotInFreeCirculationIndicator属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setGoodsNotInFreeCirculationIndicator(String value) {
        this.goodsNotInFreeCirculationIndicator = value;
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
     * 获取documentsOnly属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDocumentsOnly() {
        return documentsOnly;
    }

    /**
     * 设置documentsOnly属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDocumentsOnly(String value) {
        this.documentsOnly = value;
    }

    /**
     * 获取numOfPieces属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNumOfPieces() {
        return numOfPieces;
    }

    /**
     * 设置numOfPieces属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNumOfPieces(String value) {
        this.numOfPieces = value;
    }

    /**
     * 获取shipmentTotalWeight属性的值。
     *
     * @return
     *     possible object is
     *     {@link ShipmentWeightType }
     *
     */
    public ShipmentWeightType getShipmentTotalWeight() {
        return shipmentTotalWeight;
    }

    /**
     * 设置shipmentTotalWeight属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link ShipmentWeightType }
     *
     */
    public void setShipmentTotalWeight(ShipmentWeightType value) {
        this.shipmentTotalWeight = value;
    }

    /**
     * Gets the value of the package property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the package property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackage().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackageType }
     *
     *
     */
    public List<PackageType> getPackage() {
        if (_package == null) {
            _package = new ArrayList<PackageType>();
        }
        return this._package;
    }

    /**
     * 获取shipmentServiceOptions属性的值。
     *
     * @return
     *     possible object is
     *     {@link ShipmentServiceOptionsType }
     *
     */
    public ShipmentServiceOptionsType getShipmentServiceOptions() {
        return shipmentServiceOptions;
    }

    /**
     * 设置shipmentServiceOptions属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link ShipmentServiceOptionsType }
     *
     */
    public void setShipmentServiceOptions(ShipmentServiceOptionsType value) {
        this.shipmentServiceOptions = value;
    }

    /**
     * 获取rateInformation属性的值。
     *
     * @return
     *     possible object is
     *     {@link RateInformationType }
     *
     */
    public RateInformationType getRateInformation() {
        return rateInformation;
    }

    /**
     * 设置rateInformation属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link RateInformationType }
     *
     */
    public void setRateInformation(RateInformationType value) {
        this.rateInformation = value;
    }

    /**
     * 获取invoiceLineTotal属性的值。
     *
     * @return
     *     possible object is
     *     {@link InvoiceLineTotalType }
     *
     */
    public InvoiceLineTotalType getInvoiceLineTotal() {
        return invoiceLineTotal;
    }

    /**
     * 设置invoiceLineTotal属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link InvoiceLineTotalType }
     *
     */
    public void setInvoiceLineTotal(InvoiceLineTotalType value) {
        this.invoiceLineTotal = value;
    }

    /**
     * 获取ratingMethodRequestedIndicator属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRatingMethodRequestedIndicator() {
        return ratingMethodRequestedIndicator;
    }

    /**
     * 设置ratingMethodRequestedIndicator属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRatingMethodRequestedIndicator(String value) {
        this.ratingMethodRequestedIndicator = value;
    }

    /**
     * 获取taxInformationIndicator属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTaxInformationIndicator() {
        return taxInformationIndicator;
    }

    /**
     * 设置taxInformationIndicator属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTaxInformationIndicator(String value) {
        this.taxInformationIndicator = value;
    }

    /**
     * 获取deliveryTimeInformation属性的值。
     *
     * @return
     *     possible object is
     *     {@link TimeInTransitRequestType }
     *
     */
    public TimeInTransitRequestType getDeliveryTimeInformation() {
        return deliveryTimeInformation;
    }

    /**
     * 设置deliveryTimeInformation属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link TimeInTransitRequestType }
     *
     */
    public void setDeliveryTimeInformation(TimeInTransitRequestType value) {
        this.deliveryTimeInformation = value;
    }

    /**
     * 获取promotionalDiscountInformation属性的值。
     *
     * @return
     *     possible object is
     *     {@link PromotionalDiscountInformationType }
     *
     */
    public PromotionalDiscountInformationType getPromotionalDiscountInformation() {
        return promotionalDiscountInformation;
    }

    /**
     * 设置promotionalDiscountInformation属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link PromotionalDiscountInformationType }
     *
     */
    public void setPromotionalDiscountInformation(PromotionalDiscountInformationType value) {
        this.promotionalDiscountInformation = value;
    }

}
