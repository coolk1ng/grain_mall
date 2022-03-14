package com.codesniper.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codesniper.dao.UmsIntegrationChangeHistoryDao;
import com.codesniper.entity.UmsIntegrationChangeHistory;
import com.codesniper.service.UmsIntegrationChangeHistoryService;
import org.springframework.stereotype.Service;

/**
 * 积分变化历史记录(UmsIntegrationChangeHistory)表服务实现类
 *
 * @author CodeSniper
 * @since 2022-03-14 16:55:15
 */
@Service("umsIntegrationChangeHistoryService")
public class UmsIntegrationChangeHistoryServiceImpl extends ServiceImpl<UmsIntegrationChangeHistoryDao, UmsIntegrationChangeHistory> implements UmsIntegrationChangeHistoryService {

}

