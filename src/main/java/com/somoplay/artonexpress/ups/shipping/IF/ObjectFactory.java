//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.11 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2017.10.28 时间 03:38:22 PM EDT
//


package com.somoplay.artonexpress.ups.shipping.IF;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the com.somoplay.artonexpress.ups.shipping.IF package.
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

    private final static QName _InternationalForms_QNAME = new QName("", "InternationalForms");
    private final static QName _AddressLine1_QNAME = new QName("", "AddressLine1");
    private final static QName _AddressLine2_QNAME = new QName("", "AddressLine2");
    private final static QName _AddressLine3_QNAME = new QName("", "AddressLine3");
    private final static QName _BeginDate_QNAME = new QName("", "BeginDate");
    private final static QName _CarrierID_QNAME = new QName("", "CarrierID");
    private final static QName _City_QNAME = new QName("", "City");
    private final static QName _CompanyName_QNAME = new QName("", "CompanyName");
    private final static QName _Code_QNAME = new QName("", "Code");
    private final static QName _CurrencyCode_QNAME = new QName("", "CurrencyCode");
    private final static QName _CountryCode_QNAME = new QName("", "CountryCode");
    private final static QName _Comments_QNAME = new QName("", "Comments");
    private final static QName _CommodityCode_QNAME = new QName("", "CommodityCode");
    private final static QName _Date_QNAME = new QName("", "Date");
    private final static QName _DeclarationStatement_QNAME = new QName("", "DeclarationStatement");
    private final static QName _Description_QNAME = new QName("", "Description");
    private final static QName _EndDate_QNAME = new QName("", "EndDate");
    private final static QName _ExportDate_QNAME = new QName("", "ExportDate");
    private final static QName _ExportingCarrier_QNAME = new QName("", "ExportingCarrier");
    private final static QName _InvoiceNumber_QNAME = new QName("", "InvoiceNumber");
    private final static QName _MarksAndNumbers_QNAME = new QName("", "MarksAndNumbers");
    private final static QName _MonetaryValue_QNAME = new QName("", "MonetaryValue");
    private final static QName _Number_QNAME = new QName("", "Number");
    private final static QName _NumberOfPackagesPerCommodity_QNAME = new QName("", "NumberOfPackagesPerCommodity");
    private final static QName _OriginCountryCode_QNAME = new QName("", "OriginCountryCode");
    private final static QName _PartiesToTransaction_QNAME = new QName("", "PartiesToTransaction");
    private final static QName _PartNumber_QNAME = new QName("", "PartNumber");
    private final static QName _PostalCode_QNAME = new QName("", "PostalCode");
    private final static QName _Quantity_QNAME = new QName("", "Quantity");
    private final static QName _ReasonForExport_QNAME = new QName("", "ReasonForExport");
    private final static QName _StateProvinceCode_QNAME = new QName("", "StateProvinceCode");
    private final static QName _TaxIdentificationNumber_QNAME = new QName("", "TaxIdentificationNumber");
    private final static QName _TermsOfShipment_QNAME = new QName("", "TermsOfShipment");
    private final static QName _UnitOfMeasurement_QNAME = new QName("", "UnitOfMeasurement");
    private final static QName _Value_QNAME = new QName("", "Value");
    private final static QName _Weight_QNAME = new QName("", "Weight");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.somoplay.artonexpress.ups.shipping.IF
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InternationalFormsType }
     *
     */
    public InternationalFormsType createInternationalFormsType() {
        return new InternationalFormsType();
    }

    /**
     * Create an instance of {@link CodeType }
     *
     */
    public CodeType createCodeType() {
        return new CodeType();
    }

    /**
     * Create an instance of {@link UPSPremiumCareFormType }
     *
     */
    public UPSPremiumCareFormType createUPSPremiumCareFormType() {
        return new UPSPremiumCareFormType();
    }

    /**
     * Create an instance of {@link LanguageForUPSPremiumCareType }
     *
     */
    public LanguageForUPSPremiumCareType createLanguageForUPSPremiumCareType() {
        return new LanguageForUPSPremiumCareType();
    }

    /**
     * Create an instance of {@link UserCreatedFormType }
     *
     */
    public UserCreatedFormType createUserCreatedFormType() {
        return new UserCreatedFormType();
    }

    /**
     * Create an instance of {@link CN22FormType }
     *
     */
    public CN22FormType createCN22FormType() {
        return new CN22FormType();
    }

    /**
     * Create an instance of {@link CN22ContentType }
     *
     */
    public CN22ContentType createCN22ContentType() {
        return new CN22ContentType();
    }

    /**
     * Create an instance of {@link AddressType }
     *
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link BlanketPeriodType }
     *
     */
    public BlanketPeriodType createBlanketPeriodType() {
        return new BlanketPeriodType();
    }

    /**
     * Create an instance of {@link ContactsType }
     *
     */
    public ContactsType createContactsType() {
        return new ContactsType();
    }

    /**
     * Create an instance of {@link DiscountType }
     *
     */
    public DiscountType createDiscountType() {
        return new DiscountType();
    }

    /**
     * Create an instance of {@link ForwardAgentType }
     *
     */
    public ForwardAgentType createForwardAgentType() {
        return new ForwardAgentType();
    }

    /**
     * Create an instance of {@link FreightChargesType }
     *
     */
    public FreightChargesType createFreightChargesType() {
        return new FreightChargesType();
    }

    /**
     * Create an instance of {@link InsuranceChargesType }
     *
     */
    public InsuranceChargesType createInsuranceChargesType() {
        return new InsuranceChargesType();
    }

    /**
     * Create an instance of {@link IntermediateConsigneeType }
     *
     */
    public IntermediateConsigneeType createIntermediateConsigneeType() {
        return new IntermediateConsigneeType();
    }

    /**
     * Create an instance of {@link LicenseType }
     *
     */
    public LicenseType createLicenseType() {
        return new LicenseType();
    }

    /**
     * Create an instance of {@link NetCostDateRangeType }
     *
     */
    public NetCostDateRangeType createNetCostDateRangeType() {
        return new NetCostDateRangeType();
    }

    /**
     * Create an instance of {@link OtherChargesType }
     *
     */
    public OtherChargesType createOtherChargesType() {
        return new OtherChargesType();
    }

    /**
     * Create an instance of {@link PhoneType }
     *
     */
    public PhoneType createPhoneType() {
        return new PhoneType();
    }

    /**
     * Create an instance of {@link ProductType }
     *
     */
    public ProductType createProductType() {
        return new ProductType();
    }

    /**
     * Create an instance of {@link ExcludeFromFormType }
     *
     */
    public ExcludeFromFormType createExcludeFromFormType() {
        return new ExcludeFromFormType();
    }

    /**
     * Create an instance of {@link ProducerType }
     *
     */
    public ProducerType createProducerType() {
        return new ProducerType();
    }

    /**
     * Create an instance of {@link ProductWeightType }
     *
     */
    public ProductWeightType createProductWeightType() {
        return new ProductWeightType();
    }

    /**
     * Create an instance of {@link ScheduleBType }
     *
     */
    public ScheduleBType createScheduleBType() {
        return new ScheduleBType();
    }

    /**
     * Create an instance of {@link UltimateConsigneeType }
     *
     */
    public UltimateConsigneeType createUltimateConsigneeType() {
        return new UltimateConsigneeType();
    }

    /**
     * Create an instance of {@link UnitType }
     *
     */
    public UnitType createUnitType() {
        return new UnitType();
    }

    /**
     * Create an instance of {@link PackingListInfoType }
     *
     */
    public PackingListInfoType createPackingListInfoType() {
        return new PackingListInfoType();
    }

    /**
     * Create an instance of {@link PackageAssociatedType }
     *
     */
    public PackageAssociatedType createPackageAssociatedType() {
        return new PackageAssociatedType();
    }

    /**
     * Create an instance of {@link EEILicenseType }
     *
     */
    public EEILicenseType createEEILicenseType() {
        return new EEILicenseType();
    }

    /**
     * Create an instance of {@link EEIFilingOptionType }
     *
     */
    public EEIFilingOptionType createEEIFilingOptionType() {
        return new EEIFilingOptionType();
    }

    /**
     * Create an instance of {@link UPSFiledType }
     *
     */
    public UPSFiledType createUPSFiledType() {
        return new UPSFiledType();
    }

    /**
     * Create an instance of {@link ShipperFiledType }
     *
     */
    public ShipperFiledType createShipperFiledType() {
        return new ShipperFiledType();
    }

    /**
     * Create an instance of {@link EEIInformationType }
     *
     */
    public EEIInformationType createEEIInformationType() {
        return new EEIInformationType();
    }

    /**
     * Create an instance of {@link POAType }
     *
     */
    public POAType createPOAType() {
        return new POAType();
    }

    /**
     * Create an instance of {@link UltimateConsigneeTypeType }
     *
     */
    public UltimateConsigneeTypeType createUltimateConsigneeTypeType() {
        return new UltimateConsigneeTypeType();
    }

    /**
     * Create an instance of {@link DDTCInformationType }
     *
     */
    public DDTCInformationType createDDTCInformationType() {
        return new DDTCInformationType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InternationalFormsType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "InternationalForms")
    public JAXBElement<InternationalFormsType> createInternationalForms(InternationalFormsType value) {
        return new JAXBElement<InternationalFormsType>(_InternationalForms_QNAME, InternationalFormsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "AddressLine1")
    public JAXBElement<String> createAddressLine1(String value) {
        return new JAXBElement<String>(_AddressLine1_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "AddressLine2")
    public JAXBElement<String> createAddressLine2(String value) {
        return new JAXBElement<String>(_AddressLine2_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "AddressLine3")
    public JAXBElement<String> createAddressLine3(String value) {
        return new JAXBElement<String>(_AddressLine3_QNAME, String.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "CarrierID")
    public JAXBElement<String> createCarrierID(String value) {
        return new JAXBElement<String>(_CarrierID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "City")
    public JAXBElement<String> createCity(String value) {
        return new JAXBElement<String>(_City_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "CompanyName")
    public JAXBElement<String> createCompanyName(String value) {
        return new JAXBElement<String>(_CompanyName_QNAME, String.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "CurrencyCode")
    public JAXBElement<String> createCurrencyCode(String value) {
        return new JAXBElement<String>(_CurrencyCode_QNAME, String.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "Comments")
    public JAXBElement<String> createComments(String value) {
        return new JAXBElement<String>(_Comments_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "CommodityCode")
    public JAXBElement<String> createCommodityCode(String value) {
        return new JAXBElement<String>(_CommodityCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "Date")
    public JAXBElement<String> createDate(String value) {
        return new JAXBElement<String>(_Date_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "DeclarationStatement")
    public JAXBElement<String> createDeclarationStatement(String value) {
        return new JAXBElement<String>(_DeclarationStatement_QNAME, String.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "EndDate")
    public JAXBElement<String> createEndDate(String value) {
        return new JAXBElement<String>(_EndDate_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "ExportDate")
    public JAXBElement<String> createExportDate(String value) {
        return new JAXBElement<String>(_ExportDate_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "ExportingCarrier")
    public JAXBElement<String> createExportingCarrier(String value) {
        return new JAXBElement<String>(_ExportingCarrier_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "InvoiceNumber")
    public JAXBElement<String> createInvoiceNumber(String value) {
        return new JAXBElement<String>(_InvoiceNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "MarksAndNumbers")
    public JAXBElement<String> createMarksAndNumbers(String value) {
        return new JAXBElement<String>(_MarksAndNumbers_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "MonetaryValue")
    public JAXBElement<String> createMonetaryValue(String value) {
        return new JAXBElement<String>(_MonetaryValue_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "Number")
    public JAXBElement<String> createNumber(String value) {
        return new JAXBElement<String>(_Number_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "NumberOfPackagesPerCommodity")
    public JAXBElement<String> createNumberOfPackagesPerCommodity(String value) {
        return new JAXBElement<String>(_NumberOfPackagesPerCommodity_QNAME, String.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "PartiesToTransaction")
    public JAXBElement<String> createPartiesToTransaction(String value) {
        return new JAXBElement<String>(_PartiesToTransaction_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "PartNumber")
    public JAXBElement<String> createPartNumber(String value) {
        return new JAXBElement<String>(_PartNumber_QNAME, String.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "Quantity")
    public JAXBElement<String> createQuantity(String value) {
        return new JAXBElement<String>(_Quantity_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "ReasonForExport")
    public JAXBElement<String> createReasonForExport(String value) {
        return new JAXBElement<String>(_ReasonForExport_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "StateProvinceCode")
    public JAXBElement<String> createStateProvinceCode(String value) {
        return new JAXBElement<String>(_StateProvinceCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "TaxIdentificationNumber")
    public JAXBElement<String> createTaxIdentificationNumber(String value) {
        return new JAXBElement<String>(_TaxIdentificationNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "TermsOfShipment")
    public JAXBElement<String> createTermsOfShipment(String value) {
        return new JAXBElement<String>(_TermsOfShipment_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodeType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "UnitOfMeasurement")
    public JAXBElement<CodeType> createUnitOfMeasurement(CodeType value) {
        return new JAXBElement<CodeType>(_UnitOfMeasurement_QNAME, CodeType.class, null, value);
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
    @XmlElementDecl(namespace = "", name = "Weight")
    public JAXBElement<String> createWeight(String value) {
        return new JAXBElement<String>(_Weight_QNAME, String.class, null, value);
    }

}
