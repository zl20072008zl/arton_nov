//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.10.28 时间 03:38:22 PM EDT
//


package com.somoplay.artonexpress.ups.shipping.LabelRecoveryRequest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>LabelSpecificationType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="LabelSpecificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HTTPUserAgent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LabelImageFormat" type="{}CodeType"/&gt;
 *         &lt;element name="LabelStockSize" type="{}LabelStockSizeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LabelSpecificationType", propOrder = {
    "httpUserAgent",
    "labelImageFormat",
    "labelStockSize"
})
public class LabelSpecificationType {

    @XmlElement(name = "HTTPUserAgent")
    protected String httpUserAgent;
    @XmlElement(name = "LabelImageFormat", required = true)
    protected CodeType labelImageFormat;
    @XmlElement(name = "LabelStockSize")
    protected LabelStockSizeType labelStockSize;

    /**
     * 获取httpUserAgent属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getHTTPUserAgent() {
        return httpUserAgent;
    }

    /**
     * 设置httpUserAgent属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setHTTPUserAgent(String value) {
        this.httpUserAgent = value;
    }

    /**
     * 获取labelImageFormat属性的值。
     *
     * @return
     *     possible object is
     *     {@link CodeType }
     *
     */
    public CodeType getLabelImageFormat() {
        return labelImageFormat;
    }

    /**
     * 设置labelImageFormat属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *
     */
    public void setLabelImageFormat(CodeType value) {
        this.labelImageFormat = value;
    }

    /**
     * 获取labelStockSize属性的值。
     *
     * @return
     *     possible object is
     *     {@link LabelStockSizeType }
     *
     */
    public LabelStockSizeType getLabelStockSize() {
        return labelStockSize;
    }

    /**
     * 设置labelStockSize属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link LabelStockSizeType }
     *
     */
    public void setLabelStockSize(LabelStockSizeType value) {
        this.labelStockSize = value;
    }

}
