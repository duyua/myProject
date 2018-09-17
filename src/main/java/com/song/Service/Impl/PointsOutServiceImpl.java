package com.song.Service.Impl;

import com.song.Entity.OrderDetails;
import com.song.Entity.PointsOut;
import com.song.Repository.PointsOutRepositoty;
import com.song.Service.PointsOutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;

@Service
public class PointsOutServiceImpl  implements PointsOutService{
    @Autowired
    private PointsOutRepositoty  pointsOutRepositoty;

    public PointsOut findbyid(String id) {

        return  pointsOutRepositoty.findOne(Long.parseLong(id));

    }
   //扣减用户积分
    public void takeOutIntegral(OrderDetails details) {
        int count = details.getIntegralCount().intValue();
        PointsOut pointsOut=new PointsOut();
        pointsOut.setPointscount(count);
        pointsOut.setTelnum(details.getUserPhone());
        pointsOut.setOuttime(Calendar.getInstance().getTime());
        pointsOut.setTag("积分兑换");
        pointsOut.setStatus(Short.parseShort("0"));//设置状态为成功
        pointsOut.setOrderDetailsId(details.getId());
        pointsOut.setOrderDetailsProductName(details.getProductName());
        pointsOutRepositoty.save(pointsOut);
    }
}
