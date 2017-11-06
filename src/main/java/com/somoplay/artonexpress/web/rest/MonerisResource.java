package com.somoplay.artonexpress.web.rest;

import com.somoplay.artonexpress.moneris.Moneris;
import com.somoplay.artonexpress.moneris.MonerisRequest;
import com.somoplay.artonexpress.moneris.MonerisResponse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/moneris")
@RestController
public class MonerisResource {
    @RequestMapping(value = "/purchase", method = RequestMethod.POST,
        produces = MediaType.APPLICATION_JSON_VALUE)
    public MonerisResponse purchase (@RequestBody MonerisRequest monerisRequest) throws Exception{
        Moneris moneris = new Moneris();
//        moneris.moneris(monerisRequest);
        return moneris.moneris(monerisRequest);
    }
}
