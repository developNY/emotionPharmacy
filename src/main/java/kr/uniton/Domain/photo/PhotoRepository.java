package kr.uniton.Domain.photo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by iljun on 2017-07-29.
 */
@Repository
public interface PhotoRepository extends JpaRepository<Photo, Long> {
}
