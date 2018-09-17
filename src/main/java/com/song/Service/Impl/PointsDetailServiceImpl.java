package com.song.Service.Impl;

import com.song.Entity.PointsDetail;
import com.song.Repository.PointsDetailRepositoty;
import com.song.Repository.PointsOutRepositoty;
import com.song.Service.PointsDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class PointsDetailServiceImpl   implements PointsDetailService{
    @Autowired
    private PointsDetailRepositoty pointsDetailRepositoty;
    @Autowired
    private PointsOutRepositoty pointsOutRepositoty;

    public int getSurplusIntegralCount(String mobile) {
        //查询用户获取的积分数量
        Integer receiveCount = pointsDetailRepositoty.countPointscountByTelnum(mobile);
        //查询用户的转出的积分数量
        Integer takenCount = pointsOutRepositoty.countPointscountByTelnum(mobile);
        //查询到的结果为null时候的处理
        receiveCount = receiveCount == null ? 0 : receiveCount;
        takenCount = takenCount == null ? 0 : takenCount;
        return receiveCount - takenCount;
    }

    public void toAddIntegral(Long integralCount, String userPhone) {
        PointsDetail detail = new PointsDetail();
        detail.setBeizhu("取消订单新增积分");
        detail.setSource("取消订单新增积分");
        detail.setStatus((short) 0);
        detail.setGettype(-1);//-1表示积分商城取消订单新增,查询用户积分的时候不做显示
        detail.setGettime(new Date());
        detail.setPointscount(integralCount.intValue());
        detail.setTelnum(userPhone);
        pointsDetailRepositoty.save(detail);
    }
}
