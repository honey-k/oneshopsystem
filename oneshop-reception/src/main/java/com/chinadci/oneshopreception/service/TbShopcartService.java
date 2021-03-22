package com.chinadci.oneshopreception.service;

import com.chinadci.oneshopreception.entity.TbShopcart;
import com.chinadci.oneshopreception.mapper.TbShopcartMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
public class TbShopcartService {

    @Autowired
    private TbShopcartMapper dao;

    public List<TbShopcart> findall() {
        return dao.selectList(null);
    }
    public int insercar(TbShopcart tbShopcart){
       return dao.insert(tbShopcart);
    }


    public int del(int sid){
        return dao.deleteById(sid);
    }

    public int dels(List array){
        return dao.deleteBatchIds(array);
    }




}
