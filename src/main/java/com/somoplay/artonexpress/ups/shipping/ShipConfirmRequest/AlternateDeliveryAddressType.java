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
 * <p>AlternateDeliveryAddressType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="AlternateDeliveryAddressType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AttentionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UPSAccessPointID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Address" type="{}ADLAddressType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlternateDeliveryAddressType", propOrder = {
    "name",
    "attentionName",
    "upsAccessPointID",
    "address"
})
public class AlternateDeliveryAddressType {

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "AttentionName")
    protected String attentionName;
    @XmlElement(name = "UPSAccessPointID")
    protected String upsAccessPointID;
    @XmlElement(name = "Address", required = true)
    protected ADLAddressType address;

    /**
     * 获取name属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * 获取attentionName属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAttentionName() {
        return attentionName;
    }

    /**
     * 设置attentionName属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAttentionName(String value) {
        this.attentionName = value;
    }

    /**
     * 获取upsAccessPointID属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUPSAccessPointID() {
        return upsAccessPointID;
    }

    /**
     * 设置upsAccessPointID属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUPSAccessPointID(String value) {
        this.upsAccessPointID = value;
    }

    /**
     * 获取address属性的值。
     *
     * @return
     *     possible object is
     *     {@link ADLAddressType }
     *
     */
    public ADLAddressType getAddress() {
        return address;
    }

    /**
     * 设置address属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link ADLAddressType }
     *
     */
    public void setAddress(ADLAddressType value) {
        this.address = value;
    }

}
