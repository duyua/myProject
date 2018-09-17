package com.song.Repository;

import com.song.Entity.WxUserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WxUserInfoRepositoty extends JpaRepository<WxUserInfo,Long> {


    WxUserInfo findById(String id);
}
