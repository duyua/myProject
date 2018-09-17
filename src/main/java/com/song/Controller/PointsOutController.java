package com.song.Controller;

import com.song.Entity.PointsOut;
import com.song.Service.Impl.PointsOutServiceImpl;
import com.song.Service.PointsOutService;
import com.song.Utils.JsonResult;
import com.song.Utils.ResultCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/out")
public class PointsOutController {
    @Autowired
    private PointsOutService pointsOutService;

    @RequestMapping("/getIntegral")
    @ResponseBody
    public JsonResult  getIntegral(@RequestParam String  phone){
        String val = ResultCode.SUCCESS.val();
        String msg = ResultCode.SUCCESS.msg();
        System.out.println(phone);
        return   new JsonResult(val,msg,"heh");
    }
    @ResponseBody
    @RequestMapping("findbyid")
    public JsonResult   findAll(@RequestParam String   id){
        PointsOut pointsOut =pointsOutService.findbyid(id);
        String val = ResultCode.SUCCESS.val();
        String msg = ResultCode.SUCCESS.msg();
        return new JsonResult(val,msg,pointsOut);
    }



}
