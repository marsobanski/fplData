package com.marsob.fplData.apiData.generalInfo;

import com.marsob.fplData.apiData.generalInfo.pojo.GeneralInfo;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

@NoArgsConstructor
@Controller
public class GeneralInfoReceiver {

    @Value("${endpoint.generalInfo}")
    private String endpoint;

    @SuppressWarnings("unchecked")
    public Object receive() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(endpoint, GeneralInfo.class);
    }
}
