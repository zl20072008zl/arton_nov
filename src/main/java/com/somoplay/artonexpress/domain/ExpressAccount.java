package com.somoplay.artonexpress.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A ExpressAccount.
 */
@Entity
@Table(name = "express_account")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class ExpressAccount implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "cp_user_name")
    private String cpUserName;

    @Column(name = "cp_password")
    private String cpPassword;

    @Column(name = "cp_mailed_by")
    private String cpMailedBy;

    @Column(name = "cp_contract_id")
    private String cpContractId;

    @Column(name = "ups_user_name")
    private String upsUserName;

    @Column(name = "ups_password")
    private String upsPassword;

    @Column(name = "ups_access_license_number")
    private String upsAccessLicenseNumber;

    @Column(name = "ups_account_number")
    private String upsAccountNumber;

    @Column(name = "fedex_account_number")
    private String fedexAccountNumber;

    @Column(name = "fedex_meter_number")
    private String fedexMeterNumber;

    @Column(name = "fedex_key")
    private String fedexKey;

    @Column(name = "fedex_password")
    private String fedexPassword;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCpUserName() {
        return cpUserName;
    }

    public ExpressAccount cpUserName(String cpUserName) {
        this.cpUserName = cpUserName;
        return this;
    }

    public void setCpUserName(String cpUserName) {
        this.cpUserName = cpUserName;
    }

    public String getCpPassword() {
        return cpPassword;
    }

    public ExpressAccount cpPassword(String cpPassword) {
        this.cpPassword = cpPassword;
        return this;
    }

    public void setCpPassword(String cpPassword) {
        this.cpPassword = cpPassword;
    }

    public String getCpMailedBy() {
        return cpMailedBy;
    }

    public ExpressAccount cpMailedBy(String cpMailedBy) {
        this.cpMailedBy = cpMailedBy;
        return this;
    }

    public void setCpMailedBy(String cpMailedBy) {
        this.cpMailedBy = cpMailedBy;
    }

    public String getCpContractId() {
        return cpContractId;
    }

    public ExpressAccount cpContractId(String cpContractId) {
        this.cpContractId = cpContractId;
        return this;
    }

    public void setCpContractId(String cpContractId) {
        this.cpContractId = cpContractId;
    }

    public String getUpsUserName() {
        return upsUserName;
    }

    public ExpressAccount upsUserName(String upsUserName) {
        this.upsUserName = upsUserName;
        return this;
    }

    public void setUpsUserName(String upsUserName) {
        this.upsUserName = upsUserName;
    }

    public String getUpsPassword() {
        return upsPassword;
    }

    public ExpressAccount upsPassword(String upsPassword) {
        this.upsPassword = upsPassword;
        return this;
    }

    public void setUpsPassword(String upsPassword) {
        this.upsPassword = upsPassword;
    }

    public String getUpsAccessLicenseNumber() {
        return upsAccessLicenseNumber;
    }

    public ExpressAccount upsAccessLicenseNumber(String upsAccessLicenseNumber) {
        this.upsAccessLicenseNumber = upsAccessLicenseNumber;
        return this;
    }

    public void setUpsAccessLicenseNumber(String upsAccessLicenseNumber) {
        this.upsAccessLicenseNumber = upsAccessLicenseNumber;
    }

    public String getUpsAccountNumber() {
        return upsAccountNumber;
    }

    public ExpressAccount upsAccountNumber(String upsAccountNumber) {
        this.upsAccountNumber = upsAccountNumber;
        return this;
    }

    public void setUpsAccountNumber(String upsAccountNumber) {
        this.upsAccountNumber = upsAccountNumber;
    }

    public String getFedexAccountNumber() {
        return fedexAccountNumber;
    }

    public ExpressAccount fedexAccountNumber(String fedexAccountNumber) {
        this.fedexAccountNumber = fedexAccountNumber;
        return this;
    }

    public void setFedexAccountNumber(String fedexAccountNumber) {
        this.fedexAccountNumber = fedexAccountNumber;
    }

    public String getFedexMeterNumber() {
        return fedexMeterNumber;
    }

    public ExpressAccount fedexMeterNumber(String fedexMeterNumber) {
        this.fedexMeterNumber = fedexMeterNumber;
        return this;
    }

    public void setFedexMeterNumber(String fedexMeterNumber) {
        this.fedexMeterNumber = fedexMeterNumber;
    }

    public String getFedexKey() {
        return fedexKey;
    }

    public ExpressAccount fedexKey(String fedexKey) {
        this.fedexKey = fedexKey;
        return this;
    }

    public void setFedexKey(String fedexKey) {
        this.fedexKey = fedexKey;
    }

    public String getFedexPassword() {
        return fedexPassword;
    }

    public ExpressAccount fedexPassword(String fedexPassword) {
        this.fedexPassword = fedexPassword;
        return this;
    }

    public void setFedexPassword(String fedexPassword) {
        this.fedexPassword = fedexPassword;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExpressAccount expressAccount = (ExpressAccount) o;
        if (expressAccount.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), expressAccount.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "ExpressAccount{" +
            "id=" + getId() +
            ", cpUserName='" + getCpUserName() + "'" +
            ", cpPassword='" + getCpPassword() + "'" +
            ", cpMailedBy='" + getCpMailedBy() + "'" +
            ", cpContractId='" + getCpContractId() + "'" +
            ", upsUserName='" + getUpsUserName() + "'" +
            ", upsPassword='" + getUpsPassword() + "'" +
            ", upsAccessLicenseNumber='" + getUpsAccessLicenseNumber() + "'" +
            ", upsAccountNumber='" + getUpsAccountNumber() + "'" +
            ", fedexAccountNumber='" + getFedexAccountNumber() + "'" +
            ", fedexMeterNumber='" + getFedexMeterNumber() + "'" +
            ", fedexKey='" + getFedexKey() + "'" +
            ", fedexPassword='" + getFedexPassword() + "'" +
            "}";
    }
}
