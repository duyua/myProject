package com.song.Repository;

import com.song.Entity.PointsDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PointsDetailRepositoty extends JpaRepository<PointsDetail,Long> {
    @Query(value = "select sum(a.pointscount) from t_app_points_detail a where 1=1 and a.telnum= :telnum ",nativeQuery = true)
    Integer  countPointscountByTelnum(@Param("telnum")String  telnum);

}
