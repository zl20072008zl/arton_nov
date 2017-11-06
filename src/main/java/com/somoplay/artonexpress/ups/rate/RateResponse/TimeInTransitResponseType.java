//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.10.28 时间 03:47:50 PM EDT
//


package com.somoplay.artonexpress.ups.rate.RateResponse;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TimeInTransitResponseType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="TimeInTransitResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PickupDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DocumentsOnlyIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PackageBillType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceSummary" type="{}ServiceSummaryType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="AutoDutyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Disclaimer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeInTransitResponseType", propOrder = {
    "pickupDate",
    "documentsOnlyIndicator",
    "packageBillType",
    "serviceSummary",
    "autoDutyCode",
    "disclaimer"
})
public class TimeInTransitResponseType {

    @XmlElement(name = "PickupDate", required = true)
    protected String pickupDate;
    @XmlElement(name = "DocumentsOnlyIndicator")
    protected String documentsOnlyIndicator;
    @XmlElement(name = "PackageBillType")
    protected String packageBillType;
    @XmlElement(name = "ServiceSummary", required = true)
    protected List<ServiceSummaryType> serviceSummary;
    @XmlElement(name = "AutoDutyCode")
    protected String autoDutyCode;
    @XmlElement(name = "Disclaimer")
    protected String disclaimer;

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
     * 获取documentsOnlyIndicator属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDocumentsOnlyIndicator() {
        return documentsOnlyIndicator;
    }

    /**
     * 设置documentsOnlyIndicator属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDocumentsOnlyIndicator(String value) {
        this.documentsOnlyIndicator = value;
    }

    /**
     * 获取packageBillType属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPackageBillType() {
        return packageBillType;
    }

    /**
     * 设置packageBillType属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPackageBillType(String value) {
        this.packageBillType = value;
    }

    /**
     * Gets the value of the serviceSummary property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceSummary property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceSummary().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceSummaryType }
     *
     *
     */
    public List<ServiceSummaryType> getServiceSummary() {
        if (serviceSummary == null) {
            serviceSummary = new ArrayList<ServiceSummaryType>();
        }
        return this.serviceSummary;
    }

    /**
     * 获取autoDutyCode属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAutoDutyCode() {
        return autoDutyCode;
    }

    /**
     * 设置autoDutyCode属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAutoDutyCode(String value) {
        this.autoDutyCode = value;
    }

    /**
     * 获取disclaimer属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDisclaimer() {
        return disclaimer;
    }

    /**
     * 设置disclaimer属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDisclaimer(String value) {
        this.disclaimer = value;
    }

}
