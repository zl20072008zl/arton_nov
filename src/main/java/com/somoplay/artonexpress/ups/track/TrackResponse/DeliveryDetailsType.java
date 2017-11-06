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
 * <p>DeliveryDetailsType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="DeliveryDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DeliveryDate" type="{}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="ServiceCenter" type="{}ServiceCenterType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryDetailsType", propOrder = {
    "deliveryDate",
    "serviceCenter"
})
public class DeliveryDetailsType {

    @XmlElement(name = "DeliveryDate")
    protected DateTime deliveryDate;
    @XmlElement(name = "ServiceCenter")
    protected ServiceCenterType serviceCenter;

    /**
     * 获取deliveryDate属性的值。
     *
     * @return
     *     possible object is
     *     {@link DateTime }
     *
     */
    public DateTime getDeliveryDate() {
        return deliveryDate;
    }

    /**
     * 设置deliveryDate属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *
     */
    public void setDeliveryDate(DateTime value) {
        this.deliveryDate = value;
    }

    /**
     * 获取serviceCenter属性的值。
     *
     * @return
     *     possible object is
     *     {@link ServiceCenterType }
     *
     */
    public ServiceCenterType getServiceCenter() {
        return serviceCenter;
    }

    /**
     * 设置serviceCenter属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link ServiceCenterType }
     *
     */
    public void setServiceCenter(ServiceCenterType value) {
        this.serviceCenter = value;
    }

}
