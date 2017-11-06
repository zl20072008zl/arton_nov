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
 * <p>PackageServiceOptionsCODType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="PackageServiceOptionsCODType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CODCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CODFundsCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CODAmount" type="{}PackageServiceOptionsCODAmountType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackageServiceOptionsCODType", propOrder = {
    "codCode",
    "codFundsCode",
    "codAmount"
})
public class PackageServiceOptionsCODType {

    @XmlElement(name = "CODCode", required = true)
    protected String codCode;
    @XmlElement(name = "CODFundsCode", required = true)
    protected String codFundsCode;
    @XmlElement(name = "CODAmount", required = true)
    protected PackageServiceOptionsCODAmountType codAmount;

    /**
     * 获取codCode属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCODCode() {
        return codCode;
    }

    /**
     * 设置codCode属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCODCode(String value) {
        this.codCode = value;
    }

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
     *     {@link PackageServiceOptionsCODAmountType }
     *
     */
    public PackageServiceOptionsCODAmountType getCODAmount() {
        return codAmount;
    }

    /**
     * 设置codAmount属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link PackageServiceOptionsCODAmountType }
     *
     */
    public void setCODAmount(PackageServiceOptionsCODAmountType value) {
        this.codAmount = value;
    }

}
