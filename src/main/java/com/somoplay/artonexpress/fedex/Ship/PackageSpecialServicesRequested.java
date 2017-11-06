/**
 * PackageSpecialServicesRequested.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.somoplay.artonexpress.fedex.Ship;


/**
 * These special services are available at the package level for some
 * or all service types. If the shipper is requesting a special service
 * which requires additional data, the package special service type must
 * be present in the specialServiceTypes collection, and the supporting
 * detail must be provided in the appropriate sub-object below.
 */
public class PackageSpecialServicesRequested  implements java.io.Serializable {
    /* The types of all special services requested for the enclosing
     * shipment or package. */
    private PackageSpecialServiceType[] specialServiceTypes;

    /* For use with FedEx Ground services only; COD must be present
     * in shipment's special services. */
    private CodDetail codDetail;

    private DangerousGoodsDetail dangerousGoodsDetail;

    /* Provides details about the batteries or cells that are contained
     * within this specific package. */
    private BatteryClassificationDetail[] batteryDetails;

    private Weight dryIceWeight;

    private SignatureOptionDetail signatureOptionDetail;

    private PriorityAlertDetail priorityAlertDetail;

    private AlcoholDetail alcoholDetail;

    public PackageSpecialServicesRequested() {
    }

    public PackageSpecialServicesRequested(
           PackageSpecialServiceType[] specialServiceTypes,
           CodDetail codDetail,
           DangerousGoodsDetail dangerousGoodsDetail,
           BatteryClassificationDetail[] batteryDetails,
           Weight dryIceWeight,
           SignatureOptionDetail signatureOptionDetail,
           PriorityAlertDetail priorityAlertDetail,
           AlcoholDetail alcoholDetail) {
           this.specialServiceTypes = specialServiceTypes;
           this.codDetail = codDetail;
           this.dangerousGoodsDetail = dangerousGoodsDetail;
           this.batteryDetails = batteryDetails;
           this.dryIceWeight = dryIceWeight;
           this.signatureOptionDetail = signatureOptionDetail;
           this.priorityAlertDetail = priorityAlertDetail;
           this.alcoholDetail = alcoholDetail;
    }


    /**
     * Gets the specialServiceTypes value for this PackageSpecialServicesRequested.
     *
     * @return specialServiceTypes   * The types of all special services requested for the enclosing
     * shipment or package.
     */
    public PackageSpecialServiceType[] getSpecialServiceTypes() {
        return specialServiceTypes;
    }


    /**
     * Sets the specialServiceTypes value for this PackageSpecialServicesRequested.
     *
     * @param specialServiceTypes   * The types of all special services requested for the enclosing
     * shipment or package.
     */
    public void setSpecialServiceTypes(PackageSpecialServiceType[] specialServiceTypes) {
        this.specialServiceTypes = specialServiceTypes;
    }

    public PackageSpecialServiceType getSpecialServiceTypes(int i) {
        return this.specialServiceTypes[i];
    }

    public void setSpecialServiceTypes(int i, PackageSpecialServiceType _value) {
        this.specialServiceTypes[i] = _value;
    }


    /**
     * Gets the codDetail value for this PackageSpecialServicesRequested.
     *
     * @return codDetail   * For use with FedEx Ground services only; COD must be present
     * in shipment's special services.
     */
    public CodDetail getCodDetail() {
        return codDetail;
    }


    /**
     * Sets the codDetail value for this PackageSpecialServicesRequested.
     *
     * @param codDetail   * For use with FedEx Ground services only; COD must be present
     * in shipment's special services.
     */
    public void setCodDetail(CodDetail codDetail) {
        this.codDetail = codDetail;
    }


    /**
     * Gets the dangerousGoodsDetail value for this PackageSpecialServicesRequested.
     *
     * @return dangerousGoodsDetail
     */
    public DangerousGoodsDetail getDangerousGoodsDetail() {
        return dangerousGoodsDetail;
    }


    /**
     * Sets the dangerousGoodsDetail value for this PackageSpecialServicesRequested.
     *
     * @param dangerousGoodsDetail
     */
    public void setDangerousGoodsDetail(DangerousGoodsDetail dangerousGoodsDetail) {
        this.dangerousGoodsDetail = dangerousGoodsDetail;
    }


    /**
     * Gets the batteryDetails value for this PackageSpecialServicesRequested.
     *
     * @return batteryDetails   * Provides details about the batteries or cells that are contained
     * within this specific package.
     */
    public BatteryClassificationDetail[] getBatteryDetails() {
        return batteryDetails;
    }


    /**
     * Sets the batteryDetails value for this PackageSpecialServicesRequested.
     *
     * @param batteryDetails   * Provides details about the batteries or cells that are contained
     * within this specific package.
     */
    public void setBatteryDetails(BatteryClassificationDetail[] batteryDetails) {
        this.batteryDetails = batteryDetails;
    }

    public BatteryClassificationDetail getBatteryDetails(int i) {
        return this.batteryDetails[i];
    }

    public void setBatteryDetails(int i, BatteryClassificationDetail _value) {
        this.batteryDetails[i] = _value;
    }


