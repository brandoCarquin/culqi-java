package com.culqi.apioperation.service;
import com.culqi.model.ResponseCulqi;
import com.culqi.apioperation.ObjectResult;
import java.util.Map;


public class Subscription extends Generic {

    private static final String URL = "/recurrent/subscriptions";
    private static final String CREATE_URL = URL + "/create";
    public Subscription() {
    	super(URL);
    }
    
    public ResponseCulqi createSubscription(Map<String, Object> body) throws Exception {
        return new ObjectResult().create(body, CREATE_URL);
    }

}
