package com.codesniper.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codesniper.dao.SmsCouponSpuRelationDao;
import com.codesniper.entity.SmsCouponSpuRelation;
import com.codesniper.service.SmsCouponSpuRelationService;
import org.springframework.stereotype.Service;

/**
 * 优惠券与产品关联(SmsCouponSpuRelation)表服务实现类
 *
 * @author CodeSniper
 * @since 2022-03-14 16:55:46
 */
@Service("smsCouponSpuRelationService")
public class SmsCouponSpuRelationServiceImpl extends ServiceImpl<SmsCouponSpuRelationDao, SmsCouponSpuRelation> implements SmsCouponSpuRelationService {

}

