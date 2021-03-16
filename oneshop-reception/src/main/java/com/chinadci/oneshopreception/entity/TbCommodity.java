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
@TableName("tb_commodity")
@ApiModel(value="TbCommodity对象", description="")
public class TbCommodity implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "商品id")
      @TableId(value = "cid", type = IdType.AUTO)
    private Integer cid;

    @ApiModelProperty(value = "图片地址")
    private String cimgs;

    @ApiModelProperty(value = "商品大标题")
    private String ctitles;

    @ApiModelProperty(value = "商品小标题")
    private String ctitle;

    @ApiModelProperty(value = "本店价格")
    private BigDecimal cprices;

    @ApiModelProperty(value = "参考价格")
    private BigDecimal cprice;


}
