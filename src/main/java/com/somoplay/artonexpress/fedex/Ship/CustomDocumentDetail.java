/**
 * CustomDocumentDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.somoplay.artonexpress.fedex.Ship;


/**
 * Data required to produce a custom-specified document, either at
 * shipment or package level.
 */
public class CustomDocumentDetail  implements java.io.Serializable {
    /* Common information controlling document production. */
    private ShippingDocumentFormat format;

    /* Applicable only to documents produced on thermal printers with
     * roll stock. */
    private LabelPrintingOrientationType labelPrintingOrientation;

    /* Applicable only to documents produced on thermal printers with
     * roll stock. */
    private LabelRotationType labelRotation;

    /* Identifies the formatting specification used to construct this
     * custom document. */
    private java.lang.String specificationId;

    /* Identifies the individual document specified by the client. */
    private java.lang.String customDocumentIdentifier;

    /* If provided, thermal documents will include specified doc tab
     * content. If omitted, document will be produced without doc tab content. */
    private DocTabContent docTabContent;

    private CustomLabelDetail customContent;

    public CustomDocumentDetail() {
    }

    public CustomDocumentDetail(
           ShippingDocumentFormat format,
           LabelPrintingOrientationType labelPrintingOrientation,
           LabelRotationType labelRotation,
           java.lang.String specificationId,
           java.lang.String customDocumentIdentifier,
           DocTabContent docTabContent,
           CustomLabelDetail customContent) {
           this.format = format;
           this.labelPrintingOrientation = labelPrintingOrientation;
           this.labelRotation = labelRotation;
           this.specificationId = specificationId;
           this.customDocumentIdentifier = customDocumentIdentifier;
           this.docTabContent = docTabContent;
           this.customContent = customContent;
    }


    /**
     * Gets the format value for this CustomDocumentDetail.
     *
     * @return format   * Common information controlling document production.
     */
    public ShippingDocumentFormat getFormat() {
        return format;
    }


    /**
     * Sets the format value for this CustomDocumentDetail.
     *
     * @param format   * Common information controlling document production.
     */
    public void setFormat(ShippingDocumentFormat format) {
        this.format = format;
    }


    /**
     * Gets the labelPrintingOrientation value for this CustomDocumentDetail.
     *
     * @return labelPrintingOrientation   * Applicable only to documents produced on thermal printers with
     * roll stock.
     */
    public LabelPrintingOrientationType getLabelPrintingOrientation() {
        return labelPrintingOrientation;
    }


    /**
     * Sets the labelPrintingOrientation value for this CustomDocumentDetail.
     *
     * @param labelPrintingOrientation   * Applicable only to documents produced on thermal printers with
     * roll stock.
     */
    public void setLabelPrintingOrientation(LabelPrintingOrientationType labelPrintingOrientation) {
        this.labelPrintingOrientation = labelPrintingOrientation;
    }


    /**
     * Gets the labelRotation value for this CustomDocumentDetail.
     *
     * @return labelRotation   * Applicable only to documents produced on thermal printers with
     * roll stock.
     */
    public LabelRotationType getLabelRotation() {
        return labelRotation;
    }


    /**
     * Sets the labelRotation value for this CustomDocumentDetail.
     *
     * @param labelRotation   * Applicable only to documents produced on thermal printers with
     * roll stock.
     */
    public void setLabelRotation(LabelRotationType labelRotation) {
        this.labelRotation = labelRotation;
    }


    /**
     * Gets the specificationId value for this CustomDocumentDetail.
     *
     * @return specificationId   * Identifies the formatting specification used to construct this
     * custom document.
     */
    public java.lang.String getSpecificationId() {
        return specificationId;
    }


    /**
     * Sets the specificationId value for this CustomDocumentDetail.
     *
     * @param specificationId   * Identifies the formatting specification used to construct this
     * custom document.
     */
    public void setSpecificationId(java.lang.String specificationId) {
        this.specificationId = specificationId;
    }


