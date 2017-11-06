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
 * <p>PromotionalDiscountInformationType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="PromotionalDiscountInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PromoCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PromoAliasCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromotionalDiscountInformationType", propOrder = {
    "promoCode",
    "promoAliasCode"
})
public class PromotionalDiscountInformationType {

    @XmlElement(name = "PromoCode", required = true)
    protected String promoCode;
    @XmlElement(name = "PromoAliasCode", required = true)
    protected String promoAliasCode;

    /**
     * 获取promoCode属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPromoCode() {
        return promoCode;
    }

    /**
     * 设置promoCode属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPromoCode(String value) {
        this.promoCode = value;
    }

    /**
     * 获取promoAliasCode属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPromoAliasCode() {
        return promoAliasCode;
    }

    /**
     * 设置promoAliasCode属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPromoAliasCode(String value) {
        this.promoAliasCode = value;
    }

}
