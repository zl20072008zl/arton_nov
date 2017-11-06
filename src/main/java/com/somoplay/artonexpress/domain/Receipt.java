package com.somoplay.artonexpress.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

/**
 * A Receipt.
 */
@Entity
@Table(name = "receipt")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Receipt implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "created_date")
    private LocalDate createdDate;

    @Column(name = "updated_date")
    private LocalDate updatedDate;

    @Column(name = "message")
    private String message;

    @Column(name = "jhi_complete")
    private String complete;

    @Column(name = "card_type")
    private String cardType;

    @Column(name = "txn_number")
    private String txnNumber;

    @Column(name = "receipt_id")
    private String receiptId;

    @Column(name = "corporate_card")
    private String corporateCard;

    @Column(name = "recur_success")
    private String recurSuccess;

    @Column(name = "itdresponse")
    private String itdresponse;

    @Column(name = "iso")
    private String iso;

    @Column(name = "is_visa_debit")
    private String isVisaDebit;

    @Column(name = "timed_out")
    private String timedOut;

    @Column(name = "message_id")
    private String messageId;

    @Column(name = "ticket")
    private String ticket;

    @Column(name = "trans_date")
    private String transDate;

    @Column(name = "cavv_result_code")
    private String cavvResultCode;

    @Column(name = "response_code")
    private String responseCode;

    @Column(name = "auth_code")
    private String authCode;

    @Column(name = "status_code")
    private String statusCode;

    @Column(name = "trans_amount")
    private String transAmount;

    @Column(name = "trans_type")
    private String transType;

    @Column(name = "next_recur_date")
    private String nextRecurDate;

    @Column(name = "avs_result_code")
    private String avsResultCode;

    @Column(name = "recur_end_date")
    private String recurEndDate;

    @Column(name = "trans_time")
    private String transTime;

    @Column(name = "cvd_result_code")
    private String cvdResultCode;

    @Column(name = "bank_totals")
    private String bankTotals;

    @Column(name = "reference_num")
    private String referenceNum;

    @Column(name = "status_message")
    private String statusMessage;

    @Column(name = "recur_update_success")
    private String recurUpdateSuccess;

    @Column(name = "jhi_user")
    private String user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public Receipt createdDate(LocalDate createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDate getUpdatedDate() {
        return updatedDate;
    }

    public Receipt updatedDate(LocalDate updatedDate) {
        this.updatedDate = updatedDate;
        return this;
    }

    public void setUpdatedDate(LocalDate updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getMessage() {
        return message;
    }

    public Receipt message(String message) {
        this.message = message;
        return this;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getComplete() {
        return complete;
    }

    public Receipt complete(String complete) {
        this.complete = complete;
        return this;
    }

    public void setComplete(String complete) {
        this.complete = complete;
    }

    public String getCardType() {
        return cardType;
    }

    public Receipt cardType(String cardType) {
        this.cardType = cardType;
        return this;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getTxnNumber() {
        return txnNumber;
    }

    public Receipt txnNumber(String txnNumber) {
        this.txnNumber = txnNumber;
        return this;
    }

    public void setTxnNumber(String txnNumber) {
        this.txnNumber = txnNumber;
    }

    public String getReceiptId() {
        return receiptId;
    }

    public Receipt receiptId(String receiptId) {
        this.receiptId = receiptId;
        return this;
    }

    public void setReceiptId(String receiptId) {
        this.receiptId = receiptId;
    }

    public String getCorporateCard() {
        return corporateCard;
    }

    public Receipt corporateCard(String corporateCard) {
        this.corporateCard = corporateCard;
        return this;
    }

    public void setCorporateCard(String corporateCard) {
        this.corporateCard = corporateCard;
    }

    public String getRecurSuccess() {
        return recurSuccess;
    }

    public Receipt recurSuccess(String recurSuccess) {
        this.recurSuccess = recurSuccess;
        return this;
    }

    public void setRecurSuccess(String recurSuccess) {
        this.recurSuccess = recurSuccess;
    }

    public String getItdresponse() {
        return itdresponse;
    }

    public Receipt itdresponse(String itdresponse) {
        this.itdresponse = itdresponse;
        return this;
    }

    public void setItdresponse(String itdresponse) {
        this.itdresponse = itdresponse;
    }

    public String getIso() {
        return iso;
    }

    public Receipt iso(String iso) {
        this.iso = iso;
        return this;
    }

    public void setIso(String iso) {
        this.iso = iso;
    }

    public String getIsVisaDebit() {
        return isVisaDebit;
    }

    public Receipt isVisaDebit(String isVisaDebit) {
        this.isVisaDebit = isVisaDebit;
        return this;
    }

    public void setIsVisaDebit(String isVisaDebit) {
        this.isVisaDebit = isVisaDebit;
    }

    public String getTimedOut() {
        return timedOut;
    }

    public Receipt timedOut(String timedOut) {
        this.timedOut = timedOut;
        return this;
    }

    public void setTimedOut(String timedOut) {
        this.timedOut = timedOut;
    }

    public String getMessageId() {
        return messageId;
    }

    public Receipt messageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getTicket() {
        return ticket;
    }

    public Receipt ticket(String ticket) {
        this.ticket = ticket;
        return this;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public String getTransDate() {
        return transDate;
    }

    public Receipt transDate(String transDate) {
        this.transDate = transDate;
        return this;
    }

    public void setTransDate(String transDate) {
        this.transDate = transDate;
    }

    public String getCavvResultCode() {
        return cavvResultCode;
    }

    public Receipt cavvResultCode(String cavvResultCode) {
        this.cavvResultCode = cavvResultCode;
        return this;
    }

    public void setCavvResultCode(String cavvResultCode) {
        this.cavvResultCode = cavvResultCode;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public Receipt responseCode(String responseCode) {
        this.responseCode = responseCode;
        return this;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getAuthCode() {
        return authCode;
    }

    public Receipt authCode(String authCode) {
        this.authCode = authCode;
        return this;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public Receipt statusCode(String statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getTransAmount() {
        return transAmount;
    }

    public Receipt transAmount(String transAmount) {
        this.transAmount = transAmount;
        return this;
    }

    public void setTransAmount(String transAmount) {
        this.transAmount = transAmount;
    }

    public String getTransType() {
        return transType;
    }

    public Receipt transType(String transType) {
        this.transType = transType;
        return this;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }

    public String getNextRecurDate() {
        return nextRecurDate;
    }

    public Receipt nextRecurDate(String nextRecurDate) {
        this.nextRecurDate = nextRecurDate;
        return this;
    }

    public void setNextRecurDate(String nextRecurDate) {
        this.nextRecurDate = nextRecurDate;
    }

    public String getAvsResultCode() {
        return avsResultCode;
    }

    public Receipt avsResultCode(String avsResultCode) {
        this.avsResultCode = avsResultCode;
        return this;
    }

    public void setAvsResultCode(String avsResultCode) {
        this.avsResultCode = avsResultCode;
    }

    public String getRecurEndDate() {
        return recurEndDate;
    }

    public Receipt recurEndDate(String recurEndDate) {
        this.recurEndDate = recurEndDate;
        return this;
    }

    public void setRecurEndDate(String recurEndDate) {
        this.recurEndDate = recurEndDate;
    }

    public String getTransTime() {
        return transTime;
    }

    public Receipt transTime(String transTime) {
        this.transTime = transTime;
        return this;
    }

    public void setTransTime(String transTime) {
        this.transTime = transTime;
    }

    public String getCvdResultCode() {
        return cvdResultCode;
    }

    public Receipt cvdResultCode(String cvdResultCode) {
        this.cvdResultCode = cvdResultCode;
        return this;
    }

    public void setCvdResultCode(String cvdResultCode) {
        this.cvdResultCode = cvdResultCode;
    }

    public String getBankTotals() {
        return bankTotals;
    }

    public Receipt bankTotals(String bankTotals) {
        this.bankTotals = bankTotals;
        return this;
    }

    public void setBankTotals(String bankTotals) {
        this.bankTotals = bankTotals;
    }

    public String getReferenceNum() {
        return referenceNum;
    }

    public Receipt referenceNum(String referenceNum) {
        this.referenceNum = referenceNum;
        return this;
    }

    public void setReferenceNum(String referenceNum) {
        this.referenceNum = referenceNum;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public Receipt statusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
        return this;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    public String getRecurUpdateSuccess() {
        return recurUpdateSuccess;
    }

    public Receipt recurUpdateSuccess(String recurUpdateSuccess) {
        this.recurUpdateSuccess = recurUpdateSuccess;
        return this;
    }

    public void setRecurUpdateSuccess(String recurUpdateSuccess) {
        this.recurUpdateSuccess = recurUpdateSuccess;
    }

    public String getUser() {
        return user;
    }

    public Receipt user(String user) {
        this.user = user;
        return this;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Receipt receipt = (Receipt) o;
        if (receipt.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), receipt.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Receipt{" +
            "id=" + getId() +
            ", createdDate='" + getCreatedDate() + "'" +
            ", updatedDate='" + getUpdatedDate() + "'" +
            ", message='" + getMessage() + "'" +
            ", complete='" + getComplete() + "'" +
            ", cardType='" + getCardType() + "'" +
            ", txnNumber='" + getTxnNumber() + "'" +
            ", receiptId='" + getReceiptId() + "'" +
            ", corporateCard='" + getCorporateCard() + "'" +
            ", recurSuccess='" + getRecurSuccess() + "'" +
            ", itdresponse='" + getItdresponse() + "'" +
            ", iso='" + getIso() + "'" +
            ", isVisaDebit='" + getIsVisaDebit() + "'" +
            ", timedOut='" + getTimedOut() + "'" +
            ", messageId='" + getMessageId() + "'" +
            ", ticket='" + getTicket() + "'" +
            ", transDate='" + getTransDate() + "'" +
            ", cavvResultCode='" + getCavvResultCode() + "'" +
            ", responseCode='" + getResponseCode() + "'" +
            ", authCode='" + getAuthCode() + "'" +
            ", statusCode='" + getStatusCode() + "'" +
            ", transAmount='" + getTransAmount() + "'" +
            ", transType='" + getTransType() + "'" +
            ", nextRecurDate='" + getNextRecurDate() + "'" +
            ", avsResultCode='" + getAvsResultCode() + "'" +
            ", recurEndDate='" + getRecurEndDate() + "'" +
            ", transTime='" + getTransTime() + "'" +
            ", cvdResultCode='" + getCvdResultCode() + "'" +
            ", bankTotals='" + getBankTotals() + "'" +
            ", referenceNum='" + getReferenceNum() + "'" +
            ", statusMessage='" + getStatusMessage() + "'" +
            ", recurUpdateSuccess='" + getRecurUpdateSuccess() + "'" +
            ", user='" + getUser() + "'" +
            "}";
    }
}
