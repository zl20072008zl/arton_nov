//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.10.28 时间 03:47:50 PM EDT
//


package com.somoplay.artonexpress.ups.rate.RateRequest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CODType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="CODType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CODFundsCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CODAmount" type="{}AmountType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CODType", propOrder = {
    "codFundsCode",
    "codAmount"
})
public class CODType {

    @XmlElement(name = "CODFundsCode")
    protected String codFundsCode;
    @XmlElement(name = "CODAmount", required = true)
    protected AmountType codAmount;

    /**
     * 获取codFundsCode属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCODFundsCode() {
        return codFundsCode;
    }

    /**
     * 设置codFundsCode属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCODFundsCode(String value) {
        this.codFundsCode = value;
    }

    /**
     * 获取codAmount属性的值。
     *
     * @return
     *     possible object is
     *     {@link AmountType }
     *
     */
    public AmountType getCODAmount() {
        return codAmount;
    }

    /**
     * 设置codAmount属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *
     */
    public void setCODAmount(AmountType value) {
        this.codAmount = value;
    }

}
