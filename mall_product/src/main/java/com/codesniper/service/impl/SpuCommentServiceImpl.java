package com.codesniper.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codesniper.dao.SpuCommentDao;
import com.codesniper.entity.SpuComment;
import com.codesniper.service.SpuCommentService;
import org.springframework.stereotype.Service;

/**
 * 商品评价(SpuComment)表服务实现类
 *
 * @author CodeSniper
 * @since 2022-03-14 16:39:40
 */
@Service("spuCommentService")
public class SpuCommentServiceImpl extends ServiceImpl<SpuCommentDao, SpuComment> implements SpuCommentService {

}

