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
 * <p>PaymentInformationType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="PaymentInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="Prepaid" type="{}PrepaidType" minOccurs="0"/&gt;
 *         &lt;element name="BillThirdParty" type="{}BillThirdPartyType" minOccurs="0"/&gt;
 *         &lt;element name="FreightCollect" type="{}FreightCollectType" minOccurs="0"/&gt;
 *         &lt;element name="ConsigneeBilled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentInformationType", propOrder = {
    "prepaid",
    "billThirdParty",
    "freightCollect",
    "consigneeBilled"
})
public class PaymentInformationType {

    @XmlElement(name = "Prepaid")
    protected PrepaidType prepaid;
    @XmlElement(name = "BillThirdParty")
    protected BillThirdPartyType billThirdParty;
    @XmlElement(name = "FreightCollect")
    protected FreightCollectType freightCollect;
    @XmlElement(name = "ConsigneeBilled")
    protected String consigneeBilled;

    /**
     * 获取prepaid属性的值。
     *
     * @return
     *     possible object is
     *     {@link PrepaidType }
     *
     */
    public PrepaidType getPrepaid() {
        return prepaid;
    }

    /**
     * 设置prepaid属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link PrepaidType }
     *
     */
    public void setPrepaid(PrepaidType value) {
        this.prepaid = value;
    }

    /**
     * 获取billThirdParty属性的值。
     *
     * @return
     *     possible object is
     *     {@link BillThirdPartyType }
     *
     */
    public BillThirdPartyType getBillThirdParty() {
        return billThirdParty;
    }

    /**
     * 设置billThirdParty属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BillThirdPartyType }
     *
     */
    public void setBillThirdParty(BillThirdPartyType value) {
        this.billThirdParty = value;
    }

    /**
     * 获取freightCollect属性的值。
     *
     * @return
     *     possible object is
     *     {@link FreightCollectType }
     *
     */
    public FreightCollectType getFreightCollect() {
        return freightCollect;
    }

    /**
     * 设置freightCollect属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link FreightCollectType }
     *
     */
    public void setFreightCollect(FreightCollectType value) {
        this.freightCollect = value;
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
