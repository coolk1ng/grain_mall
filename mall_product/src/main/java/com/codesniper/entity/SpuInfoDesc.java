package com.codesniper.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * spu信息介绍(SpuInfoDesc)表实体类
 *
 * @author CodeSniper
 * @since 2022-03-14 16:39:40
 */
@SuppressWarnings("serial")
public class SpuInfoDesc extends Model<SpuInfoDesc> {
    //商品id
    private Long spuId;
    //商品介绍
    private String decript;


    public Long getSpuId() {
        return spuId;
    }

    public void setSpuId(Long spuId) {
        this.spuId = spuId;
    }

    public String getDecript() {
        return decript;
    }

    public void setDecript(String decript) {
        this.decript = decript;
    }

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.spuId;
    }
    }

