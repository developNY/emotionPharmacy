package kr.uniton.Domain.menu;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by iljun on 2017-07-29.
 */
@Repository
public interface MenuRepository extends JpaRepository<Menu, Long>{
    Menu findByEmotion(long emotion);
}
