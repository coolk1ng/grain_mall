package com.codesniper.entity;

import java.util.Date;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * 秒杀商品通知订阅(SmsSeckillSkuNotice)表实体类
 *
 * @author CodeSniper
 * @since 2022-03-14 16:55:46
 */
@SuppressWarnings("serial")
public class SmsSeckillSkuNotice extends Model<SmsSeckillSkuNotice> {
    //id
    private Long id;
    //member_id
    private Long memberId;
    //sku_id
    private Long skuId;
    //活动场次id
    private Long sessionId;
    //订阅时间
    private Date subcribeTime;
    //发送时间
    private Date sendTime;
    //通知方式[0-短信，1-邮件]
    private Integer noticeType;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public Long getSessionId() {
        return sessionId;
    }

    public void setSessionId(Long sessionId) {
        this.sessionId = sessionId;
    }

    public Date getSubcribeTime() {
        return subcribeTime;
    }

    public void setSubcribeTime(Date subcribeTime) {
        this.subcribeTime = subcribeTime;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public Integer getNoticeType() {
        return noticeType;
    }

    public void setNoticeType(Integer noticeType) {
        this.noticeType = noticeType;
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

