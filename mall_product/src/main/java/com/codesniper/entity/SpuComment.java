package com.codesniper.entity;

import java.util.Date;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * 商品评价(SpuComment)表实体类
 *
 * @author CodeSniper
 * @since 2022-03-14 16:39:40
 */
@SuppressWarnings("serial")
public class SpuComment extends Model<SpuComment> {
    //id
    private Long id;
    //sku_id
    private Long skuId;
    //spu_id
    private Long spuId;
    //商品名字
    private String spuName;
    //会员昵称
    private String memberNickName;
    //星级
    private Integer star;
    //会员ip
    private String memberIp;
    //创建时间
    private Date createTime;
    //显示状态[0-不显示，1-显示]
    private Integer showStatus;
    //购买时属性组合
    private String spuAttributes;
    //点赞数
    private Integer likesCount;
    //回复数
    private Integer replyCount;
    //评论图片/视频[json数据；[{type:文件类型,url:资源路径}]]
    private String resources;
    //内容
    private String content;
    //用户头像
    private String memberIcon;
    //评论类型[0 - 对商品的直接评论，1 - 对评论的回复]
    private Integer commentType;


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

    public Long getSpuId() {
        return spuId;
    }

    public void setSpuId(Long spuId) {
        this.spuId = spuId;
    }

    public String getSpuName() {
        return spuName;
    }

    public void setSpuName(String spuName) {
        this.spuName = spuName;
    }

    public String getMemberNickName() {
        return memberNickName;
    }

    public void setMemberNickName(String memberNickName) {
        this.memberNickName = memberNickName;
    }

    public Integer getStar() {
        return star;
    }

    public void setStar(Integer star) {
        this.star = star;
    }

    public String getMemberIp() {
        return memberIp;
    }

    public void setMemberIp(String memberIp) {
        this.memberIp = memberIp;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getShowStatus() {
        return showStatus;
    }

    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
    }

    public String getSpuAttributes() {
        return spuAttributes;
    }

    public void setSpuAttributes(String spuAttributes) {
        this.spuAttributes = spuAttributes;
    }

    public Integer getLikesCount() {
        return likesCount;
    }

    public void setLikesCount(Integer likesCount) {
        this.likesCount = likesCount;
    }

    public Integer getReplyCount() {
        return replyCount;
    }

    public void setReplyCount(Integer replyCount) {
        this.replyCount = replyCount;
    }

    public String getResources() {
        return resources;
    }

    public void setResources(String resources) {
        this.resources = resources;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getMemberIcon() {
        return memberIcon;
    }

    public void setMemberIcon(String memberIcon) {
        this.memberIcon = memberIcon;
    }

    public Integer getCommentType() {
        return commentType;
    }

    public void setCommentType(Integer commentType) {
        this.commentType = commentType;
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

