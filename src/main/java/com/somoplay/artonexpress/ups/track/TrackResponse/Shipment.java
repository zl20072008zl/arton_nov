//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.10.28 时间 03:47:51 PM EDT
//


package com.somoplay.artonexpress.ups.track.TrackResponse;

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
 *         &lt;element name="InquiryNumber" type="{}InquiryNumberType" minOccurs="0"/&gt;
 *         &lt;element name="ShipmentIdentificationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipmentType" type="{}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="CandidateBookmark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Shipper" type="{}ShipperType" minOccurs="0"/&gt;
 *         &lt;element name="ShipTo" type="{}ShipToType" minOccurs="0"/&gt;
 *         &lt;element name="ShipmentWeight" type="{}WeightType" minOccurs="0"/&gt;
 *         &lt;element name="Service" type="{}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="ReferenceNumber" type="{}ShipmentReferenceNumberType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CurrentStatus" type="{}CurrentStatusType" minOccurs="0"/&gt;
 *         &lt;element name="PickupDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryDetails" type="{}DeliveryDetailsType" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryDateTime" type="{}DeliveryDateTimeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Volume" type="{}VolumeType" minOccurs="0"/&gt;
 *         &lt;element name="BillToName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PickUpServiceCenter" type="{}ServiceCenterType" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfPieces" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfPallets" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipmentServiceOptions" type="{}ShipmentServiceOptionsType" minOccurs="0"/&gt;
 *         &lt;element name="EstimatedDeliveryDetails" type="{}EstimatedDeliveryDetailsType" minOccurs="0"/&gt;
 *         &lt;element name="SignedForByName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Activity" type="{}ShipmentActivityType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OriginPortDetails" type="{}OriginPortDetailsType" minOccurs="0"/&gt;
 *         &lt;element name="DestinationPortDetails" type="{}DestinationPortDetailsType" minOccurs="0"/&gt;
 *         &lt;element name="DescriptionOfGoods" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CargoReady" type="{}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="Manifest" type="{}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="CarrierActivityInformation" type="{}CarrierActivityInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Document" type="{}DocumentType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ScheduledDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ScheduledDeliveryTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryDateUnavailable" type="{}DeliveryDateUnavailableType" minOccurs="0"/&gt;
 *         &lt;element name="FileNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Appointment" type="{}AppointmentType" minOccurs="0"/&gt;
 *         &lt;element name="Package" type="{}PackageType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "inquiryNumber",
    "shipmentIdentificationNumber",
    "shipmentType",
    "candidateBookmark",
    "shipper",
    "shipTo",
    "shipmentWeight",
    "service",
    "referenceNumber",
    "currentStatus",
    "pickupDate",
    "deliveryDetails",
    "deliveryDateTime",
    "volume",
    "billToName",
    "pickUpServiceCenter",
    "numberOfPieces",
    "numberOfPallets",
    "shipmentServiceOptions",
    "estimatedDeliveryDetails",
    "signedForByName",
    "activity",
    "originPortDetails",
    "destinationPortDetails",
    "descriptionOfGoods",
    "cargoReady",
    "manifest",
    "carrierActivityInformation",
    "document",
    "scheduledDeliveryDate",
    "scheduledDeliveryTime",
    "deliveryDateUnavailable",
    "fileNumber",
    "appointment",
    "_package"
})
@XmlRootElement(name = "Shipment")
public class Shipment {

