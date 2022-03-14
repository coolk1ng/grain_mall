package com.codesniper.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codesniper.dao.OmsOrderOperateHistoryDao;
import com.codesniper.entity.OmsOrderOperateHistory;
import com.codesniper.service.OmsOrderOperateHistoryService;
import org.springframework.stereotype.Service;

/**
 * 订单操作历史记录(OmsOrderOperateHistory)表服务实现类
 *
 * @author CodeSniper
 * @since 2022-03-14 16:54:44
 */
@Service("omsOrderOperateHistoryService")
public class OmsOrderOperateHistoryServiceImpl extends ServiceImpl<OmsOrderOperateHistoryDao, OmsOrderOperateHistory> implements OmsOrderOperateHistoryService {

}

