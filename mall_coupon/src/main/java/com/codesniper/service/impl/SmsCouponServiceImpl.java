package com.codesniper.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codesniper.dao.SmsCouponDao;
import com.codesniper.entity.SmsCoupon;
import com.codesniper.service.SmsCouponService;
import org.springframework.stereotype.Service;

/**
 * 优惠券信息(SmsCoupon)表服务实现类
 *
 * @author CodeSniper
 * @since 2022-03-14 16:55:46
 */
@Service("smsCouponService")
public class SmsCouponServiceImpl extends ServiceImpl<SmsCouponDao, SmsCoupon> implements SmsCouponService {

}

