package com.codesniper.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codesniper.dao.SmsSeckillSessionDao;
import com.codesniper.entity.SmsSeckillSession;
import com.codesniper.service.SmsSeckillSessionService;
import org.springframework.stereotype.Service;

/**
 * 秒杀活动场次(SmsSeckillSession)表服务实现类
 *
 * @author CodeSniper
 * @since 2022-03-14 16:55:46
 */
@Service("smsSeckillSessionService")
public class SmsSeckillSessionServiceImpl extends ServiceImpl<SmsSeckillSessionDao, SmsSeckillSession> implements SmsSeckillSessionService {

}

