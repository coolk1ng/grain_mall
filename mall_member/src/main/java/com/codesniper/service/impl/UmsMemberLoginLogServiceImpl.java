package com.codesniper.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codesniper.dao.UmsMemberLoginLogDao;
import com.codesniper.entity.UmsMemberLoginLog;
import com.codesniper.service.UmsMemberLoginLogService;
import org.springframework.stereotype.Service;

/**
 * 会员登录记录(UmsMemberLoginLog)表服务实现类
 *
 * @author CodeSniper
 * @since 2022-03-14 16:55:15
 */
@Service("umsMemberLoginLogService")
public class UmsMemberLoginLogServiceImpl extends ServiceImpl<UmsMemberLoginLogDao, UmsMemberLoginLog> implements UmsMemberLoginLogService {

}

