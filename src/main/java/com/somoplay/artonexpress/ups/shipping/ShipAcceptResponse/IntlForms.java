//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.10.28 时间 03:38:22 PM EDT
//


package com.somoplay.artonexpress.ups.shipping.ShipAcceptResponse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>IntlForms complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="IntlForms"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{}Image"/&gt;
 *         &lt;element name="FormGroupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FormGroupIdName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntlForms", propOrder = {
    "code",
    "description",
    "image",
    "formGroupId",
    "formGroupIdName"
})
public class IntlForms {

    @XmlElement(name = "Code", required = true)
    protected String code;
    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "Image", required = true)
    protected ImageType image;
    @XmlElement(name = "FormGroupId")
    protected String formGroupId;
    @XmlElement(name = "FormGroupIdName")
    protected String formGroupIdName;

    /**
     * 获取code属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置code属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * 获取description属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置description属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * 获取image属性的值。
     *
     * @return
     *     possible object is
     *     {@link ImageType }
     *
     */
    public ImageType getImage() {
        return image;
    }

    /**
     * 设置image属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link ImageType }
     *
     */
    public void setImage(ImageType value) {
        this.image = value;
    }

    /**
     * 获取formGroupId属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFormGroupId() {
        return formGroupId;
    }

    /**
     * 设置formGroupId属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFormGroupId(String value) {
        this.formGroupId = value;
    }

    /**
     * 获取formGroupIdName属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFormGroupIdName() {
        return formGroupIdName;
    }

    /**
     * 设置formGroupIdName属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFormGroupIdName(String value) {
        this.formGroupIdName = value;
    }

}
