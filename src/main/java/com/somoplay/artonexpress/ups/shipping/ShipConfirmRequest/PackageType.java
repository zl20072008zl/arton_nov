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
 * <p>PackageType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="PackageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PackagingType" type="{}PackagingTypeType" minOccurs="0"/&gt;
 *         &lt;element name="Dimensions" type="{}DimensionsType" minOccurs="0"/&gt;
 *         &lt;element name="DimWeight" type="{}PackageWeightType" minOccurs="0"/&gt;
 *         &lt;element name="PackageWeight" type="{}PackageWeightType" minOccurs="0"/&gt;
 *         &lt;element name="LargePackageIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReferenceNumber" type="{}ReferenceNumberType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalHandling" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PackageServiceOptions" type="{}PackageServiceOptionsType" minOccurs="0"/&gt;
 *         &lt;element name="HazMatPackageInformation" type="{}HazMatPackageInformationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackageType", propOrder = {
    "description",
    "packagingType",
    "dimensions",
    "dimWeight",
    "packageWeight",
    "largePackageIndicator",
    "referenceNumber",
    "additionalHandling",
    "packageServiceOptions",
    "hazMatPackageInformation"
})
public class PackageType {

    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "PackagingType")
    protected PackagingTypeType packagingType;
    @XmlElement(name = "Dimensions")
    protected DimensionsType dimensions;
    @XmlElement(name = "DimWeight")
    protected PackageWeightType dimWeight;
    @XmlElement(name = "PackageWeight")
    protected PackageWeightType packageWeight;
    @XmlElement(name = "LargePackageIndicator")
    protected String largePackageIndicator;
    @XmlElement(name = "ReferenceNumber")
    protected List<ReferenceNumberType> referenceNumber;
    @XmlElement(name = "AdditionalHandling")
    protected String additionalHandling;
    @XmlElement(name = "PackageServiceOptions")
    protected PackageServiceOptionsType packageServiceOptions;
    @XmlElement(name = "HazMatPackageInformation")
    protected HazMatPackageInformationType hazMatPackageInformation;

    /**
     * 获取description属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置description属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * 获取packagingType属性的值。
     *
     * @return
     *     possible object is
     *     {@link PackagingTypeType }
     *
     */
    public PackagingTypeType getPackagingType() {
        return packagingType;
    }

    /**
     * 设置packagingType属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link PackagingTypeType }
     *
     */
    public void setPackagingType(PackagingTypeType value) {
        this.packagingType = value;
    }

    /**
     * 获取dimensions属性的值。
     *
     * @return
     *     possible object is
     *     {@link DimensionsType }
     *
     */
    public DimensionsType getDimensions() {
        return dimensions;
    }

    /**
     * 设置dimensions属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link DimensionsType }
     *
     */
    public void setDimensions(DimensionsType value) {
        this.dimensions = value;
    }

    /**
     * 获取dimWeight属性的值。
     *
     * @return
     *     possible object is
     *     {@link PackageWeightType }
     *
     */
    public PackageWeightType getDimWeight() {
        return dimWeight;
    }

    /**
     * 设置dimWeight属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link PackageWeightType }
     *
     */
    public void setDimWeight(PackageWeightType value) {
        this.dimWeight = value;
    }

    /**
     * 获取packageWeight属性的值。
     *
     * @return
     *     possible object is
     *     {@link PackageWeightType }
     *
     */
    public PackageWeightType getPackageWeight() {
        return packageWeight;
    }

    /**
     * 设置packageWeight属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link PackageWeightType }
     *
     */
    public void setPackageWeight(PackageWeightType value) {
        this.packageWeight = value;
    }

    /**
     * 获取largePackageIndicator属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLargePackageIndicator() {
        return largePackageIndicator;
    }

    /**
     * 设置largePackageIndicator属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLargePackageIndicator(String value) {
        this.largePackageIndicator = value;
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
     * {@link ReferenceNumberType }
     *
     *
     */
    public List<ReferenceNumberType> getReferenceNumber() {
        if (referenceNumber == null) {
            referenceNumber = new ArrayList<ReferenceNumberType>();
        }
        return this.referenceNumber;
    }

    /**
     * 获取additionalHandling属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAdditionalHandling() {
        return additionalHandling;
    }

    /**
     * 设置additionalHandling属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAdditionalHandling(String value) {
        this.additionalHandling = value;
    }

    /**
     * 获取packageServiceOptions属性的值。
     *
     * @return
     *     possible object is
     *     {@link PackageServiceOptionsType }
     *
     */
    public PackageServiceOptionsType getPackageServiceOptions() {
        return packageServiceOptions;
    }

    /**
     * 设置packageServiceOptions属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link PackageServiceOptionsType }
     *
     */
    public void setPackageServiceOptions(PackageServiceOptionsType value) {
        this.packageServiceOptions = value;
    }

    /**
     * 获取hazMatPackageInformation属性的值。
     *
     * @return
     *     possible object is
     *     {@link HazMatPackageInformationType }
     *
     */
    public HazMatPackageInformationType getHazMatPackageInformation() {
        return hazMatPackageInformation;
    }

    /**
     * 设置hazMatPackageInformation属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link HazMatPackageInformationType }
     *
     */
    public void setHazMatPackageInformation(HazMatPackageInformationType value) {
        this.hazMatPackageInformation = value;
    }

}
