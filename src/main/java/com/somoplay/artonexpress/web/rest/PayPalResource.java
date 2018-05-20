package com.somoplay.artonexpress.web.rest;

import com.somoplay.artonexpress.paypal.PayPalClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;


@RequestMapping("/api/paypal")
@RestController
public class PayPalResource {

    @RequestMapping(value = "/purchase", method = RequestMethod.POST,
        produces = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, Object> purchase (@RequestBody String sum) throws Exception{
        PayPalClient payPalClient = new PayPalClient();
        return payPalClient.createPayment(sum);
    }

    @RequestMapping(value = "/complete", method = RequestMethod.POST,
        produces = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, Object> completePayment(HttpServletRequest req){
        PayPalClient payPalClient = new PayPalClient();
        String paymentId = req.getParameter("paymentId");
        String payerId = req.getParameter("payerId");
        return payPalClient.completePayment(paymentId, payerId);
    }

}
