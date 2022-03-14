package com.codesniper.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.codesniper.entity.SkuInfo;
import com.codesniper.service.SkuInfoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * sku信息(SkuInfo)表控制层
 *
 * @author CodeSniper
 * @since 2022-03-14 16:39:40
 */
@RestController
@RequestMapping("skuInfo")
public class SkuInfoController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private SkuInfoService skuInfoService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param skuInfo 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<SkuInfo> page, SkuInfo skuInfo) {
        return success(this.skuInfoService.page(page, new QueryWrapper<>(skuInfo)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.skuInfoService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param skuInfo 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody SkuInfo skuInfo) {
        return success(this.skuInfoService.save(skuInfo));
    }

    /**
     * 修改数据
     *
     * @param skuInfo 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody SkuInfo skuInfo) {
        return success(this.skuInfoService.updateById(skuInfo));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.skuInfoService.removeByIds(idList));
    }
}

