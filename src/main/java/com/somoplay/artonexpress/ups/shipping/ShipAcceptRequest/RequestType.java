//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.10.28 时间 03:38:22 PM EDT
//


package com.somoplay.artonexpress.ups.shipping.ShipAcceptRequest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RequestType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="RequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="RequestAction" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;element name="SubVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *           &lt;element name="TransactionReference" type="{}TransactionReferenceType" minOccurs="0"/&gt;
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
@XmlType(name = "RequestType", propOrder = {
    "requestAction",
    "subVersion",
    "transactionReference"
})
public class RequestType {

    @XmlElement(name = "RequestAction", required = true)
    protected String requestAction;
    @XmlElement(name = "SubVersion")
    protected String subVersion;
    @XmlElement(name = "TransactionReference")
    protected TransactionReferenceType transactionReference;

    /**
     * 获取requestAction属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRequestAction() {
        return requestAction;
    }

    /**
     * 设置requestAction属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRequestAction(String value) {
        this.requestAction = value;
    }

    /**
     * 获取subVersion属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSubVersion() {
        return subVersion;
    }

    /**
     * 设置subVersion属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSubVersion(String value) {
        this.subVersion = value;
    }

    /**
     * 获取transactionReference属性的值。
     *
     * @return
     *     possible object is
     *     {@link TransactionReferenceType }
     *
     */
    public TransactionReferenceType getTransactionReference() {
        return transactionReference;
    }

    /**
     * 设置transactionReference属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link TransactionReferenceType }
     *
     */
    public void setTransactionReference(TransactionReferenceType value) {
        this.transactionReference = value;
    }

}
