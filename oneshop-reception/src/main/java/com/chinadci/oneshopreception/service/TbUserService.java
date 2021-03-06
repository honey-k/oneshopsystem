package com.chinadci.oneshopreception.service;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.chinadci.oneshopreception.entity.TbUser;

import com.chinadci.oneshopreception.mapper.TbUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author zyk
 * @since 2021-03-12
 */
@Service
public class TbUserService {

    @Autowired
    private TbUserMapper dao;

    public List<TbUser> login(String uphone, String upwd) {
        List<TbUser> list = null;
        QueryWrapper<TbUser> qw = new QueryWrapper<>();
        qw.eq("uphone", uphone);
        qw.eq("upwd", upwd);
        list = dao.selectList(qw);
        return list;
    }

    public int Insert(TbUser tbUser) {
        return dao.insert(tbUser);
    }

    public List<TbUser> findphone(String phone) {
        QueryWrapper<TbUser> qw = new QueryWrapper<>();
        qw.eq("uphone", phone);
        return dao.selectList(qw);
    }


}
