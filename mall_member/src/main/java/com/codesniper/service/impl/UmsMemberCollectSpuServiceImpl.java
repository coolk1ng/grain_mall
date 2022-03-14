package com.codesniper.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codesniper.dao.UmsMemberCollectSpuDao;
import com.codesniper.entity.UmsMemberCollectSpu;
import com.codesniper.service.UmsMemberCollectSpuService;
import org.springframework.stereotype.Service;

/**
 * 会员收藏的商品(UmsMemberCollectSpu)表服务实现类
 *
 * @author CodeSniper
 * @since 2022-03-14 16:55:15
 */
@Service("umsMemberCollectSpuService")
public class UmsMemberCollectSpuServiceImpl extends ServiceImpl<UmsMemberCollectSpuDao, UmsMemberCollectSpu> implements UmsMemberCollectSpuService {

}

