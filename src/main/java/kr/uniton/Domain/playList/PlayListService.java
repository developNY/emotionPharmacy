package kr.uniton.Domain.playList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by iljun on 2017-07-29.
 */
@Service
public class PlayListService {

    @Autowired
    PlayListRepository playListRepository;

    public List<PlayList> findByEmotion (Long emotion) {
        return playListRepository.findByEmotion(emotion);
    }
}
