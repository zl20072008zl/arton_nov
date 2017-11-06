/**
 * CustomLabelDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.somoplay.artonexpress.fedex.Rate;

public class CustomLabelDetail  implements java.io.Serializable {
    private CustomLabelCoordinateUnits coordinateUnits;

    private CustomLabelTextEntry[] textEntries;

    private CustomLabelGraphicEntry[] graphicEntries;

    private CustomLabelBoxEntry[] boxEntries;

    private CustomLabelTextBoxEntry[] textBoxEntries;

    private CustomLabelBarcodeEntry[] barcodeEntries;

    public CustomLabelDetail() {
    }

    public CustomLabelDetail(
           CustomLabelCoordinateUnits coordinateUnits,
           CustomLabelTextEntry[] textEntries,
           CustomLabelGraphicEntry[] graphicEntries,
           CustomLabelBoxEntry[] boxEntries,
           CustomLabelTextBoxEntry[] textBoxEntries,
           CustomLabelBarcodeEntry[] barcodeEntries) {
           this.coordinateUnits = coordinateUnits;
           this.textEntries = textEntries;
           this.graphicEntries = graphicEntries;
           this.boxEntries = boxEntries;
           this.textBoxEntries = textBoxEntries;
           this.barcodeEntries = barcodeEntries;
    }


    /**
     * Gets the coordinateUnits value for this CustomLabelDetail.
     *
     * @return coordinateUnits
     */
    public CustomLabelCoordinateUnits getCoordinateUnits() {
        return coordinateUnits;
    }


    /**
     * Sets the coordinateUnits value for this CustomLabelDetail.
     *
     * @param coordinateUnits
     */
    public void setCoordinateUnits(CustomLabelCoordinateUnits coordinateUnits) {
        this.coordinateUnits = coordinateUnits;
    }


    /**
     * Gets the textEntries value for this CustomLabelDetail.
     *
     * @return textEntries
     */
    public CustomLabelTextEntry[] getTextEntries() {
        return textEntries;
    }


    /**
     * Sets the textEntries value for this CustomLabelDetail.
     *
     * @param textEntries
     */
    public void setTextEntries(CustomLabelTextEntry[] textEntries) {
        this.textEntries = textEntries;
    }

    public CustomLabelTextEntry getTextEntries(int i) {
        return this.textEntries[i];
    }

    public void setTextEntries(int i, CustomLabelTextEntry _value) {
        this.textEntries[i] = _value;
    }


    /**
     * Gets the graphicEntries value for this CustomLabelDetail.
     *
     * @return graphicEntries
     */
    public CustomLabelGraphicEntry[] getGraphicEntries() {
        return graphicEntries;
    }


    /**
     * Sets the graphicEntries value for this CustomLabelDetail.
     *
     * @param graphicEntries
     */
    public void setGraphicEntries(CustomLabelGraphicEntry[] graphicEntries) {
        this.graphicEntries = graphicEntries;
    }

    public CustomLabelGraphicEntry getGraphicEntries(int i) {
        return this.graphicEntries[i];
    }

    public void setGraphicEntries(int i, CustomLabelGraphicEntry _value) {
        this.graphicEntries[i] = _value;
    }


    /**
     * Gets the boxEntries value for this CustomLabelDetail.
     *
     * @return boxEntries
     */
    public CustomLabelBoxEntry[] getBoxEntries() {
        return boxEntries;
    }


    /**
     * Sets the boxEntries value for this CustomLabelDetail.
     *
     * @param boxEntries
     */
    public void setBoxEntries(CustomLabelBoxEntry[] boxEntries) {
        this.boxEntries = boxEntries;
    }

    public CustomLabelBoxEntry getBoxEntries(int i) {
        return this.boxEntries[i];
    }

    public void setBoxEntries(int i, CustomLabelBoxEntry _value) {
        this.boxEntries[i] = _value;
    }


    /**
     * Gets the textBoxEntries value for this CustomLabelDetail.
     *
     * @return textBoxEntries
     */
    public CustomLabelTextBoxEntry[] getTextBoxEntries() {
        return textBoxEntries;
    }


    /**
     * Sets the textBoxEntries value for this CustomLabelDetail.
     *
     * @param textBoxEntries
     */
    public void setTextBoxEntries(CustomLabelTextBoxEntry[] textBoxEntries) {
        this.textBoxEntries = textBoxEntries;
    }

    public CustomLabelTextBoxEntry getTextBoxEntries(int i) {
        return this.textBoxEntries[i];
    }

    public void setTextBoxEntries(int i, CustomLabelTextBoxEntry _value) {
        this.textBoxEntries[i] = _value;
    }


    /**
     * Gets the barcodeEntries value for this CustomLabelDetail.
     *
     * @return barcodeEntries
     */
    public CustomLabelBarcodeEntry[] getBarcodeEntries() {
        return barcodeEntries;
    }


    /**
     * Sets the barcodeEntries value for this CustomLabelDetail.
     *
     * @param barcodeEntries
     */
    public void setBarcodeEntries(CustomLabelBarcodeEntry[] barcodeEntries) {
        this.barcodeEntries = barcodeEntries;
    }

    public CustomLabelBarcodeEntry getBarcodeEntries(int i) {
        return this.barcodeEntries[i];
    }

    public void setBarcodeEntries(int i, CustomLabelBarcodeEntry _value) {
        this.barcodeEntries[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomLabelDetail)) return false;
        CustomLabelDetail other = (CustomLabelDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
            ((this.coordinateUnits==null && other.getCoordinateUnits()==null) ||
             (this.coordinateUnits!=null &&
              this.coordinateUnits.equals(other.getCoordinateUnits()))) &&
            ((this.textEntries==null && other.getTextEntries()==null) ||
             (this.textEntries!=null &&
              java.util.Arrays.equals(this.textEntries, other.getTextEntries()))) &&
            ((this.graphicEntries==null && other.getGraphicEntries()==null) ||
             (this.graphicEntries!=null &&
              java.util.Arrays.equals(this.graphicEntries, other.getGraphicEntries()))) &&
            ((this.boxEntries==null && other.getBoxEntries()==null) ||
             (this.boxEntries!=null &&
              java.util.Arrays.equals(this.boxEntries, other.getBoxEntries()))) &&
            ((this.textBoxEntries==null && other.getTextBoxEntries()==null) ||
             (this.textBoxEntries!=null &&
              java.util.Arrays.equals(this.textBoxEntries, other.getTextBoxEntries()))) &&
            ((this.barcodeEntries==null && other.getBarcodeEntries()==null) ||
             (this.barcodeEntries!=null &&
              java.util.Arrays.equals(this.barcodeEntries, other.getBarcodeEntries())));
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
        if (getCoordinateUnits() != null) {
            _hashCode += getCoordinateUnits().hashCode();
        }
        if (getTextEntries() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTextEntries());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTextEntries(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGraphicEntries() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGraphicEntries());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGraphicEntries(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBoxEntries() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBoxEntries());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBoxEntries(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTextBoxEntries() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTextBoxEntries());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTextBoxEntries(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBarcodeEntries() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBarcodeEntries());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBarcodeEntries(), i);
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
        new org.apache.axis.description.TypeDesc(CustomLabelDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "CustomLabelDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coordinateUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "CoordinateUnits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "CustomLabelCoordinateUnits"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("textEntries");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "TextEntries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "CustomLabelTextEntry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("graphicEntries");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "GraphicEntries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "CustomLabelGraphicEntry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("boxEntries");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "BoxEntries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "CustomLabelBoxEntry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("textBoxEntries");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "TextBoxEntries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "CustomLabelTextBoxEntry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("barcodeEntries");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "BarcodeEntries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "CustomLabelBarcodeEntry"));
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
