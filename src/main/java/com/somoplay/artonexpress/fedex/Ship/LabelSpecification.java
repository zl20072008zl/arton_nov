/**
 * LabelSpecification.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.somoplay.artonexpress.fedex.Ship;

public class LabelSpecification  implements java.io.Serializable {
    /* Specifies how to create, organize, and return the document. */
    private ShippingDocumentDispositionDetail[] dispositions;

    private LabelFormatType labelFormatType;

    private ShippingDocumentImageType imageType;

    private LabelStockType labelStockType;

    private LabelPrintingOrientationType labelPrintingOrientation;

    /* Specifies the order in which the labels are requested to be
     * returned */
    private LabelOrderType labelOrder;

    private ContactAndAddress printedLabelOrigin;

    private CustomerSpecifiedLabelDetail customerSpecifiedDetail;

    public LabelSpecification() {
    }

    public LabelSpecification(
           ShippingDocumentDispositionDetail[] dispositions,
           LabelFormatType labelFormatType,
           ShippingDocumentImageType imageType,
           LabelStockType labelStockType,
           LabelPrintingOrientationType labelPrintingOrientation,
           LabelOrderType labelOrder,
           ContactAndAddress printedLabelOrigin,
           CustomerSpecifiedLabelDetail customerSpecifiedDetail) {
           this.dispositions = dispositions;
           this.labelFormatType = labelFormatType;
           this.imageType = imageType;
           this.labelStockType = labelStockType;
           this.labelPrintingOrientation = labelPrintingOrientation;
           this.labelOrder = labelOrder;
           this.printedLabelOrigin = printedLabelOrigin;
           this.customerSpecifiedDetail = customerSpecifiedDetail;
    }


    /**
     * Gets the dispositions value for this LabelSpecification.
     *
     * @return dispositions   * Specifies how to create, organize, and return the document.
     */
    public ShippingDocumentDispositionDetail[] getDispositions() {
        return dispositions;
    }


    /**
     * Sets the dispositions value for this LabelSpecification.
     *
     * @param dispositions   * Specifies how to create, organize, and return the document.
     */
    public void setDispositions(ShippingDocumentDispositionDetail[] dispositions) {
        this.dispositions = dispositions;
    }

    public ShippingDocumentDispositionDetail getDispositions(int i) {
        return this.dispositions[i];
    }

    public void setDispositions(int i, ShippingDocumentDispositionDetail _value) {
        this.dispositions[i] = _value;
    }


    /**
     * Gets the labelFormatType value for this LabelSpecification.
     *
     * @return labelFormatType
     */
    public LabelFormatType getLabelFormatType() {
        return labelFormatType;
    }


    /**
     * Sets the labelFormatType value for this LabelSpecification.
     *
     * @param labelFormatType
     */
    public void setLabelFormatType(LabelFormatType labelFormatType) {
        this.labelFormatType = labelFormatType;
    }


    /**
     * Gets the imageType value for this LabelSpecification.
     *
     * @return imageType
     */
    public ShippingDocumentImageType getImageType() {
        return imageType;
    }


    /**
     * Sets the imageType value for this LabelSpecification.
     *
     * @param imageType
     */
    public void setImageType(ShippingDocumentImageType imageType) {
        this.imageType = imageType;
    }


    /**
     * Gets the labelStockType value for this LabelSpecification.
     *
     * @return labelStockType
     */
    public LabelStockType getLabelStockType() {
        return labelStockType;
    }


    /**
     * Sets the labelStockType value for this LabelSpecification.
     *
     * @param labelStockType
     */
    public void setLabelStockType(LabelStockType labelStockType) {
        this.labelStockType = labelStockType;
    }


    /**
     * Gets the labelPrintingOrientation value for this LabelSpecification.
     *
     * @return labelPrintingOrientation
     */
    public LabelPrintingOrientationType getLabelPrintingOrientation() {
        return labelPrintingOrientation;
    }


    /**
     * Sets the labelPrintingOrientation value for this LabelSpecification.
     *
     * @param labelPrintingOrientation
     */
    public void setLabelPrintingOrientation(LabelPrintingOrientationType labelPrintingOrientation) {
        this.labelPrintingOrientation = labelPrintingOrientation;
    }


    /**
     * Gets the labelOrder value for this LabelSpecification.
     *
     * @return labelOrder   * Specifies the order in which the labels are requested to be
     * returned
     */
    public LabelOrderType getLabelOrder() {
        return labelOrder;
    }


    /**
     * Sets the labelOrder value for this LabelSpecification.
     *
     * @param labelOrder   * Specifies the order in which the labels are requested to be
     * returned
     */
    public void setLabelOrder(LabelOrderType labelOrder) {
        this.labelOrder = labelOrder;
    }


    /**
     * Gets the printedLabelOrigin value for this LabelSpecification.
     *
     * @return printedLabelOrigin
     */
    public ContactAndAddress getPrintedLabelOrigin() {
        return printedLabelOrigin;
    }


    /**
     * Sets the printedLabelOrigin value for this LabelSpecification.
     *
     * @param printedLabelOrigin
     */
    public void setPrintedLabelOrigin(ContactAndAddress printedLabelOrigin) {
        this.printedLabelOrigin = printedLabelOrigin;
    }


    /**
     * Gets the customerSpecifiedDetail value for this LabelSpecification.
     *
     * @return customerSpecifiedDetail
     */
    public CustomerSpecifiedLabelDetail getCustomerSpecifiedDetail() {
        return customerSpecifiedDetail;
    }


    /**
     * Sets the customerSpecifiedDetail value for this LabelSpecification.
     *
     * @param customerSpecifiedDetail
     */
    public void setCustomerSpecifiedDetail(CustomerSpecifiedLabelDetail customerSpecifiedDetail) {
        this.customerSpecifiedDetail = customerSpecifiedDetail;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LabelSpecification)) return false;
        LabelSpecification other = (LabelSpecification) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
            ((this.dispositions==null && other.getDispositions()==null) ||
             (this.dispositions!=null &&
              java.util.Arrays.equals(this.dispositions, other.getDispositions()))) &&
            ((this.labelFormatType==null && other.getLabelFormatType()==null) ||
             (this.labelFormatType!=null &&
              this.labelFormatType.equals(other.getLabelFormatType()))) &&
            ((this.imageType==null && other.getImageType()==null) ||
             (this.imageType!=null &&
              this.imageType.equals(other.getImageType()))) &&
            ((this.labelStockType==null && other.getLabelStockType()==null) ||
             (this.labelStockType!=null &&
              this.labelStockType.equals(other.getLabelStockType()))) &&
            ((this.labelPrintingOrientation==null && other.getLabelPrintingOrientation()==null) ||
             (this.labelPrintingOrientation!=null &&
              this.labelPrintingOrientation.equals(other.getLabelPrintingOrientation()))) &&
            ((this.labelOrder==null && other.getLabelOrder()==null) ||
             (this.labelOrder!=null &&
              this.labelOrder.equals(other.getLabelOrder()))) &&
            ((this.printedLabelOrigin==null && other.getPrintedLabelOrigin()==null) ||
             (this.printedLabelOrigin!=null &&
              this.printedLabelOrigin.equals(other.getPrintedLabelOrigin()))) &&
            ((this.customerSpecifiedDetail==null && other.getCustomerSpecifiedDetail()==null) ||
             (this.customerSpecifiedDetail!=null &&
              this.customerSpecifiedDetail.equals(other.getCustomerSpecifiedDetail())));
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
        if (getDispositions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDispositions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDispositions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLabelFormatType() != null) {
            _hashCode += getLabelFormatType().hashCode();
        }
        if (getImageType() != null) {
            _hashCode += getImageType().hashCode();
        }
        if (getLabelStockType() != null) {
            _hashCode += getLabelStockType().hashCode();
        }
        if (getLabelPrintingOrientation() != null) {
            _hashCode += getLabelPrintingOrientation().hashCode();
        }
        if (getLabelOrder() != null) {
            _hashCode += getLabelOrder().hashCode();
        }
        if (getPrintedLabelOrigin() != null) {
            _hashCode += getPrintedLabelOrigin().hashCode();
        }
        if (getCustomerSpecifiedDetail() != null) {
            _hashCode += getCustomerSpecifiedDetail().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LabelSpecification.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "LabelSpecification"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dispositions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "Dispositions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ShippingDocumentDispositionDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("labelFormatType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "LabelFormatType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "LabelFormatType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imageType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ImageType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ShippingDocumentImageType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("labelStockType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "LabelStockType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "LabelStockType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("labelPrintingOrientation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "LabelPrintingOrientation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "LabelPrintingOrientationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("labelOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "LabelOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "LabelOrderType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("printedLabelOrigin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "PrintedLabelOrigin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ContactAndAddress"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerSpecifiedDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "CustomerSpecifiedDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "CustomerSpecifiedLabelDetail"));
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
