package com.song.Repository;

import com.song.Entity.PointsOut;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PointsOutRepositoty extends JpaRepository<PointsOut,Long> {
    @Query(value = "select sum(a.pointscount) from t_app_points_out a where 1=1 and a.telnum=:telnum",nativeQuery = true)
    Integer  countPointscountByTelnum(@Param("telnum") String  telnum);


}
