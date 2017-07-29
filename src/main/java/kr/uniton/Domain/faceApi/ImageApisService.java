package kr.uniton.Domain.faceApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by iljun on 2017-07-29.
 */
@Service
public class ImageApisService {

    @Autowired
    private RestTemplate restTemplate;

    public String api(String title){
        StringBuilder builder = new StringBuilder();
        builder.append("https://apis.daum.net/search/image?");
        builder.append("apikey=").append("85dba97fae53bf5787562fd449074f6b");
        builder.append("&q=").append(title);
        builder.append("&output=json");
        String api = restTemplate.getForObject(builder.toString(),String.class);
        return api;
    }
}
