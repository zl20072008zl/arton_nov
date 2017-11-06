package com.somoplay.artonexpress.shippment;

import com.somoplay.artonexpress.domain.Address;
import com.somoplay.artonexpress.domain.Item;
import com.somoplay.artonexpress.domain.Service;
import com.somoplay.artonexpress.domain.User;

/**
 * Created by lmy on 7/8/2017.
 */
public class ShipmentRequest {
    private User user;
    private Address sender;
    private Address recipient;
    private Item parcel;
    private Service service;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Address getSender() {
        return sender;
    }

    public void setSender(Address sender) {
        this.sender = sender;
    }

    public Address getRecipient() {
        return recipient;
    }

    public void setRecipient(Address recipient) {
        this.recipient = recipient;
    }

    public Item getParcel() {
        return parcel;
    }

    public void setParcel(Item parcel) {
        this.parcel = parcel;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }
}
