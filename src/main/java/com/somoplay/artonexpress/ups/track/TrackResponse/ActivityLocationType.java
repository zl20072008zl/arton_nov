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
 * <p>ActivityLocationType complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType name="ActivityLocationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}Address" minOccurs="0"/&gt;
 *         &lt;element ref="{}AddressArtifactFormat" minOccurs="0"/&gt;
 *         &lt;element name="TransportFacility" type="{}TransportFacilityType" minOccurs="0"/&gt;
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SignedForByName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{}SignatureImage" minOccurs="0"/&gt;
 *         &lt;element name="PODLetter" type="{}PODLetterType" minOccurs="0"/&gt;
 *         &lt;element name="ElectronicDeliveryNotification" type="{}ElectronicDeliveryNotificationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivityLocationType", propOrder = {
    "address",
    "addressArtifactFormat",
    "transportFacility",
    "code",
    "description",
    "signedForByName",
    "signatureImage",
    "podLetter",
    "electronicDeliveryNotification"
})
public class ActivityLocationType {

    @XmlElement(name = "Address")
    protected Address address;
    @XmlElement(name = "AddressArtifactFormat")
    protected AddressArtifactType addressArtifactFormat;
    @XmlElement(name = "TransportFacility")
    protected TransportFacilityType transportFacility;
    @XmlElement(name = "Code")
    protected String code;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "SignedForByName")
    protected String signedForByName;
    @XmlElement(name = "SignatureImage")
    protected SignatureImage signatureImage;
    @XmlElement(name = "PODLetter")
    protected PODLetterType podLetter;
    @XmlElement(name = "ElectronicDeliveryNotification")
    protected ElectronicDeliveryNotificationType electronicDeliveryNotification;

    /**
     * 获取address属性的值。
     *
     * @return
     *     possible object is
     *     {@link Address }
     *
     */
    public Address getAddress() {
        return address;
    }

    /**
     * 设置address属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Address }
     *
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * 获取addressArtifactFormat属性的值。
     *
     * @return
     *     possible object is
     *     {@link AddressArtifactType }
     *
     */
    public AddressArtifactType getAddressArtifactFormat() {
        return addressArtifactFormat;
    }

    /**
     * 设置addressArtifactFormat属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link AddressArtifactType }
     *
     */
    public void setAddressArtifactFormat(AddressArtifactType value) {
        this.addressArtifactFormat = value;
    }

    /**
     * 获取transportFacility属性的值。
     *
     * @return
     *     possible object is
     *     {@link TransportFacilityType }
     *
     */
    public TransportFacilityType getTransportFacility() {
        return transportFacility;
    }

    /**
     * 设置transportFacility属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link TransportFacilityType }
     *
     */
    public void setTransportFacility(TransportFacilityType value) {
        this.transportFacility = value;
    }

    /**
     * 获取code属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置code属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * 获取description属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置description属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * 获取signedForByName属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSignedForByName() {
        return signedForByName;
    }

    /**
     * 设置signedForByName属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSignedForByName(String value) {
        this.signedForByName = value;
    }

    /**
     * 获取signatureImage属性的值。
     *
     * @return
     *     possible object is
     *     {@link SignatureImage }
     *
     */
    public SignatureImage getSignatureImage() {
        return signatureImage;
    }

    /**
     * 设置signatureImage属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link SignatureImage }
     *
     */
    public void setSignatureImage(SignatureImage value) {
        this.signatureImage = value;
    }

    /**
     * 获取podLetter属性的值。
     *
     * @return
     *     possible object is
     *     {@link PODLetterType }
     *
     */
    public PODLetterType getPODLetter() {
        return podLetter;
    }

    /**
     * 设置podLetter属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link PODLetterType }
     *
     */
    public void setPODLetter(PODLetterType value) {
        this.podLetter = value;
    }

    /**
     * 获取electronicDeliveryNotification属性的值。
     *
     * @return
     *     possible object is
     *     {@link ElectronicDeliveryNotificationType }
     *
     */
    public ElectronicDeliveryNotificationType getElectronicDeliveryNotification() {
        return electronicDeliveryNotification;
    }

    /**
     * 设置electronicDeliveryNotification属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link ElectronicDeliveryNotificationType }
     *
     */
    public void setElectronicDeliveryNotification(ElectronicDeliveryNotificationType value) {
        this.electronicDeliveryNotification = value;
    }

}