    @XmlElement(name = "InquiryNumber")
    protected InquiryNumberType inquiryNumber;
    @XmlElement(name = "ShipmentIdentificationNumber")
    protected String shipmentIdentificationNumber;
    @XmlElement(name = "ShipmentType")
    protected CodeType shipmentType;
    @XmlElement(name = "CandidateBookmark")
    protected String candidateBookmark;
    @XmlElement(name = "Shipper")
    protected ShipperType shipper;
    @XmlElement(name = "ShipTo")
    protected ShipToType shipTo;
    @XmlElement(name = "ShipmentWeight")
    protected WeightType shipmentWeight;
    @XmlElement(name = "Service")
    protected CodeType service;
    @XmlElement(name = "ReferenceNumber")
    protected List<ShipmentReferenceNumberType> referenceNumber;
    @XmlElement(name = "CurrentStatus")
    protected CurrentStatusType currentStatus;
    @XmlElement(name = "PickupDate")
    protected String pickupDate;
    @XmlElement(name = "DeliveryDetails")
    protected DeliveryDetailsType deliveryDetails;
    @XmlElement(name = "DeliveryDateTime")
    protected List<DeliveryDateTimeType> deliveryDateTime;
    @XmlElement(name = "Volume")
    protected VolumeType volume;
    @XmlElement(name = "BillToName")
    protected String billToName;
    @XmlElement(name = "PickUpServiceCenter")
    protected ServiceCenterType pickUpServiceCenter;
    @XmlElement(name = "NumberOfPieces")
    protected String numberOfPieces;
    @XmlElement(name = "NumberOfPallets")
    protected String numberOfPallets;
    @XmlElement(name = "ShipmentServiceOptions")
    protected ShipmentServiceOptionsType shipmentServiceOptions;
    @XmlElement(name = "EstimatedDeliveryDetails")
    protected EstimatedDeliveryDetailsType estimatedDeliveryDetails;
    @XmlElement(name = "SignedForByName")
    protected String signedForByName;
    @XmlElement(name = "Activity")
    protected List<ShipmentActivityType> activity;
    @XmlElement(name = "OriginPortDetails")
    protected OriginPortDetailsType originPortDetails;
    @XmlElement(name = "DestinationPortDetails")
    protected DestinationPortDetailsType destinationPortDetails;
    @XmlElement(name = "DescriptionOfGoods")
    protected String descriptionOfGoods;
    @XmlElement(name = "CargoReady")
    protected DateTime cargoReady;
    @XmlElement(name = "Manifest")
    protected DateTime manifest;
    @XmlElement(name = "CarrierActivityInformation")
    protected List<CarrierActivityInformationType> carrierActivityInformation;
    @XmlElement(name = "Document")
    protected List<DocumentType> document;
    @XmlElement(name = "ScheduledDeliveryDate")
    protected String scheduledDeliveryDate;
    @XmlElement(name = "ScheduledDeliveryTime")
    protected String scheduledDeliveryTime;
    @XmlElement(name = "DeliveryDateUnavailable")
    protected DeliveryDateUnavailableType deliveryDateUnavailable;
    @XmlElement(name = "FileNumber")
    protected String fileNumber;
    @XmlElement(name = "Appointment")
    protected AppointmentType appointment;
    @XmlElement(name = "Package")
    protected List<PackageType> _package;

    /**
     * 获取inquiryNumber属性的值。
     *
     * @return
     *     possible object is
     *     {@link InquiryNumberType }
     *
     */
    public InquiryNumberType getInquiryNumber() {
        return inquiryNumber;
    }

    /**
     * 设置inquiryNumber属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link InquiryNumberType }
     *
     */
    public void setInquiryNumber(InquiryNumberType value) {
        this.inquiryNumber = value;
    }

    /**
     * 获取shipmentIdentificationNumber属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getShipmentIdentificationNumber() {
        return shipmentIdentificationNumber;
    }

    /**
     * 设置shipmentIdentificationNumber属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setShipmentIdentificationNumber(String value) {
        this.shipmentIdentificationNumber = value;
    }

    /**
     * 获取shipmentType属性的值。
     *
     * @return
     *     possible object is
     *     {@link CodeType }
     *
     */
    public CodeType getShipmentType() {
        return shipmentType;
    }

    /**
     * 设置shipmentType属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *
     */
    public void setShipmentType(CodeType value) {
        this.shipmentType = value;
    }

    /**
     * 获取candidateBookmark属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCandidateBookmark() {
        return candidateBookmark;
    }

    /**
     * 设置candidateBookmark属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCandidateBookmark(String value) {
        this.candidateBookmark = value;
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
     * 获取shipmentWeight属性的值。
     *
     * @return
     *     possible object is
     *     {@link WeightType }
     *
     */
    public WeightType getShipmentWeight() {
        return shipmentWeight;
    }

    /**
     * 设置shipmentWeight属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link WeightType }
     *
     */
    public void setShipmentWeight(WeightType value) {
        this.shipmentWeight = value;
    }

