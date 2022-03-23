package com.codesniper.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.codesniper.entity.Category;

import java.util.List;

/**
 * 商品三级分类(Category)表服务接口
 *
 * @author CodeSniper
 * @since 2022-03-14 16:39:40
 */
public interface CategoryService extends IService<Category> {

    /**
     * 查询所有菜单
     * @return List<Category>
     */
    List<Category> listWithTree();
}

