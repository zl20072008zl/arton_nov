//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.10.28 时间 03:38:22 PM EDT
//


package com.somoplay.artonexpress.ups.shipping.ShipAcceptResponse;

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
 *         &lt;element ref="{}GrandTotal"/&gt;
 *         &lt;element ref="{}TotalChargesWithTaxes" minOccurs="0"/&gt;
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
    "grandTotal",
    "totalChargesWithTaxes"
})
@XmlRootElement(name = "NetSummaryCharges")
public class NetSummaryCharges {

    @XmlElement(name = "GrandTotal", required = true)
    protected GrandTotal grandTotal;
    @XmlElement(name = "TotalChargesWithTaxes")
    protected MonetaryType totalChargesWithTaxes;

    /**
     * 获取grandTotal属性的值。
     *
     * @return
     *     possible object is
     *     {@link GrandTotal }
     *
     */
    public GrandTotal getGrandTotal() {
        return grandTotal;
    }

    /**
     * 设置grandTotal属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link GrandTotal }
     *
     */
    public void setGrandTotal(GrandTotal value) {
        this.grandTotal = value;
    }

    /**
     * 获取totalChargesWithTaxes属性的值。
     *
     * @return
     *     possible object is
     *     {@link MonetaryType }
     *
     */
    public MonetaryType getTotalChargesWithTaxes() {
        return totalChargesWithTaxes;
    }

    /**
     * 设置totalChargesWithTaxes属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link MonetaryType }
     *
     */
    public void setTotalChargesWithTaxes(MonetaryType value) {
        this.totalChargesWithTaxes = value;
    }

}
