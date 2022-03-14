package com.codesniper.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codesniper.dao.SmsSeckillSkuRelationDao;
import com.codesniper.entity.SmsSeckillSkuRelation;
import com.codesniper.service.SmsSeckillSkuRelationService;
import org.springframework.stereotype.Service;

/**
 * 秒杀活动商品关联(SmsSeckillSkuRelation)表服务实现类
 *
 * @author CodeSniper
 * @since 2022-03-14 16:55:46
 */
@Service("smsSeckillSkuRelationService")
public class SmsSeckillSkuRelationServiceImpl extends ServiceImpl<SmsSeckillSkuRelationDao, SmsSeckillSkuRelation> implements SmsSeckillSkuRelationService {

}

