package com.chinadci.oneshopreception.controller;


import com.chinadci.oneshopreception.entity.TbUser;
import com.chinadci.oneshopreception.sendSms.SendSMS;
import com.chinadci.oneshopreception.service.TbUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author zyk
 * @since 2021-03-12
 */
@RestController
@CrossOrigin
@Api(tags = "用户CURD操作")
public class TbUserController {

    @Autowired
    private TbUserService us;

    @PostMapping("/login")
    @ApiOperation(value="用户登录", notes="用户根据手机号和密码、验证码进行登录")
    public Map<String, Object> login(String uphone, String upwd) {
        Map<String, Object> map = new HashMap<>();
        List<TbUser> list = us.login(uphone, upwd);
        map.put("data", list);
        map.put("size", list.size());
        return map;
    }

    @PostMapping("/insert")
    @ApiOperation(value="添加新用户", notes="添加新用户")
    public Map<String, Object> insert(TbUser tbUser) {
        Map<String, Object> map = new HashMap<>();
        int result = us.Insert(tbUser);
        map.put("data", result);
        return map;
    }

    @PostMapping("/findphone")
    public Map<String, Object> findphone(String phone) {
        Map<String, Object> map = new HashMap<>();
        List<TbUser> list = us.findphone(phone);
        map.put("size", list.size());
        if (map.get("size").equals(0)) {
            map.put("yanzm", SendSMS.sendsms(phone));
        }
        return map;
    }
    public void login(){
        System.out.println(111);
    }

}

