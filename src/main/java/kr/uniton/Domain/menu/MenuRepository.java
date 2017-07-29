package kr.uniton.Domain.menu;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by iljun on 2017-07-29.
 */
@Repository
public interface MenuRepository extends JpaRepository<Menu, Long>{
    List<Menu> findByEmotion(Long emotion);
}
