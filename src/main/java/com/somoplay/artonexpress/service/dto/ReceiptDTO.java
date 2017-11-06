package com.somoplay.artonexpress.service.dto;


import java.time.LocalDate;
import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the Receipt entity.
 */
public class ReceiptDTO implements Serializable {

    private Long id;

    private LocalDate createdDate;

    private LocalDate updatedDate;

    private String message;

    private String complete;

    private String cardType;

    private String txnNumber;

    private String receiptId;

    private String corporateCard;

    private String recurSuccess;

    private String itdresponse;

    private String iso;

    private String isVisaDebit;

    private String timedOut;

    private String messageId;

    private String ticket;

    private String transDate;

    private String cavvResultCode;

    private String responseCode;

    private String authCode;

    private String statusCode;

    private String transAmount;

    private String transType;

    private String nextRecurDate;

    private String avsResultCode;

    private String recurEndDate;

    private String transTime;

    private String cvdResultCode;

    private String bankTotals;

    private String referenceNum;

    private String statusMessage;

    private String recurUpdateSuccess;

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

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDate getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(LocalDate updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getComplete() {
        return complete;
    }

    public void setComplete(String complete) {
        this.complete = complete;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getTxnNumber() {
        return txnNumber;
    }

    public void setTxnNumber(String txnNumber) {
        this.txnNumber = txnNumber;
    }

    public String getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(String receiptId) {
        this.receiptId = receiptId;
    }

    public String getCorporateCard() {
        return corporateCard;
    }

    public void setCorporateCard(String corporateCard) {
        this.corporateCard = corporateCard;
    }

    public String getRecurSuccess() {
        return recurSuccess;
    }

    public void setRecurSuccess(String recurSuccess) {
        this.recurSuccess = recurSuccess;
    }

    public String getItdresponse() {
        return itdresponse;
    }

    public void setItdresponse(String itdresponse) {
        this.itdresponse = itdresponse;
    }

    public String getIso() {
        return iso;
    }

    public void setIso(String iso) {
        this.iso = iso;
    }

    public String getIsVisaDebit() {
        return isVisaDebit;
    }

    public void setIsVisaDebit(String isVisaDebit) {
        this.isVisaDebit = isVisaDebit;
    }

    public String getTimedOut() {
        return timedOut;
    }

    public void setTimedOut(String timedOut) {
        this.timedOut = timedOut;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public String getTransDate() {
        return transDate;
    }

    public void setTransDate(String transDate) {
        this.transDate = transDate;
    }

    public String getCavvResultCode() {
        return cavvResultCode;
    }

    public void setCavvResultCode(String cavvResultCode) {
        this.cavvResultCode = cavvResultCode;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getTransAmount() {
        return transAmount;
    }

    public void setTransAmount(String transAmount) {
        this.transAmount = transAmount;
    }

    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }

    public String getNextRecurDate() {
        return nextRecurDate;
    }

    public void setNextRecurDate(String nextRecurDate) {
        this.nextRecurDate = nextRecurDate;
    }

    public String getAvsResultCode() {
        return avsResultCode;
    }

    public void setAvsResultCode(String avsResultCode) {
        this.avsResultCode = avsResultCode;
    }

    public String getRecurEndDate() {
        return recurEndDate;
    }

    public void setRecurEndDate(String recurEndDate) {
        this.recurEndDate = recurEndDate;
    }

    public String getTransTime() {
        return transTime;
    }

    public void setTransTime(String transTime) {
        this.transTime = transTime;
    }

    public String getCvdResultCode() {
        return cvdResultCode;
    }

    public void setCvdResultCode(String cvdResultCode) {
        this.cvdResultCode = cvdResultCode;
    }

    public String getBankTotals() {
        return bankTotals;
    }

    public void setBankTotals(String bankTotals) {
        this.bankTotals = bankTotals;
    }

    public String getReferenceNum() {
        return referenceNum;
    }

    public void setReferenceNum(String referenceNum) {
        this.referenceNum = referenceNum;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    public String getRecurUpdateSuccess() {
        return recurUpdateSuccess;
    }

    public void setRecurUpdateSuccess(String recurUpdateSuccess) {
        this.recurUpdateSuccess = recurUpdateSuccess;
    }

    public String getUser() {
        return user;
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

        ReceiptDTO receiptDTO = (ReceiptDTO) o;
        if(receiptDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), receiptDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "ReceiptDTO{" +
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
