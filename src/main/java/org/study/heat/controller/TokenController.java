package org.study.heat.controller;


import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.study.heat.annotation.Authorization;
import org.study.heat.annotation.CurrentUser;
import org.study.heat.common.JsonResult;
import org.study.heat.entity.TokenModel;
import org.study.heat.pojo.User;
import org.study.heat.service.TokenManager;
import org.study.heat.service.UserService;




import javax.annotation.Resource;

import java.util.Map;

/**
 * @author liangyunlong
 * @date 2017/12/20
 */
@Controller
//@CrossOrigin
@RequestMapping("/login")
public class TokenController {
    //@Resource
    //private SmsOrderService smsOrderService; // 短信订单服务

    @Resource
    private UserService userService;

    @Resource
    private TokenManager tokenManager;

    @ResponseBody
    @RequestMapping(value = "/token", method = RequestMethod.POST)
    public JsonResult login(@RequestParam String name,@RequestParam String password)throws Throwable{
        User user =  userService.login(name, password);
        //生成一个token，保存用户登录状态
        TokenModel model = tokenManager.get(user.getId());
        if (model == null) {
            model = tokenManager.createToken(user.getId());
        }
        return new JsonResult(true, "登录成功", model);
    }

    /**
     * 注销
     */
    @RequestMapping(method = RequestMethod.DELETE)
    @Authorization
    public JsonResult logout(@CurrentUser User user) {
        tokenManager.deleteToken(user.getId());
        return  new JsonResult(true, "退出成功", "");
    }




}
