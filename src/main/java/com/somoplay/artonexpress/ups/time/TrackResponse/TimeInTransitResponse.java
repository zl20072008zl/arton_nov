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
 *         &lt;choice&gt;
 *           &lt;element name="TransitResponse" type="{}TransitResponseType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element name="TransitFromList" type="{}TransitFromListType" minOccurs="0"/&gt;
 *           &lt;element name="TransitToList" type="{}TransitToListType" minOccurs="0"/&gt;
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
    "transitResponse",
    "transitFromList",
    "transitToList"
})
@XmlRootElement(name = "TimeInTransitResponse")
public class TimeInTransitResponse {

    @XmlElement(name = "Response", required = true)
    protected Response response;
    @XmlElement(name = "TransitResponse")
    protected List<TransitResponseType> transitResponse;
    @XmlElement(name = "TransitFromList")
    protected TransitFromListType transitFromList;
    @XmlElement(name = "TransitToList")
    protected TransitToListType transitToList;

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
     * Gets the value of the transitResponse property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transitResponse property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransitResponse().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransitResponseType }
     *
     *
     */
    public List<TransitResponseType> getTransitResponse() {
        if (transitResponse == null) {
            transitResponse = new ArrayList<TransitResponseType>();
        }
        return this.transitResponse;
    }

    /**
     * 获取transitFromList属性的值。
     *
     * @return
     *     possible object is
     *     {@link TransitFromListType }
     *
     */
    public TransitFromListType getTransitFromList() {
        return transitFromList;
    }

    /**
     * 设置transitFromList属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link TransitFromListType }
     *
     */
    public void setTransitFromList(TransitFromListType value) {
        this.transitFromList = value;
    }

    /**
     * 获取transitToList属性的值。
     *
     * @return
     *     possible object is
     *     {@link TransitToListType }
     *
     */
    public TransitToListType getTransitToList() {
        return transitToList;
    }

    /**
     * 设置transitToList属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link TransitToListType }
     *
     */
    public void setTransitToList(TransitToListType value) {
        this.transitToList = value;
    }

}