    /**
     * 获取service属性的值。
     *
     * @return
     *     possible object is
     *     {@link CodeType }
     *
     */
    public CodeType getService() {
        return service;
    }

    /**
     * 设置service属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *
     */
    public void setService(CodeType value) {
        this.service = value;
    }

    /**
     * Gets the value of the referenceNumber property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referenceNumber property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferenceNumber().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentReferenceNumberType }
     *
     *
     */
    public List<ShipmentReferenceNumberType> getReferenceNumber() {
        if (referenceNumber == null) {
            referenceNumber = new ArrayList<ShipmentReferenceNumberType>();
        }
        return this.referenceNumber;
    }

    /**
     * 获取currentStatus属性的值。
     *
     * @return
     *     possible object is
     *     {@link CurrentStatusType }
     *
     */
    public CurrentStatusType getCurrentStatus() {
        return currentStatus;
    }

    /**
     * 设置currentStatus属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link CurrentStatusType }
     *
     */
    public void setCurrentStatus(CurrentStatusType value) {
        this.currentStatus = value;
    }

    /**
     * 获取pickupDate属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPickupDate() {
        return pickupDate;
    }

    /**
     * 设置pickupDate属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPickupDate(String value) {
        this.pickupDate = value;
    }

    /**
     * 获取deliveryDetails属性的值。
     *
     * @return
     *     possible object is
     *     {@link DeliveryDetailsType }
     *
     */
    public DeliveryDetailsType getDeliveryDetails() {
        return deliveryDetails;
    }

    /**
     * 设置deliveryDetails属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link DeliveryDetailsType }
     *
     */
    public void setDeliveryDetails(DeliveryDetailsType value) {
        this.deliveryDetails = value;
    }

    /**
     * Gets the value of the deliveryDateTime property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deliveryDateTime property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeliveryDateTime().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeliveryDateTimeType }
     *
     *
     */
    public List<DeliveryDateTimeType> getDeliveryDateTime() {
        if (deliveryDateTime == null) {
            deliveryDateTime = new ArrayList<DeliveryDateTimeType>();
        }
        return this.deliveryDateTime;
    }

    /**
     * 获取volume属性的值。
     *
     * @return
     *     possible object is
     *     {@link VolumeType }
     *
     */
    public VolumeType getVolume() {
        return volume;
    }

    /**
     * 设置volume属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link VolumeType }
     *
     */
    public void setVolume(VolumeType value) {
        this.volume = value;
    }

    /**
     * 获取billToName属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBillToName() {
        return billToName;
    }

    /**
     * 设置billToName属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBillToName(String value) {
        this.billToName = value;
    }

    /**
     * 获取pickUpServiceCenter属性的值。
     *
     * @return
     *     possible object is
     *     {@link ServiceCenterType }
     *
     */
    public ServiceCenterType getPickUpServiceCenter() {
        return pickUpServiceCenter;
    }

    /**
     * 设置pickUpServiceCenter属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link ServiceCenterType }
     *
     */
    public void setPickUpServiceCenter(ServiceCenterType value) {
        this.pickUpServiceCenter = value;
    }

    /**
     * 获取numberOfPieces属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNumberOfPieces() {
        return numberOfPieces;
    }

    /**
     * 设置numberOfPieces属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNumberOfPieces(String value) {
        this.numberOfPieces = value;
    }

    /**
     * 获取numberOfPallets属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNumberOfPallets() {
        return numberOfPallets;
    }

    /**
     * 设置numberOfPallets属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNumberOfPallets(String value) {
        this.numberOfPallets = value;
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
     * 获取estimatedDeliveryDetails属性的值。
     *
     * @return
     *     possible object is
     *     {@link EstimatedDeliveryDetailsType }
     *
     */
    public EstimatedDeliveryDetailsType getEstimatedDeliveryDetails() {
        return estimatedDeliveryDetails;
    }

    /**
     * 设置estimatedDeliveryDetails属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link EstimatedDeliveryDetailsType }
     *
     */
    public void setEstimatedDeliveryDetails(EstimatedDeliveryDetailsType value) {
        this.estimatedDeliveryDetails = value;
    }

