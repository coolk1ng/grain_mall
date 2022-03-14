package com.codesniper.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codesniper.dao.SmsSpuBoundsDao;
import com.codesniper.entity.SmsSpuBounds;
import com.codesniper.service.SmsSpuBoundsService;
import org.springframework.stereotype.Service;

/**
 * 商品spu积分设置(SmsSpuBounds)表服务实现类
 *
 * @author CodeSniper
 * @since 2022-03-14 16:55:46
 */
@Service("smsSpuBoundsService")
public class SmsSpuBoundsServiceImpl extends ServiceImpl<SmsSpuBoundsDao, SmsSpuBounds> implements SmsSpuBoundsService {

}

