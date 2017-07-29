package kr.uniton.Domain.photo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by iljun on 2017-07-29.
 */
@Service
public class PhotoService {

    @Autowired
    private PhotoRepository photoRepository;

    public List<Photo> findByEmotion(Long emotion){ return photoRepository.findByEmotion(emotion); }
}