    /**
     * Gets the dryIceWeight value for this PackageSpecialServicesRequested.
     *
     * @return dryIceWeight
     */
    public Weight getDryIceWeight() {
        return dryIceWeight;
    }


    /**
     * Sets the dryIceWeight value for this PackageSpecialServicesRequested.
     *
     * @param dryIceWeight
     */
    public void setDryIceWeight(Weight dryIceWeight) {
        this.dryIceWeight = dryIceWeight;
    }


    /**
     * Gets the signatureOptionDetail value for this PackageSpecialServicesRequested.
     *
     * @return signatureOptionDetail
     */
    public SignatureOptionDetail getSignatureOptionDetail() {
        return signatureOptionDetail;
    }


    /**
     * Sets the signatureOptionDetail value for this PackageSpecialServicesRequested.
     *
     * @param signatureOptionDetail
     */
    public void setSignatureOptionDetail(SignatureOptionDetail signatureOptionDetail) {
        this.signatureOptionDetail = signatureOptionDetail;
    }


    /**
     * Gets the priorityAlertDetail value for this PackageSpecialServicesRequested.
     *
     * @return priorityAlertDetail
     */
    public PriorityAlertDetail getPriorityAlertDetail() {
        return priorityAlertDetail;
    }


    /**
     * Sets the priorityAlertDetail value for this PackageSpecialServicesRequested.
     *
     * @param priorityAlertDetail
     */
    public void setPriorityAlertDetail(PriorityAlertDetail priorityAlertDetail) {
        this.priorityAlertDetail = priorityAlertDetail;
    }


    /**
     * Gets the alcoholDetail value for this PackageSpecialServicesRequested.
     *
     * @return alcoholDetail
     */
    public AlcoholDetail getAlcoholDetail() {
        return alcoholDetail;
    }


    /**
     * Sets the alcoholDetail value for this PackageSpecialServicesRequested.
     *
     * @param alcoholDetail
     */
    public void setAlcoholDetail(AlcoholDetail alcoholDetail) {
        this.alcoholDetail = alcoholDetail;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PackageSpecialServicesRequested)) return false;
        PackageSpecialServicesRequested other = (PackageSpecialServicesRequested) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
            ((this.specialServiceTypes==null && other.getSpecialServiceTypes()==null) ||
             (this.specialServiceTypes!=null &&
              java.util.Arrays.equals(this.specialServiceTypes, other.getSpecialServiceTypes()))) &&
            ((this.codDetail==null && other.getCodDetail()==null) ||
             (this.codDetail!=null &&
              this.codDetail.equals(other.getCodDetail()))) &&
            ((this.dangerousGoodsDetail==null && other.getDangerousGoodsDetail()==null) ||
             (this.dangerousGoodsDetail!=null &&
              this.dangerousGoodsDetail.equals(other.getDangerousGoodsDetail()))) &&
            ((this.batteryDetails==null && other.getBatteryDetails()==null) ||
             (this.batteryDetails!=null &&
              java.util.Arrays.equals(this.batteryDetails, other.getBatteryDetails()))) &&
            ((this.dryIceWeight==null && other.getDryIceWeight()==null) ||
             (this.dryIceWeight!=null &&
              this.dryIceWeight.equals(other.getDryIceWeight()))) &&
            ((this.signatureOptionDetail==null && other.getSignatureOptionDetail()==null) ||
             (this.signatureOptionDetail!=null &&
              this.signatureOptionDetail.equals(other.getSignatureOptionDetail()))) &&
            ((this.priorityAlertDetail==null && other.getPriorityAlertDetail()==null) ||
             (this.priorityAlertDetail!=null &&
              this.priorityAlertDetail.equals(other.getPriorityAlertDetail()))) &&
            ((this.alcoholDetail==null && other.getAlcoholDetail()==null) ||
             (this.alcoholDetail!=null &&
              this.alcoholDetail.equals(other.getAlcoholDetail())));
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
        if (getSpecialServiceTypes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSpecialServiceTypes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSpecialServiceTypes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCodDetail() != null) {
            _hashCode += getCodDetail().hashCode();
        }
        if (getDangerousGoodsDetail() != null) {
            _hashCode += getDangerousGoodsDetail().hashCode();
        }
        if (getBatteryDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBatteryDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBatteryDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDryIceWeight() != null) {
            _hashCode += getDryIceWeight().hashCode();
        }
        if (getSignatureOptionDetail() != null) {
            _hashCode += getSignatureOptionDetail().hashCode();
        }
        if (getPriorityAlertDetail() != null) {
            _hashCode += getPriorityAlertDetail().hashCode();
        }
        if (getAlcoholDetail() != null) {
            _hashCode += getAlcoholDetail().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PackageSpecialServicesRequested.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "PackageSpecialServicesRequested"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specialServiceTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "SpecialServiceTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "PackageSpecialServiceType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "CodDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "CodDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dangerousGoodsDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "DangerousGoodsDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "DangerousGoodsDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batteryDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "BatteryDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "BatteryClassificationDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dryIceWeight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "DryIceWeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "Weight"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signatureOptionDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "SignatureOptionDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "SignatureOptionDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priorityAlertDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "PriorityAlertDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "PriorityAlertDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alcoholDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "AlcoholDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "AlcoholDetail"));
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
