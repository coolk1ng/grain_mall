package com.codesniper.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codesniper.dao.UmsMemberStatisticsInfoDao;
import com.codesniper.entity.UmsMemberStatisticsInfo;
import com.codesniper.service.UmsMemberStatisticsInfoService;
import org.springframework.stereotype.Service;

/**
 * 会员统计信息(UmsMemberStatisticsInfo)表服务实现类
 *
 * @author CodeSniper
 * @since 2022-03-14 16:55:15
 */
@Service("umsMemberStatisticsInfoService")
public class UmsMemberStatisticsInfoServiceImpl extends ServiceImpl<UmsMemberStatisticsInfoDao, UmsMemberStatisticsInfo> implements UmsMemberStatisticsInfoService {

}

