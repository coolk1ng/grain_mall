package com.codesniper.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * 商品评价回复关系(CommentReplay)表实体类
 *
 * @author CodeSniper
 * @since 2022-03-14 16:39:40
 */
@SuppressWarnings("serial")
public class CommentReplay extends Model<CommentReplay> {
    //id
    private Long id;
    //评论id
    private Long commentId;
    //回复id
    private Long replyId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCommentId() {
        return commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    public Long getReplyId() {
        return replyId;
    }

    public void setReplyId(Long replyId) {
        this.replyId = replyId;
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

