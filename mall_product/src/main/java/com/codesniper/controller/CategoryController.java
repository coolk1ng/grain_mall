package com.codesniper.controller;


import com.baomidou.mybatisplus.extension.api.ApiController;
import com.codesniper.entity.Category;
import com.codesniper.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 商品三级分类(Category)表控制层
 *
 * @author CodeSniper
 * @since 2022-03-14 16:39:40
 */
@RestController
@RequestMapping("category")
public class CategoryController extends ApiController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping(value = "getAllMenus")
    public List<Category> getAllMenus(){
        return categoryService.listWithTree();
    }

}

