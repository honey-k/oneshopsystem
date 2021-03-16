package com.chinadci.oneshopreception.entity;

import java.math.BigDecimal;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 *
 * </p>
 *
 * @author zyk
 * @since 2021-03-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("tb_shopcart")
@ApiModel(value = "TbShopcart对象", description = "")
public class TbShopcart implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "购物车id")
    @TableId(value = "sid", type = IdType.AUTO)
    private Integer sid;

    @ApiModelProperty(value = "图片路径")
    private String simgs;

    @ApiModelProperty(value = "用户id")
    private Integer suid;

    @ApiModelProperty(value = "商品标题")
    private String stitle;

    @ApiModelProperty(value = "商品数量")
    private Integer snumber;

    @ApiModelProperty(value = "商品价格")
    private BigDecimal sprice;

    @ApiModelProperty(value = "商品总价")
    private BigDecimal sprices;


}
