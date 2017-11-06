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
 * <p>RedirectType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="RedirectType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CompanyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LocationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PickupDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UPSAPAddress" type="{}UPSAPAddressType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RedirectType", propOrder = {
    "companyName",
    "locationID",
    "pickupDate",
    "upsapAddress"
})
public class RedirectType {

    @XmlElement(name = "CompanyName")
    protected String companyName;
    @XmlElement(name = "LocationID")
    protected String locationID;
    @XmlElement(name = "PickupDate")
    protected String pickupDate;
    @XmlElement(name = "UPSAPAddress")
    protected UPSAPAddressType upsapAddress;

    /**
     * 获取companyName属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * 设置companyName属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

    /**
     * 获取locationID属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLocationID() {
        return locationID;
    }

    /**
     * 设置locationID属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLocationID(String value) {
        this.locationID = value;
    }

    /**
     * 获取pickupDate属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPickupDate() {
        return pickupDate;
    }

    /**
     * 设置pickupDate属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPickupDate(String value) {
        this.pickupDate = value;
    }

    /**
     * 获取upsapAddress属性的值。
     *
     * @return
     *     possible object is
     *     {@link UPSAPAddressType }
     *
     */
    public UPSAPAddressType getUPSAPAddress() {
        return upsapAddress;
    }

    /**
     * 设置upsapAddress属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link UPSAPAddressType }
     *
     */
    public void setUPSAPAddress(UPSAPAddressType value) {
        this.upsapAddress = value;
    }

}
