package com.codesniper.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codesniper.dao.CategoryDao;
import com.codesniper.entity.Category;
import com.codesniper.service.CategoryService;
import org.springframework.stereotype.Service;

/**
 * 商品三级分类(Category)表服务实现类
 *
 * @author CodeSniper
 * @since 2022-03-14 16:39:40
 */
@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, Category> implements CategoryService {

}

