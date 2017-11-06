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
 * <p>HazMatChemicalRecordType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="HazMatChemicalRecordType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ChemicalRecordIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ClassDivisionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IDNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TransportationMode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RegulationSet" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="EmergencyPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EmergencyContact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReportableQuantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubRiskClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PackagingGroupType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UOM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PackagingInstructionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProperShippingName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TechnicalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PackagingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HazardLabelRequired" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PackagingTypeQuantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CommodityRegulatedLevelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TransportCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TunnelRestrictionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HazMatChemicalRecordType", propOrder = {
    "chemicalRecordIdentifier",
    "classDivisionNumber",
    "idNumber",
    "transportationMode",
    "regulationSet",
    "emergencyPhone",
    "emergencyContact",
    "reportableQuantity",
    "subRiskClass",
    "packagingGroupType",
    "quantity",
    "uom",
    "packagingInstructionCode",
    "properShippingName",
    "technicalName",
    "additionalDescription",
    "packagingType",
    "hazardLabelRequired",
    "packagingTypeQuantity",
    "commodityRegulatedLevelCode",
    "transportCategory",
    "tunnelRestrictionCode"
})
public class HazMatChemicalRecordType {

    @XmlElement(name = "ChemicalRecordIdentifier")
    protected String chemicalRecordIdentifier;
    @XmlElement(name = "ClassDivisionNumber")
    protected String classDivisionNumber;
    @XmlElement(name = "IDNumber")
    protected String idNumber;
    @XmlElement(name = "TransportationMode", required = true)
    protected String transportationMode;
    @XmlElement(name = "RegulationSet", required = true)
    protected String regulationSet;
    @XmlElement(name = "EmergencyPhone")
    protected String emergencyPhone;
    @XmlElement(name = "EmergencyContact")
    protected String emergencyContact;
    @XmlElement(name = "ReportableQuantity")
    protected String reportableQuantity;
    @XmlElement(name = "SubRiskClass")
    protected String subRiskClass;
    @XmlElement(name = "PackagingGroupType")
    protected String packagingGroupType;
    @XmlElement(name = "Quantity")
    protected String quantity;
    @XmlElement(name = "UOM")
    protected String uom;
    @XmlElement(name = "PackagingInstructionCode")
    protected String packagingInstructionCode;
    @XmlElement(name = "ProperShippingName")
    protected String properShippingName;
    @XmlElement(name = "TechnicalName")
    protected String technicalName;
    @XmlElement(name = "AdditionalDescription")
    protected String additionalDescription;
    @XmlElement(name = "PackagingType")
    protected String packagingType;
    @XmlElement(name = "HazardLabelRequired")
    protected String hazardLabelRequired;
    @XmlElement(name = "PackagingTypeQuantity")
    protected String packagingTypeQuantity;
    @XmlElement(name = "CommodityRegulatedLevelCode")
    protected String commodityRegulatedLevelCode;
    @XmlElement(name = "TransportCategory")
    protected String transportCategory;
    @XmlElement(name = "TunnelRestrictionCode")
    protected String tunnelRestrictionCode;

