package com.codesniper.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codesniper.dao.SmsMemberPriceDao;
import com.codesniper.entity.SmsMemberPrice;
import com.codesniper.service.SmsMemberPriceService;
import org.springframework.stereotype.Service;

/**
 * 商品会员价格(SmsMemberPrice)表服务实现类
 *
 * @author CodeSniper
 * @since 2022-03-14 16:55:46
 */
@Service("smsMemberPriceService")
public class SmsMemberPriceServiceImpl extends ServiceImpl<SmsMemberPriceDao, SmsMemberPrice> implements SmsMemberPriceService {

}

