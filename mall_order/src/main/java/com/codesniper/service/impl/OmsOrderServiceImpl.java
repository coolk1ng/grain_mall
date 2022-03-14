package com.codesniper.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codesniper.dao.OmsOrderDao;
import com.codesniper.entity.OmsOrder;
import com.codesniper.service.OmsOrderService;
import org.springframework.stereotype.Service;

/**
 * 订单(OmsOrder)表服务实现类
 *
 * @author CodeSniper
 * @since 2022-03-14 16:54:44
 */
@Service("omsOrderService")
public class OmsOrderServiceImpl extends ServiceImpl<OmsOrderDao, OmsOrder> implements OmsOrderService {

}

