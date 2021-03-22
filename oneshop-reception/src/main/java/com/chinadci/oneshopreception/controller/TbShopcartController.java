package com.chinadci.oneshopreception.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.chinadci.oneshopreception.entity.TbShopcart;
import com.chinadci.oneshopreception.service.TbShopcartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import java.util.ArrayList;
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
public class TbShopcartController {
    @Autowired
    private TbShopcartService shopcartService;

    @GetMapping("/findgw")
    public Map<String, Object> findcar() {
        Map<String, Object> map = new HashMap<>();
        map.put("data", shopcartService.findall());
        return map;
    }

    @PostMapping("/addcar")
    public Map<String, Object> addcar(TbShopcart tbShopcart) {
        Map<String, Object> map = new HashMap<>();
        map.put("data", shopcartService.insercar(tbShopcart));
        return map;
    }

    @PostMapping("/delcar")
    public Map<String, Object> delcar(int sid) {
        Map<String, Object> map = new HashMap<>();
        map.put("data", shopcartService.del(sid));
        return map;
    }

    @PostMapping("/delcars")
    public void DelIds(String arrays) {
        JSONArray jsonArray = (JSONArray) JSON.parse(arrays);
        List list = new ArrayList();
        for (int i = 0; i < jsonArray.size(); i++) {
            list.add(jsonArray.get(i));
        }
        shopcartService.dels(list);
    }


}

