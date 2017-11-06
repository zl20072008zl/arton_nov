/**
 * RateServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.somoplay.artonexpress.fedex.Rate;

public class RateServiceSoapBindingStub extends org.apache.axis.client.Stub implements RatePortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[1];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRates");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "RateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "RateRequest"), RateRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "RateReply"));
        oper.setReturnClass(RateReply.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "RateReply"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

    }

    public RateServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public RateServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public RateServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
        addBindings2();
        addBindings3();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "AdditionalLabelsDetail");
            cachedSerQNames.add(qName);
            cls = AdditionalLabelsDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "AdditionalLabelsType");
            cachedSerQNames.add(qName);
            cls = AdditionalLabelsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "Address");
            cachedSerQNames.add(qName);
            cls = Address.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "AlcoholDetail");
            cachedSerQNames.add(qName);
            cls = AlcoholDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "AlcoholRecipientType");
            cachedSerQNames.add(qName);
            cls = AlcoholRecipientType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "AncillaryFeeAndTax");
            cachedSerQNames.add(qName);
            cls = AncillaryFeeAndTax.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "AncillaryFeeAndTaxType");
            cachedSerQNames.add(qName);
            cls = AncillaryFeeAndTaxType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "B13AFilingOptionType");
            cachedSerQNames.add(qName);
            cls = B13AFilingOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "BarcodeSymbologyType");
            cachedSerQNames.add(qName);
            cls = BarcodeSymbologyType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "BatteryClassificationDetail");
            cachedSerQNames.add(qName);
            cls = BatteryClassificationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "BatteryMaterialType");
            cachedSerQNames.add(qName);
            cls = BatteryMaterialType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "BatteryPackingType");
            cachedSerQNames.add(qName);
            cls = BatteryPackingType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "BatteryRegulatorySubType");
            cachedSerQNames.add(qName);
            cls = BatteryRegulatorySubType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "BrokerDetail");
            cachedSerQNames.add(qName);
            cls = BrokerDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "BrokerType");
            cachedSerQNames.add(qName);
            cls = BrokerType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "CarrierCodeType");
            cachedSerQNames.add(qName);
            cls = CarrierCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "CertificateOfOriginDetail");
            cachedSerQNames.add(qName);
            cls = CertificateOfOriginDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "ChargeBasisLevelType");
            cachedSerQNames.add(qName);
            cls = ChargeBasisLevelType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "CleansedAddressAndLocationDetail");
            cachedSerQNames.add(qName);
            cls = CleansedAddressAndLocationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "ClearanceBrokerageType");
            cachedSerQNames.add(qName);
            cls = ClearanceBrokerageType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "ClientDetail");
            cachedSerQNames.add(qName);
            cls = ClientDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "CodAddTransportationChargeBasisType");
            cachedSerQNames.add(qName);
            cls = CodAddTransportationChargeBasisType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "CodAddTransportationChargesDetail");
            cachedSerQNames.add(qName);
            cls = CodAddTransportationChargesDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "CodCollectionType");
            cachedSerQNames.add(qName);
            cls = CodCollectionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "CodDetail");
            cachedSerQNames.add(qName);
            cls = CodDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "CodReturnReferenceIndicatorType");
            cachedSerQNames.add(qName);
            cls = CodReturnReferenceIndicatorType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "CommercialInvoice");
            cachedSerQNames.add(qName);
            cls = CommercialInvoice.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "CommercialInvoiceDetail");
            cachedSerQNames.add(qName);
            cls = CommercialInvoiceDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "CommitDetail");
            cachedSerQNames.add(qName);
            cls = CommitDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "CommitmentDelayType");
            cachedSerQNames.add(qName);
            cls = CommitmentDelayType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "Commodity");
            cachedSerQNames.add(qName);
            cls = Commodity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "CommodityPurposeType");
            cachedSerQNames.add(qName);
            cls = CommodityPurposeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "ConfigurableLabelReferenceEntry");
            cachedSerQNames.add(qName);
            cls = ConfigurableLabelReferenceEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "ConsolidationKey");
            cachedSerQNames.add(qName);
            cls = ConsolidationKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "ConsolidationType");
            cachedSerQNames.add(qName);
            cls = ConsolidationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "Contact");
            cachedSerQNames.add(qName);
            cls = Contact.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "ContactAndAddress");
            cachedSerQNames.add(qName);
            cls = ContactAndAddress.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "ContentRecord");
            cachedSerQNames.add(qName);
            cls = ContentRecord.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "CurrencyExchangeRate");
            cachedSerQNames.add(qName);
            cls = CurrencyExchangeRate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "CustomDeliveryWindowDetail");
            cachedSerQNames.add(qName);
            cls = CustomDeliveryWindowDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "CustomDeliveryWindowType");
            cachedSerQNames.add(qName);
            cls = CustomDeliveryWindowType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "CustomDocumentDetail");
            cachedSerQNames.add(qName);
            cls = CustomDocumentDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "CustomerImageUsage");
            cachedSerQNames.add(qName);
            cls = CustomerImageUsage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "CustomerImageUsageType");
            cachedSerQNames.add(qName);
            cls = CustomerImageUsageType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "CustomerReference");
            cachedSerQNames.add(qName);
            cls = CustomerReference.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "CustomerReferenceType");
            cachedSerQNames.add(qName);
            cls = CustomerReferenceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "CustomerSpecifiedLabelDetail");
            cachedSerQNames.add(qName);
            cls = CustomerSpecifiedLabelDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "CustomerSpecifiedLabelGenerationOptionType");
            cachedSerQNames.add(qName);
            cls = CustomerSpecifiedLabelGenerationOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "CustomLabelBarcodeEntry");
            cachedSerQNames.add(qName);
            cls = CustomLabelBarcodeEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "CustomLabelBoxEntry");
            cachedSerQNames.add(qName);
            cls = CustomLabelBoxEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "CustomLabelCoordinateUnits");
            cachedSerQNames.add(qName);
            cls = CustomLabelCoordinateUnits.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "CustomLabelDetail");
            cachedSerQNames.add(qName);
            cls = CustomLabelDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "CustomLabelGraphicEntry");
            cachedSerQNames.add(qName);
            cls = CustomLabelGraphicEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "CustomLabelPosition");
            cachedSerQNames.add(qName);
            cls = CustomLabelPosition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "CustomLabelTextBoxEntry");
            cachedSerQNames.add(qName);
            cls = CustomLabelTextBoxEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "CustomLabelTextEntry");
            cachedSerQNames.add(qName);
            cls = CustomLabelTextEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "CustomsClearanceDetail");
            cachedSerQNames.add(qName);
            cls = CustomsClearanceDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "CustomsOptionDetail");
            cachedSerQNames.add(qName);
            cls = CustomsOptionDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "CustomsOptionType");
            cachedSerQNames.add(qName);
            cls = CustomsOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "DangerousGoodsAccessibilityType");
            cachedSerQNames.add(qName);
            cls = DangerousGoodsAccessibilityType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "DangerousGoodsContainer");
            cachedSerQNames.add(qName);
            cls = DangerousGoodsContainer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "DangerousGoodsDetail");
            cachedSerQNames.add(qName);
            cls = DangerousGoodsDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "DangerousGoodsPackingOptionType");
            cachedSerQNames.add(qName);
            cls = DangerousGoodsPackingOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "DangerousGoodsShippersDeclarationDetail");
            cachedSerQNames.add(qName);
            cls = DangerousGoodsShippersDeclarationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "DangerousGoodsSignatory");
            cachedSerQNames.add(qName);
            cls = DangerousGoodsSignatory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "DateRange");
            cachedSerQNames.add(qName);
            cls = DateRange.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "DayOfWeekType");
            cachedSerQNames.add(qName);
            cls = DayOfWeekType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "DelayDetail");
            cachedSerQNames.add(qName);
            cls = DelayDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "DelayLevelType");
            cachedSerQNames.add(qName);
            cls = DelayLevelType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "DelayPointType");
            cachedSerQNames.add(qName);
            cls = DelayPointType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "DeliveryOnInvoiceAcceptanceDetail");
            cachedSerQNames.add(qName);
            cls = DeliveryOnInvoiceAcceptanceDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "DestinationControlDetail");
            cachedSerQNames.add(qName);
            cls = DestinationControlDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "DestinationControlStatementType");
            cachedSerQNames.add(qName);
            cls = DestinationControlStatementType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "Dimensions");
            cachedSerQNames.add(qName);
            cls = Dimensions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "Distance");
            cachedSerQNames.add(qName);
            cls = Distance.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "DistanceUnits");
            cachedSerQNames.add(qName);
            cls = DistanceUnits.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "DocTabContent");
            cachedSerQNames.add(qName);
            cls = DocTabContent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "DocTabContentBarcoded");
            cachedSerQNames.add(qName);
            cls = DocTabContentBarcoded.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "DocTabContentType");
            cachedSerQNames.add(qName);
            cls = DocTabContentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "DocTabContentZone001");
            cachedSerQNames.add(qName);
            cls = DocTabContentZone001.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "DocTabZoneJustificationType");
            cachedSerQNames.add(qName);
            cls = DocTabZoneJustificationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "DocTabZoneSpecification");
            cachedSerQNames.add(qName);
            cls = DocTabZoneSpecification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "DocumentFormatOptionsRequested");
            cachedSerQNames.add(qName);
            cls = DocumentFormatOptionsRequested.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "DocumentFormatOptionType");
            cachedSerQNames.add(qName);
            cls = DocumentFormatOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "DropoffType");
            cachedSerQNames.add(qName);
            cls = DropoffType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "EdtCommodityTax");
            cachedSerQNames.add(qName);
            cls = EdtCommodityTax.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "EdtExciseCondition");
            cachedSerQNames.add(qName);
            cls = EdtExciseCondition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "EdtRequestType");
            cachedSerQNames.add(qName);
            cls = EdtRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "EdtTaxDetail");
            cachedSerQNames.add(qName);
            cls = EdtTaxDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "EdtTaxType");
            cachedSerQNames.add(qName);
            cls = EdtTaxType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "EMailDetail");
            cachedSerQNames.add(qName);
            cls = EMailDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "EMailNotificationRecipientType");
            cachedSerQNames.add(qName);
            cls = EMailNotificationRecipientType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "EtdAttributeType");
            cachedSerQNames.add(qName);
            cls = EtdAttributeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "EtdDetail");
            cachedSerQNames.add(qName);
            cls = EtdDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "ExportDeclarationDetail");
            cachedSerQNames.add(qName);
            cls = ExportDeclarationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "ExportDetail");
            cachedSerQNames.add(qName);
            cls = ExportDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "ExpressFreightDetail");
            cachedSerQNames.add(qName);
            cls = ExpressFreightDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "ExpressFreightDetailContact");
            cachedSerQNames.add(qName);
            cls = ExpressFreightDetailContact.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "ExpressRegionCode");
            cachedSerQNames.add(qName);
            cls = ExpressRegionCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "FedExLocationType");
            cachedSerQNames.add(qName);
            cls = FedExLocationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "FlatbedTrailerDetail");
            cachedSerQNames.add(qName);
            cls = FlatbedTrailerDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "FlatbedTrailerOption");
            cachedSerQNames.add(qName);
            cls = FlatbedTrailerOption.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "FreightAddressLabelDetail");
            cachedSerQNames.add(qName);
            cls = FreightAddressLabelDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "FreightBaseCharge");
            cachedSerQNames.add(qName);
            cls = FreightBaseCharge.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "FreightBaseChargeCalculationType");
            cachedSerQNames.add(qName);
            cls = FreightBaseChargeCalculationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "FreightChargeBasisType");
            cachedSerQNames.add(qName);
            cls = FreightChargeBasisType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "FreightClassType");
            cachedSerQNames.add(qName);
            cls = FreightClassType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "FreightCollectTermsType");
            cachedSerQNames.add(qName);
            cls = FreightCollectTermsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "FreightCommitDetail");
            cachedSerQNames.add(qName);
            cls = FreightCommitDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "FreightGuaranteeDetail");
            cachedSerQNames.add(qName);
            cls = FreightGuaranteeDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "FreightGuaranteeType");
            cachedSerQNames.add(qName);
            cls = FreightGuaranteeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "FreightOnValueType");
            cachedSerQNames.add(qName);
            cls = FreightOnValueType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "FreightRateDetail");
            cachedSerQNames.add(qName);
            cls = FreightRateDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "FreightRateNotation");
            cachedSerQNames.add(qName);
            cls = FreightRateNotation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "FreightRateQuoteType");
            cachedSerQNames.add(qName);
            cls = FreightRateQuoteType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "FreightServiceCenterDetail");
            cachedSerQNames.add(qName);
            cls = FreightServiceCenterDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "FreightServiceSchedulingType");
            cachedSerQNames.add(qName);
            cls = FreightServiceSchedulingType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "FreightShipmentDetail");
            cachedSerQNames.add(qName);
            cls = FreightShipmentDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "FreightShipmentLineItem");
            cachedSerQNames.add(qName);
            cls = FreightShipmentLineItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "FreightShipmentRoleType");
            cachedSerQNames.add(qName);
            cls = FreightShipmentRoleType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "FreightSpecialServicePayment");
            cachedSerQNames.add(qName);
            cls = FreightSpecialServicePayment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "GeneralAgencyAgreementDetail");
            cachedSerQNames.add(qName);
            cls = GeneralAgencyAgreementDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "HazardousCommodityContent");
            cachedSerQNames.add(qName);
            cls = HazardousCommodityContent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "HazardousCommodityDescription");
            cachedSerQNames.add(qName);
            cls = HazardousCommodityDescription.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "HazardousCommodityDescriptionProcessingOptionType");
            cachedSerQNames.add(qName);
            cls = HazardousCommodityDescriptionProcessingOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "HazardousCommodityInnerReceptacleDetail");
            cachedSerQNames.add(qName);
            cls = HazardousCommodityInnerReceptacleDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "HazardousCommodityLabelTextOptionType");
            cachedSerQNames.add(qName);
            cls = HazardousCommodityLabelTextOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "HazardousCommodityOptionDetail");
            cachedSerQNames.add(qName);
            cls = HazardousCommodityOptionDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "HazardousCommodityOptionType");
            cachedSerQNames.add(qName);
            cls = HazardousCommodityOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "HazardousCommodityPackagingDetail");
            cachedSerQNames.add(qName);
            cls = HazardousCommodityPackagingDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "HazardousCommodityPackingDetail");
            cachedSerQNames.add(qName);
            cls = HazardousCommodityPackingDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "HazardousCommodityPackingGroupType");
            cachedSerQNames.add(qName);
            cls = HazardousCommodityPackingGroupType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "HazardousCommodityQuantityDetail");
            cachedSerQNames.add(qName);
            cls = HazardousCommodityQuantityDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "HazardousCommodityQuantityType");
            cachedSerQNames.add(qName);
            cls = HazardousCommodityQuantityType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "HazardousCommodityRegulationType");
            cachedSerQNames.add(qName);
            cls = HazardousCommodityRegulationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "HazardousContainerPackingType");
            cachedSerQNames.add(qName);
            cls = HazardousContainerPackingType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "HoldAtLocationDetail");
            cachedSerQNames.add(qName);
            cls = HoldAtLocationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "HomeDeliveryPremiumDetail");
            cachedSerQNames.add(qName);
            cls = HomeDeliveryPremiumDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "HomeDeliveryPremiumType");
            cachedSerQNames.add(qName);
            cls = HomeDeliveryPremiumType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "ImageId");
            cachedSerQNames.add(qName);
            cls = ImageId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "InternationalControlledExportDetail");
            cachedSerQNames.add(qName);
            cls = InternationalControlledExportDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "InternationalControlledExportType");
            cachedSerQNames.add(qName);
            cls = InternationalControlledExportType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "InternationalDocumentContentType");
            cachedSerQNames.add(qName);
            cls = InternationalDocumentContentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "InternationalTrafficInArmsRegulationsDetail");
            cachedSerQNames.add(qName);
            cls = InternationalTrafficInArmsRegulationsDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "LabelFormatType");
            cachedSerQNames.add(qName);
            cls = LabelFormatType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "LabelMaskableDataType");
            cachedSerQNames.add(qName);
            cls = LabelMaskableDataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "LabelOrderType");
            cachedSerQNames.add(qName);
            cls = LabelOrderType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "LabelPrintingOrientationType");
            cachedSerQNames.add(qName);
            cls = LabelPrintingOrientationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "LabelRotationType");
            cachedSerQNames.add(qName);
            cls = LabelRotationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "LabelSpecification");
            cachedSerQNames.add(qName);
            cls = LabelSpecification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "LabelStockType");
            cachedSerQNames.add(qName);
            cls = LabelStockType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "LiabilityCoverageDetail");
            cachedSerQNames.add(qName);
            cls = LiabilityCoverageDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "LiabilityCoverageType");
            cachedSerQNames.add(qName);
            cls = LiabilityCoverageType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "LinearMeasure");
            cachedSerQNames.add(qName);
            cls = LinearMeasure.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "LinearUnits");
            cachedSerQNames.add(qName);
            cls = LinearUnits.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "Localization");
            cachedSerQNames.add(qName);
            cls = Localization.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "Measure");
            cachedSerQNames.add(qName);
            cls = Measure.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "MinimumChargeType");
            cachedSerQNames.add(qName);
            cls = MinimumChargeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "Money");
            cachedSerQNames.add(qName);
            cls = Money.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "NaftaCertificateOfOriginDetail");
            cachedSerQNames.add(qName);
            cls = NaftaCertificateOfOriginDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "NaftaCommodityDetail");
            cachedSerQNames.add(qName);
            cls = NaftaCommodityDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "NaftaImporterSpecificationType");
            cachedSerQNames.add(qName);
            cls = NaftaImporterSpecificationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "NaftaNetCostMethodCode");
            cachedSerQNames.add(qName);
            cls = NaftaNetCostMethodCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "NaftaPreferenceCriterionCode");
            cachedSerQNames.add(qName);
            cls = NaftaPreferenceCriterionCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "NaftaProducer");
            cachedSerQNames.add(qName);
            cls = NaftaProducer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "NaftaProducerDeterminationCode");
            cachedSerQNames.add(qName);
            cls = NaftaProducerDeterminationCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "NaftaProducerSpecificationType");
            cachedSerQNames.add(qName);
            cls = NaftaProducerSpecificationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "NetExplosiveClassificationType");
            cachedSerQNames.add(qName);
            cls = NetExplosiveClassificationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "NetExplosiveDetail");
            cachedSerQNames.add(qName);
            cls = NetExplosiveDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "Notification");
            cachedSerQNames.add(qName);
            cls = Notification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "NotificationDetail");
            cachedSerQNames.add(qName);
            cls = NotificationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "NotificationEventType");
            cachedSerQNames.add(qName);
            cls = NotificationEventType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "NotificationFormatType");
            cachedSerQNames.add(qName);
            cls = NotificationFormatType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "NotificationParameter");
            cachedSerQNames.add(qName);
            cls = NotificationParameter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "NotificationSeverityType");
            cachedSerQNames.add(qName);
            cls = NotificationSeverityType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "NotificationType");
            cachedSerQNames.add(qName);
            cls = NotificationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "Op900Detail");
            cachedSerQNames.add(qName);
            cls = Op900Detail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "OversizeClassType");
            cachedSerQNames.add(qName);
            cls = OversizeClassType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "PackageRateDetail");
            cachedSerQNames.add(qName);
            cls = PackageRateDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "PackageSpecialServicesRequested");
            cachedSerQNames.add(qName);
            cls = PackageSpecialServicesRequested.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "PackageSpecialServiceType");
            cachedSerQNames.add(qName);
            cls = PackageSpecialServiceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "PackagingType");
            cachedSerQNames.add(qName);
            cls = PackagingType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "PageQuadrantType");
            cachedSerQNames.add(qName);
            cls = PageQuadrantType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "Party");
            cachedSerQNames.add(qName);
            cls = Party.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "Payment");
            cachedSerQNames.add(qName);
            cls = Payment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "PaymentType");
            cachedSerQNames.add(qName);
            cls = PaymentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "Payor");
            cachedSerQNames.add(qName);
            cls = Payor.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "PendingShipmentDetail");
            cachedSerQNames.add(qName);
            cls = PendingShipmentDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "PendingShipmentProcessingOptionsRequested");
            cachedSerQNames.add(qName);
            cls = PendingShipmentProcessingOptionsRequested.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "PendingShipmentProcessingOptionType");
            cachedSerQNames.add(qName);
            cls = PendingShipmentProcessingOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "PendingShipmentType");
            cachedSerQNames.add(qName);
            cls = PendingShipmentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "PhysicalFormType");
            cachedSerQNames.add(qName);
            cls = PhysicalFormType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "PhysicalPackagingType");
            cachedSerQNames.add(qName);
            cls = PhysicalPackagingType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "PickupDetail");
            cachedSerQNames.add(qName);
            cls = PickupDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "PickupRequestSourceType");
            cachedSerQNames.add(qName);
            cls = PickupRequestSourceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "PickupRequestType");
            cachedSerQNames.add(qName);
            cls = PickupRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "PricingCodeType");
            cachedSerQNames.add(qName);
            cls = PricingCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "PriorityAlertDetail");
            cachedSerQNames.add(qName);
            cls = PriorityAlertDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "PriorityAlertEnhancementType");
            cachedSerQNames.add(qName);
            cls = PriorityAlertEnhancementType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "PurposeOfShipmentType");
            cachedSerQNames.add(qName);
            cls = PurposeOfShipmentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

    }
    private void addBindings2() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "RadioactiveContainerClassType");
            cachedSerQNames.add(qName);
            cls = RadioactiveContainerClassType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "RadioactivityDetail");
            cachedSerQNames.add(qName);
            cls = RadioactivityDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "RadioactivityUnitOfMeasure");
            cachedSerQNames.add(qName);
            cls = RadioactivityUnitOfMeasure.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "RadionuclideActivity");
            cachedSerQNames.add(qName);
            cls = RadionuclideActivity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "RadionuclideDetail");
            cachedSerQNames.add(qName);
            cls = RadionuclideDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "RateDimensionalDivisorType");
            cachedSerQNames.add(qName);
            cls = RateDimensionalDivisorType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "RateDiscount");
            cachedSerQNames.add(qName);
            cls = RateDiscount.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "RateDiscountType");
            cachedSerQNames.add(qName);
            cls = RateDiscountType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "RatedPackageDetail");
            cachedSerQNames.add(qName);
            cls = RatedPackageDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "RatedShipmentDetail");
            cachedSerQNames.add(qName);
            cls = RatedShipmentDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "RatedWeightMethod");
            cachedSerQNames.add(qName);
            cls = RatedWeightMethod.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "RateElementBasisType");
            cachedSerQNames.add(qName);
            cls = RateElementBasisType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "RateReply");
            cachedSerQNames.add(qName);
            cls = RateReply.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "RateReplyDetail");
            cachedSerQNames.add(qName);
            cls = RateReplyDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "RateRequest");
            cachedSerQNames.add(qName);
            cls = RateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "RateRequestType");
            cachedSerQNames.add(qName);
            cls = RateRequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "RateTypeBasisType");
            cachedSerQNames.add(qName);
            cls = RateTypeBasisType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "Rebate");
            cachedSerQNames.add(qName);
            cls = Rebate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "RebateType");
            cachedSerQNames.add(qName);
            cls = RebateType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "RecipientCustomsId");
            cachedSerQNames.add(qName);
            cls = RecipientCustomsId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "RecipientCustomsIdType");
            cachedSerQNames.add(qName);
            cls = RecipientCustomsIdType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "RecommendedDocumentSpecification");
            cachedSerQNames.add(qName);
            cls = RecommendedDocumentSpecification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "RecommendedDocumentType");
            cachedSerQNames.add(qName);
            cls = RecommendedDocumentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "RegulatoryControlType");
            cachedSerQNames.add(qName);
            cls = RegulatoryControlType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "RegulatoryLabelContentDetail");
            cachedSerQNames.add(qName);
            cls = RegulatoryLabelContentDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "RegulatoryLabelType");
            cachedSerQNames.add(qName);
            cls = RegulatoryLabelType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "RelativeVerticalPositionType");
            cachedSerQNames.add(qName);
            cls = RelativeVerticalPositionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "RequestedPackageLineItem");
            cachedSerQNames.add(qName);
            cls = RequestedPackageLineItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "RequestedShipment");
            cachedSerQNames.add(qName);
            cls = RequestedShipment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "RequestedShippingDocumentType");
            cachedSerQNames.add(qName);
            cls = RequestedShippingDocumentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "RequiredShippingDocumentType");
            cachedSerQNames.add(qName);
            cls = RequiredShippingDocumentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "ReturnAssociationDetail");
            cachedSerQNames.add(qName);
            cls = ReturnAssociationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "ReturnedRateType");
            cachedSerQNames.add(qName);
            cls = ReturnedRateType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "ReturnEMailAllowedSpecialServiceType");
            cachedSerQNames.add(qName);
            cls = ReturnEMailAllowedSpecialServiceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "ReturnEMailDetail");
            cachedSerQNames.add(qName);
            cls = ReturnEMailDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "ReturnInstructionsDetail");
            cachedSerQNames.add(qName);
            cls = ReturnInstructionsDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "ReturnShipmentDetail");
            cachedSerQNames.add(qName);
            cls = ReturnShipmentDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "ReturnType");
            cachedSerQNames.add(qName);
            cls = ReturnType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "Rma");
            cachedSerQNames.add(qName);
            cls = Rma.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "RotationType");
            cachedSerQNames.add(qName);
            cls = RotationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "SecondaryBarcodeType");
            cachedSerQNames.add(qName);
            cls = SecondaryBarcodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "ServiceOptionType");
            cachedSerQNames.add(qName);
            cls = ServiceOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "ServiceSubOptionDetail");
            cachedSerQNames.add(qName);
            cls = ServiceSubOptionDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "ServiceType");
            cachedSerQNames.add(qName);
            cls = ServiceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "ShipmentAuthorizationDetail");
            cachedSerQNames.add(qName);
            cls = ShipmentAuthorizationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "ShipmentConfigurationData");
            cachedSerQNames.add(qName);
            cls = ShipmentConfigurationData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "ShipmentDryIceDetail");
            cachedSerQNames.add(qName);
            cls = ShipmentDryIceDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "ShipmentDryIceProcessingOptionsRequested");
            cachedSerQNames.add(qName);
            cls = ShipmentDryIceProcessingOptionsRequested.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "ShipmentDryIceProcessingOptionType");
            cachedSerQNames.add(qName);
            cls = ShipmentDryIceProcessingOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "ShipmentEventNotificationDetail");
            cachedSerQNames.add(qName);
            cls = ShipmentEventNotificationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "ShipmentEventNotificationSpecification");
            cachedSerQNames.add(qName);
            cls = ShipmentEventNotificationSpecification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "ShipmentLegRateDetail");
            cachedSerQNames.add(qName);
            cls = ShipmentLegRateDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "ShipmentNotificationAggregationType");
            cachedSerQNames.add(qName);
            cls = ShipmentNotificationAggregationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "ShipmentNotificationFormatSpecification");
            cachedSerQNames.add(qName);
            cls = ShipmentNotificationFormatSpecification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "ShipmentNotificationRoleType");
            cachedSerQNames.add(qName);
            cls = ShipmentNotificationRoleType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "ShipmentOnlyFieldsType");
            cachedSerQNames.add(qName);
            cls = ShipmentOnlyFieldsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "ShipmentRateDetail");
            cachedSerQNames.add(qName);
            cls = ShipmentRateDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "ShipmentSpecialServicesRequested");
            cachedSerQNames.add(qName);
            cls = ShipmentSpecialServicesRequested.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "ShipmentSpecialServiceType");
            cachedSerQNames.add(qName);
            cls = ShipmentSpecialServiceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "ShipmentVariationOptionDetail");
            cachedSerQNames.add(qName);
            cls = ShipmentVariationOptionDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "ShippingDocumentDispositionDetail");
            cachedSerQNames.add(qName);
            cls = ShippingDocumentDispositionDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "ShippingDocumentDispositionType");
            cachedSerQNames.add(qName);
            cls = ShippingDocumentDispositionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "ShippingDocumentEMailDetail");
            cachedSerQNames.add(qName);
            cls = ShippingDocumentEMailDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "ShippingDocumentEMailGroupingType");
            cachedSerQNames.add(qName);
            cls = ShippingDocumentEMailGroupingType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "ShippingDocumentEMailRecipient");
            cachedSerQNames.add(qName);
            cls = ShippingDocumentEMailRecipient.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "ShippingDocumentFormat");
            cachedSerQNames.add(qName);
            cls = ShippingDocumentFormat.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "ShippingDocumentGroupingType");
            cachedSerQNames.add(qName);
            cls = ShippingDocumentGroupingType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "ShippingDocumentImageType");
            cachedSerQNames.add(qName);
            cls = ShippingDocumentImageType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "ShippingDocumentPrintDetail");
            cachedSerQNames.add(qName);
            cls = ShippingDocumentPrintDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "ShippingDocumentSpecification");
            cachedSerQNames.add(qName);
            cls = ShippingDocumentSpecification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "ShippingDocumentStockType");
            cachedSerQNames.add(qName);
            cls = ShippingDocumentStockType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "SignatureOptionDetail");
            cachedSerQNames.add(qName);
            cls = SignatureOptionDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "SignatureOptionType");
            cachedSerQNames.add(qName);
            cls = SignatureOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "SmartPostAncillaryEndorsementType");
            cachedSerQNames.add(qName);
            cls = SmartPostAncillaryEndorsementType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "SmartPostIndiciaType");
            cachedSerQNames.add(qName);
            cls = SmartPostIndiciaType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "SmartPostShipmentDetail");
            cachedSerQNames.add(qName);
            cls = SmartPostShipmentDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "SmartPostShipmentProcessingOptionsRequested");
            cachedSerQNames.add(qName);
            cls = SmartPostShipmentProcessingOptionsRequested.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "SmartPostShipmentProcessingOptionType");
            cachedSerQNames.add(qName);
            cls = SmartPostShipmentProcessingOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "SpecialRatingAppliedType");
            cachedSerQNames.add(qName);
            cls = SpecialRatingAppliedType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "Surcharge");
            cachedSerQNames.add(qName);
            cls = Surcharge.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "SurchargeLevelType");
            cachedSerQNames.add(qName);
            cls = SurchargeLevelType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "SurchargeType");
            cachedSerQNames.add(qName);
            cls = SurchargeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "Tax");
            cachedSerQNames.add(qName);
            cls = Tax.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "TaxesOrMiscellaneousChargeType");
            cachedSerQNames.add(qName);
            cls = TaxesOrMiscellaneousChargeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "TaxpayerIdentification");
            cachedSerQNames.add(qName);
            cls = TaxpayerIdentification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "TaxType");
            cachedSerQNames.add(qName);
            cls = TaxType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "TinType");
            cachedSerQNames.add(qName);
            cls = TinType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "TrackingId");
            cachedSerQNames.add(qName);
            cls = TrackingId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "TrackingIdType");
            cachedSerQNames.add(qName);
            cls = TrackingIdType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "TransactionDetail");
            cachedSerQNames.add(qName);
            cls = TransactionDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "TransitTimeType");
            cachedSerQNames.add(qName);
            cls = TransitTimeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "UploadDocumentIdProducer");
            cachedSerQNames.add(qName);
            cls = UploadDocumentIdProducer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "UploadDocumentProducerType");
            cachedSerQNames.add(qName);
            cls = UploadDocumentProducerType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "UploadDocumentReferenceDetail");
            cachedSerQNames.add(qName);
            cls = UploadDocumentReferenceDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "UploadDocumentType");
            cachedSerQNames.add(qName);
            cls = UploadDocumentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "VariableHandlingChargeDetail");
            cachedSerQNames.add(qName);
            cls = VariableHandlingChargeDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "VariableHandlingCharges");
            cachedSerQNames.add(qName);
            cls = VariableHandlingCharges.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "VersionId");
            cachedSerQNames.add(qName);
            cls = VersionId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "Volume");
            cachedSerQNames.add(qName);
            cls = Volume.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "VolumeUnits");
            cachedSerQNames.add(qName);
            cls = VolumeUnits.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

    }
    private void addBindings3() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "WebAuthenticationCredential");
            cachedSerQNames.add(qName);
            cls = WebAuthenticationCredential.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "WebAuthenticationDetail");
            cachedSerQNames.add(qName);
            cls = WebAuthenticationDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "Weight");
            cachedSerQNames.add(qName);
            cls = Weight.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://fedex.com/ws/rate/v22", "WeightUnits");
            cachedSerQNames.add(qName);
            cls = WeightUnits.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public RateReply getRates(RateRequest rateRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://fedex.com/ws/rate/v22/getRates");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getRates"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {rateRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (RateReply) _resp;
            } catch (java.lang.Exception _exception) {
                return (RateReply) org.apache.axis.utils.JavaUtils.convert(_resp, RateReply.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
