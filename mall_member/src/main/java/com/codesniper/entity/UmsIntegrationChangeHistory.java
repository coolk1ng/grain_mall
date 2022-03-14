package com.codesniper.entity;

import java.util.Date;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * 积分变化历史记录(UmsIntegrationChangeHistory)表实体类
 *
 * @author CodeSniper
 * @since 2022-03-14 16:55:15
 */
@SuppressWarnings("serial")
public class UmsIntegrationChangeHistory extends Model<UmsIntegrationChangeHistory> {
    //id
    private Long id;
    //member_id
    private Long memberId;
    //create_time
    private Date createTime;
    //变化的值
    private Integer changeCount;
    //备注
    private String note;
    //来源[0->购物；1->管理员修改;2->活动]
    private Integer sourceTyoe;


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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getChangeCount() {
        return changeCount;
    }

    public void setChangeCount(Integer changeCount) {
        this.changeCount = changeCount;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Integer getSourceTyoe() {
        return sourceTyoe;
    }

    public void setSourceTyoe(Integer sourceTyoe) {
        this.sourceTyoe = sourceTyoe;
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

