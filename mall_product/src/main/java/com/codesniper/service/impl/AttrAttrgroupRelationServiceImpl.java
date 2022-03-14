package com.codesniper.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codesniper.dao.AttrAttrgroupRelationDao;
import com.codesniper.entity.AttrAttrgroupRelation;
import com.codesniper.service.AttrAttrgroupRelationService;
import org.springframework.stereotype.Service;

/**
 * 属性&属性分组关联(AttrAttrgroupRelation)表服务实现类
 *
 * @author CodeSniper
 * @since 2022-03-14 16:39:40
 */
@Service("attrAttrgroupRelationService")
public class AttrAttrgroupRelationServiceImpl extends ServiceImpl<AttrAttrgroupRelationDao, AttrAttrgroupRelation> implements AttrAttrgroupRelationService {

}

