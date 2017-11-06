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
 * <p>PackageType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="PackageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PackagingType" type="{}CodeDescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="Dimensions" type="{}DimensionsType" minOccurs="0"/&gt;
 *         &lt;element name="DimWeight" type="{}WeightType" minOccurs="0"/&gt;
 *         &lt;element name="PackageWeight" type="{}WeightType" minOccurs="0"/&gt;
 *         &lt;element name="LargePackageIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PackageServiceOptions" type="{}PackageServiceOptionsType" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalHandling" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "packagingType",
    "dimensions",
    "dimWeight",
    "packageWeight",
    "largePackageIndicator",
    "packageServiceOptions",
    "additionalHandling"
})
public class PackageType {

    @XmlElement(name = "PackagingType")
    protected CodeDescriptionType packagingType;
    @XmlElement(name = "Dimensions")
    protected DimensionsType dimensions;
    @XmlElement(name = "DimWeight")
    protected WeightType dimWeight;
    @XmlElement(name = "PackageWeight")
    protected WeightType packageWeight;
    @XmlElement(name = "LargePackageIndicator")
    protected String largePackageIndicator;
    @XmlElement(name = "PackageServiceOptions")
    protected PackageServiceOptionsType packageServiceOptions;
    @XmlElement(name = "AdditionalHandling")
    protected String additionalHandling;

    /**
     * 获取packagingType属性的值。
     *
     * @return
     *     possible object is
     *     {@link CodeDescriptionType }
     *
     */
    public CodeDescriptionType getPackagingType() {
        return packagingType;
    }

    /**
     * 设置packagingType属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link CodeDescriptionType }
     *
     */
    public void setPackagingType(CodeDescriptionType value) {
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
     *     {@link WeightType }
     *
     */
    public WeightType getDimWeight() {
        return dimWeight;
    }

    /**
     * 设置dimWeight属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link WeightType }
     *
     */
    public void setDimWeight(WeightType value) {
        this.dimWeight = value;
    }

    /**
     * 获取packageWeight属性的值。
     *
     * @return
     *     possible object is
     *     {@link WeightType }
     *
     */
    public WeightType getPackageWeight() {
        return packageWeight;
    }

    /**
     * 设置packageWeight属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link WeightType }
     *
     */
    public void setPackageWeight(WeightType value) {
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

}
