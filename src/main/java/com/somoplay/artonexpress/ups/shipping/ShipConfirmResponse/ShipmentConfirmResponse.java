//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.10.28 时间 03:38:23 PM EDT
//


package com.somoplay.artonexpress.ups.shipping.ShipConfirmResponse;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element ref="{}Response"/&gt;
 *         &lt;element ref="{}ShipmentCharges" minOccurs="0"/&gt;
 *         &lt;element ref="{}BillingWeight"/&gt;
 *         &lt;element ref="{}ShipmentIdentificationNumber"/&gt;
 *         &lt;element ref="{}MIDualReturnShipmentKey" minOccurs="0"/&gt;
 *         &lt;element ref="{}BillableWeightCalculationMethod" minOccurs="0"/&gt;
 *         &lt;element ref="{}RatingMethod" minOccurs="0"/&gt;
 *         &lt;element name="Disclaimer" type="{}DisclaimerType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{}ShipmentDigest"/&gt;
 *         &lt;element ref="{}NegotiatedRates" minOccurs="0"/&gt;
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
    "response",
    "shipmentCharges",
    "billingWeight",
    "shipmentIdentificationNumber",
    "miDualReturnShipmentKey",
    "billableWeightCalculationMethod",
    "ratingMethod",
    "disclaimer",
    "shipmentDigest",
    "negotiatedRates"
})
@XmlRootElement(name = "ShipmentConfirmResponse")
public class ShipmentConfirmResponse {

    @XmlElement(name = "Response", required = true)
    protected Response response;
    @XmlElement(name = "ShipmentCharges")
    protected ShipmentCharges shipmentCharges;
    @XmlElement(name = "BillingWeight", required = true)
    protected BillingWeight billingWeight;
    @XmlElement(name = "ShipmentIdentificationNumber", required = true)
    protected String shipmentIdentificationNumber;
    @XmlElement(name = "MIDualReturnShipmentKey")
    protected String miDualReturnShipmentKey;
    @XmlElement(name = "BillableWeightCalculationMethod")
    protected String billableWeightCalculationMethod;
    @XmlElement(name = "RatingMethod")
    protected String ratingMethod;
    @XmlElement(name = "Disclaimer")
    protected List<DisclaimerType> disclaimer;
    @XmlElement(name = "ShipmentDigest", required = true)
    protected String shipmentDigest;
    @XmlElement(name = "NegotiatedRates")
    protected NegotiatedRates negotiatedRates;

    /**
     * 获取response属性的值。
     *
     * @return
     *     possible object is
     *     {@link Response }
     *
     */
    public Response getResponse() {
        return response;
    }

    /**
     * 设置response属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Response }
     *
     */
    public void setResponse(Response value) {
        this.response = value;
    }

    /**
     * 获取shipmentCharges属性的值。
     *
     * @return
     *     possible object is
     *     {@link ShipmentCharges }
     *
     */
    public ShipmentCharges getShipmentCharges() {
        return shipmentCharges;
    }

    /**
     * 设置shipmentCharges属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link ShipmentCharges }
     *
     */
    public void setShipmentCharges(ShipmentCharges value) {
        this.shipmentCharges = value;
    }

    /**
     * 获取billingWeight属性的值。
     *
     * @return
     *     possible object is
     *     {@link BillingWeight }
     *
     */
    public BillingWeight getBillingWeight() {
        return billingWeight;
    }

    /**
     * 设置billingWeight属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link BillingWeight }
     *
     */
    public void setBillingWeight(BillingWeight value) {
        this.billingWeight = value;
    }

    /**
     * 获取shipmentIdentificationNumber属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getShipmentIdentificationNumber() {
        return shipmentIdentificationNumber;
    }

    /**
     * 设置shipmentIdentificationNumber属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setShipmentIdentificationNumber(String value) {
        this.shipmentIdentificationNumber = value;
    }

    /**
     * 获取miDualReturnShipmentKey属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMIDualReturnShipmentKey() {
        return miDualReturnShipmentKey;
    }

    /**
     * 设置miDualReturnShipmentKey属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMIDualReturnShipmentKey(String value) {
        this.miDualReturnShipmentKey = value;
    }

    /**
     * 获取billableWeightCalculationMethod属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBillableWeightCalculationMethod() {
        return billableWeightCalculationMethod;
    }

    /**
     * 设置billableWeightCalculationMethod属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBillableWeightCalculationMethod(String value) {
        this.billableWeightCalculationMethod = value;
    }

    /**
     * 获取ratingMethod属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRatingMethod() {
        return ratingMethod;
    }

    /**
     * 设置ratingMethod属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRatingMethod(String value) {
        this.ratingMethod = value;
    }

    /**
     * Gets the value of the disclaimer property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disclaimer property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisclaimer().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisclaimerType }
     *
     *
     */
    public List<DisclaimerType> getDisclaimer() {
        if (disclaimer == null) {
            disclaimer = new ArrayList<DisclaimerType>();
        }
        return this.disclaimer;
    }

    /**
     * 获取shipmentDigest属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getShipmentDigest() {
        return shipmentDigest;
    }

    /**
     * 设置shipmentDigest属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setShipmentDigest(String value) {
        this.shipmentDigest = value;
    }

    /**
     * 获取negotiatedRates属性的值。
     *
     * @return
     *     possible object is
     *     {@link NegotiatedRates }
     *
     */
    public NegotiatedRates getNegotiatedRates() {
        return negotiatedRates;
    }

    /**
     * 设置negotiatedRates属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link NegotiatedRates }
     *
     */
    public void setNegotiatedRates(NegotiatedRates value) {
        this.negotiatedRates = value;
    }

}
