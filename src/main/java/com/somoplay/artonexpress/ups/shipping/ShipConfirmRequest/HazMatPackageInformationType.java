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
 * <p>HazMatPackageInformationType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="HazMatPackageInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AllPackedInOneIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OverPackedIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="QValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HazMatPackageInformationType", propOrder = {
    "allPackedInOneIndicator",
    "overPackedIndicator",
    "qValue"
})
public class HazMatPackageInformationType {

    @XmlElement(name = "AllPackedInOneIndicator")
    protected String allPackedInOneIndicator;
    @XmlElement(name = "OverPackedIndicator")
    protected String overPackedIndicator;
    @XmlElement(name = "QValue")
    protected String qValue;

    /**
     * 获取allPackedInOneIndicator属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAllPackedInOneIndicator() {
        return allPackedInOneIndicator;
    }

    /**
     * 设置allPackedInOneIndicator属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAllPackedInOneIndicator(String value) {
        this.allPackedInOneIndicator = value;
    }

    /**
     * 获取overPackedIndicator属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOverPackedIndicator() {
        return overPackedIndicator;
    }

    /**
     * 设置overPackedIndicator属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOverPackedIndicator(String value) {
        this.overPackedIndicator = value;
    }

    /**
     * 获取qValue属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getQValue() {
        return qValue;
    }

    /**
     * 设置qValue属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setQValue(String value) {
        this.qValue = value;
    }

}
