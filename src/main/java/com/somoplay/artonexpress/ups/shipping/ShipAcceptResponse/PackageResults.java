//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.10.28 时间 03:38:22 PM EDT
//


package com.somoplay.artonexpress.ups.shipping.ShipAcceptResponse;

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
 *         &lt;element ref="{}TrackingNumber"/&gt;
 *         &lt;element ref="{}BaseServiceCharge" minOccurs="0"/&gt;
 *         &lt;element ref="{}ServiceOptionsCharges" minOccurs="0"/&gt;
 *         &lt;element ref="{}LabelImage" minOccurs="0"/&gt;
 *         &lt;element ref="{}Receipt" minOccurs="0"/&gt;
 *         &lt;element name="USPSPICNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CN22Number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Form" type="{}IntlForms" minOccurs="0"/&gt;
 *         &lt;element ref="{}Accessorial" minOccurs="0"/&gt;
 *         &lt;element ref="{}ItemizedCharges" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}NegotiatedCharges" minOccurs="0"/&gt;
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
    "trackingNumber",
    "baseServiceCharge",
    "serviceOptionsCharges",
    "labelImage",
    "receipt",
    "uspspicNumber",
    "cn22Number",
    "form",
    "accessorial",
    "itemizedCharges",
    "negotiatedCharges"
})
@XmlRootElement(name = "PackageResults")
public class PackageResults {

    @XmlElement(name = "TrackingNumber", required = true)
    protected String trackingNumber;
    @XmlElement(name = "BaseServiceCharge")
    protected MonetaryType baseServiceCharge;
    @XmlElement(name = "ServiceOptionsCharges")
    protected MonetaryType serviceOptionsCharges;
    @XmlElement(name = "LabelImage")
    protected LabelImage labelImage;
    @XmlElement(name = "Receipt")
    protected Receipt receipt;
    @XmlElement(name = "USPSPICNumber")
    protected String uspspicNumber;
    @XmlElement(name = "CN22Number")
    protected String cn22Number;
    @XmlElement(name = "Form")
    protected IntlForms form;
    @XmlElement(name = "Accessorial")
    protected Accessorial accessorial;
    @XmlElement(name = "ItemizedCharges")
    protected List<MonetaryType> itemizedCharges;
    @XmlElement(name = "NegotiatedCharges")
    protected NegotiatedCharges negotiatedCharges;

    /**
     * 获取trackingNumber属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTrackingNumber() {
        return trackingNumber;
    }

    /**
     * 设置trackingNumber属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTrackingNumber(String value) {
        this.trackingNumber = value;
    }

    /**
     * 获取baseServiceCharge属性的值。
     *
     * @return
     *     possible object is
     *     {@link MonetaryType }
     *
     */
    public MonetaryType getBaseServiceCharge() {
        return baseServiceCharge;
    }

    /**
     * 设置baseServiceCharge属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link MonetaryType }
     *
     */
    public void setBaseServiceCharge(MonetaryType value) {
        this.baseServiceCharge = value;
    }

    /**
     * 获取serviceOptionsCharges属性的值。
     *
     * @return
     *     possible object is
     *     {@link MonetaryType }
     *
     */
    public MonetaryType getServiceOptionsCharges() {
        return serviceOptionsCharges;
    }

    /**
     * 设置serviceOptionsCharges属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link MonetaryType }
     *
     */
    public void setServiceOptionsCharges(MonetaryType value) {
        this.serviceOptionsCharges = value;
    }

    /**
     * 获取labelImage属性的值。
     *
     * @return
     *     possible object is
     *     {@link LabelImage }
     *
     */
    public LabelImage getLabelImage() {
        return labelImage;
    }

    /**
     * 设置labelImage属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link LabelImage }
     *
     */
    public void setLabelImage(LabelImage value) {
        this.labelImage = value;
    }

    /**
     * 获取receipt属性的值。
     *
     * @return
     *     possible object is
     *     {@link Receipt }
     *
     */
    public Receipt getReceipt() {
        return receipt;
    }

    /**
     * 设置receipt属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Receipt }
     *
     */
    public void setReceipt(Receipt value) {
        this.receipt = value;
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
     * 获取cn22Number属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCN22Number() {
        return cn22Number;
    }

    /**
     * 设置cn22Number属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCN22Number(String value) {
        this.cn22Number = value;
    }

    /**
     * 获取form属性的值。
     *
     * @return
     *     possible object is
     *     {@link IntlForms }
     *
     */
    public IntlForms getForm() {
        return form;
    }

    /**
     * 设置form属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link IntlForms }
     *
     */
    public void setForm(IntlForms value) {
        this.form = value;
    }

    /**
     * 获取accessorial属性的值。
     *
     * @return
     *     possible object is
     *     {@link Accessorial }
     *
     */
    public Accessorial getAccessorial() {
        return accessorial;
    }

    /**
     * 设置accessorial属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Accessorial }
     *
     */
    public void setAccessorial(Accessorial value) {
        this.accessorial = value;
    }

    /**
     * Gets the value of the itemizedCharges property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemizedCharges property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemizedCharges().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MonetaryType }
     *
     *
     */
    public List<MonetaryType> getItemizedCharges() {
        if (itemizedCharges == null) {
            itemizedCharges = new ArrayList<MonetaryType>();
        }
        return this.itemizedCharges;
    }

    /**
     * 获取negotiatedCharges属性的值。
     *
     * @return
     *     possible object is
     *     {@link NegotiatedCharges }
     *
     */
    public NegotiatedCharges getNegotiatedCharges() {
        return negotiatedCharges;
    }

    /**
     * 设置negotiatedCharges属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link NegotiatedCharges }
     *
     */
    public void setNegotiatedCharges(NegotiatedCharges value) {
        this.negotiatedCharges = value;
    }

}
