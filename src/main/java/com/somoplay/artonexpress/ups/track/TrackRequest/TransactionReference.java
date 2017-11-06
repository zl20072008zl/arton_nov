//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.10.28 时间 03:47:50 PM EDT
//


package com.somoplay.artonexpress.ups.track.TrackRequest;

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
 *         &lt;element name="CustomerContext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TransactionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ToolVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "customerContext",
    "transactionIdentifier",
    "toolVersion"
})
@XmlRootElement(name = "TransactionReference")
public class TransactionReference {

    @XmlElement(name = "CustomerContext")
    protected String customerContext;
    @XmlElement(name = "TransactionIdentifier")
    protected String transactionIdentifier;
    @XmlElement(name = "ToolVersion")
    protected String toolVersion;

    /**
     * 获取customerContext属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCustomerContext() {
        return customerContext;
    }

    /**
     * 设置customerContext属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCustomerContext(String value) {
        this.customerContext = value;
    }

    /**
     * 获取transactionIdentifier属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTransactionIdentifier() {
        return transactionIdentifier;
    }

    /**
     * 设置transactionIdentifier属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTransactionIdentifier(String value) {
        this.transactionIdentifier = value;
    }

    /**
     * 获取toolVersion属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getToolVersion() {
        return toolVersion;
    }

    /**
     * 设置toolVersion属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setToolVersion(String value) {
        this.toolVersion = value;
    }

}
