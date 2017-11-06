package com.somoplay.artonexpress.moneris;

import JavaAPI.*;

public class Moneris {
    private MonerisResponse monerisResponse = new MonerisResponse();
    private static final String host = "esqa.moneris.com";

    public MonerisResponse getMonerisResponse() {
        return monerisResponse;
    }

    public void setMonerisResponse(MonerisResponse monerisResponse) {
        this.monerisResponse = monerisResponse;
    }

    public MonerisResponse moneris (MonerisRequest monerisRequest) throws Exception{
        String store_id = "store5";
        String api_token = "yesguy";
        String name = monerisRequest.getName();
        String order_id = monerisRequest.getOrderId();
        String cust_id = monerisRequest.getCustId();
        String amount = monerisRequest.getAmount();
        String pan = monerisRequest.getPan();
        String expdate = monerisRequest.getExpdate();
        String crypt = "7";
        String cvv = monerisRequest.getCvd();
        String processing_country_code = "CA";

//        AvsInfo avs = new AvsInfo ("123", "Edgar Street", "M1M1M1");
        CvdInfo cvd = new CvdInfo ("1", cvv);

        Purchase p = new Purchase (order_id, amount, pan, expdate, crypt);

//        p.setAvsInfo (avs);
        p.setCvdInfo (cvd);

        p.setDynamicDescriptor("Arton Express");

        HttpsPostRequest mpgReq =
            new HttpsPostRequest(host, store_id, api_token, p, false);

        try {
            Receipt receipt = mpgReq.getReceipt();

            if (receipt.getCardType() != null) {
                monerisResponse.setCardType(receipt.getCardType());
            }
            if (receipt.getTransAmount() != null) {
                monerisResponse.setTransAmount(receipt.getTransAmount());
            }
            if (receipt.getTxnNumber() != null) {
                monerisResponse.setTxnNumber(receipt.getTxnNumber());
            }
            if (receipt.getReceiptId() != null) {
                monerisResponse.setReceiptId(receipt.getReceiptId());
            }
            if (receipt.getTransType() != null) {
                monerisResponse.setTransType(receipt.getTransType());
            }
            if (receipt.getReferenceNum() != null) {
                monerisResponse.setReferenceNum(receipt.getReferenceNum());
            }
            if (receipt.getResponseCode() != null) {
                monerisResponse.setResponseCode(receipt.getResponseCode());
            }
            if (receipt.getISO() != null) {
                monerisResponse.setIso(receipt.getISO());
            }
            if (receipt.getBankTotals() != null) {
                monerisResponse.setBankTotals(receipt.getBankTotals().toString());
            }
            if (receipt.getMessage() != null) {
                monerisResponse.setMessage(receipt.getMessage());
            }
            if (receipt.getAuthCode() != null) {
                monerisResponse.setAuthCode(receipt.getAuthCode());
            }
            if (receipt.getComplete() != null) {
                monerisResponse.setComplete(receipt.getComplete());
            }
            if (receipt.getTransDate() != null) {
                monerisResponse.setTransDate(receipt.getTransDate());
            }
            if (receipt.getTransTime() != null) {
                monerisResponse.setTransTime(receipt.getTransTime());
            }
            if (receipt.getTicket() != null) {
                monerisResponse.setTicket(receipt.getTicket());
            }
            if (receipt.getTimedOut() != null) {
                monerisResponse.setTimedOut(receipt.getTimedOut());
            }
            if (receipt.getStatusCode() != null) {
                monerisResponse.setStatusCode(receipt.getStatusCode());
            }
            if (receipt.getStatusMessage() != null) {
                monerisResponse.setStatusMessage(receipt.getStatusMessage());
            }
            if (receipt.getIsVisaDebit() != null) {
                monerisResponse.setIsVisaDebit(receipt.getIsVisaDebit());
            }

        }catch (Exception e) {
            e.printStackTrace();
        }
        return monerisResponse;
    }
}
