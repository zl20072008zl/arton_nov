//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.10.28 时间 03:38:22 PM EDT
//


package com.somoplay.artonexpress.ups.shipping.LabelRecoveryResponse;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
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
 *         &lt;element name="ShipmentIdentificationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CODTurnInPage" type="{}CODTurnInPageType" minOccurs="0"/&gt;
 *         &lt;element name="Form" type="{}FormType" minOccurs="0"/&gt;
 *         &lt;element name="HighValueReport" type="{}HighValueReportType" minOccurs="0"/&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element name="LabelResults" type="{}LabelResultsType"/&gt;
 *           &lt;element name="TrackingCandidate" type="{}TrackingCandidateType"/&gt;
 *         &lt;/choice&gt;
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
    "shipmentIdentificationNumber",
    "codTurnInPage",
    "form",
    "highValueReport",
    "labelResultsOrTrackingCandidate"
})
@XmlRootElement(name = "LabelRecoveryResponse")
public class LabelRecoveryResponse {

    @XmlElement(name = "Response", required = true)
    protected Response response;
    @XmlElement(name = "ShipmentIdentificationNumber")
    protected String shipmentIdentificationNumber;
    @XmlElement(name = "CODTurnInPage")
    protected CODTurnInPageType codTurnInPage;
    @XmlElement(name = "Form")
    protected FormType form;
    @XmlElement(name = "HighValueReport")
    protected HighValueReportType highValueReport;
    @XmlElements({
        @XmlElement(name = "LabelResults", type = LabelResultsType.class),
        @XmlElement(name = "TrackingCandidate", type = TrackingCandidateType.class)
    })
    protected List<Object> labelResultsOrTrackingCandidate;

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
     * 获取codTurnInPage属性的值。
     *
     * @return
     *     possible object is
     *     {@link CODTurnInPageType }
     *
     */
    public CODTurnInPageType getCODTurnInPage() {
        return codTurnInPage;
    }

    /**
     * 设置codTurnInPage属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link CODTurnInPageType }
     *
     */
    public void setCODTurnInPage(CODTurnInPageType value) {
        this.codTurnInPage = value;
    }

    /**
     * 获取form属性的值。
     *
     * @return
     *     possible object is
     *     {@link FormType }
     *
     */
    public FormType getForm() {
        return form;
    }

    /**
     * 设置form属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link FormType }
     *
     */
    public void setForm(FormType value) {
        this.form = value;
    }

    /**
     * 获取highValueReport属性的值。
     *
     * @return
     *     possible object is
     *     {@link HighValueReportType }
     *
     */
    public HighValueReportType getHighValueReport() {
        return highValueReport;
    }

    /**
     * 设置highValueReport属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link HighValueReportType }
     *
     */
    public void setHighValueReport(HighValueReportType value) {
        this.highValueReport = value;
    }

    /**
     * Gets the value of the labelResultsOrTrackingCandidate property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the labelResultsOrTrackingCandidate property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLabelResultsOrTrackingCandidate().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LabelResultsType }
     * {@link TrackingCandidateType }
     *
     *
     */
    public List<Object> getLabelResultsOrTrackingCandidate() {
        if (labelResultsOrTrackingCandidate == null) {
            labelResultsOrTrackingCandidate = new ArrayList<Object>();
        }
        return this.labelResultsOrTrackingCandidate;
    }

}
