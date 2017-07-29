package kr.uniton.Domain.photo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by iljun on 2017-07-29.
 */
@Repository
public interface PhotoRepository extends JpaRepository<Photo, Long> {
    List<Photo> findByEmotion(Long emotion);

}
