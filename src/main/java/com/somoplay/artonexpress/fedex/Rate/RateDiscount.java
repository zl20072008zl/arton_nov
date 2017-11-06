/**
 * RateDiscount.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.somoplay.artonexpress.fedex.Rate;

public class RateDiscount  implements java.io.Serializable {
    private RateDiscountType rateDiscountType;

    private java.lang.String description;

    private Money amount;

    private java.math.BigDecimal percent;

    public RateDiscount() {
    }

    public RateDiscount(
           RateDiscountType rateDiscountType,
           java.lang.String description,
           Money amount,
           java.math.BigDecimal percent) {
           this.rateDiscountType = rateDiscountType;
           this.description = description;
           this.amount = amount;
           this.percent = percent;
    }


    /**
     * Gets the rateDiscountType value for this RateDiscount.
     *
     * @return rateDiscountType
     */
    public RateDiscountType getRateDiscountType() {
        return rateDiscountType;
    }


    /**
     * Sets the rateDiscountType value for this RateDiscount.
     *
     * @param rateDiscountType
     */
    public void setRateDiscountType(RateDiscountType rateDiscountType) {
        this.rateDiscountType = rateDiscountType;
    }


    /**
     * Gets the description value for this RateDiscount.
     *
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this RateDiscount.
     *
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the amount value for this RateDiscount.
     *
     * @return amount
     */
    public Money getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this RateDiscount.
     *
     * @param amount
     */
    public void setAmount(Money amount) {
        this.amount = amount;
    }


    /**
     * Gets the percent value for this RateDiscount.
     *
     * @return percent
     */
    public java.math.BigDecimal getPercent() {
        return percent;
    }


    /**
     * Sets the percent value for this RateDiscount.
     *
     * @param percent
     */
    public void setPercent(java.math.BigDecimal percent) {
        this.percent = percent;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RateDiscount)) return false;
        RateDiscount other = (RateDiscount) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
            ((this.rateDiscountType==null && other.getRateDiscountType()==null) ||
             (this.rateDiscountType!=null &&
              this.rateDiscountType.equals(other.getRateDiscountType()))) &&
            ((this.description==null && other.getDescription()==null) ||
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.amount==null && other.getAmount()==null) ||
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.percent==null && other.getPercent()==null) ||
             (this.percent!=null &&
              this.percent.equals(other.getPercent())));
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
        if (getRateDiscountType() != null) {
            _hashCode += getRateDiscountType().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getPercent() != null) {
            _hashCode += getPercent().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RateDiscount.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "RateDiscount"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rateDiscountType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "RateDiscountType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "RateDiscountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "Amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "Percent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