    /**
     * 获取signedForByName属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSignedForByName() {
        return signedForByName;
    }

    /**
     * 设置signedForByName属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSignedForByName(String value) {
        this.signedForByName = value;
    }

    /**
     * Gets the value of the activity property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activity property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActivity().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentActivityType }
     *
     *
     */
    public List<ShipmentActivityType> getActivity() {
        if (activity == null) {
            activity = new ArrayList<ShipmentActivityType>();
        }
        return this.activity;
    }

    /**
     * 获取originPortDetails属性的值。
     *
     * @return
     *     possible object is
     *     {@link OriginPortDetailsType }
     *
     */
    public OriginPortDetailsType getOriginPortDetails() {
        return originPortDetails;
    }

    /**
     * 设置originPortDetails属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link OriginPortDetailsType }
     *
     */
    public void setOriginPortDetails(OriginPortDetailsType value) {
        this.originPortDetails = value;
    }

    /**
     * 获取destinationPortDetails属性的值。
     *
     * @return
     *     possible object is
     *     {@link DestinationPortDetailsType }
     *
     */
    public DestinationPortDetailsType getDestinationPortDetails() {
        return destinationPortDetails;
    }

    /**
     * 设置destinationPortDetails属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link DestinationPortDetailsType }
     *
     */
    public void setDestinationPortDetails(DestinationPortDetailsType value) {
        this.destinationPortDetails = value;
    }

    /**
     * 获取descriptionOfGoods属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDescriptionOfGoods() {
        return descriptionOfGoods;
    }

    /**
     * 设置descriptionOfGoods属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDescriptionOfGoods(String value) {
        this.descriptionOfGoods = value;
    }

    /**
     * 获取cargoReady属性的值。
     *
     * @return
     *     possible object is
     *     {@link DateTime }
     *
     */
    public DateTime getCargoReady() {
        return cargoReady;
    }

    /**
     * 设置cargoReady属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *
     */
    public void setCargoReady(DateTime value) {
        this.cargoReady = value;
    }

    /**
     * 获取manifest属性的值。
     *
     * @return
     *     possible object is
     *     {@link DateTime }
     *
     */
    public DateTime getManifest() {
        return manifest;
    }

    /**
     * 设置manifest属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *
     */
    public void setManifest(DateTime value) {
        this.manifest = value;
    }

    /**
     * Gets the value of the carrierActivityInformation property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carrierActivityInformation property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarrierActivityInformation().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CarrierActivityInformationType }
     *
     *
     */
    public List<CarrierActivityInformationType> getCarrierActivityInformation() {
        if (carrierActivityInformation == null) {
            carrierActivityInformation = new ArrayList<CarrierActivityInformationType>();
        }
        return this.carrierActivityInformation;
    }

    /**
     * Gets the value of the document property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the document property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocument().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentType }
     *
     *
     */
    public List<DocumentType> getDocument() {
        if (document == null) {
            document = new ArrayList<DocumentType>();
        }
        return this.document;
    }

    /**
     * 获取scheduledDeliveryDate属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getScheduledDeliveryDate() {
        return scheduledDeliveryDate;
    }

    /**
     * 设置scheduledDeliveryDate属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setScheduledDeliveryDate(String value) {
        this.scheduledDeliveryDate = value;
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
     * 获取deliveryDateUnavailable属性的值。
     *
     * @return
     *     possible object is
     *     {@link DeliveryDateUnavailableType }
     *
     */
    public DeliveryDateUnavailableType getDeliveryDateUnavailable() {
        return deliveryDateUnavailable;
    }

    /**
     * 设置deliveryDateUnavailable属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link DeliveryDateUnavailableType }
     *
     */
    public void setDeliveryDateUnavailable(DeliveryDateUnavailableType value) {
        this.deliveryDateUnavailable = value;
    }

    /**
     * 获取fileNumber属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFileNumber() {
        return fileNumber;
    }

    /**
     * 设置fileNumber属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFileNumber(String value) {
        this.fileNumber = value;
    }

    /**
     * 获取appointment属性的值。
     *
     * @return
     *     possible object is
     *     {@link AppointmentType }
     *
     */
    public AppointmentType getAppointment() {
        return appointment;
    }

    /**
     * 设置appointment属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link AppointmentType }
     *
     */
    public void setAppointment(AppointmentType value) {
        this.appointment = value;
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

}
