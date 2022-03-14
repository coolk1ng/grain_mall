package com.codesniper.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codesniper.dao.SmsHomeAdvDao;
import com.codesniper.entity.SmsHomeAdv;
import com.codesniper.service.SmsHomeAdvService;
import org.springframework.stereotype.Service;

/**
 * 首页轮播广告(SmsHomeAdv)表服务实现类
 *
 * @author CodeSniper
 * @since 2022-03-14 16:55:46
 */
@Service("smsHomeAdvService")
public class SmsHomeAdvServiceImpl extends ServiceImpl<SmsHomeAdvDao, SmsHomeAdv> implements SmsHomeAdvService {

}

