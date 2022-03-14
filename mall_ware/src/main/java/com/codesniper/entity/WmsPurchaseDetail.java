package com.codesniper.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * (WmsPurchaseDetail)表实体类
 *
 * @author CodeSniper
 * @since 2022-03-14 16:45:49
 */
@SuppressWarnings("serial")
public class WmsPurchaseDetail extends Model<WmsPurchaseDetail> {
    
    private Long id;
    //采购单id
    private Long purchaseId;
    //采购商品id
    private Long skuId;
    //采购数量
    private Integer skuNum;
    //采购金额
    private Double skuPrice;
    //仓库id
    private Long wareId;
    //状态[0新建，1已分配，2正在采购，3已完成，4采购失败]
    private Integer status;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(Long purchaseId) {
        this.purchaseId = purchaseId;
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public Integer getSkuNum() {
        return skuNum;
    }

    public void setSkuNum(Integer skuNum) {
        this.skuNum = skuNum;
    }

    public Double getSkuPrice() {
        return skuPrice;
    }

    public void setSkuPrice(Double skuPrice) {
        this.skuPrice = skuPrice;
    }

    public Long getWareId() {
        return wareId;
    }

    public void setWareId(Long wareId) {
        this.wareId = wareId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

