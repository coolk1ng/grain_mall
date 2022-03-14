package com.codesniper.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * 商品会员价格(SmsMemberPrice)表实体类
 *
 * @author CodeSniper
 * @since 2022-03-14 16:55:46
 */
@SuppressWarnings("serial")
public class SmsMemberPrice extends Model<SmsMemberPrice> {
    //id
    private Long id;
    //sku_id
    private Long skuId;
    //会员等级id
    private Long memberLevelId;
    //会员等级名
    private String memberLevelName;
    //会员对应价格
    private Double memberPrice;
    //可否叠加其他优惠[0-不可叠加优惠，1-可叠加]
    private Integer addOther;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public Long getMemberLevelId() {
        return memberLevelId;
    }

    public void setMemberLevelId(Long memberLevelId) {
        this.memberLevelId = memberLevelId;
    }

    public String getMemberLevelName() {
        return memberLevelName;
    }

    public void setMemberLevelName(String memberLevelName) {
        this.memberLevelName = memberLevelName;
    }

    public Double getMemberPrice() {
        return memberPrice;
    }

    public void setMemberPrice(Double memberPrice) {
        this.memberPrice = memberPrice;
    }

    public Integer getAddOther() {
        return addOther;
    }

    public void setAddOther(Integer addOther) {
        this.addOther = addOther;
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

