package com.song.Controller;

import com.song.Entity.WxUserInfo;
import com.song.Service.Impl.PointsDetailServiceImpl;
import com.song.Service.Impl.WxUserInfoServiceImpl;
import com.song.Service.PointsDetailService;
import com.song.Service.WxUserInfoService;
import com.song.Utils.JsonResult;
import com.song.Utils.ResultCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

@Controller
@RequestMapping(value = "/points")
public class PointsDetailController {
    @Autowired
    private PointsDetailService pointsDetailService;
    @Autowired
    private WxUserInfoService wxUserInfoService;

    /**用户积分查询接口
     * @param id(用户id)
     * @return
     */
    @RequestMapping("getIntegralCount")
    @ResponseBody
    public JsonResult getIntegralCount(@RequestParam String id) {
        WxUserInfo wxUserInfo = wxUserInfoService.findById(id);
        if (wxUserInfo == null)
            return new JsonResult(ResultCode.NOT_DATA.val(), ResultCode.NONE_USER.msg(), null);
        int count = pointsDetailService.getSurplusIntegralCount(wxUserInfo.getPhone());
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("availableIntegral", count);
        return new JsonResult(ResultCode.SUCCESS.val(), ResultCode.SUCCESS.msg(), map);
    }


}
