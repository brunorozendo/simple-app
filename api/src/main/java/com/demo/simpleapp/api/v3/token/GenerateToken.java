package com.demo.simpleapp.api.v3.token;

import java.util.HashMap;

public interface GenerateToken {

    String getJwtToken(HashMap<String, Object> extraInfo);
    Boolean isValid(String token);

}
