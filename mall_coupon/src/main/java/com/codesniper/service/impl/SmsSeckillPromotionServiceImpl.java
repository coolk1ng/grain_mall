package com.codesniper.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codesniper.dao.SmsSeckillPromotionDao;
import com.codesniper.entity.SmsSeckillPromotion;
import com.codesniper.service.SmsSeckillPromotionService;
import org.springframework.stereotype.Service;

/**
 * 秒杀活动(SmsSeckillPromotion)表服务实现类
 *
 * @author CodeSniper
 * @since 2022-03-14 16:55:46
 */
@Service("smsSeckillPromotionService")
public class SmsSeckillPromotionServiceImpl extends ServiceImpl<SmsSeckillPromotionDao, SmsSeckillPromotion> implements SmsSeckillPromotionService {

}

