/**
 * PendingShipmentDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.somoplay.artonexpress.fedex.Rate;


/**
 * This information describes the kind of pending shipment being requested.
 */
public class PendingShipmentDetail  implements java.io.Serializable {
    private PendingShipmentType type;

    /* Date after which the pending shipment will no longer be available
     * for completion. */
    private java.util.Date expirationDate;

    private PendingShipmentProcessingOptionsRequested processingOptions;

    /* These are documents that are recommended to be included with
     * the shipment. */
    private RecommendedDocumentSpecification recommendedDocumentSpecification;

    public PendingShipmentDetail() {
    }

    public PendingShipmentDetail(
           PendingShipmentType type,
           java.util.Date expirationDate,
           PendingShipmentProcessingOptionsRequested processingOptions,
           RecommendedDocumentSpecification recommendedDocumentSpecification) {
           this.type = type;
           this.expirationDate = expirationDate;
           this.processingOptions = processingOptions;
           this.recommendedDocumentSpecification = recommendedDocumentSpecification;
    }


    /**
     * Gets the type value for this PendingShipmentDetail.
     *
     * @return type
     */
    public PendingShipmentType getType() {
        return type;
    }


    /**
     * Sets the type value for this PendingShipmentDetail.
     *
     * @param type
     */
    public void setType(PendingShipmentType type) {
        this.type = type;
    }


    /**
     * Gets the expirationDate value for this PendingShipmentDetail.
     *
     * @return expirationDate   * Date after which the pending shipment will no longer be available
     * for completion.
     */
    public java.util.Date getExpirationDate() {
        return expirationDate;
    }


    /**
     * Sets the expirationDate value for this PendingShipmentDetail.
     *
     * @param expirationDate   * Date after which the pending shipment will no longer be available
     * for completion.
     */
    public void setExpirationDate(java.util.Date expirationDate) {
        this.expirationDate = expirationDate;
    }


    /**
     * Gets the processingOptions value for this PendingShipmentDetail.
     *
     * @return processingOptions
     */
    public PendingShipmentProcessingOptionsRequested getProcessingOptions() {
        return processingOptions;
    }


    /**
     * Sets the processingOptions value for this PendingShipmentDetail.
     *
     * @param processingOptions
     */
    public void setProcessingOptions(PendingShipmentProcessingOptionsRequested processingOptions) {
        this.processingOptions = processingOptions;
    }


    /**
     * Gets the recommendedDocumentSpecification value for this PendingShipmentDetail.
     *
     * @return recommendedDocumentSpecification   * These are documents that are recommended to be included with
     * the shipment.
     */
    public RecommendedDocumentSpecification getRecommendedDocumentSpecification() {
        return recommendedDocumentSpecification;
    }


    /**
     * Sets the recommendedDocumentSpecification value for this PendingShipmentDetail.
     *
     * @param recommendedDocumentSpecification   * These are documents that are recommended to be included with
     * the shipment.
     */
    public void setRecommendedDocumentSpecification(RecommendedDocumentSpecification recommendedDocumentSpecification) {
        this.recommendedDocumentSpecification = recommendedDocumentSpecification;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PendingShipmentDetail)) return false;
        PendingShipmentDetail other = (PendingShipmentDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
            ((this.type==null && other.getType()==null) ||
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.expirationDate==null && other.getExpirationDate()==null) ||
             (this.expirationDate!=null &&
              this.expirationDate.equals(other.getExpirationDate()))) &&
            ((this.processingOptions==null && other.getProcessingOptions()==null) ||
             (this.processingOptions!=null &&
              this.processingOptions.equals(other.getProcessingOptions()))) &&
            ((this.recommendedDocumentSpecification==null && other.getRecommendedDocumentSpecification()==null) ||
             (this.recommendedDocumentSpecification!=null &&
              this.recommendedDocumentSpecification.equals(other.getRecommendedDocumentSpecification())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getExpirationDate() != null) {
            _hashCode += getExpirationDate().hashCode();
        }
        if (getProcessingOptions() != null) {
            _hashCode += getProcessingOptions().hashCode();
        }
        if (getRecommendedDocumentSpecification() != null) {
            _hashCode += getRecommendedDocumentSpecification().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PendingShipmentDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "PendingShipmentDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "PendingShipmentType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "ExpirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processingOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "ProcessingOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "PendingShipmentProcessingOptionsRequested"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recommendedDocumentSpecification");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "RecommendedDocumentSpecification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "RecommendedDocumentSpecification"));
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
