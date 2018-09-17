package com.song.Repository;

import com.song.Entity.ExchangeDetails;
import com.song.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ExchangeDetailsRepositoty extends JpaRepository<ExchangeDetails,Long> {


}
