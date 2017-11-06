//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.10.28 时间 03:38:23 PM EDT
//


package com.somoplay.artonexpress.ups.shipping.ShipConfirmResponse;

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
 *         &lt;element ref="{}ItemizedCharges" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}TaxCharges" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}NetSummaryCharges"/&gt;
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
    "itemizedCharges",
    "taxCharges",
    "netSummaryCharges"
})
@XmlRootElement(name = "NegotiatedRates")
public class NegotiatedRates {

    @XmlElement(name = "ItemizedCharges")
    protected List<MonetaryType> itemizedCharges;
    @XmlElement(name = "TaxCharges")
    protected List<TaxChargeType> taxCharges;
    @XmlElement(name = "NetSummaryCharges", required = true)
    protected NetSummaryCharges netSummaryCharges;

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
     * Gets the value of the taxCharges property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxCharges property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxCharges().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxChargeType }
     *
     *
     */
    public List<TaxChargeType> getTaxCharges() {
        if (taxCharges == null) {
            taxCharges = new ArrayList<TaxChargeType>();
        }
        return this.taxCharges;
    }

    /**
     * 获取netSummaryCharges属性的值。
     *
     * @return
     *     possible object is
     *     {@link NetSummaryCharges }
     *
     */
    public NetSummaryCharges getNetSummaryCharges() {
        return netSummaryCharges;
    }

    /**
     * 设置netSummaryCharges属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link NetSummaryCharges }
     *
     */
    public void setNetSummaryCharges(NetSummaryCharges value) {
        this.netSummaryCharges = value;
    }

}
