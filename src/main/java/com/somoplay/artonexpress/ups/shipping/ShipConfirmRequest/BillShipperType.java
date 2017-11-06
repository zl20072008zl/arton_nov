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
 * <p>BillShipperType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="BillShipperType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreditCard" type="{}CreditCardType" minOccurs="0"/&gt;
 *         &lt;element name="AlternatePaymentMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillShipperType", propOrder = {
    "accountNumber",
    "creditCard",
    "alternatePaymentMethod"
})
public class BillShipperType {

    @XmlElement(name = "AccountNumber")
    protected String accountNumber;
    @XmlElement(name = "CreditCard")
    protected CreditCardType creditCard;
    @XmlElement(name = "AlternatePaymentMethod")
    protected String alternatePaymentMethod;

    /**
     * 获取accountNumber属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * 设置accountNumber属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * 获取creditCard属性的值。
     *
     * @return
     *     possible object is
     *     {@link CreditCardType }
     *
     */
    public CreditCardType getCreditCard() {
        return creditCard;
    }

    /**
     * 设置creditCard属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link CreditCardType }
     *
     */
    public void setCreditCard(CreditCardType value) {
        this.creditCard = value;
    }

    /**
     * 获取alternatePaymentMethod属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAlternatePaymentMethod() {
        return alternatePaymentMethod;
    }

    /**
     * 设置alternatePaymentMethod属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAlternatePaymentMethod(String value) {
        this.alternatePaymentMethod = value;
    }

}
