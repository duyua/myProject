package com.song.Repository;

import com.song.Entity.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailsRepositoty extends JpaRepository<OrderDetails,Long> {


    OrderDetails findByOrderNo(String orderNo);
}
