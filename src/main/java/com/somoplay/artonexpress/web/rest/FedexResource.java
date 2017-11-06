package com.somoplay.artonexpress.web.rest;

import com.somoplay.artonexpress.fedex.FedexRateService;
import com.somoplay.artonexpress.fedex.FedexShipService;
import com.somoplay.artonexpress.fedex.Rate.RateReplyDetail;
import com.somoplay.artonexpress.fedex.Ship.ProcessShipmentReply;
import com.somoplay.artonexpress.fedex.Track.TrackReply;
import com.somoplay.artonexpress.fedex.TrackService;
import com.somoplay.artonexpress.shippment.RateResponse;
import com.somoplay.artonexpress.shippment.ShipmentRequest;
import com.somoplay.artonexpress.shippment.ShipmentResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/fedex")
@RestController
public class FedexResource {
//    @RequestMapping(value = "/track/detail",
//        method = RequestMethod.POST,
//        produces = MediaType.APPLICATION_JSON_VALUE)
//    public FedexTrackingResponse track_detail(@RequestBody String trackingNumber) throws Exception {
//        TrackService trackDetail = new TrackService();
//        trackDetail.track(trackingNumber);
//        return trackDetail.getFedexTrackingResponse();
//    }

    @RequestMapping(value = "/track",
        method = RequestMethod.POST,
        produces = MediaType.APPLICATION_JSON_VALUE)
    public TrackReply track(@RequestBody String trackingNumber) throws Exception {
        TrackService trackDetail = new TrackService();
        trackDetail.track(trackingNumber);
        return trackDetail.getTrackReply();
    }

    @RequestMapping(value = "/rate",
        method = RequestMethod.POST,
        produces = MediaType.APPLICATION_JSON_VALUE)
    public List<RateResponse> rate_details(@RequestBody ShipmentRequest shipmentRequest) {
        FedexRateService shipService = new FedexRateService();
        shipService.ship(shipmentRequest);
        return shipService.getRateResponseList();
    }

    @RequestMapping(value = "/rate/detail",
        method = RequestMethod.POST,
        produces = MediaType.APPLICATION_JSON_VALUE)
    public RateReplyDetail[] rate(@RequestBody ShipmentRequest shipmentRequest) {
        FedexRateService fedexRateService = new FedexRateService();
        fedexRateService.ship(shipmentRequest);
        return fedexRateService.getRateReplyDetails();
    }

    @RequestMapping(value = "/ship",
        method = RequestMethod.POST,
        produces = MediaType.APPLICATION_JSON_VALUE)
    public ShipmentResponse ship(@RequestBody ShipmentRequest shipmentRequest) {
        FedexShipService fedexShipService = new FedexShipService();
        fedexShipService.ship(shipmentRequest);
        return fedexShipService.getShipmentResponse();
    }

    @RequestMapping(value = "/ship/detail",
        method = RequestMethod.POST,
        produces = MediaType.APPLICATION_JSON_VALUE)
    public ProcessShipmentReply ship_detail(@RequestBody ShipmentRequest shipmentRequest) {
        FedexShipService fedexShipService = new FedexShipService();
        fedexShipService.ship(shipmentRequest);
        return fedexShipService.getReplyDetail();
    }
}
