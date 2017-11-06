//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.10.28 时间 03:38:22 PM EDT
//


package com.somoplay.artonexpress.ups.shipping.LabelRecoveryResponse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>LabelImageType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="LabelImageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LabelImageFormat" type="{}CodeType"/&gt;
 *         &lt;element name="GraphicImage" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="HTMLImage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PDF417" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InternationalSignatureGraphicImage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LabelImageType", propOrder = {
    "labelImageFormat",
    "graphicImage",
    "htmlImage",
    "pdf417",
    "internationalSignatureGraphicImage",
    "url"
})
public class LabelImageType {

    @XmlElement(name = "LabelImageFormat", required = true)
    protected CodeType labelImageFormat;
    @XmlElement(name = "GraphicImage", required = true)
    protected String graphicImage;
    @XmlElement(name = "HTMLImage")
    protected String htmlImage;
    @XmlElement(name = "PDF417")
    protected String pdf417;
    @XmlElement(name = "InternationalSignatureGraphicImage")
    protected String internationalSignatureGraphicImage;
    @XmlElement(name = "URL")
    protected String url;

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
     * 获取graphicImage属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getGraphicImage() {
        return graphicImage;
    }

    /**
     * 设置graphicImage属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setGraphicImage(String value) {
        this.graphicImage = value;
    }

    /**
     * 获取htmlImage属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getHTMLImage() {
        return htmlImage;
    }

    /**
     * 设置htmlImage属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setHTMLImage(String value) {
        this.htmlImage = value;
    }

    /**
     * 获取pdf417属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPDF417() {
        return pdf417;
    }

    /**
     * 设置pdf417属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPDF417(String value) {
        this.pdf417 = value;
    }

    /**
     * 获取internationalSignatureGraphicImage属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getInternationalSignatureGraphicImage() {
        return internationalSignatureGraphicImage;
    }

    /**
     * 设置internationalSignatureGraphicImage属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setInternationalSignatureGraphicImage(String value) {
        this.internationalSignatureGraphicImage = value;
    }

    /**
     * 获取url属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getURL() {
        return url;
    }

    /**
     * 设置url属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setURL(String value) {
        this.url = value;
    }

}
