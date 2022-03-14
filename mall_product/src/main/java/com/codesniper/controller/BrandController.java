package com.codesniper.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.codesniper.entity.Brand;
import com.codesniper.service.BrandService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 品牌(Brand)表控制层
 *
 * @author CodeSniper
 * @since 2022-03-14 16:39:40
 */
@RestController
@RequestMapping("brand")
public class BrandController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private BrandService brandService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param brand 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<Brand> page, Brand brand) {
        return success(this.brandService.page(page, new QueryWrapper<>(brand)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.brandService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param brand 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody Brand brand) {
        return success(this.brandService.save(brand));
    }

    /**
     * 修改数据
     *
     * @param brand 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody Brand brand) {
        return success(this.brandService.updateById(brand));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.brandService.removeByIds(idList));
    }
}

