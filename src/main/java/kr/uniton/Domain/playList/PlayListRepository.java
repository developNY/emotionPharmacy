package kr.uniton.Domain.playList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by iljun on 2017-07-29.
 */
@Repository
public interface PlayListRepository extends JpaRepository<PlayList,Long>{
}
