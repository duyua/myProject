package com.song.Controller;

import com.song.Entity.User;
import com.song.Service.Impl.UserServiceImpl;
import com.song.Service.UserService;
import com.song.Utils.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/index")
    public String index() {
        return "user/index";
    }

    @RequestMapping(value = "/show")
    @ResponseBody
    public JsonResult show(@RequestParam String name) {
        User user = userService.findUserByName(name);
        if (null != user) {
            return new JsonResult("200", "成功", user);
        }
       return new JsonResult("200", "用户不存在", null);
    }
}
