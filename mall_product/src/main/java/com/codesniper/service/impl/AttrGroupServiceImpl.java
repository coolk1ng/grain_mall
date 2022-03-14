package com.codesniper.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codesniper.dao.AttrGroupDao;
import com.codesniper.entity.AttrGroup;
import com.codesniper.service.AttrGroupService;
import org.springframework.stereotype.Service;

/**
 * 属性分组(AttrGroup)表服务实现类
 *
 * @author CodeSniper
 * @since 2022-03-14 16:39:40
 */
@Service("attrGroupService")
public class AttrGroupServiceImpl extends ServiceImpl<AttrGroupDao, AttrGroup> implements AttrGroupService {

}