    /**
     * Gets the customDocumentIdentifier value for this CustomDocumentDetail.
     *
     * @return customDocumentIdentifier   * Identifies the individual document specified by the client.
     */
    public java.lang.String getCustomDocumentIdentifier() {
        return customDocumentIdentifier;
    }


    /**
     * Sets the customDocumentIdentifier value for this CustomDocumentDetail.
     *
     * @param customDocumentIdentifier   * Identifies the individual document specified by the client.
     */
    public void setCustomDocumentIdentifier(java.lang.String customDocumentIdentifier) {
        this.customDocumentIdentifier = customDocumentIdentifier;
    }


    /**
     * Gets the docTabContent value for this CustomDocumentDetail.
     *
     * @return docTabContent   * If provided, thermal documents will include specified doc tab
     * content. If omitted, document will be produced without doc tab content.
     */
    public DocTabContent getDocTabContent() {
        return docTabContent;
    }


    /**
     * Sets the docTabContent value for this CustomDocumentDetail.
     *
     * @param docTabContent   * If provided, thermal documents will include specified doc tab
     * content. If omitted, document will be produced without doc tab content.
     */
    public void setDocTabContent(DocTabContent docTabContent) {
        this.docTabContent = docTabContent;
    }


    /**
     * Gets the customContent value for this CustomDocumentDetail.
     *
     * @return customContent
     */
    public CustomLabelDetail getCustomContent() {
        return customContent;
    }


    /**
     * Sets the customContent value for this CustomDocumentDetail.
     *
     * @param customContent
     */
    public void setCustomContent(CustomLabelDetail customContent) {
        this.customContent = customContent;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomDocumentDetail)) return false;
        CustomDocumentDetail other = (CustomDocumentDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
            ((this.format==null && other.getFormat()==null) ||
             (this.format!=null &&
              this.format.equals(other.getFormat()))) &&
            ((this.labelPrintingOrientation==null && other.getLabelPrintingOrientation()==null) ||
             (this.labelPrintingOrientation!=null &&
              this.labelPrintingOrientation.equals(other.getLabelPrintingOrientation()))) &&
            ((this.labelRotation==null && other.getLabelRotation()==null) ||
             (this.labelRotation!=null &&
              this.labelRotation.equals(other.getLabelRotation()))) &&
            ((this.specificationId==null && other.getSpecificationId()==null) ||
             (this.specificationId!=null &&
              this.specificationId.equals(other.getSpecificationId()))) &&
            ((this.customDocumentIdentifier==null && other.getCustomDocumentIdentifier()==null) ||
             (this.customDocumentIdentifier!=null &&
              this.customDocumentIdentifier.equals(other.getCustomDocumentIdentifier()))) &&
            ((this.docTabContent==null && other.getDocTabContent()==null) ||
             (this.docTabContent!=null &&
              this.docTabContent.equals(other.getDocTabContent()))) &&
            ((this.customContent==null && other.getCustomContent()==null) ||
             (this.customContent!=null &&
              this.customContent.equals(other.getCustomContent())));
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
        if (getFormat() != null) {
            _hashCode += getFormat().hashCode();
        }
        if (getLabelPrintingOrientation() != null) {
            _hashCode += getLabelPrintingOrientation().hashCode();
        }
        if (getLabelRotation() != null) {
            _hashCode += getLabelRotation().hashCode();
        }
        if (getSpecificationId() != null) {
            _hashCode += getSpecificationId().hashCode();
        }
        if (getCustomDocumentIdentifier() != null) {
            _hashCode += getCustomDocumentIdentifier().hashCode();
        }
        if (getDocTabContent() != null) {
            _hashCode += getDocTabContent().hashCode();
        }
        if (getCustomContent() != null) {
            _hashCode += getCustomContent().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomDocumentDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "CustomDocumentDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("format");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "Format"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ShippingDocumentFormat"));
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
        elemField.setFieldName("labelRotation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "LabelRotation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "LabelRotationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specificationId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "SpecificationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customDocumentIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "CustomDocumentIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docTabContent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "DocTabContent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "DocTabContent"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customContent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "CustomContent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "CustomLabelDetail"));
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
