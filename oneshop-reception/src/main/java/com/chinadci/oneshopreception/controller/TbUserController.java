package com.chinadci.oneshopreception.controller;


import com.chinadci.oneshopreception.entity.TbUser;
import com.chinadci.oneshopreception.service.TbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
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
public class TbUserController {

    @Autowired
    private TbUserService us;

    @PostMapping("/login")
    public Map<String, Object> login(String uphone, String upwd) {
        Map<String, Object> map = new HashMap<>();
        List<TbUser> list = us.login(uphone, upwd);
        map.put("data", list);
        map.put("size", list.size());
        return map;
    }

    @PostMapping("/insert")
    public Map<String, Object> insert(TbUser tbUser) {
        Map<String, Object> map = new HashMap<>();
        int result = us.Insert(tbUser);
        map.put("data", result);
        return map;
    }

}

