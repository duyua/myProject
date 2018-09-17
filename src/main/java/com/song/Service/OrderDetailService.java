package com.song.Service;

import com.song.Entity.OrderDetails;

public interface OrderDetailService {



     OrderDetails toSave(OrderDetails details) ;

     OrderDetails findOne(long id);
     OrderDetails findByOrderNo(String orderId) ;

}
