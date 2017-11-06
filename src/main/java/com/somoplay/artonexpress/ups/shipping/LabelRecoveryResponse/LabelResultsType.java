//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.10.28 时间 03:38:22 PM EDT
//


package com.somoplay.artonexpress.ups.shipping.LabelRecoveryResponse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>LabelResultsType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="LabelResultsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LabelImage" type="{}LabelImageType"/&gt;
 *         &lt;element name="Receipt" type="{}ReceiptType" minOccurs="0"/&gt;
 *         &lt;element name="Form" type="{}FormType" minOccurs="0"/&gt;
 *         &lt;element name="MailInnovationsTrackingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MailInnovationsLabelImage" type="{}LabelImageType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LabelResultsType", propOrder = {
    "trackingNumber",
    "labelImage",
    "receipt",
    "form",
    "mailInnovationsTrackingNumber",
    "mailInnovationsLabelImage"
})
public class LabelResultsType {

    @XmlElement(name = "TrackingNumber", required = true)
    protected String trackingNumber;
    @XmlElement(name = "LabelImage", required = true)
    protected LabelImageType labelImage;
    @XmlElement(name = "Receipt")
    protected ReceiptType receipt;
    @XmlElement(name = "Form")
    protected FormType form;
    @XmlElement(name = "MailInnovationsTrackingNumber")
    protected String mailInnovationsTrackingNumber;
    @XmlElement(name = "MailInnovationsLabelImage")
    protected LabelImageType mailInnovationsLabelImage;

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
     * 获取labelImage属性的值。
     *
     * @return
     *     possible object is
     *     {@link LabelImageType }
     *
     */
    public LabelImageType getLabelImage() {
        return labelImage;
    }

    /**
     * 设置labelImage属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link LabelImageType }
     *
     */
    public void setLabelImage(LabelImageType value) {
        this.labelImage = value;
    }

    /**
     * 获取receipt属性的值。
     *
     * @return
     *     possible object is
     *     {@link ReceiptType }
     *
     */
    public ReceiptType getReceipt() {
        return receipt;
    }

    /**
     * 设置receipt属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link ReceiptType }
     *
     */
    public void setReceipt(ReceiptType value) {
        this.receipt = value;
    }

    /**
     * 获取form属性的值。
     *
     * @return
     *     possible object is
     *     {@link FormType }
     *
     */
    public FormType getForm() {
        return form;
    }

    /**
     * 设置form属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link FormType }
     *
     */
    public void setForm(FormType value) {
        this.form = value;
    }

    /**
     * 获取mailInnovationsTrackingNumber属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMailInnovationsTrackingNumber() {
        return mailInnovationsTrackingNumber;
    }

    /**
     * 设置mailInnovationsTrackingNumber属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMailInnovationsTrackingNumber(String value) {
        this.mailInnovationsTrackingNumber = value;
    }

    /**
     * 获取mailInnovationsLabelImage属性的值。
     *
     * @return
     *     possible object is
     *     {@link LabelImageType }
     *
     */
    public LabelImageType getMailInnovationsLabelImage() {
        return mailInnovationsLabelImage;
    }

    /**
     * 设置mailInnovationsLabelImage属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link LabelImageType }
     *
     */
    public void setMailInnovationsLabelImage(LabelImageType value) {
        this.mailInnovationsLabelImage = value;
    }

}
