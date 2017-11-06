//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.10.28 时间 03:47:51 PM EDT
//


package com.somoplay.artonexpress.ups.track.TrackResponse;

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
 *         &lt;element ref="{}ErrorLocationElementName" minOccurs="0"/&gt;
 *         &lt;element ref="{}ErrorLocationElementReference" minOccurs="0"/&gt;
 *         &lt;element ref="{}ErrorLocationAttributeName" minOccurs="0"/&gt;
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
    "errorLocationElementName",
    "errorLocationElementReference",
    "errorLocationAttributeName"
})
@XmlRootElement(name = "ErrorLocation")
public class ErrorLocation {

    @XmlElement(name = "ErrorLocationElementName")
    protected String errorLocationElementName;
    @XmlElement(name = "ErrorLocationElementReference")
    protected String errorLocationElementReference;
    @XmlElement(name = "ErrorLocationAttributeName")
    protected String errorLocationAttributeName;

    /**
     * 获取errorLocationElementName属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getErrorLocationElementName() {
        return errorLocationElementName;
    }

    /**
     * 设置errorLocationElementName属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setErrorLocationElementName(String value) {
        this.errorLocationElementName = value;
    }

    /**
     * 获取errorLocationElementReference属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getErrorLocationElementReference() {
        return errorLocationElementReference;
    }

    /**
     * 设置errorLocationElementReference属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setErrorLocationElementReference(String value) {
        this.errorLocationElementReference = value;
    }

    /**
     * 获取errorLocationAttributeName属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getErrorLocationAttributeName() {
        return errorLocationAttributeName;
    }

    /**
     * 设置errorLocationAttributeName属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setErrorLocationAttributeName(String value) {
        this.errorLocationAttributeName = value;
    }

}
