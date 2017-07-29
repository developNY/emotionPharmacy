package kr.uniton.Domain.file;

import com.cloudinary.Cloudinary;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by iljun on 2017-07-29.
 */
@Service
@Slf4j
public class FileService {

    @Autowired
    private Cloudinary cloudinary;


    public String save(MultipartFile multipartFile){
        Map<String, String> uploadInfo = upload(multipartFile);

        return uploadInfo.get("objecKey");
    }

    private Map<String, String> upload(MultipartFile multipartFile) {
        try {
            Map<String, String> uploadInfo = cloudinary.uploader().upload(multipartFile.getBytes(), new HashMap() {
                {
                    put("resource_type", "auto");
                }
            });
            uploadInfo.put("name", multipartFile.getName());
            return uploadInfo;
        } catch (IOException e) {
            log.error("Exception : " + e.getMessage());
            return null;
        }
    }
}
