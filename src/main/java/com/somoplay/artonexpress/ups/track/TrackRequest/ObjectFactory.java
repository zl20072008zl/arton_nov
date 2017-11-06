//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.10.28 时间 03:47:50 PM EDT
//


package com.somoplay.artonexpress.ups.track.TrackRequest;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the com.somoplay.artonexpress.ups.track.TrackRequest package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 *
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RequestAction_QNAME = new QName("", "RequestAction");
    private final static QName _RequestOption_QNAME = new QName("", "RequestOption");
    private final static QName _TrackingNumber_QNAME = new QName("", "TrackingNumber");
    private final static QName _ShipmentIdentificationNumber_QNAME = new QName("", "ShipmentIdentificationNumber");
    private final static QName _CandidateBookmark_QNAME = new QName("", "CandidateBookmark");
    private final static QName _Value_QNAME = new QName("", "Value");
    private final static QName _BeginDate_QNAME = new QName("", "BeginDate");
    private final static QName _EndDate_QNAME = new QName("", "EndDate");
    private final static QName _ShipperNumber_QNAME = new QName("", "ShipperNumber");
    private final static QName _DestinationPostalCode_QNAME = new QName("", "DestinationPostalCode");
    private final static QName _DestinationCountryCode_QNAME = new QName("", "DestinationCountryCode");
    private final static QName _OriginPostalCode_QNAME = new QName("", "OriginPostalCode");
    private final static QName _OriginCountryCode_QNAME = new QName("", "OriginCountryCode");
    private final static QName _IncludeFreight_QNAME = new QName("", "IncludeFreight");
    private final static QName _PostalCode_QNAME = new QName("", "PostalCode");
    private final static QName _CountryCode_QNAME = new QName("", "CountryCode");
    private final static QName _Code_QNAME = new QName("", "Code");
    private final static QName _Description_QNAME = new QName("", "Description");
    private final static QName _EventFilter_QNAME = new QName("", "EventFilter");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.somoplay.artonexpress.ups.track.TrackRequest
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TrackRequest }
     *
     */
    public TrackRequest createTrackRequest() {
        return new TrackRequest();
    }

    /**
     * Create an instance of {@link Request }
     *
     */
    public Request createRequest() {
        return new Request();
    }

    /**
     * Create an instance of {@link TransactionReference }
     *
     */
    public TransactionReference createTransactionReference() {
        return new TransactionReference();
    }

    /**
     * Create an instance of {@link ReferenceNumber }
     *
     */
    public ReferenceNumber createReferenceNumber() {
        return new ReferenceNumber();
    }

    /**
     * Create an instance of {@link PickupDateRange }
     *
     */
    public PickupDateRange createPickupDateRange() {
        return new PickupDateRange();
    }

    /**
     * Create an instance of {@link CodeType }
     *
     */
    public CodeType createCodeType() {
        return new CodeType();
    }

    /**
     * Create an instance of {@link ShipperAccountInfo }
     *
     */
    public ShipperAccountInfo createShipperAccountInfo() {
        return new ShipperAccountInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "RequestAction")
    public JAXBElement<String> createRequestAction(String value) {
        return new JAXBElement<String>(_RequestAction_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "RequestOption")
    public JAXBElement<String> createRequestOption(String value) {
        return new JAXBElement<String>(_RequestOption_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "TrackingNumber")
    public JAXBElement<String> createTrackingNumber(String value) {
        return new JAXBElement<String>(_TrackingNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "ShipmentIdentificationNumber")
    public JAXBElement<String> createShipmentIdentificationNumber(String value) {
        return new JAXBElement<String>(_ShipmentIdentificationNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "CandidateBookmark")
    public JAXBElement<String> createCandidateBookmark(String value) {
        return new JAXBElement<String>(_CandidateBookmark_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "Value")
    public JAXBElement<String> createValue(String value) {
        return new JAXBElement<String>(_Value_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "BeginDate")
    public JAXBElement<String> createBeginDate(String value) {
        return new JAXBElement<String>(_BeginDate_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "EndDate")
    public JAXBElement<String> createEndDate(String value) {
        return new JAXBElement<String>(_EndDate_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "ShipperNumber")
    public JAXBElement<String> createShipperNumber(String value) {
        return new JAXBElement<String>(_ShipperNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "DestinationPostalCode")
    public JAXBElement<String> createDestinationPostalCode(String value) {
        return new JAXBElement<String>(_DestinationPostalCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "DestinationCountryCode")
    public JAXBElement<String> createDestinationCountryCode(String value) {
        return new JAXBElement<String>(_DestinationCountryCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "OriginPostalCode")
    public JAXBElement<String> createOriginPostalCode(String value) {
        return new JAXBElement<String>(_OriginPostalCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "OriginCountryCode")
    public JAXBElement<String> createOriginCountryCode(String value) {
        return new JAXBElement<String>(_OriginCountryCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "IncludeFreight")
    public JAXBElement<String> createIncludeFreight(String value) {
        return new JAXBElement<String>(_IncludeFreight_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "PostalCode")
    public JAXBElement<String> createPostalCode(String value) {
        return new JAXBElement<String>(_PostalCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "CountryCode")
    public JAXBElement<String> createCountryCode(String value) {
        return new JAXBElement<String>(_CountryCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "Code")
    public JAXBElement<String> createCode(String value) {
        return new JAXBElement<String>(_Code_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "Description")
    public JAXBElement<String> createDescription(String value) {
        return new JAXBElement<String>(_Description_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "EventFilter")
    public JAXBElement<String> createEventFilter(String value) {
        return new JAXBElement<String>(_EventFilter_QNAME, String.class, null, value);
    }

}
