//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.10.28 时间 03:47:50 PM EDT
//


package com.somoplay.artonexpress.ups.track.TrackRequest;

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
 *         &lt;element ref="{}TransactionReference"/&gt;
 *         &lt;element ref="{}RequestAction"/&gt;
 *         &lt;element ref="{}RequestOption" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "transactionReference",
    "requestAction",
    "requestOption"
})
@XmlRootElement(name = "Request")
public class Request {

    @XmlElement(name = "TransactionReference", required = true)
    protected TransactionReference transactionReference;
    @XmlElement(name = "RequestAction", required = true)
    protected String requestAction;
    @XmlElement(name = "RequestOption")
    protected List<String> requestOption;

    /**
     * 获取transactionReference属性的值。
     *
     * @return
     *     possible object is
     *     {@link TransactionReference }
     *
     */
    public TransactionReference getTransactionReference() {
        return transactionReference;
    }

    /**
     * 设置transactionReference属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link TransactionReference }
     *
     */
    public void setTransactionReference(TransactionReference value) {
        this.transactionReference = value;
    }

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
     * Gets the value of the requestOption property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestOption property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestOption().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     *
     *
     */
    public List<String> getRequestOption() {
        if (requestOption == null) {
            requestOption = new ArrayList<String>();
        }
        return this.requestOption;
    }

}
