package com.song.Controller;

import com.song.Entity.AddressManager;
import com.song.Service.AddressManagerService;
import com.song.Service.Impl.AddressManagerServiceImpl;
import com.song.Utils.JsonResult;
import com.song.Utils.ResultCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/address")
public class AddressManagerController {
    @Autowired
    private AddressManagerService addressManagerService;

    /**
     * 新增/修改使用地址
     * @param addressManager
     * @return
     */
    @RequestMapping("toadd")
    @ResponseBody
    public JsonResult addAddressManager(@RequestBody AddressManager addressManager) {
        AddressManager manager = addressManagerService.toSaveAddressManager(addressManager);
        if (manager == null)
            return new JsonResult(ResultCode.EXCEPTION.val(), ResultCode.EXCEPTION.msg(), null);
        return new JsonResult(ResultCode.SUCCESS.val(), ResultCode.SUCCESS.msg(), null);
    }

    /**
     * 删除用户地址
     *
     * @return
     */
    @RequestMapping("todel")
    @ResponseBody
    public JsonResult delAddressManager(@RequestParam String id) {
        AddressManager manager = addressManagerService.delAddressManager(id);
        if (manager == null)
            return new JsonResult(ResultCode.EXCEPTION.val(), ResultCode.EXCEPTION.msg(), null);
        return new JsonResult(ResultCode.SUCCESS.val(), ResultCode.SUCCESS.msg(), null);
    }

    @RequestMapping("findbyid")
    @ResponseBody
    public JsonResult findByid(@RequestParam String id) {
        AddressManager manager = addressManagerService.findByid(id);
        if (manager == null)
            return new JsonResult(ResultCode.EXCEPTION.val(), ResultCode.EXCEPTION.msg(), null);
        return new JsonResult(ResultCode.SUCCESS.val(), ResultCode.SUCCESS.msg(), manager);
    }
    @RequestMapping("abc/{type}")
    @ResponseBody
    public   String   getAddressManager(@PathVariable  int  type){
        System.out.println(type);
        return "qwetqwet"+type;
    }
}