    /**
     * 获取chemicalRecordIdentifier属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getChemicalRecordIdentifier() {
        return chemicalRecordIdentifier;
    }

    /**
     * 设置chemicalRecordIdentifier属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setChemicalRecordIdentifier(String value) {
        this.chemicalRecordIdentifier = value;
    }

    /**
     * 获取classDivisionNumber属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getClassDivisionNumber() {
        return classDivisionNumber;
    }

    /**
     * 设置classDivisionNumber属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setClassDivisionNumber(String value) {
        this.classDivisionNumber = value;
    }

    /**
     * 获取idNumber属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIDNumber() {
        return idNumber;
    }

    /**
     * 设置idNumber属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIDNumber(String value) {
        this.idNumber = value;
    }

    /**
     * 获取transportationMode属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTransportationMode() {
        return transportationMode;
    }

    /**
     * 设置transportationMode属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTransportationMode(String value) {
        this.transportationMode = value;
    }

    /**
     * 获取regulationSet属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRegulationSet() {
        return regulationSet;
    }

    /**
     * 设置regulationSet属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRegulationSet(String value) {
        this.regulationSet = value;
    }

    /**
     * 获取emergencyPhone属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEmergencyPhone() {
        return emergencyPhone;
    }

    /**
     * 设置emergencyPhone属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEmergencyPhone(String value) {
        this.emergencyPhone = value;
    }

    /**
     * 获取emergencyContact属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEmergencyContact() {
        return emergencyContact;
    }

    /**
     * 设置emergencyContact属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEmergencyContact(String value) {
        this.emergencyContact = value;
    }

    /**
     * 获取reportableQuantity属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getReportableQuantity() {
        return reportableQuantity;
    }

    /**
     * 设置reportableQuantity属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setReportableQuantity(String value) {
        this.reportableQuantity = value;
    }

    /**
     * 获取subRiskClass属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSubRiskClass() {
        return subRiskClass;
    }

    /**
     * 设置subRiskClass属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSubRiskClass(String value) {
        this.subRiskClass = value;
    }

    /**
     * 获取packagingGroupType属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPackagingGroupType() {
        return packagingGroupType;
    }

    /**
     * 设置packagingGroupType属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPackagingGroupType(String value) {
        this.packagingGroupType = value;
    }

    /**
     * 获取quantity属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * 设置quantity属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setQuantity(String value) {
        this.quantity = value;
    }

    /**
     * 获取uom属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUOM() {
        return uom;
    }

    /**
     * 设置uom属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUOM(String value) {
        this.uom = value;
    }

    /**
     * 获取packagingInstructionCode属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPackagingInstructionCode() {
        return packagingInstructionCode;
    }

    /**
     * 设置packagingInstructionCode属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPackagingInstructionCode(String value) {
        this.packagingInstructionCode = value;
    }

    /**
     * 获取properShippingName属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProperShippingName() {
        return properShippingName;
    }

    /**
     * 设置properShippingName属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProperShippingName(String value) {
        this.properShippingName = value;
    }

    /**
     * 获取technicalName属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTechnicalName() {
        return technicalName;
    }

    /**
     * 设置technicalName属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTechnicalName(String value) {
        this.technicalName = value;
    }

    /**
     * 获取additionalDescription属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAdditionalDescription() {
        return additionalDescription;
    }

    /**
     * 设置additionalDescription属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAdditionalDescription(String value) {
        this.additionalDescription = value;
    }

    /**
     * 获取packagingType属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPackagingType() {
        return packagingType;
    }

    /**
     * 设置packagingType属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPackagingType(String value) {
        this.packagingType = value;
    }

    /**
     * 获取hazardLabelRequired属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getHazardLabelRequired() {
        return hazardLabelRequired;
    }

    /**
     * 设置hazardLabelRequired属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setHazardLabelRequired(String value) {
        this.hazardLabelRequired = value;
    }

    /**
     * 获取packagingTypeQuantity属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPackagingTypeQuantity() {
        return packagingTypeQuantity;
    }

    /**
     * 设置packagingTypeQuantity属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPackagingTypeQuantity(String value) {
        this.packagingTypeQuantity = value;
    }

    /**
     * 获取commodityRegulatedLevelCode属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCommodityRegulatedLevelCode() {
        return commodityRegulatedLevelCode;
    }

    /**
     * 设置commodityRegulatedLevelCode属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCommodityRegulatedLevelCode(String value) {
        this.commodityRegulatedLevelCode = value;
    }

    /**
     * 获取transportCategory属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTransportCategory() {
        return transportCategory;
    }

    /**
     * 设置transportCategory属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTransportCategory(String value) {
        this.transportCategory = value;
    }

    /**
     * 获取tunnelRestrictionCode属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTunnelRestrictionCode() {
        return tunnelRestrictionCode;
    }

    /**
     * 设置tunnelRestrictionCode属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTunnelRestrictionCode(String value) {
        this.tunnelRestrictionCode = value;
    }

}
