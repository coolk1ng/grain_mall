package com.codesniper.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.codesniper.entity.Category;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类(Category)表数据库访问层
 *
 * @author CodeSniper
 * @since 2022-03-14 16:39:40
 */
@Mapper
public interface CategoryDao extends BaseMapper<Category> {

}

