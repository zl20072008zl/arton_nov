//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.10.28 时间 03:47:51 PM EDT
//


package com.somoplay.artonexpress.ups.time.TrackResponse;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the com.somoplay.artonexpress.ups.time.TrackResponse package.
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

    private final static QName _ResidentialAddressIndicator_QNAME = new QName("", "ResidentialAddressIndicator");
    private final static QName _DocumentsOnlyIndicator_QNAME = new QName("", "DocumentsOnlyIndicator");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.somoplay.artonexpress.ups.time.TrackResponse
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TimeInTransitResponse }
     *
     */
    public TimeInTransitResponse createTimeInTransitResponse() {
        return new TimeInTransitResponse();
    }

    /**
     * Create an instance of {@link Response }
     *
     */
    public Response createResponse() {
        return new Response();
    }

    /**
     * Create an instance of {@link TransactionReference }
     *
     */
    public TransactionReference createTransactionReference() {
        return new TransactionReference();
    }

    /**
     * Create an instance of {@link Error }
     *
     */
    public Error createError() {
        return new Error();
    }

    /**
     * Create an instance of {@link ErrorLocation }
     *
     */
    public ErrorLocation createErrorLocation() {
        return new ErrorLocation();
    }

    /**
     * Create an instance of {@link TransitResponseType }
     *
     */
    public TransitResponseType createTransitResponseType() {
        return new TransitResponseType();
    }

    /**
     * Create an instance of {@link TransitFromListType }
     *
     */
    public TransitFromListType createTransitFromListType() {
        return new TransitFromListType();
    }

    /**
     * Create an instance of {@link TransitToListType }
     *
     */
    public TransitToListType createTransitToListType() {
        return new TransitToListType();
    }

    /**
     * Create an instance of {@link ServiceSummaryType }
     *
     */
    public ServiceSummaryType createServiceSummaryType() {
        return new ServiceSummaryType();
    }

    /**
     * Create an instance of {@link EstimatedArrivalType }
     *
     */
    public EstimatedArrivalType createEstimatedArrivalType() {
        return new EstimatedArrivalType();
    }

    /**
     * Create an instance of {@link TransitFromType }
     *
     */
    public TransitFromType createTransitFromType() {
        return new TransitFromType();
    }

    /**
     * Create an instance of {@link TransitFromAddressArtifactFormatType }
     *
     */
    public TransitFromAddressArtifactFormatType createTransitFromAddressArtifactFormatType() {
        return new TransitFromAddressArtifactFormatType();
    }

    /**
     * Create an instance of {@link TransitToType }
     *
     */
    public TransitToType createTransitToType() {
        return new TransitToType();
    }

    /**
     * Create an instance of {@link TransitToAddressArtifactFormatType }
     *
     */
    public TransitToAddressArtifactFormatType createTransitToAddressArtifactFormatType() {
        return new TransitToAddressArtifactFormatType();
    }

    /**
     * Create an instance of {@link WeightType }
     *
     */
    public WeightType createWeightType() {
        return new WeightType();
    }

    /**
     * Create an instance of {@link CodeType }
     *
     */
    public CodeType createCodeType() {
        return new CodeType();
    }

    /**
     * Create an instance of {@link MonetaryType }
     *
     */
    public MonetaryType createMonetaryType() {
        return new MonetaryType();
    }

    /**
     * Create an instance of {@link CandidateType }
     *
     */
    public CandidateType createCandidateType() {
        return new CandidateType();
    }

    /**
     * Create an instance of {@link AddressArtifactFormatType }
     *
     */
    public AddressArtifactFormatType createAddressArtifactFormatType() {
        return new AddressArtifactFormatType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "ResidentialAddressIndicator")
    public JAXBElement<String> createResidentialAddressIndicator(String value) {
        return new JAXBElement<String>(_ResidentialAddressIndicator_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "DocumentsOnlyIndicator")
    public JAXBElement<String> createDocumentsOnlyIndicator(String value) {
        return new JAXBElement<String>(_DocumentsOnlyIndicator_QNAME, String.class, null, value);
    }

}
