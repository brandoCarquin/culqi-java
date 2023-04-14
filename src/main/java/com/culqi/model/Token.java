package com.culqi.model;

import com.culqi.apioperation.All;
import com.culqi.apioperation.Create;
import com.culqi.apioperation.Find;
import com.culqi.util.ObjectResult;

import java.util.Map;

/**
 * Created by culqi on 12/21/16.
 */

public class Token implements All, Create, Find {

    private static final String URL = "/tokens/";
    private static final String URL_YAPE = "/tokens/yape";

    public Map<String, Object> list(Map<String, Object> params) throws Exception {
        params = (params == null || params.size() == 0) ? null : params;
        return new ObjectResult().list(this.URL.replace("/",""), params);
    }

    public Map<String, Object> list() throws Exception {
        return new ObjectResult().list(this.URL.replace("/",""), null);
    }

    public Map<String, Object> create(Map<String, Object> body) throws Exception {
        return new ObjectResult().create(body, this.URL);
    }

    public Map<String, Object> createEncrypt(Map<String, Object> body) throws Exception {
        return new ObjectResult().createEncrypt(body, this.URL);
    }

    public Map<String, Object> createYape(Map<String, Object> body) throws Exception {
        return new ObjectResult().create(body, this.URL_YAPE);
    }

    public Map<String, Object> get(String id) throws Exception {
        return new ObjectResult().get_or_delete(this.URL, id, false);
    }

}
