package com.codesniper.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codesniper.dao.UmsMemberDao;
import com.codesniper.entity.UmsMember;
import com.codesniper.service.UmsMemberService;
import org.springframework.stereotype.Service;

/**
 * 会员(UmsMember)表服务实现类
 *
 * @author CodeSniper
 * @since 2022-03-14 16:55:15
 */
@Service("umsMemberService")
public class UmsMemberServiceImpl extends ServiceImpl<UmsMemberDao, UmsMember> implements UmsMemberService {

}

