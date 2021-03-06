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
 * <p>ErrorType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="ErrorType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ErrorSeverity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ErrorCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ErrorDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ElementLevelInformation" type="{}ElementLevelInformationType" minOccurs="0"/&gt;
 *         &lt;element name="ErrorLocation" type="{}ErrorLocationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrorType", propOrder = {
    "errorSeverity",
    "errorCode",
    "errorDescription",
    "elementLevelInformation",
    "errorLocation"
})
public class ErrorType {

    @XmlElement(name = "ErrorSeverity", required = true)
    protected String errorSeverity;
    @XmlElement(name = "ErrorCode", required = true)
    protected String errorCode;
    @XmlElement(name = "ErrorDescription")
    protected String errorDescription;
    @XmlElement(name = "ElementLevelInformation")
    protected ElementLevelInformationType elementLevelInformation;
    @XmlElement(name = "ErrorLocation")
    protected List<ErrorLocationType> errorLocation;

    /**
     * 获取errorSeverity属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getErrorSeverity() {
        return errorSeverity;
    }

    /**
     * 设置errorSeverity属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setErrorSeverity(String value) {
        this.errorSeverity = value;
    }

    /**
     * 获取errorCode属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * 设置errorCode属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setErrorCode(String value) {
        this.errorCode = value;
    }

    /**
     * 获取errorDescription属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getErrorDescription() {
        return errorDescription;
    }

    /**
     * 设置errorDescription属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setErrorDescription(String value) {
        this.errorDescription = value;
    }

    /**
     * 获取elementLevelInformation属性的值。
     *
     * @return
     *     possible object is
     *     {@link ElementLevelInformationType }
     *
     */
    public ElementLevelInformationType getElementLevelInformation() {
        return elementLevelInformation;
    }

    /**
     * 设置elementLevelInformation属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link ElementLevelInformationType }
     *
     */
    public void setElementLevelInformation(ElementLevelInformationType value) {
        this.elementLevelInformation = value;
    }

    /**
     * Gets the value of the errorLocation property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errorLocation property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrorLocation().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorLocationType }
     *
     *
     */
    public List<ErrorLocationType> getErrorLocation() {
        if (errorLocation == null) {
            errorLocation = new ArrayList<ErrorLocationType>();
        }
        return this.errorLocation;
    }

}
