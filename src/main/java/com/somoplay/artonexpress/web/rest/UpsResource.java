package com.somoplay.artonexpress.web.rest;

import com.somoplay.artonexpress.shippment.ShipmentRequest;
import com.somoplay.artonexpress.ups.RateService;
import com.somoplay.artonexpress.ups.TrackService;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.IOUtils;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by limingyang on 2017/10/28.
 */
@RequestMapping("/api/ups")
@RestController
public class UpsResource {

//    @RequestMapping(value = "/track",
//        method = RequestMethod.POST,
//        produces = MediaType.APPLICATION_XML_VALUE)
//    public String track(@RequestBody String trackingNumber){
//        TrackService trackService = new TrackService();
//        trackService.track_service(trackingNumber);
//        return trackService.getResult();
//    }
//
//    @RequestMapping(value = "/rate",
//        method = RequestMethod.POST,
//        produces = MediaType.APPLICATION_XML_VALUE)
//    public String rate(@RequestBody ShipmentRequest shipmentRequest) {
//        RateService rateService = new RateService();
//        rateService.rate_service(shipmentRequest);
//        return rateService.getResult();
//    }
//
//    @RequestMapping(value = "/rate",
//        method = RequestMethod.GET,
//        produces = MediaType.APPLICATION_JSON_VALUE)
//    public String rate(){
//        return rateService.getResult();
//    }
//
//    @RequestMapping(value = "/shipment",
//        method = RequestMethod.POST,
//        produces = MediaType.APPLICATION_XML_VALUE)
//    public void shipment(@RequestBody ExpressRequest expressRequest) {
//        shippingService.ship_service(expressRequest);
//    }
//
//    @RequestMapping(value = "/shipment",
//        method = RequestMethod.GET,
//        produces = MediaType.APPLICATION_JSON_VALUE)
//    public String shipment(){
//        return rateService.getResult();
//    }

//    @RequestMapping(value = "/tnt",
//        method = RequestMethod.POST,
//        produces = MediaType.APPLICATION_XML_VALUE)
//    public void tnt(@RequestBody TimeInTransitRequest tntRequest) {
//
//        ups.setTntReply(upsService.upsService(tntRequest, tntUrl));
//    }
}
