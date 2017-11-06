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
 * <p>EEIInformationType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="EEIInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExportInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="License" type="{}EEILicenseType" minOccurs="0"/&gt;
 *         &lt;element name="DDTCInformation" type="{}DDTCInformationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EEIInformationType", propOrder = {
    "exportInformation",
    "license",
    "ddtcInformation"
})
public class EEIInformationType {

    @XmlElement(name = "ExportInformation")
    protected String exportInformation;
    @XmlElement(name = "License")
    protected EEILicenseType license;
    @XmlElement(name = "DDTCInformation")
    protected DDTCInformationType ddtcInformation;

    /**
     * 获取exportInformation属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getExportInformation() {
        return exportInformation;
    }

    /**
     * 设置exportInformation属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setExportInformation(String value) {
        this.exportInformation = value;
    }

    /**
     * 获取license属性的值。
     *
     * @return
     *     possible object is
     *     {@link EEILicenseType }
     *
     */
    public EEILicenseType getLicense() {
        return license;
    }

    /**
     * 设置license属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link EEILicenseType }
     *
     */
    public void setLicense(EEILicenseType value) {
        this.license = value;
    }

    /**
     * 获取ddtcInformation属性的值。
     *
     * @return
     *     possible object is
     *     {@link DDTCInformationType }
     *
     */
    public DDTCInformationType getDDTCInformation() {
        return ddtcInformation;
    }

    /**
     * 设置ddtcInformation属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link DDTCInformationType }
     *
     */
    public void setDDTCInformation(DDTCInformationType value) {
        this.ddtcInformation = value;
    }

}
