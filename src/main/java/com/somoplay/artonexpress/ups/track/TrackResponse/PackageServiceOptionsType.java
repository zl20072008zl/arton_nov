//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.10.28 时间 03:47:51 PM EDT
//


package com.somoplay.artonexpress.ups.track.TrackResponse;

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
 *         &lt;element name="COD" type="{}PackageCOD" minOccurs="0"/&gt;
 *         &lt;element name="SignatureRequired" type="{}CodeDescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="ImportControl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CommercialInvoiceRemoval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UPScarbonneutral" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="USPSPICNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExchangeBased" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PackAndCollect" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "cod",
    "signatureRequired",
    "importControl",
    "commercialInvoiceRemoval",
    "upScarbonneutral",
    "uspspicNumber",
    "exchangeBased",
    "packAndCollect"
})
public class PackageServiceOptionsType {

    @XmlElement(name = "COD")
    protected PackageCOD cod;
    @XmlElement(name = "SignatureRequired")
    protected CodeDescriptionType signatureRequired;
    @XmlElement(name = "ImportControl")
    protected String importControl;
    @XmlElement(name = "CommercialInvoiceRemoval")
    protected String commercialInvoiceRemoval;
    @XmlElement(name = "UPScarbonneutral")
    protected String upScarbonneutral;
    @XmlElement(name = "USPSPICNumber")
    protected String uspspicNumber;
    @XmlElement(name = "ExchangeBased")
    protected String exchangeBased;
    @XmlElement(name = "PackAndCollect")
    protected String packAndCollect;

    /**
     * 获取cod属性的值。
     *
     * @return
     *     possible object is
     *     {@link PackageCOD }
     *
     */
    public PackageCOD getCOD() {
        return cod;
    }

    /**
     * 设置cod属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link PackageCOD }
     *
     */
    public void setCOD(PackageCOD value) {
        this.cod = value;
    }

    /**
     * 获取signatureRequired属性的值。
     *
     * @return
     *     possible object is
     *     {@link CodeDescriptionType }
     *
     */
    public CodeDescriptionType getSignatureRequired() {
        return signatureRequired;
    }

    /**
     * 设置signatureRequired属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link CodeDescriptionType }
     *
     */
    public void setSignatureRequired(CodeDescriptionType value) {
        this.signatureRequired = value;
    }

    /**
     * 获取importControl属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getImportControl() {
        return importControl;
    }

    /**
     * 设置importControl属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setImportControl(String value) {
        this.importControl = value;
    }

    /**
     * 获取commercialInvoiceRemoval属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCommercialInvoiceRemoval() {
        return commercialInvoiceRemoval;
    }

    /**
     * 设置commercialInvoiceRemoval属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCommercialInvoiceRemoval(String value) {
        this.commercialInvoiceRemoval = value;
    }

    /**
     * 获取upScarbonneutral属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUPScarbonneutral() {
        return upScarbonneutral;
    }

    /**
     * 设置upScarbonneutral属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUPScarbonneutral(String value) {
        this.upScarbonneutral = value;
    }

    /**
     * 获取uspspicNumber属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUSPSPICNumber() {
        return uspspicNumber;
    }

    /**
     * 设置uspspicNumber属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUSPSPICNumber(String value) {
        this.uspspicNumber = value;
    }

    /**
     * 获取exchangeBased属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getExchangeBased() {
        return exchangeBased;
    }

    /**
     * 设置exchangeBased属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setExchangeBased(String value) {
        this.exchangeBased = value;
    }

    /**
     * 获取packAndCollect属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPackAndCollect() {
        return packAndCollect;
    }

    /**
     * 设置packAndCollect属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPackAndCollect(String value) {
        this.packAndCollect = value;
    }

}
