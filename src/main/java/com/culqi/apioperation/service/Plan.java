package com.culqi.apioperation.service;
import com.culqi.model.ResponseCulqi;
import com.culqi.apioperation.ObjectResult;
import java.util.Map;

public class Plan extends Generic {

    private static final String URL = "/recurrent/plans";
    private static final String CREATE_URL = URL + "/create";  // Corrección aquí
    
    public Plan() {
        super(URL);
    }

    public ResponseCulqi createPlan(Map<String, Object> body) throws Exception {
        return new ObjectResult().create(body, CREATE_URL);
    }
}
