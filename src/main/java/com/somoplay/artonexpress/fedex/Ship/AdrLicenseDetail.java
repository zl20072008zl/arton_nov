/**
 * AdrLicenseDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.somoplay.artonexpress.fedex.Ship;


/**
 * Specifies the details around the ADR license required for shipping.
 */
public class AdrLicenseDetail  implements java.io.Serializable {
    private LicenseOrPermitDetail licenseOrPermitDetail;

    public AdrLicenseDetail() {
    }

    public AdrLicenseDetail(
           LicenseOrPermitDetail licenseOrPermitDetail) {
           this.licenseOrPermitDetail = licenseOrPermitDetail;
    }


    /**
     * Gets the licenseOrPermitDetail value for this AdrLicenseDetail.
     *
     * @return licenseOrPermitDetail
     */
    public LicenseOrPermitDetail getLicenseOrPermitDetail() {
        return licenseOrPermitDetail;
    }


    /**
     * Sets the licenseOrPermitDetail value for this AdrLicenseDetail.
     *
     * @param licenseOrPermitDetail
     */
    public void setLicenseOrPermitDetail(LicenseOrPermitDetail licenseOrPermitDetail) {
        this.licenseOrPermitDetail = licenseOrPermitDetail;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdrLicenseDetail)) return false;
        AdrLicenseDetail other = (AdrLicenseDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
            ((this.licenseOrPermitDetail==null && other.getLicenseOrPermitDetail()==null) ||
             (this.licenseOrPermitDetail!=null &&
              this.licenseOrPermitDetail.equals(other.getLicenseOrPermitDetail())));
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
        if (getLicenseOrPermitDetail() != null) {
            _hashCode += getLicenseOrPermitDetail().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdrLicenseDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "AdrLicenseDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("licenseOrPermitDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "LicenseOrPermitDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "LicenseOrPermitDetail"));
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
