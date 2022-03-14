package com.codesniper.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codesniper.dao.SmsSkuLadderDao;
import com.codesniper.entity.SmsSkuLadder;
import com.codesniper.service.SmsSkuLadderService;
import org.springframework.stereotype.Service;

/**
 * 商品阶梯价格(SmsSkuLadder)表服务实现类
 *
 * @author CodeSniper
 * @since 2022-03-14 16:55:46
 */
@Service("smsSkuLadderService")
public class SmsSkuLadderServiceImpl extends ServiceImpl<SmsSkuLadderDao, SmsSkuLadder> implements SmsSkuLadderService {

}

