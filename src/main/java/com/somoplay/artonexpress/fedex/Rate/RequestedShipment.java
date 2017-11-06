/**
 * RequestedShipment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.somoplay.artonexpress.fedex.Rate;

public class RequestedShipment  implements java.io.Serializable {
    private java.util.Calendar shipTimestamp;

    private DropoffType dropoffType;

    private ServiceType serviceType;

    private PackagingType packagingType;

    /* The shipment variations for the current shipment expressed
     * in key-value pairs. */
    private ShipmentVariationOptionDetail[] variationOptions;

    private Weight totalWeight;

    /* Specifies the total declared value for carriage of the shipment.
     * The declared value for carriage represents the maximum liability of
     * FedEx in connection with a shipment, including, but not limited to,
     * any loss, damage, delay, mis-delivery, nondelivery, misinformation,
     * any failure to provide information, or mis-delivery of information
     * relating to the shipment. */
    private Money totalInsuredValue;

    /* This attribute indicates the currency the caller requests to
     * have used in all returned monetary values (when a choice is possible). */
    private java.lang.String preferredCurrency;

    /* Specifies details about the entity responsible for the shipment. */
    private ShipmentAuthorizationDetail shipmentAuthorizationDetail;

    private Party shipper;

    private Party recipient;

    private java.lang.String recipientLocationNumber;

    /* Physical starting address for the shipment, if different from
     * shipper's address. */
    private ContactAndAddress origin;

    private Party soldTo;

    private Payment shippingChargesPayment;

    private ShipmentSpecialServicesRequested specialServicesRequested;

    private ExpressFreightDetail expressFreightDetail;

    /* Data applicable to shipments using FEDEX_FREIGHT_ECONOMY and
     * FEDEX_FREIGHT_PRIORITY services. */
    private FreightShipmentDetail freightShipmentDetail;

    /* Used with Ground Home Delivery and Freight. */
    private java.lang.String deliveryInstructions;

    private VariableHandlingChargeDetail variableHandlingChargeDetail;

    /* Customs clearance data, used for both international and intra-country
     * shipping. */
    private CustomsClearanceDetail customsClearanceDetail;

    /* For use in "process tag" transaction. */
    private PickupDetail pickupDetail;

    /* Specifies the characteristics of a shipment pertaining to SmartPost
     * services. */
    private SmartPostShipmentDetail smartPostDetail;

    /* If true, only the shipper/payor will have visibility of this
     * shipment. */
    private java.lang.Boolean blockInsightVisibility;

    private LabelSpecification labelSpecification;

    /* Contains data used to create additional (non-label) shipping
     * documents. */
    private ShippingDocumentSpecification shippingDocumentSpecification;

    /* Specifies whether and what kind of rates the customer wishes
     * to have quoted on this shipment. The reply will also be constrained
     * by other data on the shipment and customer. */
    private RateRequestType[] rateRequestTypes;

    /* Specifies whether the customer wishes to have Estimated Duties
     * and Taxes provided with the rate quotation on this shipment. Only
     * applies with shipments moving under international services. */
    private EdtRequestType edtRequestType;

    /* The total number of packages in the entire shipment (even when
     * the shipment spans multiple transactions.) */
    private org.apache.axis.types.NonNegativeInteger packageCount;

    /* Specifies which package-level data values are provided at the
     * shipment-level only. The package-level data values types specified
     * here will not be provided at the package-level. */
    private ShipmentOnlyFieldsType[] shipmentOnlyFields;

    /* Specifies data structures that may be re-used multiple times
     * with s single shipment. */
    private ShipmentConfigurationData configurationData;

    /* One or more package-attribute descriptions, each of which describes
     * an individual package, a group of identical packages, or (for the
     * total-piece-total-weight case) common characteristics all packages
     * in the shipment. */
    private RequestedPackageLineItem[] requestedPackageLineItems;

    public RequestedShipment() {
    }

    public RequestedShipment(
           java.util.Calendar shipTimestamp,
           DropoffType dropoffType,
           ServiceType serviceType,
           PackagingType packagingType,
           ShipmentVariationOptionDetail[] variationOptions,
           Weight totalWeight,
           Money totalInsuredValue,
           java.lang.String preferredCurrency,
           ShipmentAuthorizationDetail shipmentAuthorizationDetail,
           Party shipper,
           Party recipient,
           java.lang.String recipientLocationNumber,
           ContactAndAddress origin,
           Party soldTo,
           Payment shippingChargesPayment,
           ShipmentSpecialServicesRequested specialServicesRequested,
           ExpressFreightDetail expressFreightDetail,
           FreightShipmentDetail freightShipmentDetail,
           java.lang.String deliveryInstructions,
           VariableHandlingChargeDetail variableHandlingChargeDetail,
           CustomsClearanceDetail customsClearanceDetail,
           PickupDetail pickupDetail,
           SmartPostShipmentDetail smartPostDetail,
           java.lang.Boolean blockInsightVisibility,
           LabelSpecification labelSpecification,
           ShippingDocumentSpecification shippingDocumentSpecification,
           RateRequestType[] rateRequestTypes,
           EdtRequestType edtRequestType,
           org.apache.axis.types.NonNegativeInteger packageCount,
           ShipmentOnlyFieldsType[] shipmentOnlyFields,
           ShipmentConfigurationData configurationData,
           RequestedPackageLineItem[] requestedPackageLineItems) {
           this.shipTimestamp = shipTimestamp;
           this.dropoffType = dropoffType;
           this.serviceType = serviceType;
           this.packagingType = packagingType;
           this.variationOptions = variationOptions;
           this.totalWeight = totalWeight;
           this.totalInsuredValue = totalInsuredValue;
           this.preferredCurrency = preferredCurrency;
           this.shipmentAuthorizationDetail = shipmentAuthorizationDetail;
           this.shipper = shipper;
           this.recipient = recipient;
           this.recipientLocationNumber = recipientLocationNumber;
           this.origin = origin;
           this.soldTo = soldTo;
           this.shippingChargesPayment = shippingChargesPayment;
           this.specialServicesRequested = specialServicesRequested;
           this.expressFreightDetail = expressFreightDetail;
           this.freightShipmentDetail = freightShipmentDetail;
           this.deliveryInstructions = deliveryInstructions;
           this.variableHandlingChargeDetail = variableHandlingChargeDetail;
           this.customsClearanceDetail = customsClearanceDetail;
           this.pickupDetail = pickupDetail;
           this.smartPostDetail = smartPostDetail;
           this.blockInsightVisibility = blockInsightVisibility;
           this.labelSpecification = labelSpecification;
           this.shippingDocumentSpecification = shippingDocumentSpecification;
           this.rateRequestTypes = rateRequestTypes;
           this.edtRequestType = edtRequestType;
           this.packageCount = packageCount;
           this.shipmentOnlyFields = shipmentOnlyFields;
           this.configurationData = configurationData;
           this.requestedPackageLineItems = requestedPackageLineItems;
    }


    /**
     * Gets the shipTimestamp value for this RequestedShipment.
     *
     * @return shipTimestamp
     */
    public java.util.Calendar getShipTimestamp() {
        return shipTimestamp;
    }


    /**
     * Sets the shipTimestamp value for this RequestedShipment.
     *
     * @param shipTimestamp
     */
    public void setShipTimestamp(java.util.Calendar shipTimestamp) {
        this.shipTimestamp = shipTimestamp;
    }


    /**
     * Gets the dropoffType value for this RequestedShipment.
     *
     * @return dropoffType
     */
    public DropoffType getDropoffType() {
        return dropoffType;
    }


    /**
     * Sets the dropoffType value for this RequestedShipment.
     *
     * @param dropoffType
     */
    public void setDropoffType(DropoffType dropoffType) {
        this.dropoffType = dropoffType;
    }


    /**
     * Gets the serviceType value for this RequestedShipment.
     *
     * @return serviceType
     */
    public ServiceType getServiceType() {
        return serviceType;
    }


    /**
     * Sets the serviceType value for this RequestedShipment.
     *
     * @param serviceType
     */
    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }


    /**
     * Gets the packagingType value for this RequestedShipment.
     *
     * @return packagingType
     */
    public PackagingType getPackagingType() {
        return packagingType;
    }


    /**
     * Sets the packagingType value for this RequestedShipment.
     *
     * @param packagingType
     */
    public void setPackagingType(PackagingType packagingType) {
        this.packagingType = packagingType;
    }


    /**
     * Gets the variationOptions value for this RequestedShipment.
     *
     * @return variationOptions   * The shipment variations for the current shipment expressed
     * in key-value pairs.
     */
    public ShipmentVariationOptionDetail[] getVariationOptions() {
        return variationOptions;
    }


    /**
     * Sets the variationOptions value for this RequestedShipment.
     *
     * @param variationOptions   * The shipment variations for the current shipment expressed
     * in key-value pairs.
     */
    public void setVariationOptions(ShipmentVariationOptionDetail[] variationOptions) {
        this.variationOptions = variationOptions;
    }

    public ShipmentVariationOptionDetail getVariationOptions(int i) {
        return this.variationOptions[i];
    }

    public void setVariationOptions(int i, ShipmentVariationOptionDetail _value) {
        this.variationOptions[i] = _value;
    }


    /**
     * Gets the totalWeight value for this RequestedShipment.
     *
     * @return totalWeight
     */
    public Weight getTotalWeight() {
        return totalWeight;
    }


    /**
     * Sets the totalWeight value for this RequestedShipment.
     *
     * @param totalWeight
     */
    public void setTotalWeight(Weight totalWeight) {
        this.totalWeight = totalWeight;
    }


    /**
     * Gets the totalInsuredValue value for this RequestedShipment.
     *
     * @return totalInsuredValue   * Specifies the total declared value for carriage of the shipment.
     * The declared value for carriage represents the maximum liability of
     * FedEx in connection with a shipment, including, but not limited to,
     * any loss, damage, delay, mis-delivery, nondelivery, misinformation,
     * any failure to provide information, or mis-delivery of information
     * relating to the shipment.
     */
    public Money getTotalInsuredValue() {
        return totalInsuredValue;
    }


    /**
     * Sets the totalInsuredValue value for this RequestedShipment.
     *
     * @param totalInsuredValue   * Specifies the total declared value for carriage of the shipment.
     * The declared value for carriage represents the maximum liability of
     * FedEx in connection with a shipment, including, but not limited to,
     * any loss, damage, delay, mis-delivery, nondelivery, misinformation,
     * any failure to provide information, or mis-delivery of information
     * relating to the shipment.
     */
    public void setTotalInsuredValue(Money totalInsuredValue) {
        this.totalInsuredValue = totalInsuredValue;
    }


    /**
     * Gets the preferredCurrency value for this RequestedShipment.
     *
     * @return preferredCurrency   * This attribute indicates the currency the caller requests to
     * have used in all returned monetary values (when a choice is possible).
     */
    public java.lang.String getPreferredCurrency() {
        return preferredCurrency;
    }


    /**
     * Sets the preferredCurrency value for this RequestedShipment.
     *
     * @param preferredCurrency   * This attribute indicates the currency the caller requests to
     * have used in all returned monetary values (when a choice is possible).
     */
    public void setPreferredCurrency(java.lang.String preferredCurrency) {
        this.preferredCurrency = preferredCurrency;
    }


    /**
     * Gets the shipmentAuthorizationDetail value for this RequestedShipment.
     *
     * @return shipmentAuthorizationDetail   * Specifies details about the entity responsible for the shipment.
     */
    public ShipmentAuthorizationDetail getShipmentAuthorizationDetail() {
        return shipmentAuthorizationDetail;
    }


    /**
     * Sets the shipmentAuthorizationDetail value for this RequestedShipment.
     *
     * @param shipmentAuthorizationDetail   * Specifies details about the entity responsible for the shipment.
     */
    public void setShipmentAuthorizationDetail(ShipmentAuthorizationDetail shipmentAuthorizationDetail) {
        this.shipmentAuthorizationDetail = shipmentAuthorizationDetail;
    }


    /**
     * Gets the shipper value for this RequestedShipment.
     *
     * @return shipper
     */
    public Party getShipper() {
        return shipper;
    }


    /**
     * Sets the shipper value for this RequestedShipment.
     *
     * @param shipper
     */
    public void setShipper(Party shipper) {
        this.shipper = shipper;
    }


    /**
     * Gets the recipient value for this RequestedShipment.
     *
     * @return recipient
     */
    public Party getRecipient() {
        return recipient;
    }


    /**
     * Sets the recipient value for this RequestedShipment.
     *
     * @param recipient
     */
    public void setRecipient(Party recipient) {
        this.recipient = recipient;
    }


    /**
     * Gets the recipientLocationNumber value for this RequestedShipment.
     *
     * @return recipientLocationNumber
     */
    public java.lang.String getRecipientLocationNumber() {
        return recipientLocationNumber;
    }


    /**
     * Sets the recipientLocationNumber value for this RequestedShipment.
     *
     * @param recipientLocationNumber
     */
    public void setRecipientLocationNumber(java.lang.String recipientLocationNumber) {
        this.recipientLocationNumber = recipientLocationNumber;
    }


    /**
     * Gets the origin value for this RequestedShipment.
     *
     * @return origin   * Physical starting address for the shipment, if different from
     * shipper's address.
     */
    public ContactAndAddress getOrigin() {
        return origin;
    }


    /**
     * Sets the origin value for this RequestedShipment.
     *
     * @param origin   * Physical starting address for the shipment, if different from
     * shipper's address.
     */
    public void setOrigin(ContactAndAddress origin) {
        this.origin = origin;
    }


    /**
     * Gets the soldTo value for this RequestedShipment.
     *
     * @return soldTo
     */
    public Party getSoldTo() {
        return soldTo;
    }


    /**
     * Sets the soldTo value for this RequestedShipment.
     *
     * @param soldTo
     */
    public void setSoldTo(Party soldTo) {
        this.soldTo = soldTo;
    }


    /**
     * Gets the shippingChargesPayment value for this RequestedShipment.
     *
     * @return shippingChargesPayment
     */
    public Payment getShippingChargesPayment() {
        return shippingChargesPayment;
    }


    /**
     * Sets the shippingChargesPayment value for this RequestedShipment.
     *
     * @param shippingChargesPayment
     */
    public void setShippingChargesPayment(Payment shippingChargesPayment) {
        this.shippingChargesPayment = shippingChargesPayment;
    }


    /**
     * Gets the specialServicesRequested value for this RequestedShipment.
     *
     * @return specialServicesRequested
     */
    public ShipmentSpecialServicesRequested getSpecialServicesRequested() {
        return specialServicesRequested;
    }


    /**
     * Sets the specialServicesRequested value for this RequestedShipment.
     *
     * @param specialServicesRequested
     */
    public void setSpecialServicesRequested(ShipmentSpecialServicesRequested specialServicesRequested) {
        this.specialServicesRequested = specialServicesRequested;
    }


    /**
     * Gets the expressFreightDetail value for this RequestedShipment.
     *
     * @return expressFreightDetail
     */
    public ExpressFreightDetail getExpressFreightDetail() {
        return expressFreightDetail;
    }


    /**
     * Sets the expressFreightDetail value for this RequestedShipment.
     *
     * @param expressFreightDetail
     */
    public void setExpressFreightDetail(ExpressFreightDetail expressFreightDetail) {
        this.expressFreightDetail = expressFreightDetail;
    }


    /**
     * Gets the freightShipmentDetail value for this RequestedShipment.
     *
     * @return freightShipmentDetail   * Data applicable to shipments using FEDEX_FREIGHT_ECONOMY and
     * FEDEX_FREIGHT_PRIORITY services.
     */
    public FreightShipmentDetail getFreightShipmentDetail() {
        return freightShipmentDetail;
    }


    /**
     * Sets the freightShipmentDetail value for this RequestedShipment.
     *
     * @param freightShipmentDetail   * Data applicable to shipments using FEDEX_FREIGHT_ECONOMY and
     * FEDEX_FREIGHT_PRIORITY services.
     */
    public void setFreightShipmentDetail(FreightShipmentDetail freightShipmentDetail) {
        this.freightShipmentDetail = freightShipmentDetail;
    }


    /**
     * Gets the deliveryInstructions value for this RequestedShipment.
     *
     * @return deliveryInstructions   * Used with Ground Home Delivery and Freight.
     */
    public java.lang.String getDeliveryInstructions() {
        return deliveryInstructions;
    }


    /**
     * Sets the deliveryInstructions value for this RequestedShipment.
     *
     * @param deliveryInstructions   * Used with Ground Home Delivery and Freight.
     */
    public void setDeliveryInstructions(java.lang.String deliveryInstructions) {
        this.deliveryInstructions = deliveryInstructions;
    }


    /**
     * Gets the variableHandlingChargeDetail value for this RequestedShipment.
     *
     * @return variableHandlingChargeDetail
     */
    public VariableHandlingChargeDetail getVariableHandlingChargeDetail() {
        return variableHandlingChargeDetail;
    }


    /**
     * Sets the variableHandlingChargeDetail value for this RequestedShipment.
     *
     * @param variableHandlingChargeDetail
     */
    public void setVariableHandlingChargeDetail(VariableHandlingChargeDetail variableHandlingChargeDetail) {
        this.variableHandlingChargeDetail = variableHandlingChargeDetail;
    }


    /**
     * Gets the customsClearanceDetail value for this RequestedShipment.
     *
     * @return customsClearanceDetail   * Customs clearance data, used for both international and intra-country
     * shipping.
     */
    public CustomsClearanceDetail getCustomsClearanceDetail() {
        return customsClearanceDetail;
    }


    /**
     * Sets the customsClearanceDetail value for this RequestedShipment.
     *
     * @param customsClearanceDetail   * Customs clearance data, used for both international and intra-country
     * shipping.
     */
    public void setCustomsClearanceDetail(CustomsClearanceDetail customsClearanceDetail) {
        this.customsClearanceDetail = customsClearanceDetail;
    }


    /**
     * Gets the pickupDetail value for this RequestedShipment.
     *
     * @return pickupDetail   * For use in "process tag" transaction.
     */
    public PickupDetail getPickupDetail() {
        return pickupDetail;
    }


    /**
     * Sets the pickupDetail value for this RequestedShipment.
     *
     * @param pickupDetail   * For use in "process tag" transaction.
     */
    public void setPickupDetail(PickupDetail pickupDetail) {
        this.pickupDetail = pickupDetail;
    }


    /**
     * Gets the smartPostDetail value for this RequestedShipment.
     *
     * @return smartPostDetail   * Specifies the characteristics of a shipment pertaining to SmartPost
     * services.
     */
    public SmartPostShipmentDetail getSmartPostDetail() {
        return smartPostDetail;
    }


    /**
     * Sets the smartPostDetail value for this RequestedShipment.
     *
     * @param smartPostDetail   * Specifies the characteristics of a shipment pertaining to SmartPost
     * services.
     */
    public void setSmartPostDetail(SmartPostShipmentDetail smartPostDetail) {
        this.smartPostDetail = smartPostDetail;
    }


    /**
     * Gets the blockInsightVisibility value for this RequestedShipment.
     *
     * @return blockInsightVisibility   * If true, only the shipper/payor will have visibility of this
     * shipment.
     */
    public java.lang.Boolean getBlockInsightVisibility() {
        return blockInsightVisibility;
    }


    /**
     * Sets the blockInsightVisibility value for this RequestedShipment.
     *
     * @param blockInsightVisibility   * If true, only the shipper/payor will have visibility of this
     * shipment.
     */
    public void setBlockInsightVisibility(java.lang.Boolean blockInsightVisibility) {
        this.blockInsightVisibility = blockInsightVisibility;
    }


    /**
     * Gets the labelSpecification value for this RequestedShipment.
     *
     * @return labelSpecification
     */
    public LabelSpecification getLabelSpecification() {
        return labelSpecification;
    }


    /**
     * Sets the labelSpecification value for this RequestedShipment.
     *
     * @param labelSpecification
     */
    public void setLabelSpecification(LabelSpecification labelSpecification) {
        this.labelSpecification = labelSpecification;
    }


    /**
     * Gets the shippingDocumentSpecification value for this RequestedShipment.
     *
     * @return shippingDocumentSpecification   * Contains data used to create additional (non-label) shipping
     * documents.
     */
    public ShippingDocumentSpecification getShippingDocumentSpecification() {
        return shippingDocumentSpecification;
    }


    /**
     * Sets the shippingDocumentSpecification value for this RequestedShipment.
     *
     * @param shippingDocumentSpecification   * Contains data used to create additional (non-label) shipping
     * documents.
     */
    public void setShippingDocumentSpecification(ShippingDocumentSpecification shippingDocumentSpecification) {
        this.shippingDocumentSpecification = shippingDocumentSpecification;
    }


    /**
     * Gets the rateRequestTypes value for this RequestedShipment.
     *
     * @return rateRequestTypes   * Specifies whether and what kind of rates the customer wishes
     * to have quoted on this shipment. The reply will also be constrained
     * by other data on the shipment and customer.
     */
    public RateRequestType[] getRateRequestTypes() {
        return rateRequestTypes;
    }


    /**
     * Sets the rateRequestTypes value for this RequestedShipment.
     *
     * @param rateRequestTypes   * Specifies whether and what kind of rates the customer wishes
     * to have quoted on this shipment. The reply will also be constrained
     * by other data on the shipment and customer.
     */
    public void setRateRequestTypes(RateRequestType[] rateRequestTypes) {
        this.rateRequestTypes = rateRequestTypes;
    }

    public RateRequestType getRateRequestTypes(int i) {
        return this.rateRequestTypes[i];
    }

    public void setRateRequestTypes(int i, RateRequestType _value) {
        this.rateRequestTypes[i] = _value;
    }


    /**
     * Gets the edtRequestType value for this RequestedShipment.
     *
     * @return edtRequestType   * Specifies whether the customer wishes to have Estimated Duties
     * and Taxes provided with the rate quotation on this shipment. Only
     * applies with shipments moving under international services.
     */
    public EdtRequestType getEdtRequestType() {
        return edtRequestType;
    }


    /**
     * Sets the edtRequestType value for this RequestedShipment.
     *
     * @param edtRequestType   * Specifies whether the customer wishes to have Estimated Duties
     * and Taxes provided with the rate quotation on this shipment. Only
     * applies with shipments moving under international services.
     */
    public void setEdtRequestType(EdtRequestType edtRequestType) {
        this.edtRequestType = edtRequestType;
    }


    /**
     * Gets the packageCount value for this RequestedShipment.
     *
     * @return packageCount   * The total number of packages in the entire shipment (even when
     * the shipment spans multiple transactions.)
     */
    public org.apache.axis.types.NonNegativeInteger getPackageCount() {
        return packageCount;
    }


    /**
     * Sets the packageCount value for this RequestedShipment.
     *
     * @param packageCount   * The total number of packages in the entire shipment (even when
     * the shipment spans multiple transactions.)
     */
    public void setPackageCount(org.apache.axis.types.NonNegativeInteger packageCount) {
        this.packageCount = packageCount;
    }


    /**
     * Gets the shipmentOnlyFields value for this RequestedShipment.
     *
     * @return shipmentOnlyFields   * Specifies which package-level data values are provided at the
     * shipment-level only. The package-level data values types specified
     * here will not be provided at the package-level.
     */
    public ShipmentOnlyFieldsType[] getShipmentOnlyFields() {
        return shipmentOnlyFields;
    }


    /**
     * Sets the shipmentOnlyFields value for this RequestedShipment.
     *
     * @param shipmentOnlyFields   * Specifies which package-level data values are provided at the
     * shipment-level only. The package-level data values types specified
     * here will not be provided at the package-level.
     */
    public void setShipmentOnlyFields(ShipmentOnlyFieldsType[] shipmentOnlyFields) {
        this.shipmentOnlyFields = shipmentOnlyFields;
    }

    public ShipmentOnlyFieldsType getShipmentOnlyFields(int i) {
        return this.shipmentOnlyFields[i];
    }

    public void setShipmentOnlyFields(int i, ShipmentOnlyFieldsType _value) {
        this.shipmentOnlyFields[i] = _value;
    }


    /**
     * Gets the configurationData value for this RequestedShipment.
     *
     * @return configurationData   * Specifies data structures that may be re-used multiple times
     * with s single shipment.
     */
    public ShipmentConfigurationData getConfigurationData() {
        return configurationData;
    }


    /**
     * Sets the configurationData value for this RequestedShipment.
     *
     * @param configurationData   * Specifies data structures that may be re-used multiple times
     * with s single shipment.
     */
    public void setConfigurationData(ShipmentConfigurationData configurationData) {
        this.configurationData = configurationData;
    }


    /**
     * Gets the requestedPackageLineItems value for this RequestedShipment.
     *
     * @return requestedPackageLineItems   * One or more package-attribute descriptions, each of which describes
     * an individual package, a group of identical packages, or (for the
     * total-piece-total-weight case) common characteristics all packages
     * in the shipment.
     */
    public RequestedPackageLineItem[] getRequestedPackageLineItems() {
        return requestedPackageLineItems;
    }


    /**
     * Sets the requestedPackageLineItems value for this RequestedShipment.
     *
     * @param requestedPackageLineItems   * One or more package-attribute descriptions, each of which describes
     * an individual package, a group of identical packages, or (for the
     * total-piece-total-weight case) common characteristics all packages
     * in the shipment.
     */
    public void setRequestedPackageLineItems(RequestedPackageLineItem[] requestedPackageLineItems) {
        this.requestedPackageLineItems = requestedPackageLineItems;
    }

    public RequestedPackageLineItem getRequestedPackageLineItems(int i) {
        return this.requestedPackageLineItems[i];
    }

    public void setRequestedPackageLineItems(int i, RequestedPackageLineItem _value) {
        this.requestedPackageLineItems[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequestedShipment)) return false;
        RequestedShipment other = (RequestedShipment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
            ((this.shipTimestamp==null && other.getShipTimestamp()==null) ||
             (this.shipTimestamp!=null &&
              this.shipTimestamp.equals(other.getShipTimestamp()))) &&
            ((this.dropoffType==null && other.getDropoffType()==null) ||
             (this.dropoffType!=null &&
              this.dropoffType.equals(other.getDropoffType()))) &&
            ((this.serviceType==null && other.getServiceType()==null) ||
             (this.serviceType!=null &&
              this.serviceType.equals(other.getServiceType()))) &&
            ((this.packagingType==null && other.getPackagingType()==null) ||
             (this.packagingType!=null &&
              this.packagingType.equals(other.getPackagingType()))) &&
            ((this.variationOptions==null && other.getVariationOptions()==null) ||
             (this.variationOptions!=null &&
              java.util.Arrays.equals(this.variationOptions, other.getVariationOptions()))) &&
            ((this.totalWeight==null && other.getTotalWeight()==null) ||
             (this.totalWeight!=null &&
              this.totalWeight.equals(other.getTotalWeight()))) &&
            ((this.totalInsuredValue==null && other.getTotalInsuredValue()==null) ||
             (this.totalInsuredValue!=null &&
              this.totalInsuredValue.equals(other.getTotalInsuredValue()))) &&
            ((this.preferredCurrency==null && other.getPreferredCurrency()==null) ||
             (this.preferredCurrency!=null &&
              this.preferredCurrency.equals(other.getPreferredCurrency()))) &&
            ((this.shipmentAuthorizationDetail==null && other.getShipmentAuthorizationDetail()==null) ||
             (this.shipmentAuthorizationDetail!=null &&
              this.shipmentAuthorizationDetail.equals(other.getShipmentAuthorizationDetail()))) &&
            ((this.shipper==null && other.getShipper()==null) ||
             (this.shipper!=null &&
              this.shipper.equals(other.getShipper()))) &&
            ((this.recipient==null && other.getRecipient()==null) ||
             (this.recipient!=null &&
              this.recipient.equals(other.getRecipient()))) &&
            ((this.recipientLocationNumber==null && other.getRecipientLocationNumber()==null) ||
             (this.recipientLocationNumber!=null &&
              this.recipientLocationNumber.equals(other.getRecipientLocationNumber()))) &&
            ((this.origin==null && other.getOrigin()==null) ||
             (this.origin!=null &&
              this.origin.equals(other.getOrigin()))) &&
            ((this.soldTo==null && other.getSoldTo()==null) ||
             (this.soldTo!=null &&
              this.soldTo.equals(other.getSoldTo()))) &&
            ((this.shippingChargesPayment==null && other.getShippingChargesPayment()==null) ||
             (this.shippingChargesPayment!=null &&
              this.shippingChargesPayment.equals(other.getShippingChargesPayment()))) &&
            ((this.specialServicesRequested==null && other.getSpecialServicesRequested()==null) ||
             (this.specialServicesRequested!=null &&
              this.specialServicesRequested.equals(other.getSpecialServicesRequested()))) &&
            ((this.expressFreightDetail==null && other.getExpressFreightDetail()==null) ||
             (this.expressFreightDetail!=null &&
              this.expressFreightDetail.equals(other.getExpressFreightDetail()))) &&
            ((this.freightShipmentDetail==null && other.getFreightShipmentDetail()==null) ||
             (this.freightShipmentDetail!=null &&
              this.freightShipmentDetail.equals(other.getFreightShipmentDetail()))) &&
            ((this.deliveryInstructions==null && other.getDeliveryInstructions()==null) ||
             (this.deliveryInstructions!=null &&
              this.deliveryInstructions.equals(other.getDeliveryInstructions()))) &&
            ((this.variableHandlingChargeDetail==null && other.getVariableHandlingChargeDetail()==null) ||
             (this.variableHandlingChargeDetail!=null &&
              this.variableHandlingChargeDetail.equals(other.getVariableHandlingChargeDetail()))) &&
            ((this.customsClearanceDetail==null && other.getCustomsClearanceDetail()==null) ||
             (this.customsClearanceDetail!=null &&
              this.customsClearanceDetail.equals(other.getCustomsClearanceDetail()))) &&
            ((this.pickupDetail==null && other.getPickupDetail()==null) ||
             (this.pickupDetail!=null &&
              this.pickupDetail.equals(other.getPickupDetail()))) &&
            ((this.smartPostDetail==null && other.getSmartPostDetail()==null) ||
             (this.smartPostDetail!=null &&
              this.smartPostDetail.equals(other.getSmartPostDetail()))) &&
            ((this.blockInsightVisibility==null && other.getBlockInsightVisibility()==null) ||
             (this.blockInsightVisibility!=null &&
              this.blockInsightVisibility.equals(other.getBlockInsightVisibility()))) &&
            ((this.labelSpecification==null && other.getLabelSpecification()==null) ||
             (this.labelSpecification!=null &&
              this.labelSpecification.equals(other.getLabelSpecification()))) &&
            ((this.shippingDocumentSpecification==null && other.getShippingDocumentSpecification()==null) ||
             (this.shippingDocumentSpecification!=null &&
              this.shippingDocumentSpecification.equals(other.getShippingDocumentSpecification()))) &&
            ((this.rateRequestTypes==null && other.getRateRequestTypes()==null) ||
             (this.rateRequestTypes!=null &&
              java.util.Arrays.equals(this.rateRequestTypes, other.getRateRequestTypes()))) &&
            ((this.edtRequestType==null && other.getEdtRequestType()==null) ||
             (this.edtRequestType!=null &&
              this.edtRequestType.equals(other.getEdtRequestType()))) &&
            ((this.packageCount==null && other.getPackageCount()==null) ||
             (this.packageCount!=null &&
              this.packageCount.equals(other.getPackageCount()))) &&
            ((this.shipmentOnlyFields==null && other.getShipmentOnlyFields()==null) ||
             (this.shipmentOnlyFields!=null &&
              java.util.Arrays.equals(this.shipmentOnlyFields, other.getShipmentOnlyFields()))) &&
            ((this.configurationData==null && other.getConfigurationData()==null) ||
             (this.configurationData!=null &&
              this.configurationData.equals(other.getConfigurationData()))) &&
            ((this.requestedPackageLineItems==null && other.getRequestedPackageLineItems()==null) ||
             (this.requestedPackageLineItems!=null &&
              java.util.Arrays.equals(this.requestedPackageLineItems, other.getRequestedPackageLineItems())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getShipTimestamp() != null) {
            _hashCode += getShipTimestamp().hashCode();
        }
        if (getDropoffType() != null) {
            _hashCode += getDropoffType().hashCode();
        }
        if (getServiceType() != null) {
            _hashCode += getServiceType().hashCode();
        }
        if (getPackagingType() != null) {
            _hashCode += getPackagingType().hashCode();
        }
        if (getVariationOptions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVariationOptions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVariationOptions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTotalWeight() != null) {
            _hashCode += getTotalWeight().hashCode();
        }
        if (getTotalInsuredValue() != null) {
            _hashCode += getTotalInsuredValue().hashCode();
        }
        if (getPreferredCurrency() != null) {
            _hashCode += getPreferredCurrency().hashCode();
        }
        if (getShipmentAuthorizationDetail() != null) {
            _hashCode += getShipmentAuthorizationDetail().hashCode();
        }
        if (getShipper() != null) {
            _hashCode += getShipper().hashCode();
        }
        if (getRecipient() != null) {
            _hashCode += getRecipient().hashCode();
        }
        if (getRecipientLocationNumber() != null) {
            _hashCode += getRecipientLocationNumber().hashCode();
        }
        if (getOrigin() != null) {
            _hashCode += getOrigin().hashCode();
        }
        if (getSoldTo() != null) {
            _hashCode += getSoldTo().hashCode();
        }
        if (getShippingChargesPayment() != null) {
            _hashCode += getShippingChargesPayment().hashCode();
        }
        if (getSpecialServicesRequested() != null) {
            _hashCode += getSpecialServicesRequested().hashCode();
        }
        if (getExpressFreightDetail() != null) {
            _hashCode += getExpressFreightDetail().hashCode();
        }
        if (getFreightShipmentDetail() != null) {
            _hashCode += getFreightShipmentDetail().hashCode();
        }
        if (getDeliveryInstructions() != null) {
            _hashCode += getDeliveryInstructions().hashCode();
        }
        if (getVariableHandlingChargeDetail() != null) {
            _hashCode += getVariableHandlingChargeDetail().hashCode();
        }
        if (getCustomsClearanceDetail() != null) {
            _hashCode += getCustomsClearanceDetail().hashCode();
        }
        if (getPickupDetail() != null) {
            _hashCode += getPickupDetail().hashCode();
        }
        if (getSmartPostDetail() != null) {
            _hashCode += getSmartPostDetail().hashCode();
        }
        if (getBlockInsightVisibility() != null) {
            _hashCode += getBlockInsightVisibility().hashCode();
        }
        if (getLabelSpecification() != null) {
            _hashCode += getLabelSpecification().hashCode();
        }
        if (getShippingDocumentSpecification() != null) {
            _hashCode += getShippingDocumentSpecification().hashCode();
        }
        if (getRateRequestTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRateRequestTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRateRequestTypes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEdtRequestType() != null) {
            _hashCode += getEdtRequestType().hashCode();
        }
        if (getPackageCount() != null) {
            _hashCode += getPackageCount().hashCode();
        }
        if (getShipmentOnlyFields() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShipmentOnlyFields());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShipmentOnlyFields(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getConfigurationData() != null) {
            _hashCode += getConfigurationData().hashCode();
        }
        if (getRequestedPackageLineItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRequestedPackageLineItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRequestedPackageLineItems(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RequestedShipment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "RequestedShipment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipTimestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "ShipTimestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dropoffType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "DropoffType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "DropoffType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "ServiceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "ServiceType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packagingType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "PackagingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "PackagingType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("variationOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "VariationOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "ShipmentVariationOptionDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalWeight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "TotalWeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "Weight"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalInsuredValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "TotalInsuredValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferredCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "PreferredCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentAuthorizationDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "ShipmentAuthorizationDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "ShipmentAuthorizationDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipper");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "Shipper"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "Party"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipient");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "Recipient"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "Party"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipientLocationNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "RecipientLocationNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("origin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "Origin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "ContactAndAddress"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("soldTo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "SoldTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "Party"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingChargesPayment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "ShippingChargesPayment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "Payment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specialServicesRequested");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "SpecialServicesRequested"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "ShipmentSpecialServicesRequested"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expressFreightDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "ExpressFreightDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "ExpressFreightDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freightShipmentDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "FreightShipmentDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "FreightShipmentDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryInstructions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "DeliveryInstructions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("variableHandlingChargeDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "VariableHandlingChargeDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "VariableHandlingChargeDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customsClearanceDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "CustomsClearanceDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "CustomsClearanceDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickupDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "PickupDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "PickupDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smartPostDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "SmartPostDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "SmartPostShipmentDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blockInsightVisibility");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "BlockInsightVisibility"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("labelSpecification");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "LabelSpecification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "LabelSpecification"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingDocumentSpecification");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "ShippingDocumentSpecification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "ShippingDocumentSpecification"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rateRequestTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "RateRequestTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "RateRequestType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("edtRequestType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "EdtRequestType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "EdtRequestType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "PackageCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentOnlyFields");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "ShipmentOnlyFields"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "ShipmentOnlyFieldsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("configurationData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "ConfigurationData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "ShipmentConfigurationData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestedPackageLineItems");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "RequestedPackageLineItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "RequestedPackageLineItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType,
           java.lang.Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType,
           java.lang.Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
