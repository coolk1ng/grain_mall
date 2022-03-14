package com.codesniper.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codesniper.dao.OmsPaymentInfoDao;
import com.codesniper.entity.OmsPaymentInfo;
import com.codesniper.service.OmsPaymentInfoService;
import org.springframework.stereotype.Service;

/**
 * 支付信息表(OmsPaymentInfo)表服务实现类
 *
 * @author CodeSniper
 * @since 2022-03-14 16:54:44
 */
@Service("omsPaymentInfoService")
public class OmsPaymentInfoServiceImpl extends ServiceImpl<OmsPaymentInfoDao, OmsPaymentInfo> implements OmsPaymentInfoService {

}

