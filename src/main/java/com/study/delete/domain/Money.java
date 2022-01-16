package com.study.delete.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 *  atlan 2022/1/16 16:01 
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "money")
public class Money {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField(value = "`count`")
    private BigDecimal count;

}