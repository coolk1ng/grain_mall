package com.codesniper.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codesniper.dao.CommentReplayDao;
import com.codesniper.entity.CommentReplay;
import com.codesniper.service.CommentReplayService;
import org.springframework.stereotype.Service;

/**
 * 商品评价回复关系(CommentReplay)表服务实现类
 *
 * @author CodeSniper
 * @since 2022-03-14 16:39:40
 */
@Service("commentReplayService")
public class CommentReplayServiceImpl extends ServiceImpl<CommentReplayDao, CommentReplay> implements CommentReplayService {

}

