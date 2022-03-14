package com.codesniper.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codesniper.dao.OmsOrderReturnApplyDao;
import com.codesniper.entity.OmsOrderReturnApply;
import com.codesniper.service.OmsOrderReturnApplyService;
import org.springframework.stereotype.Service;

/**
 * 订单退货申请(OmsOrderReturnApply)表服务实现类
 *
 * @author CodeSniper
 * @since 2022-03-14 16:54:44
 */
@Service("omsOrderReturnApplyService")
public class OmsOrderReturnApplyServiceImpl extends ServiceImpl<OmsOrderReturnApplyDao, OmsOrderReturnApply> implements OmsOrderReturnApplyService {

}

