package com.codesniper.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codesniper.dao.SmsSeckillSkuNoticeDao;
import com.codesniper.entity.SmsSeckillSkuNotice;
import com.codesniper.service.SmsSeckillSkuNoticeService;
import org.springframework.stereotype.Service;

/**
 * 秒杀商品通知订阅(SmsSeckillSkuNotice)表服务实现类
 *
 * @author CodeSniper
 * @since 2022-03-14 16:55:46
 */
@Service("smsSeckillSkuNoticeService")
public class SmsSeckillSkuNoticeServiceImpl extends ServiceImpl<SmsSeckillSkuNoticeDao, SmsSeckillSkuNotice> implements SmsSeckillSkuNoticeService {

}

