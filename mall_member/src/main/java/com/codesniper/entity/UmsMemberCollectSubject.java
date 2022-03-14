package com.codesniper.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * 会员收藏的专题活动(UmsMemberCollectSubject)表实体类
 *
 * @author CodeSniper
 * @since 2022-03-14 16:55:15
 */
@SuppressWarnings("serial")
public class UmsMemberCollectSubject extends Model<UmsMemberCollectSubject> {
    //id
    private Long id;
    //subject_id
    private Long subjectId;
    //subject_name
    private String subjectName;
    //subject_img
    private String subjectImg;
    //活动url
    private String subjectUrll;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectImg() {
        return subjectImg;
    }

    public void setSubjectImg(String subjectImg) {
        this.subjectImg = subjectImg;
    }

    public String getSubjectUrll() {
        return subjectUrll;
    }

    public void setSubjectUrll(String subjectUrll) {
        this.subjectUrll = subjectUrll;
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

