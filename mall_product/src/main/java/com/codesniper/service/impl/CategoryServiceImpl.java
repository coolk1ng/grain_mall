package com.codesniper.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codesniper.dao.CategoryDao;
import com.codesniper.entity.Category;
import com.codesniper.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 商品三级分类(Category)表服务实现类
 *
 * @author CodeSniper
 * @since 2022-03-14 16:39:40
 */
@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, Category> implements CategoryService {

    @Autowired
    private CategoryDao categoryDao;

    @Override
    public List<Category> listWithTree() {
        //查询所有一级菜单
        List<Category> menuList = categoryDao.selectList(null);
        List<Category> collect = menuList.stream().filter(category -> category.getParentCid().equals(0L)).map(item -> {
            item.setChildren(getChildrenMenu(item, menuList));
            return item;
        }).collect(Collectors.toList());
        return menuList;
    }

    //递归查找所有菜单的子菜单
    private List<Category> getChildrenMenu(Category category, List<Category> allMenus) {
        return allMenus.stream().filter(item -> item.getParentCid().equals(category.getCatId())).map(item -> {
            item.setChildren(getChildrenMenu(item, allMenus));
            return item;
        }).collect(Collectors.toList());
    }
}

