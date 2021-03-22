package com.chinadci.oneshopreception.controller;


import com.chinadci.oneshopreception.entity.TbCommodity;
import com.chinadci.oneshopreception.entity.TbUser;
import com.chinadci.oneshopreception.service.TbCommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

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
public class TbCommodityController {

    @Autowired
    private TbCommodityService ts;

    @PostMapping("/mhfindall")
    public Map<String, Object> findall(String ctitles) {
        Map<String, Object> map = new HashMap<>();
        map.put("data", ts.findall(ctitles));
        return map;
    }

    @GetMapping("/findbyid")
    public Map<String, Object> findbyid(int id) {
        Map<String, Object> map = new HashMap<>();
        map.put("data", ts.findyid(id));
        return map;
    }

}

