//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.10.28 时间 03:47:51 PM EDT
//


package com.somoplay.artonexpress.ups.time.TimeInTransitRequest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TransitToAddressArtifactFormatType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="TransitToAddressArtifactFormatType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}AddressArtifactFormatType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}ResidentialAddressIndicator" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransitToAddressArtifactFormatType", propOrder = {
    "residentialAddressIndicator"
})
public class TransitToAddressArtifactFormatType
    extends AddressArtifactFormatType
{

    @XmlElement(name = "ResidentialAddressIndicator")
    protected String residentialAddressIndicator;

    /**
     * 获取residentialAddressIndicator属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getResidentialAddressIndicator() {
        return residentialAddressIndicator;
    }

    /**
     * 设置residentialAddressIndicator属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setResidentialAddressIndicator(String value) {
        this.residentialAddressIndicator = value;
    }

}
