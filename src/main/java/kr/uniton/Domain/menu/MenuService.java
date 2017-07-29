package kr.uniton.Domain.menu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by iljun on 2017-07-29.
 */
@Service
public class MenuService {

    @Autowired
    private MenuRepository menuRepository;

    public List<Menu> findAll(){
        return menuRepository.findAll();
    }

    public List<Menu> findByEmotion(Long emotion){
        return menuRepository.findByEmotion(emotion);
    }

    public void save(Menu menu) { menuRepository.save(menu); }
}