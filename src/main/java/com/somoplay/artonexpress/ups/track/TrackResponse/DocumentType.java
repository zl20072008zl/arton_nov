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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DocumentType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="DocumentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Type" type="{}CodeDescriptionType"/&gt;
 *         &lt;element name="GraphicImage" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Format" type="{}CodeDescriptionType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentType", propOrder = {
    "type",
    "graphicImage",
    "format"
})
public class DocumentType {

    @XmlElement(name = "Type", required = true)
    protected CodeDescriptionType type;
    @XmlElement(name = "GraphicImage", required = true)
    protected String graphicImage;
    @XmlElement(name = "Format", required = true)
    protected CodeDescriptionType format;

    /**
     * 获取type属性的值。
     *
     * @return
     *     possible object is
     *     {@link CodeDescriptionType }
     *
     */
    public CodeDescriptionType getType() {
        return type;
    }

    /**
     * 设置type属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link CodeDescriptionType }
     *
     */
    public void setType(CodeDescriptionType value) {
        this.type = value;
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
     * 获取format属性的值。
     *
     * @return
     *     possible object is
     *     {@link CodeDescriptionType }
     *
     */
    public CodeDescriptionType getFormat() {
        return format;
    }

    /**
     * 设置format属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link CodeDescriptionType }
     *
     */
    public void setFormat(CodeDescriptionType value) {
        this.format = value;
    }

}
