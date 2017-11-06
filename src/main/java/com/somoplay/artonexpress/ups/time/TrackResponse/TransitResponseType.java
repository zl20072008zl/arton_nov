//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.10.28 时间 03:47:51 PM EDT
//


package com.somoplay.artonexpress.ups.time.TrackResponse;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TransitResponseType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="TransitResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TransitFrom" type="{}TransitFromType"/&gt;
 *         &lt;element name="TransitTo" type="{}TransitToType"/&gt;
 *         &lt;element name="PickupDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{}DocumentsOnlyIndicator" minOccurs="0"/&gt;
 *         &lt;element name="AutoDutyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipmentWeight" type="{}WeightType" minOccurs="0"/&gt;
 *         &lt;element name="InvoiceLineTotal" type="{}MonetaryType" minOccurs="0"/&gt;
 *         &lt;element name="ServiceSummary" type="{}ServiceSummaryType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="MaximumListSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "TransitResponseType", propOrder = {
    "transitFrom",
    "transitTo",
    "pickupDate",
    "documentsOnlyIndicator",
    "autoDutyCode",
    "shipmentWeight",
    "invoiceLineTotal",
    "serviceSummary",
    "maximumListSize",
    "disclaimer"
})
public class TransitResponseType {

    @XmlElement(name = "TransitFrom", required = true)
    protected TransitFromType transitFrom;
    @XmlElement(name = "TransitTo", required = true)
    protected TransitToType transitTo;
    @XmlElement(name = "PickupDate", required = true)
    protected String pickupDate;
    @XmlElement(name = "DocumentsOnlyIndicator")
    protected String documentsOnlyIndicator;
    @XmlElement(name = "AutoDutyCode")
    protected String autoDutyCode;
    @XmlElement(name = "ShipmentWeight")
    protected WeightType shipmentWeight;
    @XmlElement(name = "InvoiceLineTotal")
    protected MonetaryType invoiceLineTotal;
    @XmlElement(name = "ServiceSummary", required = true)
    protected List<ServiceSummaryType> serviceSummary;
    @XmlElement(name = "MaximumListSize")
    protected String maximumListSize;
    @XmlElement(name = "Disclaimer")
    protected String disclaimer;

    /**
     * 获取transitFrom属性的值。
     *
     * @return
     *     possible object is
     *     {@link TransitFromType }
     *
     */
    public TransitFromType getTransitFrom() {
        return transitFrom;
    }

    /**
     * 设置transitFrom属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link TransitFromType }
     *
     */
    public void setTransitFrom(TransitFromType value) {
        this.transitFrom = value;
    }

    /**
     * 获取transitTo属性的值。
     *
     * @return
     *     possible object is
     *     {@link TransitToType }
     *
     */
    public TransitToType getTransitTo() {
        return transitTo;
    }

    /**
     * 设置transitTo属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link TransitToType }
     *
     */
    public void setTransitTo(TransitToType value) {
        this.transitTo = value;
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
     * 获取shipmentWeight属性的值。
     *
     * @return
     *     possible object is
     *     {@link WeightType }
     *
     */
    public WeightType getShipmentWeight() {
        return shipmentWeight;
    }

    /**
     * 设置shipmentWeight属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link WeightType }
     *
     */
    public void setShipmentWeight(WeightType value) {
        this.shipmentWeight = value;
    }

    /**
     * 获取invoiceLineTotal属性的值。
     *
     * @return
     *     possible object is
     *     {@link MonetaryType }
     *
     */
    public MonetaryType getInvoiceLineTotal() {
        return invoiceLineTotal;
    }

    /**
     * 设置invoiceLineTotal属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link MonetaryType }
     *
     */
    public void setInvoiceLineTotal(MonetaryType value) {
        this.invoiceLineTotal = value;
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
     * 获取maximumListSize属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMaximumListSize() {
        return maximumListSize;
    }

    /**
     * 设置maximumListSize属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMaximumListSize(String value) {
        this.maximumListSize = value;
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
