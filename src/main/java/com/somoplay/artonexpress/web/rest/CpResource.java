package com.somoplay.artonexpress.web.rest;

import com.somoplay.artonexpress.canadapost.*;
import com.somoplay.artonexpress.shippment.*;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by lmy on 7/8/2017.
 */

@RequestMapping("/api/canadapost")
@RestController
public class CpResource {
    @RequestMapping(value = "/track/detail",
        method = RequestMethod.POST,
        produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CpTrackDetailResponse> track_detail(@RequestBody String trackingNumber) {
        CpTrackDetail cpTrackDetail = new CpTrackDetail();
        cpTrackDetail.track_detail(trackingNumber);
        return cpTrackDetail.getTrack_details();
    }

    @RequestMapping(value = "/track/summery",
        method = RequestMethod.POST,
        produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CpTrackSummeryResponse> track_summery(@RequestBody String trackingNumber) {
        CpTrackSummery cpTrackSummery = new CpTrackSummery();
        cpTrackSummery.track_summery(trackingNumber);
        return cpTrackSummery.getTrack_summeries();
    }

    @RequestMapping(value = "/rate",
        method = RequestMethod.POST,
        produces = MediaType.APPLICATION_JSON_VALUE)
    public List<RateResponse> rate(@RequestBody ShipmentRequest cpRateRequest) {
        CpRate cpRate = new CpRate();
        cpRate.rate(cpRateRequest);
        return cpRate.getRates();
    }

    @RequestMapping(value = "/contract/shipping",
        method = RequestMethod.POST,
        produces = MediaType.APPLICATION_JSON_VALUE)
    public ShipmentResponse contract_ship(@RequestBody ShipmentRequest shipmentRequest) {
        CpContractShipping cpContractShipping = new CpContractShipping();
        cpContractShipping.contract_shipping(shipmentRequest);
        return cpContractShipping.getShipmentResponse();
    }

    @RequestMapping(value = "/contract/refund",
        method = RequestMethod.POST,
        produces = MediaType.APPLICATION_JSON_VALUE)
    public CpRefundResponse contract_refund(@RequestBody CpRefundRequest cpRefundRequest) {
        CpContractRefund cpContractRefund = new CpContractRefund();
        cpContractRefund.contract_refund(cpRefundRequest);
        return cpContractRefund.getCpRefundResponse();
    }

    @RequestMapping(value = "/noncontract/shipping",
        method = RequestMethod.POST,
        produces = MediaType.APPLICATION_JSON_VALUE)
    public ShipmentResponse non_contract_ship(@RequestBody ShipmentRequest shipmentRequest) {
        CpNonContractShipping cpNonContractShipping = new CpNonContractShipping();
        cpNonContractShipping.non_contract_shipping(shipmentRequest);
        return cpNonContractShipping.getShipmentResponse();
    }

    @RequestMapping(value = "/noncontract/refund",
        method = RequestMethod.POST,
        produces = MediaType.APPLICATION_JSON_VALUE)
    public CpRefundResponse non_contract_refund(@RequestBody CpRefundRequest cpRefundRequest) {
        CpNonContractRefund cpNonContractRefund = new CpNonContractRefund();
        cpNonContractRefund.non_contract_refund(cpRefundRequest);
        return cpNonContractRefund.getCpRefundResponse();
    }

    @RequestMapping(value = "/void",
        method = RequestMethod.POST,
        produces = MediaType.APPLICATION_JSON_VALUE)
    public String cp_void(@RequestBody String trackingNumber) {
        CpVoid cpVoid = new CpVoid();
        cpVoid.cp_void(trackingNumber);
        return cpVoid.getStatus();
    }

    @RequestMapping(value = "/label",
        method = RequestMethod.POST,
        produces = MediaType.APPLICATION_JSON_VALUE)
    public String cp_label(@RequestBody String link) {
        CpLabel cpLabel = new CpLabel();
        cpLabel.getLabel(link);
        return cpLabel.getStream();
    }
}
