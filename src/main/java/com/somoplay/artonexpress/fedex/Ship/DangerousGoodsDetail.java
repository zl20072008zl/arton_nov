/**
 * DangerousGoodsDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.somoplay.artonexpress.fedex.Ship;

public class DangerousGoodsDetail  implements java.io.Serializable {
    /* This field is used to identify an instance of an uploaded dangerous
     * goods handling unit. */
    private java.lang.String uploadedTrackingNumber;

    private HazardousCommodityRegulationType regulation;

    private DangerousGoodsAccessibilityType accessibility;

    /* Shipment is packaged/documented for movement ONLY on cargo
     * aircraft. */
    private java.lang.Boolean cargoAircraftOnly;

    /* Indicates which kinds of hazardous content are in the current
     * package. */
    private HazardousCommodityOptionType[] options;

    /* Indicates whether there is additional customer provided packaging
     * enclosing the approved dangerous goods containers. */
    private DangerousGoodsPackingOptionType packingOption;

    /* Identifies the configuration of this dangerous goods package.
     * The common configuration is represented at the shipment level. */
    private java.lang.String referenceId;

    /* Indicates one or more containers used to pack dangerous goods
     * commodities. */
    private DangerousGoodsContainer[] containers;

    /* Description of the packaging of this commodity, suitable for
     * use on OP-900 and OP-950 forms. */
    private HazardousCommodityPackagingDetail packaging;

    /* Name, title and place of the signatory for this shipment. */
    private DangerousGoodsSignatory signatory;

    /* Telephone number to use for contact in the event of an emergency. */
    private java.lang.String emergencyContactNumber;

    /* Offeror's name or contract number, per DOT regulation. */
    private java.lang.String offeror;

    /* Specifies the contact of the party responsible for handling
     * the infectious substances, if any, in the dangerous goods shipment. */
    private Contact infectiousSubstanceResponsibleContact;

    /* Specifies additional handling information for the current package. */
    private java.lang.String additionalHandling;

    /* Specifies the radioactivity detail for the current package,
     * if the package contains radioactive materials. */
    private RadioactivityDetail radioactivityDetail;

    public DangerousGoodsDetail() {
    }

    public DangerousGoodsDetail(
           java.lang.String uploadedTrackingNumber,
           HazardousCommodityRegulationType regulation,
           DangerousGoodsAccessibilityType accessibility,
           java.lang.Boolean cargoAircraftOnly,
           HazardousCommodityOptionType[] options,
           DangerousGoodsPackingOptionType packingOption,
           java.lang.String referenceId,
           DangerousGoodsContainer[] containers,
           HazardousCommodityPackagingDetail packaging,
           DangerousGoodsSignatory signatory,
           java.lang.String emergencyContactNumber,
           java.lang.String offeror,
           Contact infectiousSubstanceResponsibleContact,
           java.lang.String additionalHandling,
           RadioactivityDetail radioactivityDetail) {
           this.uploadedTrackingNumber = uploadedTrackingNumber;
           this.regulation = regulation;
           this.accessibility = accessibility;
           this.cargoAircraftOnly = cargoAircraftOnly;
           this.options = options;
           this.packingOption = packingOption;
           this.referenceId = referenceId;
           this.containers = containers;
           this.packaging = packaging;
           this.signatory = signatory;
           this.emergencyContactNumber = emergencyContactNumber;
           this.offeror = offeror;
           this.infectiousSubstanceResponsibleContact = infectiousSubstanceResponsibleContact;
           this.additionalHandling = additionalHandling;
           this.radioactivityDetail = radioactivityDetail;
    }


    /**
     * Gets the uploadedTrackingNumber value for this DangerousGoodsDetail.
     *
     * @return uploadedTrackingNumber   * This field is used to identify an instance of an uploaded dangerous
     * goods handling unit.
     */
    public java.lang.String getUploadedTrackingNumber() {
        return uploadedTrackingNumber;
    }


    /**
     * Sets the uploadedTrackingNumber value for this DangerousGoodsDetail.
     *
     * @param uploadedTrackingNumber   * This field is used to identify an instance of an uploaded dangerous
     * goods handling unit.
     */
    public void setUploadedTrackingNumber(java.lang.String uploadedTrackingNumber) {
        this.uploadedTrackingNumber = uploadedTrackingNumber;
    }


    /**
     * Gets the regulation value for this DangerousGoodsDetail.
     *
     * @return regulation
     */
    public HazardousCommodityRegulationType getRegulation() {
        return regulation;
    }


    /**
     * Sets the regulation value for this DangerousGoodsDetail.
     *
     * @param regulation
     */
    public void setRegulation(HazardousCommodityRegulationType regulation) {
        this.regulation = regulation;
    }


    /**
     * Gets the accessibility value for this DangerousGoodsDetail.
     *
     * @return accessibility
     */
    public DangerousGoodsAccessibilityType getAccessibility() {
        return accessibility;
    }


    /**
     * Sets the accessibility value for this DangerousGoodsDetail.
     *
     * @param accessibility
     */
    public void setAccessibility(DangerousGoodsAccessibilityType accessibility) {
        this.accessibility = accessibility;
    }


    /**
     * Gets the cargoAircraftOnly value for this DangerousGoodsDetail.
     *
     * @return cargoAircraftOnly   * Shipment is packaged/documented for movement ONLY on cargo
     * aircraft.
     */
    public java.lang.Boolean getCargoAircraftOnly() {
        return cargoAircraftOnly;
    }


    /**
     * Sets the cargoAircraftOnly value for this DangerousGoodsDetail.
     *
     * @param cargoAircraftOnly   * Shipment is packaged/documented for movement ONLY on cargo
     * aircraft.
     */
    public void setCargoAircraftOnly(java.lang.Boolean cargoAircraftOnly) {
        this.cargoAircraftOnly = cargoAircraftOnly;
    }


    /**
     * Gets the options value for this DangerousGoodsDetail.
     *
     * @return options   * Indicates which kinds of hazardous content are in the current
     * package.
     */
    public HazardousCommodityOptionType[] getOptions() {
        return options;
    }


    /**
     * Sets the options value for this DangerousGoodsDetail.
     *
     * @param options   * Indicates which kinds of hazardous content are in the current
     * package.
     */
    public void setOptions(HazardousCommodityOptionType[] options) {
        this.options = options;
    }

    public HazardousCommodityOptionType getOptions(int i) {
        return this.options[i];
    }

    public void setOptions(int i, HazardousCommodityOptionType _value) {
        this.options[i] = _value;
    }


    /**
     * Gets the packingOption value for this DangerousGoodsDetail.
     *
     * @return packingOption   * Indicates whether there is additional customer provided packaging
     * enclosing the approved dangerous goods containers.
     */
    public DangerousGoodsPackingOptionType getPackingOption() {
        return packingOption;
    }


    /**
     * Sets the packingOption value for this DangerousGoodsDetail.
     *
     * @param packingOption   * Indicates whether there is additional customer provided packaging
     * enclosing the approved dangerous goods containers.
     */
    public void setPackingOption(DangerousGoodsPackingOptionType packingOption) {
        this.packingOption = packingOption;
    }


    /**
     * Gets the referenceId value for this DangerousGoodsDetail.
     *
     * @return referenceId   * Identifies the configuration of this dangerous goods package.
     * The common configuration is represented at the shipment level.
     */
    public java.lang.String getReferenceId() {
        return referenceId;
    }


    /**
     * Sets the referenceId value for this DangerousGoodsDetail.
     *
     * @param referenceId   * Identifies the configuration of this dangerous goods package.
     * The common configuration is represented at the shipment level.
     */
    public void setReferenceId(java.lang.String referenceId) {
        this.referenceId = referenceId;
    }


    /**
     * Gets the containers value for this DangerousGoodsDetail.
     *
     * @return containers   * Indicates one or more containers used to pack dangerous goods
     * commodities.
     */
    public DangerousGoodsContainer[] getContainers() {
        return containers;
    }


    /**
     * Sets the containers value for this DangerousGoodsDetail.
     *
     * @param containers   * Indicates one or more containers used to pack dangerous goods
     * commodities.
     */
    public void setContainers(DangerousGoodsContainer[] containers) {
        this.containers = containers;
    }

    public DangerousGoodsContainer getContainers(int i) {
        return this.containers[i];
    }

    public void setContainers(int i, DangerousGoodsContainer _value) {
        this.containers[i] = _value;
    }


    /**
     * Gets the packaging value for this DangerousGoodsDetail.
     *
     * @return packaging   * Description of the packaging of this commodity, suitable for
     * use on OP-900 and OP-950 forms.
     */
    public HazardousCommodityPackagingDetail getPackaging() {
        return packaging;
    }


    /**
     * Sets the packaging value for this DangerousGoodsDetail.
     *
     * @param packaging   * Description of the packaging of this commodity, suitable for
     * use on OP-900 and OP-950 forms.
     */
    public void setPackaging(HazardousCommodityPackagingDetail packaging) {
        this.packaging = packaging;
    }


    /**
     * Gets the signatory value for this DangerousGoodsDetail.
     *
     * @return signatory   * Name, title and place of the signatory for this shipment.
     */
    public DangerousGoodsSignatory getSignatory() {
        return signatory;
    }


    /**
     * Sets the signatory value for this DangerousGoodsDetail.
     *
     * @param signatory   * Name, title and place of the signatory for this shipment.
     */
    public void setSignatory(DangerousGoodsSignatory signatory) {
        this.signatory = signatory;
    }


    /**
     * Gets the emergencyContactNumber value for this DangerousGoodsDetail.
     *
     * @return emergencyContactNumber   * Telephone number to use for contact in the event of an emergency.
     */
    public java.lang.String getEmergencyContactNumber() {
        return emergencyContactNumber;
    }


    /**
     * Sets the emergencyContactNumber value for this DangerousGoodsDetail.
     *
     * @param emergencyContactNumber   * Telephone number to use for contact in the event of an emergency.
     */
    public void setEmergencyContactNumber(java.lang.String emergencyContactNumber) {
        this.emergencyContactNumber = emergencyContactNumber;
    }


    /**
     * Gets the offeror value for this DangerousGoodsDetail.
     *
     * @return offeror   * Offeror's name or contract number, per DOT regulation.
     */
    public java.lang.String getOfferor() {
        return offeror;
    }


    /**
     * Sets the offeror value for this DangerousGoodsDetail.
     *
     * @param offeror   * Offeror's name or contract number, per DOT regulation.
     */
    public void setOfferor(java.lang.String offeror) {
        this.offeror = offeror;
    }


    /**
     * Gets the infectiousSubstanceResponsibleContact value for this DangerousGoodsDetail.
     *
     * @return infectiousSubstanceResponsibleContact   * Specifies the contact of the party responsible for handling
     * the infectious substances, if any, in the dangerous goods shipment.
     */
    public Contact getInfectiousSubstanceResponsibleContact() {
        return infectiousSubstanceResponsibleContact;
    }


    /**
     * Sets the infectiousSubstanceResponsibleContact value for this DangerousGoodsDetail.
     *
     * @param infectiousSubstanceResponsibleContact   * Specifies the contact of the party responsible for handling
     * the infectious substances, if any, in the dangerous goods shipment.
     */
    public void setInfectiousSubstanceResponsibleContact(Contact infectiousSubstanceResponsibleContact) {
        this.infectiousSubstanceResponsibleContact = infectiousSubstanceResponsibleContact;
    }


    /**
     * Gets the additionalHandling value for this DangerousGoodsDetail.
     *
     * @return additionalHandling   * Specifies additional handling information for the current package.
     */
    public java.lang.String getAdditionalHandling() {
        return additionalHandling;
    }


    /**
     * Sets the additionalHandling value for this DangerousGoodsDetail.
     *
     * @param additionalHandling   * Specifies additional handling information for the current package.
     */
    public void setAdditionalHandling(java.lang.String additionalHandling) {
        this.additionalHandling = additionalHandling;
    }


    /**
     * Gets the radioactivityDetail value for this DangerousGoodsDetail.
     *
     * @return radioactivityDetail   * Specifies the radioactivity detail for the current package,
     * if the package contains radioactive materials.
     */
    public RadioactivityDetail getRadioactivityDetail() {
        return radioactivityDetail;
    }


    /**
     * Sets the radioactivityDetail value for this DangerousGoodsDetail.
     *
     * @param radioactivityDetail   * Specifies the radioactivity detail for the current package,
     * if the package contains radioactive materials.
     */
    public void setRadioactivityDetail(RadioactivityDetail radioactivityDetail) {
        this.radioactivityDetail = radioactivityDetail;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DangerousGoodsDetail)) return false;
        DangerousGoodsDetail other = (DangerousGoodsDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
            ((this.uploadedTrackingNumber==null && other.getUploadedTrackingNumber()==null) ||
             (this.uploadedTrackingNumber!=null &&
              this.uploadedTrackingNumber.equals(other.getUploadedTrackingNumber()))) &&
            ((this.regulation==null && other.getRegulation()==null) ||
             (this.regulation!=null &&
              this.regulation.equals(other.getRegulation()))) &&
            ((this.accessibility==null && other.getAccessibility()==null) ||
             (this.accessibility!=null &&
              this.accessibility.equals(other.getAccessibility()))) &&
            ((this.cargoAircraftOnly==null && other.getCargoAircraftOnly()==null) ||
             (this.cargoAircraftOnly!=null &&
              this.cargoAircraftOnly.equals(other.getCargoAircraftOnly()))) &&
            ((this.options==null && other.getOptions()==null) ||
             (this.options!=null &&
              java.util.Arrays.equals(this.options, other.getOptions()))) &&
            ((this.packingOption==null && other.getPackingOption()==null) ||
             (this.packingOption!=null &&
              this.packingOption.equals(other.getPackingOption()))) &&
            ((this.referenceId==null && other.getReferenceId()==null) ||
             (this.referenceId!=null &&
              this.referenceId.equals(other.getReferenceId()))) &&
            ((this.containers==null && other.getContainers()==null) ||
             (this.containers!=null &&
              java.util.Arrays.equals(this.containers, other.getContainers()))) &&
            ((this.packaging==null && other.getPackaging()==null) ||
             (this.packaging!=null &&
              this.packaging.equals(other.getPackaging()))) &&
            ((this.signatory==null && other.getSignatory()==null) ||
             (this.signatory!=null &&
              this.signatory.equals(other.getSignatory()))) &&
            ((this.emergencyContactNumber==null && other.getEmergencyContactNumber()==null) ||
             (this.emergencyContactNumber!=null &&
              this.emergencyContactNumber.equals(other.getEmergencyContactNumber()))) &&
            ((this.offeror==null && other.getOfferor()==null) ||
             (this.offeror!=null &&
              this.offeror.equals(other.getOfferor()))) &&
            ((this.infectiousSubstanceResponsibleContact==null && other.getInfectiousSubstanceResponsibleContact()==null) ||
             (this.infectiousSubstanceResponsibleContact!=null &&
              this.infectiousSubstanceResponsibleContact.equals(other.getInfectiousSubstanceResponsibleContact()))) &&
            ((this.additionalHandling==null && other.getAdditionalHandling()==null) ||
             (this.additionalHandling!=null &&
              this.additionalHandling.equals(other.getAdditionalHandling()))) &&
            ((this.radioactivityDetail==null && other.getRadioactivityDetail()==null) ||
             (this.radioactivityDetail!=null &&
              this.radioactivityDetail.equals(other.getRadioactivityDetail())));
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
        if (getUploadedTrackingNumber() != null) {
            _hashCode += getUploadedTrackingNumber().hashCode();
        }
        if (getRegulation() != null) {
            _hashCode += getRegulation().hashCode();
        }
        if (getAccessibility() != null) {
            _hashCode += getAccessibility().hashCode();
        }
        if (getCargoAircraftOnly() != null) {
            _hashCode += getCargoAircraftOnly().hashCode();
        }
        if (getOptions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOptions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOptions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPackingOption() != null) {
            _hashCode += getPackingOption().hashCode();
        }
        if (getReferenceId() != null) {
            _hashCode += getReferenceId().hashCode();
        }
        if (getContainers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContainers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getContainers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPackaging() != null) {
            _hashCode += getPackaging().hashCode();
        }
        if (getSignatory() != null) {
            _hashCode += getSignatory().hashCode();
        }
        if (getEmergencyContactNumber() != null) {
            _hashCode += getEmergencyContactNumber().hashCode();
        }
        if (getOfferor() != null) {
            _hashCode += getOfferor().hashCode();
        }
        if (getInfectiousSubstanceResponsibleContact() != null) {
            _hashCode += getInfectiousSubstanceResponsibleContact().hashCode();
        }
        if (getAdditionalHandling() != null) {
            _hashCode += getAdditionalHandling().hashCode();
        }
        if (getRadioactivityDetail() != null) {
            _hashCode += getRadioactivityDetail().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DangerousGoodsDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "DangerousGoodsDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uploadedTrackingNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "UploadedTrackingNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regulation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "Regulation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "HazardousCommodityRegulationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessibility");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "Accessibility"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "DangerousGoodsAccessibilityType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cargoAircraftOnly");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "CargoAircraftOnly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("options");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "Options"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "HazardousCommodityOptionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packingOption");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "PackingOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "DangerousGoodsPackingOptionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ReferenceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("containers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "Containers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "DangerousGoodsContainer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packaging");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "Packaging"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "HazardousCommodityPackagingDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signatory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "Signatory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "DangerousGoodsSignatory"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emergencyContactNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "EmergencyContactNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offeror");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "Offeror"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("infectiousSubstanceResponsibleContact");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "InfectiousSubstanceResponsibleContact"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "Contact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalHandling");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "AdditionalHandling"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("radioactivityDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "RadioactivityDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "RadioactivityDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
