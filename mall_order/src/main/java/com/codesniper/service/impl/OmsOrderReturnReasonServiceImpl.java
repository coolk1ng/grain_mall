package com.codesniper.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codesniper.dao.OmsOrderReturnReasonDao;
import com.codesniper.entity.OmsOrderReturnReason;
import com.codesniper.service.OmsOrderReturnReasonService;
import org.springframework.stereotype.Service;

/**
 * 退货原因(OmsOrderReturnReason)表服务实现类
 *
 * @author CodeSniper
 * @since 2022-03-14 16:54:44
 */
@Service("omsOrderReturnReasonService")
public class OmsOrderReturnReasonServiceImpl extends ServiceImpl<OmsOrderReturnReasonDao, OmsOrderReturnReason> implements OmsOrderReturnReasonService {

}

