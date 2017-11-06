/**
 * AncillaryFeeAndTaxType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.somoplay.artonexpress.fedex.Ship;

public class AncillaryFeeAndTaxType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AncillaryFeeAndTaxType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _CLEARANCE_ENTRY_FEE = "CLEARANCE_ENTRY_FEE";
    public static final java.lang.String _GOODS_AND_SERVICES_TAX = "GOODS_AND_SERVICES_TAX";
    public static final java.lang.String _HARMONIZED_SALES_TAX = "HARMONIZED_SALES_TAX";
    public static final java.lang.String _OTHER = "OTHER";
    public static final AncillaryFeeAndTaxType CLEARANCE_ENTRY_FEE = new AncillaryFeeAndTaxType(_CLEARANCE_ENTRY_FEE);
    public static final AncillaryFeeAndTaxType GOODS_AND_SERVICES_TAX = new AncillaryFeeAndTaxType(_GOODS_AND_SERVICES_TAX);
    public static final AncillaryFeeAndTaxType HARMONIZED_SALES_TAX = new AncillaryFeeAndTaxType(_HARMONIZED_SALES_TAX);
    public static final AncillaryFeeAndTaxType OTHER = new AncillaryFeeAndTaxType(_OTHER);
    public java.lang.String getValue() { return _value_;}
    public static AncillaryFeeAndTaxType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AncillaryFeeAndTaxType enumeration = (AncillaryFeeAndTaxType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AncillaryFeeAndTaxType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType,
           java.lang.Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType,
           java.lang.Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AncillaryFeeAndTaxType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "AncillaryFeeAndTaxType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
