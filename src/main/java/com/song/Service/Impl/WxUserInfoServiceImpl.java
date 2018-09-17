package com.song.Service.Impl;

import com.song.Entity.WxUserInfo;
import com.song.Repository.WxUserInfoRepositoty;
import com.song.Service.WxUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WxUserInfoServiceImpl implements WxUserInfoService {
    @Autowired
    private WxUserInfoRepositoty wxUserInfoRepositoty;

    public WxUserInfo findById(String id) {
        WxUserInfo wxUserInfo = wxUserInfoRepositoty.findById(id);
        return wxUserInfo;
    }
}
