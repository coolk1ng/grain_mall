package com.codesniper.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codesniper.dao.OmsRefundInfoDao;
import com.codesniper.entity.OmsRefundInfo;
import com.codesniper.service.OmsRefundInfoService;
import org.springframework.stereotype.Service;

/**
 * 退款信息(OmsRefundInfo)表服务实现类
 *
 * @author CodeSniper
 * @since 2022-03-14 16:54:44
 */
@Service("omsRefundInfoService")
public class OmsRefundInfoServiceImpl extends ServiceImpl<OmsRefundInfoDao, OmsRefundInfo> implements OmsRefundInfoService {

}

