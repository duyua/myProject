package com.song.Service.Impl;

import com.song.Entity.OrderDetails;
import com.song.Repository.OrderDetailsRepositoty;
import com.song.Service.OrderDetailService;
import com.song.Service.PointsOutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class OrderDetailServiceImpl implements OrderDetailService {
    @Autowired
    private OrderDetailsRepositoty orderDetailsRepositoty;
    @Autowired
    private PointsOutService   pointsOutService;


    @Transactional
    public OrderDetails toSave(OrderDetails details) {
        OrderDetails orderDetails = null;
        try {
            orderDetails = orderDetailsRepositoty.save(details);
            //扣除积分
            pointsOutService.takeOutIntegral(orderDetails);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return orderDetails;
    }

    public OrderDetails findOne(long id) {
      return   orderDetailsRepositoty.findOne(id);
    }
    public OrderDetails findByOrderNo(String orderId) {
      return   orderDetailsRepositoty.findByOrderNo(orderId);
    }

}
