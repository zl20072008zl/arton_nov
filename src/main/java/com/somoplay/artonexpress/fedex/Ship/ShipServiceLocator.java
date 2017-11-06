/**
 * ShipServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.somoplay.artonexpress.fedex.Ship;

public class ShipServiceLocator extends org.apache.axis.client.Service implements ShipService {

    public ShipServiceLocator() {
    }


    public ShipServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ShipServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ShipServicePort
    private java.lang.String ShipServicePort_address = "https://wsbeta.fedex.com:443/web-services/ship";

    public java.lang.String getShipServicePortAddress() {
        return ShipServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ShipServicePortWSDDServiceName = "ShipServicePort";

    public java.lang.String getShipServicePortWSDDServiceName() {
        return ShipServicePortWSDDServiceName;
    }

    public void setShipServicePortWSDDServiceName(java.lang.String name) {
        ShipServicePortWSDDServiceName = name;
    }

    public ShipPortType getShipServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ShipServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getShipServicePort(endpoint);
    }

    public ShipPortType getShipServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ShipServiceSoapBindingStub _stub = new ShipServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getShipServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setShipServicePortEndpointAddress(java.lang.String address) {
        ShipServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (ShipPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                ShipServiceSoapBindingStub _stub = new ShipServiceSoapBindingStub(new java.net.URL(ShipServicePort_address), this);
                _stub.setPortName(getShipServicePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ShipServicePort".equals(inputPortName)) {
            return getShipServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ShipService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v21", "ShipServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {

if ("ShipServicePort".equals(portName)) {
            setShipServicePortEndpointAddress(address);
        }
        else
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
