package com.chinadci.oneshopreception.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.chinadci.oneshopreception.entity.TbCommodity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.chinadci.oneshopreception.mapper.TbCommodityMapper;
import com.chinadci.oneshopreception.mapper.TbUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author zyk
 * @since 2021-03-12
 */
@Service
public class TbCommodityService {

    @Autowired
    private TbCommodityMapper dao;

    public List<TbCommodity> findall(String ctitles) {
        QueryWrapper<TbCommodity> qw = new QueryWrapper<>();
        qw.like("ctitles", ctitles);
        return dao.selectList(qw);
    }

    public List<TbCommodity> findyid(int id) {
        QueryWrapper<TbCommodity> qw = new QueryWrapper<>();
        qw.eq("cid", id);
        return dao.selectList(qw);
    }

}
