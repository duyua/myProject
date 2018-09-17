package com.song.Service;

import com.song.Entity.OrderDetails;
import com.song.Entity.PointsOut;
import com.song.Repository.PointsOutRepositoty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;

public interface PointsOutService {

    public PointsOut findbyid(String id) ;
   //扣减用户积分
    public void takeOutIntegral(OrderDetails details);
}
