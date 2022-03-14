package com.codesniper.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codesniper.dao.CategoryBrandRelationDao;
import com.codesniper.entity.CategoryBrandRelation;
import com.codesniper.service.CategoryBrandRelationService;
import org.springframework.stereotype.Service;

/**
 * 品牌分类关联(CategoryBrandRelation)表服务实现类
 *
 * @author CodeSniper
 * @since 2022-03-14 16:39:40
 */
@Service("categoryBrandRelationService")
public class CategoryBrandRelationServiceImpl extends ServiceImpl<CategoryBrandRelationDao, CategoryBrandRelation> implements CategoryBrandRelationService {

}

