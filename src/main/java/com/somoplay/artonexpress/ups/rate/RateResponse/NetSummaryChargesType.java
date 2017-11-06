//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.10.28 时间 03:47:50 PM EDT
//


package com.somoplay.artonexpress.ups.rate.RateResponse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>NetSummaryChargesType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="NetSummaryChargesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="GrandTotal" type="{}ChargesType"/&gt;
 *           &lt;element name="TotalChargesWithTaxes" type="{}ChargesType" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetSummaryChargesType", propOrder = {
    "grandTotal",
    "totalChargesWithTaxes"
})
public class NetSummaryChargesType {

    @XmlElement(name = "GrandTotal", required = true)
    protected ChargesType grandTotal;
    @XmlElement(name = "TotalChargesWithTaxes")
    protected ChargesType totalChargesWithTaxes;

    /**
     * 获取grandTotal属性的值。
     *
     * @return
     *     possible object is
     *     {@link ChargesType }
     *
     */
    public ChargesType getGrandTotal() {
        return grandTotal;
    }

    /**
     * 设置grandTotal属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link ChargesType }
     *
     */
    public void setGrandTotal(ChargesType value) {
        this.grandTotal = value;
    }

    /**
     * 获取totalChargesWithTaxes属性的值。
     *
     * @return
     *     possible object is
     *     {@link ChargesType }
     *
     */
    public ChargesType getTotalChargesWithTaxes() {
        return totalChargesWithTaxes;
    }

    /**
     * 设置totalChargesWithTaxes属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link ChargesType }
     *
     */
    public void setTotalChargesWithTaxes(ChargesType value) {
        this.totalChargesWithTaxes = value;
    }

}
