package com.codesniper.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codesniper.dao.UmsMemberLevelDao;
import com.codesniper.entity.UmsMemberLevel;
import com.codesniper.service.UmsMemberLevelService;
import org.springframework.stereotype.Service;

/**
 * 会员等级(UmsMemberLevel)表服务实现类
 *
 * @author CodeSniper
 * @since 2022-03-14 16:55:15
 */
@Service("umsMemberLevelService")
public class UmsMemberLevelServiceImpl extends ServiceImpl<UmsMemberLevelDao, UmsMemberLevel> implements UmsMemberLevelService {

}

