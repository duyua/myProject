package com.song.Service;

import com.song.Entity.WxUserInfo;
import com.song.Repository.WxUserInfoRepositoty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public interface WxUserInfoService {

    WxUserInfo findById(String id);
}
