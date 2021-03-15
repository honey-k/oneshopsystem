package com.chinadci.oneshopreception.service;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.chinadci.oneshopreception.entity.TbUser;
import com.chinadci.oneshopreception.mapper.ITbUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    private ITbUserMapper dao;

    public void login() {
        QueryWrapper<TbUser> qw = new QueryWrapper<>();



    }

}
