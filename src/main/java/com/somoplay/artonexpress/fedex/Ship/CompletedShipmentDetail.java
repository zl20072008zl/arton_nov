/**
 * CompletedShipmentDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.somoplay.artonexpress.fedex.Ship;

public class CompletedShipmentDetail  implements java.io.Serializable {
    private java.lang.Boolean usDomestic;

    private CarrierCodeType carrierCode;

    private TrackingId masterTrackingId;

    private java.lang.String serviceTypeDescription;

    private java.lang.String packagingDescription;

    private ShipmentOperationalDetail operationalDetail;

    /* Only used with pending shipments. */
    private PendingShipmentAccessDetail accessDetail;

    /* Only used in the reply to tag requests. */
    private CompletedTagDetail tagDetail;

    private CompletedSmartPostDetail smartPostDetail;

    /* Computed shipment level information about hazarous commodities. */
    private CompletedHazardousShipmentDetail hazardousShipmentDetail;

    /* All shipment-level rating data for this shipment, which may
     * include data for multiple rate types. */
    private ShipmentRating shipmentRating;

    /* Returns the default holding location information when HOLD_AT_LOCATION
     * special service is requested and the client does not specify the hold
     * location address. */
    private CompletedHoldAtLocationDetail completedHoldAtLocationDetail;

    /* Returns any defaults or updates applied to RequestedShipment.exportDetail.exportComplianceStatement. */
    private java.lang.String exportComplianceStatement;

    /* This specifies what rules or requirements for documents are
     * applicable for this shipment. This may identify required or prohibited
     * documents. */
    private DocumentRequirementsDetail documentRequirements;

    private CompletedEtdDetail completedEtdDetail;

    /* All shipment-level shipping documents (other than labels and
     * barcodes). */
    private ShippingDocument[] shipmentDocuments;

    private AssociatedShipmentDetail[] associatedShipments;

    private CompletedCodDetail completedCodDetail;

    private CompletedPackageDetail[] completedPackageDetails;

    public CompletedShipmentDetail() {
    }

    public CompletedShipmentDetail(
           java.lang.Boolean usDomestic,
           CarrierCodeType carrierCode,
           TrackingId masterTrackingId,
           java.lang.String serviceTypeDescription,
           java.lang.String packagingDescription,
           ShipmentOperationalDetail operationalDetail,
           PendingShipmentAccessDetail accessDetail,
           CompletedTagDetail tagDetail,
           CompletedSmartPostDetail smartPostDetail,
           CompletedHazardousShipmentDetail hazardousShipmentDetail,
           ShipmentRating shipmentRating,
           CompletedHoldAtLocationDetail completedHoldAtLocationDetail,
           java.lang.String exportComplianceStatement,
           DocumentRequirementsDetail documentRequirements,
           CompletedEtdDetail completedEtdDetail,
           ShippingDocument[] shipmentDocuments,
           AssociatedShipmentDetail[] associatedShipments,
           CompletedCodDetail completedCodDetail,
           CompletedPackageDetail[] completedPackageDetails) {
           this.usDomestic = usDomestic;
           this.carrierCode = carrierCode;
           this.masterTrackingId = masterTrackingId;
           this.serviceTypeDescription = serviceTypeDescription;
           this.packagingDescription = packagingDescription;
           this.operationalDetail = operationalDetail;
           this.accessDetail = accessDetail;
           this.tagDetail = tagDetail;
           this.smartPostDetail = smartPostDetail;
           this.hazardousShipmentDetail = hazardousShipmentDetail;
           this.shipmentRating = shipmentRating;
           this.completedHoldAtLocationDetail = completedHoldAtLocationDetail;
           this.exportComplianceStatement = exportComplianceStatement;
           this.documentRequirements = documentRequirements;
           this.completedEtdDetail = completedEtdDetail;
           this.shipmentDocuments = shipmentDocuments;
           this.associatedShipments = associatedShipments;
           this.completedCodDetail = completedCodDetail;
           this.completedPackageDetails = completedPackageDetails;
    }


    /**
     * Gets the usDomestic value for this CompletedShipmentDetail.
     *
     * @return usDomestic
     */
    public java.lang.Boolean getUsDomestic() {
        return usDomestic;
    }


    /**
     * Sets the usDomestic value for this CompletedShipmentDetail.
     *
     * @param usDomestic
     */
    public void setUsDomestic(java.lang.Boolean usDomestic) {
        this.usDomestic = usDomestic;
    }


    /**
     * Gets the carrierCode value for this CompletedShipmentDetail.
     *
     * @return carrierCode
     */
    public CarrierCodeType getCarrierCode() {
        return carrierCode;
    }


    /**
     * Sets the carrierCode value for this CompletedShipmentDetail.
     *
     * @param carrierCode
     */
    public void setCarrierCode(CarrierCodeType carrierCode) {
        this.carrierCode = carrierCode;
    }


    /**
     * Gets the masterTrackingId value for this CompletedShipmentDetail.
     *
     * @return masterTrackingId
     */
    public TrackingId getMasterTrackingId() {
        return masterTrackingId;
    }


    /**
     * Sets the masterTrackingId value for this CompletedShipmentDetail.
     *
     * @param masterTrackingId
     */
    public void setMasterTrackingId(TrackingId masterTrackingId) {
        this.masterTrackingId = masterTrackingId;
    }


    /**
     * Gets the serviceTypeDescription value for this CompletedShipmentDetail.
     *
     * @return serviceTypeDescription
     */
    public java.lang.String getServiceTypeDescription() {
        return serviceTypeDescription;
    }


    /**
     * Sets the serviceTypeDescription value for this CompletedShipmentDetail.
     *
     * @param serviceTypeDescription
     */
    public void setServiceTypeDescription(java.lang.String serviceTypeDescription) {
        this.serviceTypeDescription = serviceTypeDescription;
    }


    /**
     * Gets the packagingDescription value for this CompletedShipmentDetail.
     *
     * @return packagingDescription
     */
    public java.lang.String getPackagingDescription() {
        return packagingDescription;
    }


    /**
     * Sets the packagingDescription value for this CompletedShipmentDetail.
     *
     * @param packagingDescription
     */
    public void setPackagingDescription(java.lang.String packagingDescription) {
        this.packagingDescription = packagingDescription;
    }


    /**
     * Gets the operationalDetail value for this CompletedShipmentDetail.
     *
     * @return operationalDetail
     */
    public ShipmentOperationalDetail getOperationalDetail() {
        return operationalDetail;
    }


    /**
     * Sets the operationalDetail value for this CompletedShipmentDetail.
     *
     * @param operationalDetail
     */
    public void setOperationalDetail(ShipmentOperationalDetail operationalDetail) {
        this.operationalDetail = operationalDetail;
    }


    /**
     * Gets the accessDetail value for this CompletedShipmentDetail.
     *
     * @return accessDetail   * Only used with pending shipments.
     */
    public PendingShipmentAccessDetail getAccessDetail() {
        return accessDetail;
    }


    /**
     * Sets the accessDetail value for this CompletedShipmentDetail.
     *
     * @param accessDetail   * Only used with pending shipments.
     */
    public void setAccessDetail(PendingShipmentAccessDetail accessDetail) {
        this.accessDetail = accessDetail;
    }


    /**
     * Gets the tagDetail value for this CompletedShipmentDetail.
     *
     * @return tagDetail   * Only used in the reply to tag requests.
     */
    public CompletedTagDetail getTagDetail() {
        return tagDetail;
    }


    /**
     * Sets the tagDetail value for this CompletedShipmentDetail.
     *
     * @param tagDetail   * Only used in the reply to tag requests.
     */
    public void setTagDetail(CompletedTagDetail tagDetail) {
        this.tagDetail = tagDetail;
    }


    /**
     * Gets the smartPostDetail value for this CompletedShipmentDetail.
     *
     * @return smartPostDetail
     */
    public CompletedSmartPostDetail getSmartPostDetail() {
        return smartPostDetail;
    }


    /**
     * Sets the smartPostDetail value for this CompletedShipmentDetail.
     *
     * @param smartPostDetail
     */
    public void setSmartPostDetail(CompletedSmartPostDetail smartPostDetail) {
        this.smartPostDetail = smartPostDetail;
    }


    /**
     * Gets the hazardousShipmentDetail value for this CompletedShipmentDetail.
     *
     * @return hazardousShipmentDetail   * Computed shipment level information about hazarous commodities.
     */
    public CompletedHazardousShipmentDetail getHazardousShipmentDetail() {
        return hazardousShipmentDetail;
    }


    /**
     * Sets the hazardousShipmentDetail value for this CompletedShipmentDetail.
     *
     * @param hazardousShipmentDetail   * Computed shipment level information about hazarous commodities.
     */
    public void setHazardousShipmentDetail(CompletedHazardousShipmentDetail hazardousShipmentDetail) {
        this.hazardousShipmentDetail = hazardousShipmentDetail;
    }


    /**
     * Gets the shipmentRating value for this CompletedShipmentDetail.
     *
     * @return shipmentRating   * All shipment-level rating data for this shipment, which may
     * include data for multiple rate types.
     */
    public ShipmentRating getShipmentRating() {
        return shipmentRating;
    }


    /**
     * Sets the shipmentRating value for this CompletedShipmentDetail.
     *
     * @param shipmentRating   * All shipment-level rating data for this shipment, which may
     * include data for multiple rate types.
     */
    public void setShipmentRating(ShipmentRating shipmentRating) {
        this.shipmentRating = shipmentRating;
    }


    /**
     * Gets the completedHoldAtLocationDetail value for this CompletedShipmentDetail.
     *
     * @return completedHoldAtLocationDetail   * Returns the default holding location information when HOLD_AT_LOCATION
     * special service is requested and the client does not specify the hold
     * location address.
     */
    public CompletedHoldAtLocationDetail getCompletedHoldAtLocationDetail() {
        return completedHoldAtLocationDetail;
    }


    /**
     * Sets the completedHoldAtLocationDetail value for this CompletedShipmentDetail.
     *
     * @param completedHoldAtLocationDetail   * Returns the default holding location information when HOLD_AT_LOCATION
     * special service is requested and the client does not specify the hold
     * location address.
     */
    public void setCompletedHoldAtLocationDetail(CompletedHoldAtLocationDetail completedHoldAtLocationDetail) {
        this.completedHoldAtLocationDetail = completedHoldAtLocationDetail;
    }


    /**
     * Gets the exportComplianceStatement value for this CompletedShipmentDetail.
     *
     * @return exportComplianceStatement   * Returns any defaults or updates applied to RequestedShipment.exportDetail.exportComplianceStatement.
     */
    public java.lang.String getExportComplianceStatement() {
        return exportComplianceStatement;
    }


    /**
     * Sets the exportComplianceStatement value for this CompletedShipmentDetail.
     *
     * @param exportComplianceStatement   * Returns any defaults or updates applied to RequestedShipment.exportDetail.exportComplianceStatement.
     */
    public void setExportComplianceStatement(java.lang.String exportComplianceStatement) {
        this.exportComplianceStatement = exportComplianceStatement;
    }


    /**
     * Gets the documentRequirements value for this CompletedShipmentDetail.
     *
     * @return documentRequirements   * This specifies what rules or requirements for documents are
     * applicable for this shipment. This may identify required or prohibited
     * documents.
     */
    public DocumentRequirementsDetail getDocumentRequirements() {
        return documentRequirements;
    }


    /**
     * Sets the documentRequirements value for this CompletedShipmentDetail.
     *
     * @param documentRequirements   * This specifies what rules or requirements for documents are
     * applicable for this shipment. This may identify required or prohibited
     * documents.
     */
    public void setDocumentRequirements(DocumentRequirementsDetail documentRequirements) {
        this.documentRequirements = documentRequirements;
    }


    /**
     * Gets the completedEtdDetail value for this CompletedShipmentDetail.
     *
     * @return completedEtdDetail
     */
    public CompletedEtdDetail getCompletedEtdDetail() {
        return completedEtdDetail;
    }


    /**
     * Sets the completedEtdDetail value for this CompletedShipmentDetail.
     *
     * @param completedEtdDetail
     */
    public void setCompletedEtdDetail(CompletedEtdDetail completedEtdDetail) {
        this.completedEtdDetail = completedEtdDetail;
    }


    /**
     * Gets the shipmentDocuments value for this CompletedShipmentDetail.
     *
     * @return shipmentDocuments   * All shipment-level shipping documents (other than labels and
     * barcodes).
     */
    public ShippingDocument[] getShipmentDocuments() {
        return shipmentDocuments;
    }


    /**
     * Sets the shipmentDocuments value for this CompletedShipmentDetail.
     *
     * @param shipmentDocuments   * All shipment-level shipping documents (other than labels and
     * barcodes).
     */
    public void setShipmentDocuments(ShippingDocument[] shipmentDocuments) {
        this.shipmentDocuments = shipmentDocuments;
    }

    public ShippingDocument getShipmentDocuments(int i) {
        return this.shipmentDocuments[i];
    }

    public void setShipmentDocuments(int i, ShippingDocument _value) {
        this.shipmentDocuments[i] = _value;
    }


    /**
     * Gets the associatedShipments value for this CompletedShipmentDetail.
     *
     * @return associatedShipments
     */
    public AssociatedShipmentDetail[] getAssociatedShipments() {
        return associatedShipments;
    }


    /**
     * Sets the associatedShipments value for this CompletedShipmentDetail.
     *
     * @param associatedShipments
     */
    public void setAssociatedShipments(AssociatedShipmentDetail[] associatedShipments) {
        this.associatedShipments = associatedShipments;
    }

    public AssociatedShipmentDetail getAssociatedShipments(int i) {
        return this.associatedShipments[i];
    }

    public void setAssociatedShipments(int i, AssociatedShipmentDetail _value) {
        this.associatedShipments[i] = _value;
    }


    /**
     * Gets the completedCodDetail value for this CompletedShipmentDetail.
     *
     * @return completedCodDetail
     */
    public CompletedCodDetail getCompletedCodDetail() {
        return completedCodDetail;
    }


    /**
     * Sets the completedCodDetail value for this CompletedShipmentDetail.
     *
     * @param completedCodDetail
     */
    public void setCompletedCodDetail(CompletedCodDetail completedCodDetail) {
        this.completedCodDetail = completedCodDetail;
    }


    /**
     * Gets the completedPackageDetails value for this CompletedShipmentDetail.
     *
     * @return completedPackageDetails
     */
    public CompletedPackageDetail[] getCompletedPackageDetails() {
        return completedPackageDetails;
    }


    /**
     * Sets the completedPackageDetails value for this CompletedShipmentDetail.
     *
     * @param completedPackageDetails
     */
    public void setCompletedPackageDetails(CompletedPackageDetail[] completedPackageDetails) {
        this.completedPackageDetails = completedPackageDetails;
    }

    public CompletedPackageDetail getCompletedPackageDetails(int i) {
        return this.completedPackageDetails[i];
    }

    public void setCompletedPackageDetails(int i, CompletedPackageDetail _value) {
        this.completedPackageDetails[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CompletedShipmentDetail)) return false;
        CompletedShipmentDetail other = (CompletedShipmentDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
            ((this.usDomestic==null && other.getUsDomestic()==null) ||
             (this.usDomestic!=null &&
              this.usDomestic.equals(other.getUsDomestic()))) &&
            ((this.carrierCode==null && other.getCarrierCode()==null) ||
             (this.carrierCode!=null &&
              this.carrierCode.equals(other.getCarrierCode()))) &&
            ((this.masterTrackingId==null && other.getMasterTrackingId()==null) ||
             (this.masterTrackingId!=null &&
              this.masterTrackingId.equals(other.getMasterTrackingId()))) &&
            ((this.serviceTypeDescription==null && other.getServiceTypeDescription()==null) ||
             (this.serviceTypeDescription!=null &&
              this.serviceTypeDescription.equals(other.getServiceTypeDescription()))) &&
            ((this.packagingDescription==null && other.getPackagingDescription()==null) ||
             (this.packagingDescription!=null &&
              this.packagingDescription.equals(other.getPackagingDescription()))) &&
            ((this.operationalDetail==null && other.getOperationalDetail()==null) ||
             (this.operationalDetail!=null &&
              this.operationalDetail.equals(other.getOperationalDetail()))) &&
            ((this.accessDetail==null && other.getAccessDetail()==null) ||
             (this.accessDetail!=null &&
              this.accessDetail.equals(other.getAccessDetail()))) &&
            ((this.tagDetail==null && other.getTagDetail()==null) ||
             (this.tagDetail!=null &&
              this.tagDetail.equals(other.getTagDetail()))) &&
            ((this.smartPostDetail==null && other.getSmartPostDetail()==null) ||
             (this.smartPostDetail!=null &&
              this.smartPostDetail.equals(other.getSmartPostDetail()))) &&
            ((this.hazardousShipmentDetail==null && other.getHazardousShipmentDetail()==null) ||
             (this.hazardousShipmentDetail!=null &&
              this.hazardousShipmentDetail.equals(other.getHazardousShipmentDetail()))) &&
            ((this.shipmentRating==null && other.getShipmentRating()==null) ||
             (this.shipmentRating!=null &&
              this.shipmentRating.equals(other.getShipmentRating()))) &&
            ((this.completedHoldAtLocationDetail==null && other.getCompletedHoldAtLocationDetail()==null) ||
             (this.completedHoldAtLocationDetail!=null &&
              this.completedHoldAtLocationDetail.equals(other.getCompletedHoldAtLocationDetail()))) &&
            ((this.exportComplianceStatement==null && other.getExportComplianceStatement()==null) ||
             (this.exportComplianceStatement!=null &&
              this.exportComplianceStatement.equals(other.getExportComplianceStatement()))) &&
            ((this.documentRequirements==null && other.getDocumentRequirements()==null) ||
             (this.documentRequirements!=null &&
              this.documentRequirements.equals(other.getDocumentRequirements()))) &&
            ((this.completedEtdDetail==null && other.getCompletedEtdDetail()==null) ||
             (this.completedEtdDetail!=null &&
              this.completedEtdDetail.equals(other.getCompletedEtdDetail()))) &&
            ((this.shipmentDocuments==null && other.getShipmentDocuments()==null) ||
             (this.shipmentDocuments!=null &&
              java.util.Arrays.equals(this.shipmentDocuments, other.getShipmentDocuments()))) &&
            ((this.associatedShipments==null && other.getAssociatedShipments()==null) ||
             (this.associatedShipments!=null &&
              java.util.Arrays.equals(this.associatedShipments, other.getAssociatedShipments()))) &&
            ((this.completedCodDetail==null && other.getCompletedCodDetail()==null) ||
             (this.completedCodDetail!=null &&
              this.completedCodDetail.equals(other.getCompletedCodDetail()))) &&
            ((this.completedPackageDetails==null && other.getCompletedPackageDetails()==null) ||
             (this.completedPackageDetails!=null &&
              java.util.Arrays.equals(this.completedPackageDetails, other.getCompletedPackageDetails())));
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
        if (getUsDomestic() != null) {
            _hashCode += getUsDomestic().hashCode();
        }
        if (getCarrierCode() != null) {
            _hashCode += getCarrierCode().hashCode();
        }
        if (getMasterTrackingId() != null) {
            _hashCode += getMasterTrackingId().hashCode();
        }
        if (getServiceTypeDescription() != null) {
            _hashCode += getServiceTypeDescription().hashCode();
        }
        if (getPackagingDescription() != null) {
            _hashCode += getPackagingDescription().hashCode();
        }
        if (getOperationalDetail() != null) {
            _hashCode += getOperationalDetail().hashCode();
        }
        if (getAccessDetail() != null) {
            _hashCode += getAccessDetail().hashCode();
        }
        if (getTagDetail() != null) {
            _hashCode += getTagDetail().hashCode();
        }
        if (getSmartPostDetail() != null) {
            _hashCode += getSmartPostDetail().hashCode();
        }
        if (getHazardousShipmentDetail() != null) {
            _hashCode += getHazardousShipmentDetail().hashCode();
        }
        if (getShipmentRating() != null) {
            _hashCode += getShipmentRating().hashCode();
        }
        if (getCompletedHoldAtLocationDetail() != null) {
            _hashCode += getCompletedHoldAtLocationDetail().hashCode();
        }
        if (getExportComplianceStatement() != null) {
            _hashCode += getExportComplianceStatement().hashCode();
        }
        if (getDocumentRequirements() != null) {
            _hashCode += getDocumentRequirements().hashCode();
        }
        if (getCompletedEtdDetail() != null) {
            _hashCode += getCompletedEtdDetail().hashCode();
        }
        if (getShipmentDocuments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShipmentDocuments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShipmentDocuments(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAssociatedShipments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAssociatedShipments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAssociatedShipments(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCompletedCodDetail() != null) {
            _hashCode += getCompletedCodDetail().hashCode();
        }
        if (getCompletedPackageDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCompletedPackageDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCompletedPackageDetails(), i);
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
        new org.apache.axis.description.TypeDesc(CompletedShipmentDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "CompletedShipmentDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usDomestic");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "UsDomestic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrierCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "CarrierCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "CarrierCodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("masterTrackingId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "MasterTrackingId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "TrackingId"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceTypeDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ServiceTypeDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packagingDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "PackagingDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationalDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "OperationalDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ShipmentOperationalDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "AccessDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "PendingShipmentAccessDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tagDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "TagDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "CompletedTagDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smartPostDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "SmartPostDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "CompletedSmartPostDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hazardousShipmentDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "HazardousShipmentDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "CompletedHazardousShipmentDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentRating");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ShipmentRating"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ShipmentRating"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("completedHoldAtLocationDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "CompletedHoldAtLocationDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "CompletedHoldAtLocationDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exportComplianceStatement");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ExportComplianceStatement"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentRequirements");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "DocumentRequirements"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "DocumentRequirementsDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("completedEtdDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "CompletedEtdDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "CompletedEtdDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentDocuments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ShipmentDocuments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ShippingDocument"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("associatedShipments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "AssociatedShipments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "AssociatedShipmentDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("completedCodDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "CompletedCodDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "CompletedCodDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("completedPackageDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "CompletedPackageDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "CompletedPackageDetail"));
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
