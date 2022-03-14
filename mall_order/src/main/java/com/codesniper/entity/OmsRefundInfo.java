package com.codesniper.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * 退款信息(OmsRefundInfo)表实体类
 *
 * @author CodeSniper
 * @since 2022-03-14 16:54:44
 */
@SuppressWarnings("serial")
public class OmsRefundInfo extends Model<OmsRefundInfo> {
    //id
    private Long id;
    //退款的订单
    private Long orderReturnId;
    //退款金额
    private Double refund;
    //退款交易流水号
    private String refundSn;
    //退款状态
    private Integer refundStatus;
    //退款渠道[1-支付宝，2-微信，3-银联，4-汇款]
    private Integer refundChannel;
    
    private String refundContent;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderReturnId() {
        return orderReturnId;
    }

    public void setOrderReturnId(Long orderReturnId) {
        this.orderReturnId = orderReturnId;
    }

    public Double getRefund() {
        return refund;
    }

    public void setRefund(Double refund) {
        this.refund = refund;
    }

    public String getRefundSn() {
        return refundSn;
    }

    public void setRefundSn(String refundSn) {
        this.refundSn = refundSn;
    }

    public Integer getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(Integer refundStatus) {
        this.refundStatus = refundStatus;
    }

    public Integer getRefundChannel() {
        return refundChannel;
    }

    public void setRefundChannel(Integer refundChannel) {
        this.refundChannel = refundChannel;
    }

    public String getRefundContent() {
        return refundContent;
    }

    public void setRefundContent(String refundContent) {
        this.refundContent = refundContent;
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

