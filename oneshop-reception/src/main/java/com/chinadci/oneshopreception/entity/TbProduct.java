package com.chinadci.oneshopreception.entity;

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
@TableName("tb_product")
@ApiModel(value = "TbProduct对象", description = "")
public class TbProduct implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "pid", type = IdType.AUTO)
    private Integer pid;

    private String pname;

    private String pimg;

    private String pinfo;

    private Double pprice;

    private Integer ptype;


}
