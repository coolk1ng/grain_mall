package com.codesniper.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * 订单配置信息(OmsOrderSetting)表实体类
 *
 * @author CodeSniper
 * @since 2022-03-14 16:54:44
 */
@SuppressWarnings("serial")
public class OmsOrderSetting extends Model<OmsOrderSetting> {
    //id
    private Long id;
    //秒杀订单超时关闭时间(分)
    private Integer flashOrderOvertime;
    //正常订单超时时间(分)
    private Integer normalOrderOvertime;
    //发货后自动确认收货时间（天）
    private Integer confirmOvertime;
    //自动完成交易时间，不能申请退货（天）
    private Integer finishOvertime;
    //订单完成后自动好评时间（天）
    private Integer commentOvertime;
    //会员等级【0-不限会员等级，全部通用；其他-对应的其他会员等级】
    private Integer memberLevel;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getFlashOrderOvertime() {
        return flashOrderOvertime;
    }

    public void setFlashOrderOvertime(Integer flashOrderOvertime) {
        this.flashOrderOvertime = flashOrderOvertime;
    }

    public Integer getNormalOrderOvertime() {
        return normalOrderOvertime;
    }

    public void setNormalOrderOvertime(Integer normalOrderOvertime) {
        this.normalOrderOvertime = normalOrderOvertime;
    }

    public Integer getConfirmOvertime() {
        return confirmOvertime;
    }

    public void setConfirmOvertime(Integer confirmOvertime) {
        this.confirmOvertime = confirmOvertime;
    }

    public Integer getFinishOvertime() {
        return finishOvertime;
    }

    public void setFinishOvertime(Integer finishOvertime) {
        this.finishOvertime = finishOvertime;
    }

    public Integer getCommentOvertime() {
        return commentOvertime;
    }

    public void setCommentOvertime(Integer commentOvertime) {
        this.commentOvertime = commentOvertime;
    }

    public Integer getMemberLevel() {
        return memberLevel;
    }

    public void setMemberLevel(Integer memberLevel) {
        this.memberLevel = memberLevel;
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

