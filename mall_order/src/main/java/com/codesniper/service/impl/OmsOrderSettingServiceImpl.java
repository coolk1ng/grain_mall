package com.codesniper.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codesniper.dao.OmsOrderSettingDao;
import com.codesniper.entity.OmsOrderSetting;
import com.codesniper.service.OmsOrderSettingService;
import org.springframework.stereotype.Service;

/**
 * 订单配置信息(OmsOrderSetting)表服务实现类
 *
 * @author CodeSniper
 * @since 2022-03-14 16:54:44
 */
@Service("omsOrderSettingService")
public class OmsOrderSettingServiceImpl extends ServiceImpl<OmsOrderSettingDao, OmsOrderSetting> implements OmsOrderSettingService {

}

