package com.codesniper.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codesniper.dao.UmsGrowthChangeHistoryDao;
import com.codesniper.entity.UmsGrowthChangeHistory;
import com.codesniper.service.UmsGrowthChangeHistoryService;
import org.springframework.stereotype.Service;

/**
 * 成长值变化历史记录(UmsGrowthChangeHistory)表服务实现类
 *
 * @author CodeSniper
 * @since 2022-03-14 16:55:15
 */
@Service("umsGrowthChangeHistoryService")
public class UmsGrowthChangeHistoryServiceImpl extends ServiceImpl<UmsGrowthChangeHistoryDao, UmsGrowthChangeHistory> implements UmsGrowthChangeHistoryService {

}

