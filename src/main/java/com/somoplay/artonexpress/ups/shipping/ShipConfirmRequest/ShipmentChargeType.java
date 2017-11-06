//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.10.28 时间 03:38:23 PM EDT
//


package com.somoplay.artonexpress.ups.shipping.ShipConfirmRequest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ShipmentChargeType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="ShipmentChargeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="BillShipper" type="{}BillShipperType" minOccurs="0"/&gt;
 *           &lt;element name="BillReceiver" type="{}BillReceiverType" minOccurs="0"/&gt;
 *           &lt;element name="BillThirdParty" type="{}ItemizedBillThirdPartyType" minOccurs="0"/&gt;
 *           &lt;element name="ConsigneeBilled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipmentChargeType", propOrder = {
    "type",
    "billShipper",
    "billReceiver",
    "billThirdParty",
    "consigneeBilled"
})
public class ShipmentChargeType {

    @XmlElement(name = "Type", required = true)
    protected String type;
    @XmlElement(name = "BillShipper")
    protected BillShipperType billShipper;
    @XmlElement(name = "BillReceiver")
    protected BillReceiverType billReceiver;
    @XmlElement(name = "BillThirdParty")
    protected ItemizedBillThirdPartyType billThirdParty;
    @XmlElement(name = "ConsigneeBilled")
    protected String consigneeBilled;

    /**
     * 获取type属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getType() {
        return type;
    }

    /**
     * 设置type属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * 获取billShipper属性的值。
     *
     * @return
     *     possible object is
     *     {@link BillShipperType }
     *
     */
    public BillShipperType getBillShipper() {
        return billShipper;
    }

    /**
     * 设置billShipper属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BillShipperType }
     *
     */
    public void setBillShipper(BillShipperType value) {
        this.billShipper = value;
    }

    /**
     * 获取billReceiver属性的值。
     *
     * @return
     *     possible object is
     *     {@link BillReceiverType }
     *
     */
    public BillReceiverType getBillReceiver() {
        return billReceiver;
    }

    /**
     * 设置billReceiver属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BillReceiverType }
     *
     */
    public void setBillReceiver(BillReceiverType value) {
        this.billReceiver = value;
    }

    /**
     * 获取billThirdParty属性的值。
     *
     * @return
     *     possible object is
     *     {@link ItemizedBillThirdPartyType }
     *
     */
    public ItemizedBillThirdPartyType getBillThirdParty() {
        return billThirdParty;
    }

    /**
     * 设置billThirdParty属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link ItemizedBillThirdPartyType }
     *
     */
    public void setBillThirdParty(ItemizedBillThirdPartyType value) {
        this.billThirdParty = value;
    }

    /**
     * 获取consigneeBilled属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getConsigneeBilled() {
        return consigneeBilled;
    }

    /**
     * 设置consigneeBilled属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setConsigneeBilled(String value) {
        this.consigneeBilled = value;
    }

}
