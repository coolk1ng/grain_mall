package com.codesniper.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.codesniper.entity.SpuImages;
import com.codesniper.service.SpuImagesService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * spu图片(SpuImages)表控制层
 *
 * @author CodeSniper
 * @since 2022-03-14 16:39:40
 */
@RestController
@RequestMapping("spuImages")
public class SpuImagesController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private SpuImagesService spuImagesService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param spuImages 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<SpuImages> page, SpuImages spuImages) {
        return success(this.spuImagesService.page(page, new QueryWrapper<>(spuImages)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.spuImagesService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param spuImages 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody SpuImages spuImages) {
        return success(this.spuImagesService.save(spuImages));
    }

    /**
     * 修改数据
     *
     * @param spuImages 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody SpuImages spuImages) {
        return success(this.spuImagesService.updateById(spuImages));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.spuImagesService.removeByIds(idList));
    }
}

