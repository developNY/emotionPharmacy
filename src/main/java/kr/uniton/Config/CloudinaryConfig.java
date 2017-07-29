package kr.uniton.Config;

import com.cloudinary.Cloudinary;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;

/**
 * Created by iljun on 2017-07-29.
 */
@Configuration
public class CloudinaryConfig {

    @Value("${cloudinary.name}")
    private String cloudName;
    @Value("${cloudinary.key}")
    private String cloudKey;
    @Value("${cloudinary.secret}")
    private String cloudSecret;

    @Bean
    public Cloudinary cloudinary(){
        return new Cloudinary(new HashMap(){{
            put("cloud_name", cloudName);
            put("api_key", cloudKey);
            put("api_secret", cloudSecret);
        }});
    }
}
