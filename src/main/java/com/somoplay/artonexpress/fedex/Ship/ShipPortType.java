/**
 * ShipPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.somoplay.artonexpress.fedex.Ship;

public interface ShipPortType extends java.rmi.Remote {
    public ProcessTagReply processTag(ProcessTagRequest processTagRequest) throws java.rmi.RemoteException;
    public ProcessShipmentReply processShipment(ProcessShipmentRequest processShipmentRequest) throws java.rmi.RemoteException;
    public ShipmentReply deleteTag(DeleteTagRequest deleteTagRequest) throws java.rmi.RemoteException;
    public ShipmentReply deleteShipment(DeleteShipmentRequest deleteShipmentRequest) throws java.rmi.RemoteException;
    public ShipmentReply validateShipment(ValidateShipmentRequest validateShipmentRequest) throws java.rmi.RemoteException;
}
