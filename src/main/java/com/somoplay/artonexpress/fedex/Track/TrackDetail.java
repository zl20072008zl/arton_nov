/**
 * TrackDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.somoplay.artonexpress.fedex.Track;

public class TrackDetail  implements java.io.Serializable {
    /* To report soft error on an individual track detail. */
    private Notification notification;

    /* The FedEx package identifier. */
    private java.lang.String trackingNumber;

    private StringBarcode barcode;

    /* When duplicate tracking numbers exist this data is returned
     * with summary information for each of the duplicates. The summary information
     * is used to determine which of the duplicates the intended tracking
     * number is. This identifier is used on a subsequent track request to
     * retrieve the tracking data for the desired tracking number. */
    private java.lang.String trackingNumberUniqueIdentifier;

    /* Specifies details about the status of the shipment being tracked. */
    private TrackStatusDetail statusDetail;

    /* Notifications to the end user that provide additional information
     * relevant to the tracked shipment. For example, a notification may
     * indicate that a change in behavior has occurred. */
    private TrackInformationNoteDetail[] informationNotes;

    private CustomerExceptionRequestDetail[] customerExceptionRequests;

    /* Used to report the status of a piece of a multiple piece shipment
     * which is no longer traveling with the rest of the packages in the
     * shipment or has not been accounted for. */
    private TrackReconciliation reconciliation;

    /* Used to convey information such as. 1. FedEx has received information
     * about a package but has not yet taken possession of it. 2. FedEx has
     * handed the package off to a third party for final delivery. 3. The
     * package delivery has been cancelled */
    private java.lang.String serviceCommitMessage;

    private java.lang.String destinationServiceArea;

    private java.lang.String destinationServiceAreaDescription;

    /* Identifies a FedEx operating company (transportation). */
    private CarrierCodeType carrierCode;

    /* Identifies operating transportation company that is the specific
     * to the carrier code. */
    private OperatingCompanyType operatingCompany;

    /* Specifies a detailed description about the carrier or the operating
     * company. */
    private java.lang.String operatingCompanyOrCarrierDescription;

    /* If the package was interlined to a cartage agent, this is the
     * name of the cartage agent. (Returned for CSR SL only.) */
    private java.lang.String cartageAgentCompanyName;

    /* Specifies the FXO production centre contact and address. */
    private ContactAndAddress productionLocationContactAndAddress;

    private TrackOtherIdentifierDetail[] otherIdentifiers;

    /* (Returned for CSR SL only.) */
    private java.lang.String formId;

    /* Specifies details about service such as service description
     * and type. */
    private TrackServiceDescriptionDetail service;

    /* The weight of this package. */
    private Weight packageWeight;

    /* Physical dimensions of the package. */
    private Dimensions packageDimensions;

    /* The dimensional weight of the package. */
    private Weight packageDimensionalWeight;

    /* The weight of the entire shipment. */
    private Weight shipmentWeight;

    /* Retained for legacy compatibility only. */
    private java.lang.String packaging;

    /* Strict representation of the Packaging type (e.g. FEDEX_BOX,
     * YOUR_PACKAGING). */
    private PackagingType packagingType;

    private PhysicalPackagingType physicalPackagingType;

    /* The sequence number of this package in a shipment. This would
     * be 2 if it was package number 2 of 4. */
    private org.apache.axis.types.NonNegativeInteger packageSequenceNumber;

    /* The number of packages in this shipment. */
    private org.apache.axis.types.NonNegativeInteger packageCount;

    /* FOR FEDEX INTERNAL USE ONLY: Specifies the software id of the
     * device that was used to create this tracked shipment. */
    private java.lang.String creatorSoftwareId;

    /* Specifies the details about the SPOC details. */
    private TrackChargeDetail[] charges;

    private java.lang.String nickName;

    private java.lang.String notes;

    private TrackDetailAttributeType[] attributes;

    private ContentRecord[] shipmentContents;

    private java.lang.String[] packageContents;

    private java.lang.String clearanceLocationCode;

    private Commodity[] commodities;

    private TrackReturnDetail returnDetail;

    /* Specifies the reason for return. */
    private CustomsOptionDetail[] customsOptionDetails;

    private TrackAdvanceNotificationDetail advanceNotificationDetail;

    /* List of special handlings that applied to this package. */
    private TrackSpecialHandling[] specialHandlings;

    /* Specifies the details about the payments for the shipment being
     * tracked. */
    private TrackPayment[] payments;

    /* (Returned for CSR SL only.) */
    private Contact shipper;

    /* Indicates last-known possession of package (Returned for CSR
     * SL only.) */
    private TrackPossessionStatusType possessionStatus;

    private Address shipperAddress;

    /* The address of the FedEx pickup location/facility. */
    private Address originLocationAddress;

    /* (Returned for CSR SL only.) */
    private java.lang.String originStationId;

    private TrackingDateOrTimestamp[] datesOrTimes;

    /* The distance from the origin to the destination. Returned for
     * Custom Critical shipments. */
    private Distance totalTransitDistance;

    /* Total distance package still has to travel. Returned for Custom
     * Critical shipments. */
    private Distance distanceToDestination;

    /* Provides additional details about package delivery. */
    private TrackSpecialInstruction[] specialInstructions;

    /* (Returned for CSR SL only.) */
    private Contact recipient;

    /* This is the latest updated destination address. */
    private Address lastUpdatedDestinationAddress;

    /* The address this package is to be (or has been) delivered. */
    private Address destinationAddress;

    private Contact holdAtLocationContact;

    /* The address this package is requested to placed on hold. */
    private Address holdAtLocationAddress;

    /* (Returned for CSR SL only.) */
    private java.lang.String destinationStationId;

    /* The address of the FedEx delivery location/facility. */
    private Address destinationLocationAddress;

    private FedExLocationType destinationLocationType;

    private java.lang.String destinationLocationTimeZoneOffset;

    /* Actual address where package was delivered. Differs from destinationAddress,
     * which indicates where the package was to be delivered; This field
     * tells where delivery actually occurred (next door, at station, etc.) */
    private Address actualDeliveryAddress;

    /* Identifies the method of office order delivery. */
    private OfficeOrderDeliveryMethodType officeOrderDeliveryMethod;

    /* Strict text indicating the delivery location at the delivered
     * to address. */
    private TrackDeliveryLocationType deliveryLocationType;

    /* User/screen friendly representation of the DeliveryLocationType
     * (delivery location at the delivered to address). Can be returned in
     * localized text. */
    private java.lang.String deliveryLocationDescription;

    /* Specifies the number of delivery attempts made to deliver the
     * shipment. */
    private org.apache.axis.types.NonNegativeInteger deliveryAttempts;

    /* This is either the name of the person that signed for the package
     * or "Signature not requested" or "Signature on file". */
    private java.lang.String deliverySignatureName;

    /* Specifies the details about the count of the packages delivered
     * at the delivery location and the count of the packages at the origin. */
    private PieceCountVerificationDetail[] pieceCountVerificationDetails;

    /* Specifies the total number of unique addresses on the CRNs
     * in a consolidation. */
    private org.apache.axis.types.NonNegativeInteger totalUniqueAddressCountInConsolidation;

    private AvailableImagesDetail[] availableImages;

    private SignatureImageDetail signature;

    private NotificationEventType[] notificationEventsAvailable;

    /* Returned for cargo shipments only when they are currently split
     * across vehicles. */
    private TrackSplitShipmentPart[] splitShipmentParts;

    /* Specifies the details about the eligibility for different delivery
     * options. */
    private DeliveryOptionEligibilityDetail[] deliveryOptionEligibilityDetails;

    /* Event information for a tracking number. */
    private TrackEvent[] events;

    public TrackDetail() {
    }

    public TrackDetail(
           Notification notification,
           java.lang.String trackingNumber,
           StringBarcode barcode,
           java.lang.String trackingNumberUniqueIdentifier,
           TrackStatusDetail statusDetail,
           TrackInformationNoteDetail[] informationNotes,
           CustomerExceptionRequestDetail[] customerExceptionRequests,
           TrackReconciliation reconciliation,
           java.lang.String serviceCommitMessage,
           java.lang.String destinationServiceArea,
           java.lang.String destinationServiceAreaDescription,
           CarrierCodeType carrierCode,
           OperatingCompanyType operatingCompany,
           java.lang.String operatingCompanyOrCarrierDescription,
           java.lang.String cartageAgentCompanyName,
           ContactAndAddress productionLocationContactAndAddress,
           TrackOtherIdentifierDetail[] otherIdentifiers,
           java.lang.String formId,
           TrackServiceDescriptionDetail service,
           Weight packageWeight,
           Dimensions packageDimensions,
           Weight packageDimensionalWeight,
           Weight shipmentWeight,
           java.lang.String packaging,
           PackagingType packagingType,
           PhysicalPackagingType physicalPackagingType,
           org.apache.axis.types.NonNegativeInteger packageSequenceNumber,
           org.apache.axis.types.NonNegativeInteger packageCount,
           java.lang.String creatorSoftwareId,
           TrackChargeDetail[] charges,
           java.lang.String nickName,
           java.lang.String notes,
           TrackDetailAttributeType[] attributes,
           ContentRecord[] shipmentContents,
           java.lang.String[] packageContents,
           java.lang.String clearanceLocationCode,
           Commodity[] commodities,
           TrackReturnDetail returnDetail,
           CustomsOptionDetail[] customsOptionDetails,
           TrackAdvanceNotificationDetail advanceNotificationDetail,
           TrackSpecialHandling[] specialHandlings,
           TrackPayment[] payments,
           Contact shipper,
           TrackPossessionStatusType possessionStatus,
           Address shipperAddress,
           Address originLocationAddress,
           java.lang.String originStationId,
           TrackingDateOrTimestamp[] datesOrTimes,
           Distance totalTransitDistance,
           Distance distanceToDestination,
           TrackSpecialInstruction[] specialInstructions,
           Contact recipient,
           Address lastUpdatedDestinationAddress,
           Address destinationAddress,
           Contact holdAtLocationContact,
           Address holdAtLocationAddress,
           java.lang.String destinationStationId,
           Address destinationLocationAddress,
           FedExLocationType destinationLocationType,
           java.lang.String destinationLocationTimeZoneOffset,
           Address actualDeliveryAddress,
           OfficeOrderDeliveryMethodType officeOrderDeliveryMethod,
           TrackDeliveryLocationType deliveryLocationType,
           java.lang.String deliveryLocationDescription,
           org.apache.axis.types.NonNegativeInteger deliveryAttempts,
           java.lang.String deliverySignatureName,
           PieceCountVerificationDetail[] pieceCountVerificationDetails,
           org.apache.axis.types.NonNegativeInteger totalUniqueAddressCountInConsolidation,
           AvailableImagesDetail[] availableImages,
           SignatureImageDetail signature,
           NotificationEventType[] notificationEventsAvailable,
           TrackSplitShipmentPart[] splitShipmentParts,
           DeliveryOptionEligibilityDetail[] deliveryOptionEligibilityDetails,
           TrackEvent[] events) {
           this.notification = notification;
           this.trackingNumber = trackingNumber;
           this.barcode = barcode;
           this.trackingNumberUniqueIdentifier = trackingNumberUniqueIdentifier;
           this.statusDetail = statusDetail;
           this.informationNotes = informationNotes;
           this.customerExceptionRequests = customerExceptionRequests;
           this.reconciliation = reconciliation;
           this.serviceCommitMessage = serviceCommitMessage;
           this.destinationServiceArea = destinationServiceArea;
           this.destinationServiceAreaDescription = destinationServiceAreaDescription;
           this.carrierCode = carrierCode;
           this.operatingCompany = operatingCompany;
           this.operatingCompanyOrCarrierDescription = operatingCompanyOrCarrierDescription;
           this.cartageAgentCompanyName = cartageAgentCompanyName;
           this.productionLocationContactAndAddress = productionLocationContactAndAddress;
           this.otherIdentifiers = otherIdentifiers;
           this.formId = formId;
           this.service = service;
           this.packageWeight = packageWeight;
           this.packageDimensions = packageDimensions;
           this.packageDimensionalWeight = packageDimensionalWeight;
           this.shipmentWeight = shipmentWeight;
           this.packaging = packaging;
           this.packagingType = packagingType;
           this.physicalPackagingType = physicalPackagingType;
           this.packageSequenceNumber = packageSequenceNumber;
           this.packageCount = packageCount;
           this.creatorSoftwareId = creatorSoftwareId;
           this.charges = charges;
           this.nickName = nickName;
           this.notes = notes;
           this.attributes = attributes;
           this.shipmentContents = shipmentContents;
           this.packageContents = packageContents;
           this.clearanceLocationCode = clearanceLocationCode;
           this.commodities = commodities;
           this.returnDetail = returnDetail;
           this.customsOptionDetails = customsOptionDetails;
           this.advanceNotificationDetail = advanceNotificationDetail;
           this.specialHandlings = specialHandlings;
           this.payments = payments;
           this.shipper = shipper;
           this.possessionStatus = possessionStatus;
           this.shipperAddress = shipperAddress;
           this.originLocationAddress = originLocationAddress;
           this.originStationId = originStationId;
           this.datesOrTimes = datesOrTimes;
           this.totalTransitDistance = totalTransitDistance;
           this.distanceToDestination = distanceToDestination;
           this.specialInstructions = specialInstructions;
           this.recipient = recipient;
           this.lastUpdatedDestinationAddress = lastUpdatedDestinationAddress;
           this.destinationAddress = destinationAddress;
           this.holdAtLocationContact = holdAtLocationContact;
           this.holdAtLocationAddress = holdAtLocationAddress;
           this.destinationStationId = destinationStationId;
           this.destinationLocationAddress = destinationLocationAddress;
           this.destinationLocationType = destinationLocationType;
           this.destinationLocationTimeZoneOffset = destinationLocationTimeZoneOffset;
           this.actualDeliveryAddress = actualDeliveryAddress;
           this.officeOrderDeliveryMethod = officeOrderDeliveryMethod;
           this.deliveryLocationType = deliveryLocationType;
           this.deliveryLocationDescription = deliveryLocationDescription;
           this.deliveryAttempts = deliveryAttempts;
           this.deliverySignatureName = deliverySignatureName;
           this.pieceCountVerificationDetails = pieceCountVerificationDetails;
           this.totalUniqueAddressCountInConsolidation = totalUniqueAddressCountInConsolidation;
           this.availableImages = availableImages;
           this.signature = signature;
           this.notificationEventsAvailable = notificationEventsAvailable;
           this.splitShipmentParts = splitShipmentParts;
           this.deliveryOptionEligibilityDetails = deliveryOptionEligibilityDetails;
           this.events = events;
    }


    /**
     * Gets the notification value for this TrackDetail.
     *
     * @return notification   * To report soft error on an individual track detail.
     */
    public Notification getNotification() {
        return notification;
    }


    /**
     * Sets the notification value for this TrackDetail.
     *
     * @param notification   * To report soft error on an individual track detail.
     */
    public void setNotification(Notification notification) {
        this.notification = notification;
    }


    /**
     * Gets the trackingNumber value for this TrackDetail.
     *
     * @return trackingNumber   * The FedEx package identifier.
     */
    public java.lang.String getTrackingNumber() {
        return trackingNumber;
    }


    /**
     * Sets the trackingNumber value for this TrackDetail.
     *
     * @param trackingNumber   * The FedEx package identifier.
     */
    public void setTrackingNumber(java.lang.String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }


    /**
     * Gets the barcode value for this TrackDetail.
     *
     * @return barcode
     */
    public StringBarcode getBarcode() {
        return barcode;
    }


    /**
     * Sets the barcode value for this TrackDetail.
     *
     * @param barcode
     */
    public void setBarcode(StringBarcode barcode) {
        this.barcode = barcode;
    }


    /**
     * Gets the trackingNumberUniqueIdentifier value for this TrackDetail.
     *
     * @return trackingNumberUniqueIdentifier   * When duplicate tracking numbers exist this data is returned
     * with summary information for each of the duplicates. The summary information
     * is used to determine which of the duplicates the intended tracking
     * number is. This identifier is used on a subsequent track request to
     * retrieve the tracking data for the desired tracking number.
     */
    public java.lang.String getTrackingNumberUniqueIdentifier() {
        return trackingNumberUniqueIdentifier;
    }


    /**
     * Sets the trackingNumberUniqueIdentifier value for this TrackDetail.
     *
     * @param trackingNumberUniqueIdentifier   * When duplicate tracking numbers exist this data is returned
     * with summary information for each of the duplicates. The summary information
     * is used to determine which of the duplicates the intended tracking
     * number is. This identifier is used on a subsequent track request to
     * retrieve the tracking data for the desired tracking number.
     */
    public void setTrackingNumberUniqueIdentifier(java.lang.String trackingNumberUniqueIdentifier) {
        this.trackingNumberUniqueIdentifier = trackingNumberUniqueIdentifier;
    }


    /**
     * Gets the statusDetail value for this TrackDetail.
     *
     * @return statusDetail   * Specifies details about the status of the shipment being tracked.
     */
    public TrackStatusDetail getStatusDetail() {
        return statusDetail;
    }


    /**
     * Sets the statusDetail value for this TrackDetail.
     *
     * @param statusDetail   * Specifies details about the status of the shipment being tracked.
     */
    public void setStatusDetail(TrackStatusDetail statusDetail) {
        this.statusDetail = statusDetail;
    }


    /**
     * Gets the informationNotes value for this TrackDetail.
     *
     * @return informationNotes   * Notifications to the end user that provide additional information
     * relevant to the tracked shipment. For example, a notification may
     * indicate that a change in behavior has occurred.
     */
    public TrackInformationNoteDetail[] getInformationNotes() {
        return informationNotes;
    }


    /**
     * Sets the informationNotes value for this TrackDetail.
     *
     * @param informationNotes   * Notifications to the end user that provide additional information
     * relevant to the tracked shipment. For example, a notification may
     * indicate that a change in behavior has occurred.
     */
    public void setInformationNotes(TrackInformationNoteDetail[] informationNotes) {
        this.informationNotes = informationNotes;
    }

    public TrackInformationNoteDetail getInformationNotes(int i) {
        return this.informationNotes[i];
    }

    public void setInformationNotes(int i, TrackInformationNoteDetail _value) {
        this.informationNotes[i] = _value;
    }


    /**
     * Gets the customerExceptionRequests value for this TrackDetail.
     *
     * @return customerExceptionRequests
     */
    public CustomerExceptionRequestDetail[] getCustomerExceptionRequests() {
        return customerExceptionRequests;
    }


    /**
     * Sets the customerExceptionRequests value for this TrackDetail.
     *
     * @param customerExceptionRequests
     */
    public void setCustomerExceptionRequests(CustomerExceptionRequestDetail[] customerExceptionRequests) {
        this.customerExceptionRequests = customerExceptionRequests;
    }

    public CustomerExceptionRequestDetail getCustomerExceptionRequests(int i) {
        return this.customerExceptionRequests[i];
    }

    public void setCustomerExceptionRequests(int i, CustomerExceptionRequestDetail _value) {
        this.customerExceptionRequests[i] = _value;
    }


    /**
     * Gets the reconciliation value for this TrackDetail.
     *
     * @return reconciliation   * Used to report the status of a piece of a multiple piece shipment
     * which is no longer traveling with the rest of the packages in the
     * shipment or has not been accounted for.
     */
    public TrackReconciliation getReconciliation() {
        return reconciliation;
    }


    /**
     * Sets the reconciliation value for this TrackDetail.
     *
     * @param reconciliation   * Used to report the status of a piece of a multiple piece shipment
     * which is no longer traveling with the rest of the packages in the
     * shipment or has not been accounted for.
     */
    public void setReconciliation(TrackReconciliation reconciliation) {
        this.reconciliation = reconciliation;
    }


    /**
     * Gets the serviceCommitMessage value for this TrackDetail.
     *
     * @return serviceCommitMessage   * Used to convey information such as. 1. FedEx has received information
     * about a package but has not yet taken possession of it. 2. FedEx has
     * handed the package off to a third party for final delivery. 3. The
     * package delivery has been cancelled
     */
    public java.lang.String getServiceCommitMessage() {
        return serviceCommitMessage;
    }


    /**
     * Sets the serviceCommitMessage value for this TrackDetail.
     *
     * @param serviceCommitMessage   * Used to convey information such as. 1. FedEx has received information
     * about a package but has not yet taken possession of it. 2. FedEx has
     * handed the package off to a third party for final delivery. 3. The
     * package delivery has been cancelled
     */
    public void setServiceCommitMessage(java.lang.String serviceCommitMessage) {
        this.serviceCommitMessage = serviceCommitMessage;
    }


    /**
     * Gets the destinationServiceArea value for this TrackDetail.
     *
     * @return destinationServiceArea
     */
    public java.lang.String getDestinationServiceArea() {
        return destinationServiceArea;
    }


    /**
     * Sets the destinationServiceArea value for this TrackDetail.
     *
     * @param destinationServiceArea
     */
    public void setDestinationServiceArea(java.lang.String destinationServiceArea) {
        this.destinationServiceArea = destinationServiceArea;
    }


    /**
     * Gets the destinationServiceAreaDescription value for this TrackDetail.
     *
     * @return destinationServiceAreaDescription
     */
    public java.lang.String getDestinationServiceAreaDescription() {
        return destinationServiceAreaDescription;
    }


    /**
     * Sets the destinationServiceAreaDescription value for this TrackDetail.
     *
     * @param destinationServiceAreaDescription
     */
    public void setDestinationServiceAreaDescription(java.lang.String destinationServiceAreaDescription) {
        this.destinationServiceAreaDescription = destinationServiceAreaDescription;
    }


    /**
     * Gets the carrierCode value for this TrackDetail.
     *
     * @return carrierCode   * Identifies a FedEx operating company (transportation).
     */
    public CarrierCodeType getCarrierCode() {
        return carrierCode;
    }


    /**
     * Sets the carrierCode value for this TrackDetail.
     *
     * @param carrierCode   * Identifies a FedEx operating company (transportation).
     */
    public void setCarrierCode(CarrierCodeType carrierCode) {
        this.carrierCode = carrierCode;
    }


    /**
     * Gets the operatingCompany value for this TrackDetail.
     *
     * @return operatingCompany   * Identifies operating transportation company that is the specific
     * to the carrier code.
     */
    public OperatingCompanyType getOperatingCompany() {
        return operatingCompany;
    }


    /**
     * Sets the operatingCompany value for this TrackDetail.
     *
     * @param operatingCompany   * Identifies operating transportation company that is the specific
     * to the carrier code.
     */
    public void setOperatingCompany(OperatingCompanyType operatingCompany) {
        this.operatingCompany = operatingCompany;
    }


    /**
     * Gets the operatingCompanyOrCarrierDescription value for this TrackDetail.
     *
     * @return operatingCompanyOrCarrierDescription   * Specifies a detailed description about the carrier or the operating
     * company.
     */
    public java.lang.String getOperatingCompanyOrCarrierDescription() {
        return operatingCompanyOrCarrierDescription;
    }


    /**
     * Sets the operatingCompanyOrCarrierDescription value for this TrackDetail.
     *
     * @param operatingCompanyOrCarrierDescription   * Specifies a detailed description about the carrier or the operating
     * company.
     */
    public void setOperatingCompanyOrCarrierDescription(java.lang.String operatingCompanyOrCarrierDescription) {
        this.operatingCompanyOrCarrierDescription = operatingCompanyOrCarrierDescription;
    }


    /**
     * Gets the cartageAgentCompanyName value for this TrackDetail.
     *
     * @return cartageAgentCompanyName   * If the package was interlined to a cartage agent, this is the
     * name of the cartage agent. (Returned for CSR SL only.)
     */
    public java.lang.String getCartageAgentCompanyName() {
        return cartageAgentCompanyName;
    }


    /**
     * Sets the cartageAgentCompanyName value for this TrackDetail.
     *
     * @param cartageAgentCompanyName   * If the package was interlined to a cartage agent, this is the
     * name of the cartage agent. (Returned for CSR SL only.)
     */
    public void setCartageAgentCompanyName(java.lang.String cartageAgentCompanyName) {
        this.cartageAgentCompanyName = cartageAgentCompanyName;
    }


    /**
     * Gets the productionLocationContactAndAddress value for this TrackDetail.
     *
     * @return productionLocationContactAndAddress   * Specifies the FXO production centre contact and address.
     */
    public ContactAndAddress getProductionLocationContactAndAddress() {
        return productionLocationContactAndAddress;
    }


    /**
     * Sets the productionLocationContactAndAddress value for this TrackDetail.
     *
     * @param productionLocationContactAndAddress   * Specifies the FXO production centre contact and address.
     */
    public void setProductionLocationContactAndAddress(ContactAndAddress productionLocationContactAndAddress) {
        this.productionLocationContactAndAddress = productionLocationContactAndAddress;
    }


    /**
     * Gets the otherIdentifiers value for this TrackDetail.
     *
     * @return otherIdentifiers
     */
    public TrackOtherIdentifierDetail[] getOtherIdentifiers() {
        return otherIdentifiers;
    }


    /**
     * Sets the otherIdentifiers value for this TrackDetail.
     *
     * @param otherIdentifiers
     */
    public void setOtherIdentifiers(TrackOtherIdentifierDetail[] otherIdentifiers) {
        this.otherIdentifiers = otherIdentifiers;
    }

    public TrackOtherIdentifierDetail getOtherIdentifiers(int i) {
        return this.otherIdentifiers[i];
    }

    public void setOtherIdentifiers(int i, TrackOtherIdentifierDetail _value) {
        this.otherIdentifiers[i] = _value;
    }


    /**
     * Gets the formId value for this TrackDetail.
     *
     * @return formId   * (Returned for CSR SL only.)
     */
    public java.lang.String getFormId() {
        return formId;
    }


    /**
     * Sets the formId value for this TrackDetail.
     *
     * @param formId   * (Returned for CSR SL only.)
     */
    public void setFormId(java.lang.String formId) {
        this.formId = formId;
    }


    /**
     * Gets the service value for this TrackDetail.
     *
     * @return service   * Specifies details about service such as service description
     * and type.
     */
    public TrackServiceDescriptionDetail getService() {
        return service;
    }


    /**
     * Sets the service value for this TrackDetail.
     *
     * @param service   * Specifies details about service such as service description
     * and type.
     */
    public void setService(TrackServiceDescriptionDetail service) {
        this.service = service;
    }


    /**
     * Gets the packageWeight value for this TrackDetail.
     *
     * @return packageWeight   * The weight of this package.
     */
    public Weight getPackageWeight() {
        return packageWeight;
    }


    /**
     * Sets the packageWeight value for this TrackDetail.
     *
     * @param packageWeight   * The weight of this package.
     */
    public void setPackageWeight(Weight packageWeight) {
        this.packageWeight = packageWeight;
    }


    /**
     * Gets the packageDimensions value for this TrackDetail.
     *
     * @return packageDimensions   * Physical dimensions of the package.
     */
    public Dimensions getPackageDimensions() {
        return packageDimensions;
    }


    /**
     * Sets the packageDimensions value for this TrackDetail.
     *
     * @param packageDimensions   * Physical dimensions of the package.
     */
    public void setPackageDimensions(Dimensions packageDimensions) {
        this.packageDimensions = packageDimensions;
    }


    /**
     * Gets the packageDimensionalWeight value for this TrackDetail.
     *
     * @return packageDimensionalWeight   * The dimensional weight of the package.
     */
    public Weight getPackageDimensionalWeight() {
        return packageDimensionalWeight;
    }


    /**
     * Sets the packageDimensionalWeight value for this TrackDetail.
     *
     * @param packageDimensionalWeight   * The dimensional weight of the package.
     */
    public void setPackageDimensionalWeight(Weight packageDimensionalWeight) {
        this.packageDimensionalWeight = packageDimensionalWeight;
    }


    /**
     * Gets the shipmentWeight value for this TrackDetail.
     *
     * @return shipmentWeight   * The weight of the entire shipment.
     */
    public Weight getShipmentWeight() {
        return shipmentWeight;
    }


    /**
     * Sets the shipmentWeight value for this TrackDetail.
     *
     * @param shipmentWeight   * The weight of the entire shipment.
     */
    public void setShipmentWeight(Weight shipmentWeight) {
        this.shipmentWeight = shipmentWeight;
    }


    /**
     * Gets the packaging value for this TrackDetail.
     *
     * @return packaging   * Retained for legacy compatibility only.
     */
    public java.lang.String getPackaging() {
        return packaging;
    }


    /**
     * Sets the packaging value for this TrackDetail.
     *
     * @param packaging   * Retained for legacy compatibility only.
     */
    public void setPackaging(java.lang.String packaging) {
        this.packaging = packaging;
    }


    /**
     * Gets the packagingType value for this TrackDetail.
     *
     * @return packagingType   * Strict representation of the Packaging type (e.g. FEDEX_BOX,
     * YOUR_PACKAGING).
     */
    public PackagingType getPackagingType() {
        return packagingType;
    }


    /**
     * Sets the packagingType value for this TrackDetail.
     *
     * @param packagingType   * Strict representation of the Packaging type (e.g. FEDEX_BOX,
     * YOUR_PACKAGING).
     */
    public void setPackagingType(PackagingType packagingType) {
        this.packagingType = packagingType;
    }


    /**
     * Gets the physicalPackagingType value for this TrackDetail.
     *
     * @return physicalPackagingType
     */
    public PhysicalPackagingType getPhysicalPackagingType() {
        return physicalPackagingType;
    }


    /**
     * Sets the physicalPackagingType value for this TrackDetail.
     *
     * @param physicalPackagingType
     */
    public void setPhysicalPackagingType(PhysicalPackagingType physicalPackagingType) {
        this.physicalPackagingType = physicalPackagingType;
    }


    /**
     * Gets the packageSequenceNumber value for this TrackDetail.
     *
     * @return packageSequenceNumber   * The sequence number of this package in a shipment. This would
     * be 2 if it was package number 2 of 4.
     */
    public org.apache.axis.types.NonNegativeInteger getPackageSequenceNumber() {
        return packageSequenceNumber;
    }


    /**
     * Sets the packageSequenceNumber value for this TrackDetail.
     *
     * @param packageSequenceNumber   * The sequence number of this package in a shipment. This would
     * be 2 if it was package number 2 of 4.
     */
    public void setPackageSequenceNumber(org.apache.axis.types.NonNegativeInteger packageSequenceNumber) {
        this.packageSequenceNumber = packageSequenceNumber;
    }


    /**
     * Gets the packageCount value for this TrackDetail.
     *
     * @return packageCount   * The number of packages in this shipment.
     */
    public org.apache.axis.types.NonNegativeInteger getPackageCount() {
        return packageCount;
    }


    /**
     * Sets the packageCount value for this TrackDetail.
     *
     * @param packageCount   * The number of packages in this shipment.
     */
    public void setPackageCount(org.apache.axis.types.NonNegativeInteger packageCount) {
        this.packageCount = packageCount;
    }


    /**
     * Gets the creatorSoftwareId value for this TrackDetail.
     *
     * @return creatorSoftwareId   * FOR FEDEX INTERNAL USE ONLY: Specifies the software id of the
     * device that was used to create this tracked shipment.
     */
    public java.lang.String getCreatorSoftwareId() {
        return creatorSoftwareId;
    }


    /**
     * Sets the creatorSoftwareId value for this TrackDetail.
     *
     * @param creatorSoftwareId   * FOR FEDEX INTERNAL USE ONLY: Specifies the software id of the
     * device that was used to create this tracked shipment.
     */
    public void setCreatorSoftwareId(java.lang.String creatorSoftwareId) {
        this.creatorSoftwareId = creatorSoftwareId;
    }


    /**
     * Gets the charges value for this TrackDetail.
     *
     * @return charges   * Specifies the details about the SPOC details.
     */
    public TrackChargeDetail[] getCharges() {
        return charges;
    }


    /**
     * Sets the charges value for this TrackDetail.
     *
     * @param charges   * Specifies the details about the SPOC details.
     */
    public void setCharges(TrackChargeDetail[] charges) {
        this.charges = charges;
    }

    public TrackChargeDetail getCharges(int i) {
        return this.charges[i];
    }

    public void setCharges(int i, TrackChargeDetail _value) {
        this.charges[i] = _value;
    }


    /**
     * Gets the nickName value for this TrackDetail.
     *
     * @return nickName
     */
    public java.lang.String getNickName() {
        return nickName;
    }


    /**
     * Sets the nickName value for this TrackDetail.
     *
     * @param nickName
     */
    public void setNickName(java.lang.String nickName) {
        this.nickName = nickName;
    }


    /**
     * Gets the notes value for this TrackDetail.
     *
     * @return notes
     */
    public java.lang.String getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this TrackDetail.
     *
     * @param notes
     */
    public void setNotes(java.lang.String notes) {
        this.notes = notes;
    }


    /**
     * Gets the attributes value for this TrackDetail.
     *
     * @return attributes
     */
    public TrackDetailAttributeType[] getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this TrackDetail.
     *
     * @param attributes
     */
    public void setAttributes(TrackDetailAttributeType[] attributes) {
        this.attributes = attributes;
    }

    public TrackDetailAttributeType getAttributes(int i) {
        return this.attributes[i];
    }

    public void setAttributes(int i, TrackDetailAttributeType _value) {
        this.attributes[i] = _value;
    }


    /**
     * Gets the shipmentContents value for this TrackDetail.
     *
     * @return shipmentContents
     */
    public ContentRecord[] getShipmentContents() {
        return shipmentContents;
    }


    /**
     * Sets the shipmentContents value for this TrackDetail.
     *
     * @param shipmentContents
     */
    public void setShipmentContents(ContentRecord[] shipmentContents) {
        this.shipmentContents = shipmentContents;
    }

    public ContentRecord getShipmentContents(int i) {
        return this.shipmentContents[i];
    }

    public void setShipmentContents(int i, ContentRecord _value) {
        this.shipmentContents[i] = _value;
    }


    /**
     * Gets the packageContents value for this TrackDetail.
     *
     * @return packageContents
     */
    public java.lang.String[] getPackageContents() {
        return packageContents;
    }


    /**
     * Sets the packageContents value for this TrackDetail.
     *
     * @param packageContents
     */
    public void setPackageContents(java.lang.String[] packageContents) {
        this.packageContents = packageContents;
    }

    public java.lang.String getPackageContents(int i) {
        return this.packageContents[i];
    }

    public void setPackageContents(int i, java.lang.String _value) {
        this.packageContents[i] = _value;
    }


    /**
     * Gets the clearanceLocationCode value for this TrackDetail.
     *
     * @return clearanceLocationCode
     */
    public java.lang.String getClearanceLocationCode() {
        return clearanceLocationCode;
    }


    /**
     * Sets the clearanceLocationCode value for this TrackDetail.
     *
     * @param clearanceLocationCode
     */
    public void setClearanceLocationCode(java.lang.String clearanceLocationCode) {
        this.clearanceLocationCode = clearanceLocationCode;
    }


    /**
     * Gets the commodities value for this TrackDetail.
     *
     * @return commodities
     */
    public Commodity[] getCommodities() {
        return commodities;
    }


    /**
     * Sets the commodities value for this TrackDetail.
     *
     * @param commodities
     */
    public void setCommodities(Commodity[] commodities) {
        this.commodities = commodities;
    }

    public Commodity getCommodities(int i) {
        return this.commodities[i];
    }

    public void setCommodities(int i, Commodity _value) {
        this.commodities[i] = _value;
    }


    /**
     * Gets the returnDetail value for this TrackDetail.
     *
     * @return returnDetail
     */
    public TrackReturnDetail getReturnDetail() {
        return returnDetail;
    }


    /**
     * Sets the returnDetail value for this TrackDetail.
     *
     * @param returnDetail
     */
    public void setReturnDetail(TrackReturnDetail returnDetail) {
        this.returnDetail = returnDetail;
    }


    /**
     * Gets the customsOptionDetails value for this TrackDetail.
     *
     * @return customsOptionDetails   * Specifies the reason for return.
     */
    public CustomsOptionDetail[] getCustomsOptionDetails() {
        return customsOptionDetails;
    }


    /**
     * Sets the customsOptionDetails value for this TrackDetail.
     *
     * @param customsOptionDetails   * Specifies the reason for return.
     */
    public void setCustomsOptionDetails(CustomsOptionDetail[] customsOptionDetails) {
        this.customsOptionDetails = customsOptionDetails;
    }

    public CustomsOptionDetail getCustomsOptionDetails(int i) {
        return this.customsOptionDetails[i];
    }

    public void setCustomsOptionDetails(int i, CustomsOptionDetail _value) {
        this.customsOptionDetails[i] = _value;
    }


    /**
     * Gets the advanceNotificationDetail value for this TrackDetail.
     *
     * @return advanceNotificationDetail
     */
    public TrackAdvanceNotificationDetail getAdvanceNotificationDetail() {
        return advanceNotificationDetail;
    }


    /**
     * Sets the advanceNotificationDetail value for this TrackDetail.
     *
     * @param advanceNotificationDetail
     */
    public void setAdvanceNotificationDetail(TrackAdvanceNotificationDetail advanceNotificationDetail) {
        this.advanceNotificationDetail = advanceNotificationDetail;
    }


    /**
     * Gets the specialHandlings value for this TrackDetail.
     *
     * @return specialHandlings   * List of special handlings that applied to this package.
     */
    public TrackSpecialHandling[] getSpecialHandlings() {
        return specialHandlings;
    }


    /**
     * Sets the specialHandlings value for this TrackDetail.
     *
     * @param specialHandlings   * List of special handlings that applied to this package.
     */
    public void setSpecialHandlings(TrackSpecialHandling[] specialHandlings) {
        this.specialHandlings = specialHandlings;
    }

    public TrackSpecialHandling getSpecialHandlings(int i) {
        return this.specialHandlings[i];
    }

    public void setSpecialHandlings(int i, TrackSpecialHandling _value) {
        this.specialHandlings[i] = _value;
    }


    /**
     * Gets the payments value for this TrackDetail.
     *
     * @return payments   * Specifies the details about the payments for the shipment being
     * tracked.
     */
    public TrackPayment[] getPayments() {
        return payments;
    }


    /**
     * Sets the payments value for this TrackDetail.
     *
     * @param payments   * Specifies the details about the payments for the shipment being
     * tracked.
     */
    public void setPayments(TrackPayment[] payments) {
        this.payments = payments;
    }

    public TrackPayment getPayments(int i) {
        return this.payments[i];
    }

    public void setPayments(int i, TrackPayment _value) {
        this.payments[i] = _value;
    }


    /**
     * Gets the shipper value for this TrackDetail.
     *
     * @return shipper   * (Returned for CSR SL only.)
     */
    public Contact getShipper() {
        return shipper;
    }


    /**
     * Sets the shipper value for this TrackDetail.
     *
     * @param shipper   * (Returned for CSR SL only.)
     */
    public void setShipper(Contact shipper) {
        this.shipper = shipper;
    }


    /**
     * Gets the possessionStatus value for this TrackDetail.
     *
     * @return possessionStatus   * Indicates last-known possession of package (Returned for CSR
     * SL only.)
     */
    public TrackPossessionStatusType getPossessionStatus() {
        return possessionStatus;
    }


    /**
     * Sets the possessionStatus value for this TrackDetail.
     *
     * @param possessionStatus   * Indicates last-known possession of package (Returned for CSR
     * SL only.)
     */
    public void setPossessionStatus(TrackPossessionStatusType possessionStatus) {
        this.possessionStatus = possessionStatus;
    }


    /**
     * Gets the shipperAddress value for this TrackDetail.
     *
     * @return shipperAddress
     */
    public Address getShipperAddress() {
        return shipperAddress;
    }


    /**
     * Sets the shipperAddress value for this TrackDetail.
     *
     * @param shipperAddress
     */
    public void setShipperAddress(Address shipperAddress) {
        this.shipperAddress = shipperAddress;
    }


    /**
     * Gets the originLocationAddress value for this TrackDetail.
     *
     * @return originLocationAddress   * The address of the FedEx pickup location/facility.
     */
    public Address getOriginLocationAddress() {
        return originLocationAddress;
    }


    /**
     * Sets the originLocationAddress value for this TrackDetail.
     *
     * @param originLocationAddress   * The address of the FedEx pickup location/facility.
     */
    public void setOriginLocationAddress(Address originLocationAddress) {
        this.originLocationAddress = originLocationAddress;
    }


    /**
     * Gets the originStationId value for this TrackDetail.
     *
     * @return originStationId   * (Returned for CSR SL only.)
     */
    public java.lang.String getOriginStationId() {
        return originStationId;
    }


    /**
     * Sets the originStationId value for this TrackDetail.
     *
     * @param originStationId   * (Returned for CSR SL only.)
     */
    public void setOriginStationId(java.lang.String originStationId) {
        this.originStationId = originStationId;
    }


    /**
     * Gets the datesOrTimes value for this TrackDetail.
     *
     * @return datesOrTimes
     */
    public TrackingDateOrTimestamp[] getDatesOrTimes() {
        return datesOrTimes;
    }


    /**
     * Sets the datesOrTimes value for this TrackDetail.
     *
     * @param datesOrTimes
     */
    public void setDatesOrTimes(TrackingDateOrTimestamp[] datesOrTimes) {
        this.datesOrTimes = datesOrTimes;
    }

    public TrackingDateOrTimestamp getDatesOrTimes(int i) {
        return this.datesOrTimes[i];
    }

    public void setDatesOrTimes(int i, TrackingDateOrTimestamp _value) {
        this.datesOrTimes[i] = _value;
    }


    /**
     * Gets the totalTransitDistance value for this TrackDetail.
     *
     * @return totalTransitDistance   * The distance from the origin to the destination. Returned for
     * Custom Critical shipments.
     */
    public Distance getTotalTransitDistance() {
        return totalTransitDistance;
    }


    /**
     * Sets the totalTransitDistance value for this TrackDetail.
     *
     * @param totalTransitDistance   * The distance from the origin to the destination. Returned for
     * Custom Critical shipments.
     */
    public void setTotalTransitDistance(Distance totalTransitDistance) {
        this.totalTransitDistance = totalTransitDistance;
    }


    /**
     * Gets the distanceToDestination value for this TrackDetail.
     *
     * @return distanceToDestination   * Total distance package still has to travel. Returned for Custom
     * Critical shipments.
     */
    public Distance getDistanceToDestination() {
        return distanceToDestination;
    }


    /**
     * Sets the distanceToDestination value for this TrackDetail.
     *
     * @param distanceToDestination   * Total distance package still has to travel. Returned for Custom
     * Critical shipments.
     */
    public void setDistanceToDestination(Distance distanceToDestination) {
        this.distanceToDestination = distanceToDestination;
    }


    /**
     * Gets the specialInstructions value for this TrackDetail.
     *
     * @return specialInstructions   * Provides additional details about package delivery.
     */
    public TrackSpecialInstruction[] getSpecialInstructions() {
        return specialInstructions;
    }


    /**
     * Sets the specialInstructions value for this TrackDetail.
     *
     * @param specialInstructions   * Provides additional details about package delivery.
     */
    public void setSpecialInstructions(TrackSpecialInstruction[] specialInstructions) {
        this.specialInstructions = specialInstructions;
    }

    public TrackSpecialInstruction getSpecialInstructions(int i) {
        return this.specialInstructions[i];
    }

    public void setSpecialInstructions(int i, TrackSpecialInstruction _value) {
        this.specialInstructions[i] = _value;
    }


    /**
     * Gets the recipient value for this TrackDetail.
     *
     * @return recipient   * (Returned for CSR SL only.)
     */
    public Contact getRecipient() {
        return recipient;
    }


    /**
     * Sets the recipient value for this TrackDetail.
     *
     * @param recipient   * (Returned for CSR SL only.)
     */
    public void setRecipient(Contact recipient) {
        this.recipient = recipient;
    }


    /**
     * Gets the lastUpdatedDestinationAddress value for this TrackDetail.
     *
     * @return lastUpdatedDestinationAddress   * This is the latest updated destination address.
     */
    public Address getLastUpdatedDestinationAddress() {
        return lastUpdatedDestinationAddress;
    }


    /**
     * Sets the lastUpdatedDestinationAddress value for this TrackDetail.
     *
     * @param lastUpdatedDestinationAddress   * This is the latest updated destination address.
     */
    public void setLastUpdatedDestinationAddress(Address lastUpdatedDestinationAddress) {
        this.lastUpdatedDestinationAddress = lastUpdatedDestinationAddress;
    }


    /**
     * Gets the destinationAddress value for this TrackDetail.
     *
     * @return destinationAddress   * The address this package is to be (or has been) delivered.
     */
    public Address getDestinationAddress() {
        return destinationAddress;
    }


    /**
     * Sets the destinationAddress value for this TrackDetail.
     *
     * @param destinationAddress   * The address this package is to be (or has been) delivered.
     */
    public void setDestinationAddress(Address destinationAddress) {
        this.destinationAddress = destinationAddress;
    }


    /**
     * Gets the holdAtLocationContact value for this TrackDetail.
     *
     * @return holdAtLocationContact
     */
    public Contact getHoldAtLocationContact() {
        return holdAtLocationContact;
    }


    /**
     * Sets the holdAtLocationContact value for this TrackDetail.
     *
     * @param holdAtLocationContact
     */
    public void setHoldAtLocationContact(Contact holdAtLocationContact) {
        this.holdAtLocationContact = holdAtLocationContact;
    }


    /**
     * Gets the holdAtLocationAddress value for this TrackDetail.
     *
     * @return holdAtLocationAddress   * The address this package is requested to placed on hold.
     */
    public Address getHoldAtLocationAddress() {
        return holdAtLocationAddress;
    }


    /**
     * Sets the holdAtLocationAddress value for this TrackDetail.
     *
     * @param holdAtLocationAddress   * The address this package is requested to placed on hold.
     */
    public void setHoldAtLocationAddress(Address holdAtLocationAddress) {
        this.holdAtLocationAddress = holdAtLocationAddress;
    }


    /**
     * Gets the destinationStationId value for this TrackDetail.
     *
     * @return destinationStationId   * (Returned for CSR SL only.)
     */
    public java.lang.String getDestinationStationId() {
        return destinationStationId;
    }


    /**
     * Sets the destinationStationId value for this TrackDetail.
     *
     * @param destinationStationId   * (Returned for CSR SL only.)
     */
    public void setDestinationStationId(java.lang.String destinationStationId) {
        this.destinationStationId = destinationStationId;
    }


    /**
     * Gets the destinationLocationAddress value for this TrackDetail.
     *
     * @return destinationLocationAddress   * The address of the FedEx delivery location/facility.
     */
    public Address getDestinationLocationAddress() {
        return destinationLocationAddress;
    }


    /**
     * Sets the destinationLocationAddress value for this TrackDetail.
     *
     * @param destinationLocationAddress   * The address of the FedEx delivery location/facility.
     */
    public void setDestinationLocationAddress(Address destinationLocationAddress) {
        this.destinationLocationAddress = destinationLocationAddress;
    }


    /**
     * Gets the destinationLocationType value for this TrackDetail.
     *
     * @return destinationLocationType
     */
    public FedExLocationType getDestinationLocationType() {
        return destinationLocationType;
    }


    /**
     * Sets the destinationLocationType value for this TrackDetail.
     *
     * @param destinationLocationType
     */
    public void setDestinationLocationType(FedExLocationType destinationLocationType) {
        this.destinationLocationType = destinationLocationType;
    }


    /**
     * Gets the destinationLocationTimeZoneOffset value for this TrackDetail.
     *
     * @return destinationLocationTimeZoneOffset
     */
    public java.lang.String getDestinationLocationTimeZoneOffset() {
        return destinationLocationTimeZoneOffset;
    }


    /**
     * Sets the destinationLocationTimeZoneOffset value for this TrackDetail.
     *
     * @param destinationLocationTimeZoneOffset
     */
    public void setDestinationLocationTimeZoneOffset(java.lang.String destinationLocationTimeZoneOffset) {
        this.destinationLocationTimeZoneOffset = destinationLocationTimeZoneOffset;
    }


    /**
     * Gets the actualDeliveryAddress value for this TrackDetail.
     *
     * @return actualDeliveryAddress   * Actual address where package was delivered. Differs from destinationAddress,
     * which indicates where the package was to be delivered; This field
     * tells where delivery actually occurred (next door, at station, etc.)
     */
    public Address getActualDeliveryAddress() {
        return actualDeliveryAddress;
    }


    /**
     * Sets the actualDeliveryAddress value for this TrackDetail.
     *
     * @param actualDeliveryAddress   * Actual address where package was delivered. Differs from destinationAddress,
     * which indicates where the package was to be delivered; This field
     * tells where delivery actually occurred (next door, at station, etc.)
     */
    public void setActualDeliveryAddress(Address actualDeliveryAddress) {
        this.actualDeliveryAddress = actualDeliveryAddress;
    }


    /**
     * Gets the officeOrderDeliveryMethod value for this TrackDetail.
     *
     * @return officeOrderDeliveryMethod   * Identifies the method of office order delivery.
     */
    public OfficeOrderDeliveryMethodType getOfficeOrderDeliveryMethod() {
        return officeOrderDeliveryMethod;
    }


    /**
     * Sets the officeOrderDeliveryMethod value for this TrackDetail.
     *
     * @param officeOrderDeliveryMethod   * Identifies the method of office order delivery.
     */
    public void setOfficeOrderDeliveryMethod(OfficeOrderDeliveryMethodType officeOrderDeliveryMethod) {
        this.officeOrderDeliveryMethod = officeOrderDeliveryMethod;
    }


    /**
     * Gets the deliveryLocationType value for this TrackDetail.
     *
     * @return deliveryLocationType   * Strict text indicating the delivery location at the delivered
     * to address.
     */
    public TrackDeliveryLocationType getDeliveryLocationType() {
        return deliveryLocationType;
    }


    /**
     * Sets the deliveryLocationType value for this TrackDetail.
     *
     * @param deliveryLocationType   * Strict text indicating the delivery location at the delivered
     * to address.
     */
    public void setDeliveryLocationType(TrackDeliveryLocationType deliveryLocationType) {
        this.deliveryLocationType = deliveryLocationType;
    }


    /**
     * Gets the deliveryLocationDescription value for this TrackDetail.
     *
     * @return deliveryLocationDescription   * User/screen friendly representation of the DeliveryLocationType
     * (delivery location at the delivered to address). Can be returned in
     * localized text.
     */
    public java.lang.String getDeliveryLocationDescription() {
        return deliveryLocationDescription;
    }


    /**
     * Sets the deliveryLocationDescription value for this TrackDetail.
     *
     * @param deliveryLocationDescription   * User/screen friendly representation of the DeliveryLocationType
     * (delivery location at the delivered to address). Can be returned in
     * localized text.
     */
    public void setDeliveryLocationDescription(java.lang.String deliveryLocationDescription) {
        this.deliveryLocationDescription = deliveryLocationDescription;
    }


    /**
     * Gets the deliveryAttempts value for this TrackDetail.
     *
     * @return deliveryAttempts   * Specifies the number of delivery attempts made to deliver the
     * shipment.
     */
    public org.apache.axis.types.NonNegativeInteger getDeliveryAttempts() {
        return deliveryAttempts;
    }


    /**
     * Sets the deliveryAttempts value for this TrackDetail.
     *
     * @param deliveryAttempts   * Specifies the number of delivery attempts made to deliver the
     * shipment.
     */
    public void setDeliveryAttempts(org.apache.axis.types.NonNegativeInteger deliveryAttempts) {
        this.deliveryAttempts = deliveryAttempts;
    }


    /**
     * Gets the deliverySignatureName value for this TrackDetail.
     *
     * @return deliverySignatureName   * This is either the name of the person that signed for the package
     * or "Signature not requested" or "Signature on file".
     */
    public java.lang.String getDeliverySignatureName() {
        return deliverySignatureName;
    }


    /**
     * Sets the deliverySignatureName value for this TrackDetail.
     *
     * @param deliverySignatureName   * This is either the name of the person that signed for the package
     * or "Signature not requested" or "Signature on file".
     */
    public void setDeliverySignatureName(java.lang.String deliverySignatureName) {
        this.deliverySignatureName = deliverySignatureName;
    }


    /**
     * Gets the pieceCountVerificationDetails value for this TrackDetail.
     *
     * @return pieceCountVerificationDetails   * Specifies the details about the count of the packages delivered
     * at the delivery location and the count of the packages at the origin.
     */
    public PieceCountVerificationDetail[] getPieceCountVerificationDetails() {
        return pieceCountVerificationDetails;
    }


    /**
     * Sets the pieceCountVerificationDetails value for this TrackDetail.
     *
     * @param pieceCountVerificationDetails   * Specifies the details about the count of the packages delivered
     * at the delivery location and the count of the packages at the origin.
     */
    public void setPieceCountVerificationDetails(PieceCountVerificationDetail[] pieceCountVerificationDetails) {
        this.pieceCountVerificationDetails = pieceCountVerificationDetails;
    }

    public PieceCountVerificationDetail getPieceCountVerificationDetails(int i) {
        return this.pieceCountVerificationDetails[i];
    }

    public void setPieceCountVerificationDetails(int i, PieceCountVerificationDetail _value) {
        this.pieceCountVerificationDetails[i] = _value;
    }


    /**
     * Gets the totalUniqueAddressCountInConsolidation value for this TrackDetail.
     *
     * @return totalUniqueAddressCountInConsolidation   * Specifies the total number of unique addresses on the CRNs
     * in a consolidation.
     */
    public org.apache.axis.types.NonNegativeInteger getTotalUniqueAddressCountInConsolidation() {
        return totalUniqueAddressCountInConsolidation;
    }


    /**
     * Sets the totalUniqueAddressCountInConsolidation value for this TrackDetail.
     *
     * @param totalUniqueAddressCountInConsolidation   * Specifies the total number of unique addresses on the CRNs
     * in a consolidation.
     */
    public void setTotalUniqueAddressCountInConsolidation(org.apache.axis.types.NonNegativeInteger totalUniqueAddressCountInConsolidation) {
        this.totalUniqueAddressCountInConsolidation = totalUniqueAddressCountInConsolidation;
    }


    /**
     * Gets the availableImages value for this TrackDetail.
     *
     * @return availableImages
     */
    public AvailableImagesDetail[] getAvailableImages() {
        return availableImages;
    }


    /**
     * Sets the availableImages value for this TrackDetail.
     *
     * @param availableImages
     */
    public void setAvailableImages(AvailableImagesDetail[] availableImages) {
        this.availableImages = availableImages;
    }

    public AvailableImagesDetail getAvailableImages(int i) {
        return this.availableImages[i];
    }

    public void setAvailableImages(int i, AvailableImagesDetail _value) {
        this.availableImages[i] = _value;
    }


    /**
     * Gets the signature value for this TrackDetail.
     *
     * @return signature
     */
    public SignatureImageDetail getSignature() {
        return signature;
    }


    /**
     * Sets the signature value for this TrackDetail.
     *
     * @param signature
     */
    public void setSignature(SignatureImageDetail signature) {
        this.signature = signature;
    }


    /**
     * Gets the notificationEventsAvailable value for this TrackDetail.
     *
     * @return notificationEventsAvailable
     */
    public NotificationEventType[] getNotificationEventsAvailable() {
        return notificationEventsAvailable;
    }


    /**
     * Sets the notificationEventsAvailable value for this TrackDetail.
     *
     * @param notificationEventsAvailable
     */
    public void setNotificationEventsAvailable(NotificationEventType[] notificationEventsAvailable) {
        this.notificationEventsAvailable = notificationEventsAvailable;
    }

    public NotificationEventType getNotificationEventsAvailable(int i) {
        return this.notificationEventsAvailable[i];
    }

    public void setNotificationEventsAvailable(int i, NotificationEventType _value) {
        this.notificationEventsAvailable[i] = _value;
    }


    /**
     * Gets the splitShipmentParts value for this TrackDetail.
     *
     * @return splitShipmentParts   * Returned for cargo shipments only when they are currently split
     * across vehicles.
     */
    public TrackSplitShipmentPart[] getSplitShipmentParts() {
        return splitShipmentParts;
    }


    /**
     * Sets the splitShipmentParts value for this TrackDetail.
     *
     * @param splitShipmentParts   * Returned for cargo shipments only when they are currently split
     * across vehicles.
     */
    public void setSplitShipmentParts(TrackSplitShipmentPart[] splitShipmentParts) {
        this.splitShipmentParts = splitShipmentParts;
    }

    public TrackSplitShipmentPart getSplitShipmentParts(int i) {
        return this.splitShipmentParts[i];
    }

    public void setSplitShipmentParts(int i, TrackSplitShipmentPart _value) {
        this.splitShipmentParts[i] = _value;
    }


    /**
     * Gets the deliveryOptionEligibilityDetails value for this TrackDetail.
     *
     * @return deliveryOptionEligibilityDetails   * Specifies the details about the eligibility for different delivery
     * options.
     */
    public DeliveryOptionEligibilityDetail[] getDeliveryOptionEligibilityDetails() {
        return deliveryOptionEligibilityDetails;
    }


    /**
     * Sets the deliveryOptionEligibilityDetails value for this TrackDetail.
     *
     * @param deliveryOptionEligibilityDetails   * Specifies the details about the eligibility for different delivery
     * options.
     */
    public void setDeliveryOptionEligibilityDetails(DeliveryOptionEligibilityDetail[] deliveryOptionEligibilityDetails) {
        this.deliveryOptionEligibilityDetails = deliveryOptionEligibilityDetails;
    }

    public DeliveryOptionEligibilityDetail getDeliveryOptionEligibilityDetails(int i) {
        return this.deliveryOptionEligibilityDetails[i];
    }

    public void setDeliveryOptionEligibilityDetails(int i, DeliveryOptionEligibilityDetail _value) {
        this.deliveryOptionEligibilityDetails[i] = _value;
    }


    /**
     * Gets the events value for this TrackDetail.
     *
     * @return events   * Event information for a tracking number.
     */
    public TrackEvent[] getEvents() {
        return events;
    }


    /**
     * Sets the events value for this TrackDetail.
     *
     * @param events   * Event information for a tracking number.
     */
    public void setEvents(TrackEvent[] events) {
        this.events = events;
    }

    public TrackEvent getEvents(int i) {
        return this.events[i];
    }

    public void setEvents(int i, TrackEvent _value) {
        this.events[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TrackDetail)) return false;
        TrackDetail other = (TrackDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
            ((this.notification==null && other.getNotification()==null) ||
             (this.notification!=null &&
              this.notification.equals(other.getNotification()))) &&
            ((this.trackingNumber==null && other.getTrackingNumber()==null) ||
             (this.trackingNumber!=null &&
              this.trackingNumber.equals(other.getTrackingNumber()))) &&
            ((this.barcode==null && other.getBarcode()==null) ||
             (this.barcode!=null &&
              this.barcode.equals(other.getBarcode()))) &&
            ((this.trackingNumberUniqueIdentifier==null && other.getTrackingNumberUniqueIdentifier()==null) ||
             (this.trackingNumberUniqueIdentifier!=null &&
              this.trackingNumberUniqueIdentifier.equals(other.getTrackingNumberUniqueIdentifier()))) &&
            ((this.statusDetail==null && other.getStatusDetail()==null) ||
             (this.statusDetail!=null &&
              this.statusDetail.equals(other.getStatusDetail()))) &&
            ((this.informationNotes==null && other.getInformationNotes()==null) ||
             (this.informationNotes!=null &&
              java.util.Arrays.equals(this.informationNotes, other.getInformationNotes()))) &&
            ((this.customerExceptionRequests==null && other.getCustomerExceptionRequests()==null) ||
             (this.customerExceptionRequests!=null &&
              java.util.Arrays.equals(this.customerExceptionRequests, other.getCustomerExceptionRequests()))) &&
            ((this.reconciliation==null && other.getReconciliation()==null) ||
             (this.reconciliation!=null &&
              this.reconciliation.equals(other.getReconciliation()))) &&
            ((this.serviceCommitMessage==null && other.getServiceCommitMessage()==null) ||
             (this.serviceCommitMessage!=null &&
              this.serviceCommitMessage.equals(other.getServiceCommitMessage()))) &&
            ((this.destinationServiceArea==null && other.getDestinationServiceArea()==null) ||
             (this.destinationServiceArea!=null &&
              this.destinationServiceArea.equals(other.getDestinationServiceArea()))) &&
            ((this.destinationServiceAreaDescription==null && other.getDestinationServiceAreaDescription()==null) ||
             (this.destinationServiceAreaDescription!=null &&
              this.destinationServiceAreaDescription.equals(other.getDestinationServiceAreaDescription()))) &&
            ((this.carrierCode==null && other.getCarrierCode()==null) ||
             (this.carrierCode!=null &&
              this.carrierCode.equals(other.getCarrierCode()))) &&
            ((this.operatingCompany==null && other.getOperatingCompany()==null) ||
             (this.operatingCompany!=null &&
              this.operatingCompany.equals(other.getOperatingCompany()))) &&
            ((this.operatingCompanyOrCarrierDescription==null && other.getOperatingCompanyOrCarrierDescription()==null) ||
             (this.operatingCompanyOrCarrierDescription!=null &&
              this.operatingCompanyOrCarrierDescription.equals(other.getOperatingCompanyOrCarrierDescription()))) &&
            ((this.cartageAgentCompanyName==null && other.getCartageAgentCompanyName()==null) ||
             (this.cartageAgentCompanyName!=null &&
              this.cartageAgentCompanyName.equals(other.getCartageAgentCompanyName()))) &&
            ((this.productionLocationContactAndAddress==null && other.getProductionLocationContactAndAddress()==null) ||
             (this.productionLocationContactAndAddress!=null &&
              this.productionLocationContactAndAddress.equals(other.getProductionLocationContactAndAddress()))) &&
            ((this.otherIdentifiers==null && other.getOtherIdentifiers()==null) ||
             (this.otherIdentifiers!=null &&
              java.util.Arrays.equals(this.otherIdentifiers, other.getOtherIdentifiers()))) &&
            ((this.formId==null && other.getFormId()==null) ||
             (this.formId!=null &&
              this.formId.equals(other.getFormId()))) &&
            ((this.service==null && other.getService()==null) ||
             (this.service!=null &&
              this.service.equals(other.getService()))) &&
            ((this.packageWeight==null && other.getPackageWeight()==null) ||
             (this.packageWeight!=null &&
              this.packageWeight.equals(other.getPackageWeight()))) &&
            ((this.packageDimensions==null && other.getPackageDimensions()==null) ||
             (this.packageDimensions!=null &&
              this.packageDimensions.equals(other.getPackageDimensions()))) &&
            ((this.packageDimensionalWeight==null && other.getPackageDimensionalWeight()==null) ||
             (this.packageDimensionalWeight!=null &&
              this.packageDimensionalWeight.equals(other.getPackageDimensionalWeight()))) &&
            ((this.shipmentWeight==null && other.getShipmentWeight()==null) ||
             (this.shipmentWeight!=null &&
              this.shipmentWeight.equals(other.getShipmentWeight()))) &&
            ((this.packaging==null && other.getPackaging()==null) ||
             (this.packaging!=null &&
              this.packaging.equals(other.getPackaging()))) &&
            ((this.packagingType==null && other.getPackagingType()==null) ||
             (this.packagingType!=null &&
              this.packagingType.equals(other.getPackagingType()))) &&
            ((this.physicalPackagingType==null && other.getPhysicalPackagingType()==null) ||
             (this.physicalPackagingType!=null &&
              this.physicalPackagingType.equals(other.getPhysicalPackagingType()))) &&
            ((this.packageSequenceNumber==null && other.getPackageSequenceNumber()==null) ||
             (this.packageSequenceNumber!=null &&
              this.packageSequenceNumber.equals(other.getPackageSequenceNumber()))) &&
            ((this.packageCount==null && other.getPackageCount()==null) ||
             (this.packageCount!=null &&
              this.packageCount.equals(other.getPackageCount()))) &&
            ((this.creatorSoftwareId==null && other.getCreatorSoftwareId()==null) ||
             (this.creatorSoftwareId!=null &&
              this.creatorSoftwareId.equals(other.getCreatorSoftwareId()))) &&
            ((this.charges==null && other.getCharges()==null) ||
             (this.charges!=null &&
              java.util.Arrays.equals(this.charges, other.getCharges()))) &&
            ((this.nickName==null && other.getNickName()==null) ||
             (this.nickName!=null &&
              this.nickName.equals(other.getNickName()))) &&
            ((this.notes==null && other.getNotes()==null) ||
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.attributes==null && other.getAttributes()==null) ||
             (this.attributes!=null &&
              java.util.Arrays.equals(this.attributes, other.getAttributes()))) &&
            ((this.shipmentContents==null && other.getShipmentContents()==null) ||
             (this.shipmentContents!=null &&
              java.util.Arrays.equals(this.shipmentContents, other.getShipmentContents()))) &&
            ((this.packageContents==null && other.getPackageContents()==null) ||
             (this.packageContents!=null &&
              java.util.Arrays.equals(this.packageContents, other.getPackageContents()))) &&
            ((this.clearanceLocationCode==null && other.getClearanceLocationCode()==null) ||
             (this.clearanceLocationCode!=null &&
              this.clearanceLocationCode.equals(other.getClearanceLocationCode()))) &&
            ((this.commodities==null && other.getCommodities()==null) ||
             (this.commodities!=null &&
              java.util.Arrays.equals(this.commodities, other.getCommodities()))) &&
            ((this.returnDetail==null && other.getReturnDetail()==null) ||
             (this.returnDetail!=null &&
              this.returnDetail.equals(other.getReturnDetail()))) &&
            ((this.customsOptionDetails==null && other.getCustomsOptionDetails()==null) ||
             (this.customsOptionDetails!=null &&
              java.util.Arrays.equals(this.customsOptionDetails, other.getCustomsOptionDetails()))) &&
            ((this.advanceNotificationDetail==null && other.getAdvanceNotificationDetail()==null) ||
             (this.advanceNotificationDetail!=null &&
              this.advanceNotificationDetail.equals(other.getAdvanceNotificationDetail()))) &&
            ((this.specialHandlings==null && other.getSpecialHandlings()==null) ||
             (this.specialHandlings!=null &&
              java.util.Arrays.equals(this.specialHandlings, other.getSpecialHandlings()))) &&
            ((this.payments==null && other.getPayments()==null) ||
             (this.payments!=null &&
              java.util.Arrays.equals(this.payments, other.getPayments()))) &&
            ((this.shipper==null && other.getShipper()==null) ||
             (this.shipper!=null &&
              this.shipper.equals(other.getShipper()))) &&
            ((this.possessionStatus==null && other.getPossessionStatus()==null) ||
             (this.possessionStatus!=null &&
              this.possessionStatus.equals(other.getPossessionStatus()))) &&
            ((this.shipperAddress==null && other.getShipperAddress()==null) ||
             (this.shipperAddress!=null &&
              this.shipperAddress.equals(other.getShipperAddress()))) &&
            ((this.originLocationAddress==null && other.getOriginLocationAddress()==null) ||
             (this.originLocationAddress!=null &&
              this.originLocationAddress.equals(other.getOriginLocationAddress()))) &&
            ((this.originStationId==null && other.getOriginStationId()==null) ||
             (this.originStationId!=null &&
              this.originStationId.equals(other.getOriginStationId()))) &&
            ((this.datesOrTimes==null && other.getDatesOrTimes()==null) ||
             (this.datesOrTimes!=null &&
              java.util.Arrays.equals(this.datesOrTimes, other.getDatesOrTimes()))) &&
            ((this.totalTransitDistance==null && other.getTotalTransitDistance()==null) ||
             (this.totalTransitDistance!=null &&
              this.totalTransitDistance.equals(other.getTotalTransitDistance()))) &&
            ((this.distanceToDestination==null && other.getDistanceToDestination()==null) ||
             (this.distanceToDestination!=null &&
              this.distanceToDestination.equals(other.getDistanceToDestination()))) &&
            ((this.specialInstructions==null && other.getSpecialInstructions()==null) ||
             (this.specialInstructions!=null &&
              java.util.Arrays.equals(this.specialInstructions, other.getSpecialInstructions()))) &&
            ((this.recipient==null && other.getRecipient()==null) ||
             (this.recipient!=null &&
              this.recipient.equals(other.getRecipient()))) &&
            ((this.lastUpdatedDestinationAddress==null && other.getLastUpdatedDestinationAddress()==null) ||
             (this.lastUpdatedDestinationAddress!=null &&
              this.lastUpdatedDestinationAddress.equals(other.getLastUpdatedDestinationAddress()))) &&
            ((this.destinationAddress==null && other.getDestinationAddress()==null) ||
             (this.destinationAddress!=null &&
              this.destinationAddress.equals(other.getDestinationAddress()))) &&
            ((this.holdAtLocationContact==null && other.getHoldAtLocationContact()==null) ||
             (this.holdAtLocationContact!=null &&
              this.holdAtLocationContact.equals(other.getHoldAtLocationContact()))) &&
            ((this.holdAtLocationAddress==null && other.getHoldAtLocationAddress()==null) ||
             (this.holdAtLocationAddress!=null &&
              this.holdAtLocationAddress.equals(other.getHoldAtLocationAddress()))) &&
            ((this.destinationStationId==null && other.getDestinationStationId()==null) ||
             (this.destinationStationId!=null &&
              this.destinationStationId.equals(other.getDestinationStationId()))) &&
            ((this.destinationLocationAddress==null && other.getDestinationLocationAddress()==null) ||
             (this.destinationLocationAddress!=null &&
              this.destinationLocationAddress.equals(other.getDestinationLocationAddress()))) &&
            ((this.destinationLocationType==null && other.getDestinationLocationType()==null) ||
             (this.destinationLocationType!=null &&
              this.destinationLocationType.equals(other.getDestinationLocationType()))) &&
            ((this.destinationLocationTimeZoneOffset==null && other.getDestinationLocationTimeZoneOffset()==null) ||
             (this.destinationLocationTimeZoneOffset!=null &&
              this.destinationLocationTimeZoneOffset.equals(other.getDestinationLocationTimeZoneOffset()))) &&
            ((this.actualDeliveryAddress==null && other.getActualDeliveryAddress()==null) ||
             (this.actualDeliveryAddress!=null &&
              this.actualDeliveryAddress.equals(other.getActualDeliveryAddress()))) &&
            ((this.officeOrderDeliveryMethod==null && other.getOfficeOrderDeliveryMethod()==null) ||
             (this.officeOrderDeliveryMethod!=null &&
              this.officeOrderDeliveryMethod.equals(other.getOfficeOrderDeliveryMethod()))) &&
            ((this.deliveryLocationType==null && other.getDeliveryLocationType()==null) ||
             (this.deliveryLocationType!=null &&
              this.deliveryLocationType.equals(other.getDeliveryLocationType()))) &&
            ((this.deliveryLocationDescription==null && other.getDeliveryLocationDescription()==null) ||
             (this.deliveryLocationDescription!=null &&
              this.deliveryLocationDescription.equals(other.getDeliveryLocationDescription()))) &&
            ((this.deliveryAttempts==null && other.getDeliveryAttempts()==null) ||
             (this.deliveryAttempts!=null &&
              this.deliveryAttempts.equals(other.getDeliveryAttempts()))) &&
            ((this.deliverySignatureName==null && other.getDeliverySignatureName()==null) ||
             (this.deliverySignatureName!=null &&
              this.deliverySignatureName.equals(other.getDeliverySignatureName()))) &&
            ((this.pieceCountVerificationDetails==null && other.getPieceCountVerificationDetails()==null) ||
             (this.pieceCountVerificationDetails!=null &&
              java.util.Arrays.equals(this.pieceCountVerificationDetails, other.getPieceCountVerificationDetails()))) &&
            ((this.totalUniqueAddressCountInConsolidation==null && other.getTotalUniqueAddressCountInConsolidation()==null) ||
             (this.totalUniqueAddressCountInConsolidation!=null &&
              this.totalUniqueAddressCountInConsolidation.equals(other.getTotalUniqueAddressCountInConsolidation()))) &&
            ((this.availableImages==null && other.getAvailableImages()==null) ||
             (this.availableImages!=null &&
              java.util.Arrays.equals(this.availableImages, other.getAvailableImages()))) &&
            ((this.signature==null && other.getSignature()==null) ||
             (this.signature!=null &&
              this.signature.equals(other.getSignature()))) &&
            ((this.notificationEventsAvailable==null && other.getNotificationEventsAvailable()==null) ||
             (this.notificationEventsAvailable!=null &&
              java.util.Arrays.equals(this.notificationEventsAvailable, other.getNotificationEventsAvailable()))) &&
            ((this.splitShipmentParts==null && other.getSplitShipmentParts()==null) ||
             (this.splitShipmentParts!=null &&
              java.util.Arrays.equals(this.splitShipmentParts, other.getSplitShipmentParts()))) &&
            ((this.deliveryOptionEligibilityDetails==null && other.getDeliveryOptionEligibilityDetails()==null) ||
             (this.deliveryOptionEligibilityDetails!=null &&
              java.util.Arrays.equals(this.deliveryOptionEligibilityDetails, other.getDeliveryOptionEligibilityDetails()))) &&
            ((this.events==null && other.getEvents()==null) ||
             (this.events!=null &&
              java.util.Arrays.equals(this.events, other.getEvents())));
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
        if (getNotification() != null) {
            _hashCode += getNotification().hashCode();
        }
        if (getTrackingNumber() != null) {
            _hashCode += getTrackingNumber().hashCode();
        }
        if (getBarcode() != null) {
            _hashCode += getBarcode().hashCode();
        }
        if (getTrackingNumberUniqueIdentifier() != null) {
            _hashCode += getTrackingNumberUniqueIdentifier().hashCode();
        }
        if (getStatusDetail() != null) {
            _hashCode += getStatusDetail().hashCode();
        }
        if (getInformationNotes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInformationNotes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInformationNotes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCustomerExceptionRequests() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomerExceptionRequests());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomerExceptionRequests(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReconciliation() != null) {
            _hashCode += getReconciliation().hashCode();
        }
        if (getServiceCommitMessage() != null) {
            _hashCode += getServiceCommitMessage().hashCode();
        }
        if (getDestinationServiceArea() != null) {
            _hashCode += getDestinationServiceArea().hashCode();
        }
        if (getDestinationServiceAreaDescription() != null) {
            _hashCode += getDestinationServiceAreaDescription().hashCode();
        }
        if (getCarrierCode() != null) {
            _hashCode += getCarrierCode().hashCode();
        }
        if (getOperatingCompany() != null) {
            _hashCode += getOperatingCompany().hashCode();
        }
        if (getOperatingCompanyOrCarrierDescription() != null) {
            _hashCode += getOperatingCompanyOrCarrierDescription().hashCode();
        }
        if (getCartageAgentCompanyName() != null) {
            _hashCode += getCartageAgentCompanyName().hashCode();
        }
        if (getProductionLocationContactAndAddress() != null) {
            _hashCode += getProductionLocationContactAndAddress().hashCode();
        }
        if (getOtherIdentifiers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOtherIdentifiers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOtherIdentifiers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFormId() != null) {
            _hashCode += getFormId().hashCode();
        }
        if (getService() != null) {
            _hashCode += getService().hashCode();
        }
        if (getPackageWeight() != null) {
            _hashCode += getPackageWeight().hashCode();
        }
        if (getPackageDimensions() != null) {
            _hashCode += getPackageDimensions().hashCode();
        }
        if (getPackageDimensionalWeight() != null) {
            _hashCode += getPackageDimensionalWeight().hashCode();
        }
        if (getShipmentWeight() != null) {
            _hashCode += getShipmentWeight().hashCode();
        }
        if (getPackaging() != null) {
            _hashCode += getPackaging().hashCode();
        }
        if (getPackagingType() != null) {
            _hashCode += getPackagingType().hashCode();
        }
        if (getPhysicalPackagingType() != null) {
            _hashCode += getPhysicalPackagingType().hashCode();
        }
        if (getPackageSequenceNumber() != null) {
            _hashCode += getPackageSequenceNumber().hashCode();
        }
        if (getPackageCount() != null) {
            _hashCode += getPackageCount().hashCode();
        }
        if (getCreatorSoftwareId() != null) {
            _hashCode += getCreatorSoftwareId().hashCode();
        }
        if (getCharges() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCharges());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCharges(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNickName() != null) {
            _hashCode += getNickName().hashCode();
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        if (getAttributes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttributes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttributes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShipmentContents() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShipmentContents());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShipmentContents(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPackageContents() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPackageContents());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPackageContents(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getClearanceLocationCode() != null) {
            _hashCode += getClearanceLocationCode().hashCode();
        }
        if (getCommodities() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCommodities());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCommodities(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReturnDetail() != null) {
            _hashCode += getReturnDetail().hashCode();
        }
        if (getCustomsOptionDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomsOptionDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomsOptionDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAdvanceNotificationDetail() != null) {
            _hashCode += getAdvanceNotificationDetail().hashCode();
        }
        if (getSpecialHandlings() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSpecialHandlings());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSpecialHandlings(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPayments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPayments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPayments(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShipper() != null) {
            _hashCode += getShipper().hashCode();
        }
        if (getPossessionStatus() != null) {
            _hashCode += getPossessionStatus().hashCode();
        }
        if (getShipperAddress() != null) {
            _hashCode += getShipperAddress().hashCode();
        }
        if (getOriginLocationAddress() != null) {
            _hashCode += getOriginLocationAddress().hashCode();
        }
        if (getOriginStationId() != null) {
            _hashCode += getOriginStationId().hashCode();
        }
        if (getDatesOrTimes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDatesOrTimes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDatesOrTimes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTotalTransitDistance() != null) {
            _hashCode += getTotalTransitDistance().hashCode();
        }
        if (getDistanceToDestination() != null) {
            _hashCode += getDistanceToDestination().hashCode();
        }
        if (getSpecialInstructions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSpecialInstructions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSpecialInstructions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRecipient() != null) {
            _hashCode += getRecipient().hashCode();
        }
        if (getLastUpdatedDestinationAddress() != null) {
            _hashCode += getLastUpdatedDestinationAddress().hashCode();
        }
        if (getDestinationAddress() != null) {
            _hashCode += getDestinationAddress().hashCode();
        }
        if (getHoldAtLocationContact() != null) {
            _hashCode += getHoldAtLocationContact().hashCode();
        }
        if (getHoldAtLocationAddress() != null) {
            _hashCode += getHoldAtLocationAddress().hashCode();
        }
        if (getDestinationStationId() != null) {
            _hashCode += getDestinationStationId().hashCode();
        }
        if (getDestinationLocationAddress() != null) {
            _hashCode += getDestinationLocationAddress().hashCode();
        }
        if (getDestinationLocationType() != null) {
            _hashCode += getDestinationLocationType().hashCode();
        }
        if (getDestinationLocationTimeZoneOffset() != null) {
            _hashCode += getDestinationLocationTimeZoneOffset().hashCode();
        }
        if (getActualDeliveryAddress() != null) {
            _hashCode += getActualDeliveryAddress().hashCode();
        }
        if (getOfficeOrderDeliveryMethod() != null) {
            _hashCode += getOfficeOrderDeliveryMethod().hashCode();
        }
        if (getDeliveryLocationType() != null) {
            _hashCode += getDeliveryLocationType().hashCode();
        }
        if (getDeliveryLocationDescription() != null) {
            _hashCode += getDeliveryLocationDescription().hashCode();
        }
        if (getDeliveryAttempts() != null) {
            _hashCode += getDeliveryAttempts().hashCode();
        }
        if (getDeliverySignatureName() != null) {
            _hashCode += getDeliverySignatureName().hashCode();
        }
        if (getPieceCountVerificationDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPieceCountVerificationDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPieceCountVerificationDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTotalUniqueAddressCountInConsolidation() != null) {
            _hashCode += getTotalUniqueAddressCountInConsolidation().hashCode();
        }
        if (getAvailableImages() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAvailableImages());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAvailableImages(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSignature() != null) {
            _hashCode += getSignature().hashCode();
        }
        if (getNotificationEventsAvailable() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNotificationEventsAvailable());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNotificationEventsAvailable(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSplitShipmentParts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSplitShipmentParts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSplitShipmentParts(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDeliveryOptionEligibilityDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeliveryOptionEligibilityDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeliveryOptionEligibilityDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEvents() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEvents());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEvents(), i);
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
        new org.apache.axis.description.TypeDesc(TrackDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "TrackDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notification");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "Notification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "Notification"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackingNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "TrackingNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("barcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "Barcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "StringBarcode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackingNumberUniqueIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "TrackingNumberUniqueIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "StatusDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "TrackStatusDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("informationNotes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "InformationNotes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "TrackInformationNoteDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerExceptionRequests");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "CustomerExceptionRequests"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "CustomerExceptionRequestDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reconciliation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "Reconciliation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "TrackReconciliation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceCommitMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "ServiceCommitMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationServiceArea");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "DestinationServiceArea"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationServiceAreaDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "DestinationServiceAreaDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrierCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "CarrierCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "CarrierCodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operatingCompany");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "OperatingCompany"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "OperatingCompanyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operatingCompanyOrCarrierDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "OperatingCompanyOrCarrierDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cartageAgentCompanyName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "CartageAgentCompanyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productionLocationContactAndAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "ProductionLocationContactAndAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "ContactAndAddress"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherIdentifiers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "OtherIdentifiers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "TrackOtherIdentifierDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "FormId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("service");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "Service"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "TrackServiceDescriptionDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageWeight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "PackageWeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "Weight"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageDimensions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "PackageDimensions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "Dimensions"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageDimensionalWeight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "PackageDimensionalWeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "Weight"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentWeight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "ShipmentWeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "Weight"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packaging");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "Packaging"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packagingType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "PackagingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "PackagingType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("physicalPackagingType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "PhysicalPackagingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "PhysicalPackagingType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageSequenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "PackageSequenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "PackageCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creatorSoftwareId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "CreatorSoftwareId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("charges");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "Charges"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "TrackChargeDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nickName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "NickName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "Notes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "Attributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "TrackDetailAttributeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentContents");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "ShipmentContents"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "ContentRecord"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageContents");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "PackageContents"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clearanceLocationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "ClearanceLocationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commodities");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "Commodities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "Commodity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "ReturnDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "TrackReturnDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customsOptionDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "CustomsOptionDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "CustomsOptionDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advanceNotificationDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "AdvanceNotificationDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "TrackAdvanceNotificationDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specialHandlings");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "SpecialHandlings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "TrackSpecialHandling"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "Payments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "TrackPayment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipper");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "Shipper"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "Contact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("possessionStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "PossessionStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "TrackPossessionStatusType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipperAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "ShipperAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "Address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originLocationAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "OriginLocationAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "Address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originStationId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "OriginStationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datesOrTimes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "DatesOrTimes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "TrackingDateOrTimestamp"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalTransitDistance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "TotalTransitDistance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "Distance"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("distanceToDestination");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "DistanceToDestination"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "Distance"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specialInstructions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "SpecialInstructions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "TrackSpecialInstruction"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipient");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "Recipient"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "Contact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastUpdatedDestinationAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "LastUpdatedDestinationAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "Address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "DestinationAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "Address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("holdAtLocationContact");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "HoldAtLocationContact"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "Contact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("holdAtLocationAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "HoldAtLocationAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "Address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationStationId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "DestinationStationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationLocationAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "DestinationLocationAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "Address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationLocationType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "DestinationLocationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "FedExLocationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationLocationTimeZoneOffset");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "DestinationLocationTimeZoneOffset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualDeliveryAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "ActualDeliveryAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "Address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("officeOrderDeliveryMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "OfficeOrderDeliveryMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "OfficeOrderDeliveryMethodType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryLocationType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "DeliveryLocationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "TrackDeliveryLocationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryLocationDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "DeliveryLocationDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryAttempts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "DeliveryAttempts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliverySignatureName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "DeliverySignatureName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pieceCountVerificationDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "PieceCountVerificationDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "PieceCountVerificationDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalUniqueAddressCountInConsolidation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "TotalUniqueAddressCountInConsolidation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableImages");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "AvailableImages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "AvailableImagesDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signature");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "Signature"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "SignatureImageDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notificationEventsAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "NotificationEventsAvailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "NotificationEventType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("splitShipmentParts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "SplitShipmentParts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "TrackSplitShipmentPart"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliveryOptionEligibilityDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "DeliveryOptionEligibilityDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "DeliveryOptionEligibilityDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("events");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "Events"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/track/v14", "TrackEvent"));
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
