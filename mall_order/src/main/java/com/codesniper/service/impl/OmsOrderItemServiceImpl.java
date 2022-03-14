package com.codesniper.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codesniper.dao.OmsOrderItemDao;
import com.codesniper.entity.OmsOrderItem;
import com.codesniper.service.OmsOrderItemService;
import org.springframework.stereotype.Service;

/**
 * 订单项信息(OmsOrderItem)表服务实现类
 *
 * @author CodeSniper
 * @since 2022-03-14 16:54:44
 */
@Service("omsOrderItemService")
public class OmsOrderItemServiceImpl extends ServiceImpl<OmsOrderItemDao, OmsOrderItem> implements OmsOrderItemService {

}

