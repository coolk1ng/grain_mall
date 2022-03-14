package com.codesniper.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.codesniper.entity.SpuInfo;
import com.codesniper.service.SpuInfoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * spu信息(SpuInfo)表控制层
 *
 * @author CodeSniper
 * @since 2022-03-14 16:39:40
 */
@RestController
@RequestMapping("spuInfo")
public class SpuInfoController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private SpuInfoService spuInfoService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param spuInfo 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<SpuInfo> page, SpuInfo spuInfo) {
        return success(this.spuInfoService.page(page, new QueryWrapper<>(spuInfo)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.spuInfoService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param spuInfo 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody SpuInfo spuInfo) {
        return success(this.spuInfoService.save(spuInfo));
    }

    /**
     * 修改数据
     *
     * @param spuInfo 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody SpuInfo spuInfo) {
        return success(this.spuInfoService.updateById(spuInfo));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.spuInfoService.removeByIds(idList));
    }
}

