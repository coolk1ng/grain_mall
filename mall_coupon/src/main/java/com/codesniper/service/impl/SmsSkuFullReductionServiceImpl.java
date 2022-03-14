package com.codesniper.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codesniper.dao.SmsSkuFullReductionDao;
import com.codesniper.entity.SmsSkuFullReduction;
import com.codesniper.service.SmsSkuFullReductionService;
import org.springframework.stereotype.Service;

/**
 * 商品满减信息(SmsSkuFullReduction)表服务实现类
 *
 * @author CodeSniper
 * @since 2022-03-14 16:55:46
 */
@Service("smsSkuFullReductionService")
public class SmsSkuFullReductionServiceImpl extends ServiceImpl<SmsSkuFullReductionDao, SmsSkuFullReduction> implements SmsSkuFullReductionService {

}

