package com.codesniper.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codesniper.dao.SmsCouponHistoryDao;
import com.codesniper.entity.SmsCouponHistory;
import com.codesniper.service.SmsCouponHistoryService;
import org.springframework.stereotype.Service;

/**
 * 优惠券领取历史记录(SmsCouponHistory)表服务实现类
 *
 * @author CodeSniper
 * @since 2022-03-14 16:55:46
 */
@Service("smsCouponHistoryService")
public class SmsCouponHistoryServiceImpl extends ServiceImpl<SmsCouponHistoryDao, SmsCouponHistory> implements SmsCouponHistoryService {

}

