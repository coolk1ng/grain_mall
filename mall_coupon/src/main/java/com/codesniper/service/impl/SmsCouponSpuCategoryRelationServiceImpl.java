package com.codesniper.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codesniper.dao.SmsCouponSpuCategoryRelationDao;
import com.codesniper.entity.SmsCouponSpuCategoryRelation;
import com.codesniper.service.SmsCouponSpuCategoryRelationService;
import org.springframework.stereotype.Service;

/**
 * 优惠券分类关联(SmsCouponSpuCategoryRelation)表服务实现类
 *
 * @author CodeSniper
 * @since 2022-03-14 16:55:46
 */
@Service("smsCouponSpuCategoryRelationService")
public class SmsCouponSpuCategoryRelationServiceImpl extends ServiceImpl<SmsCouponSpuCategoryRelationDao, SmsCouponSpuCategoryRelation> implements SmsCouponSpuCategoryRelationService {

}

