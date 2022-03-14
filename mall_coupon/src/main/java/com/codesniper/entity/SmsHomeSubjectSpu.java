package com.codesniper.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * 专题商品(SmsHomeSubjectSpu)表实体类
 *
 * @author CodeSniper
 * @since 2022-03-14 16:55:46
 */
@SuppressWarnings("serial")
public class SmsHomeSubjectSpu extends Model<SmsHomeSubjectSpu> {
    //id
    private Long id;
    //专题名字
    private String name;
    //专题id
    private Long subjectId;
    //spu_id
    private Long spuId;
    //排序
    private Integer sort;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
    }

    public Long getSpuId() {
        return spuId;
    }

    public void setSpuId(Long spuId) {
        this.spuId = spuId;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.id;
    }
    }

