package com.chinadci.oneshopreception.controller;


import com.chinadci.oneshopreception.entity.TbCommodity;
import com.chinadci.oneshopreception.entity.TbUser;
import com.chinadci.oneshopreception.service.TbCommodityService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
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
@Api(tags = "用户CURD操作")
@CrossOrigin
public class TbCommodityController {

    @Autowired
    private TbCommodityService ts;

    @PostMapping("/mhfindall")
    @ApiOperation(value="获取商品所有信息", notes="根据ctitles模糊查询来获取详细信息")
    public Map<String, Object> findall(String ctitles) {
        Map<String, Object> map = new HashMap<>();
        map.put("data", ts.findall(ctitles));
        return map;
    }

    @GetMapping("/findbyid")
    @ApiOperation(value="根据id查询所有信息", notes="根据id查询来获取所有信息")
    public Map<String, Object> findbyid(int id) {
        Map<String, Object> map = new HashMap<>();
        map.put("data", ts.findyid(id));
        return map;
    }

}

