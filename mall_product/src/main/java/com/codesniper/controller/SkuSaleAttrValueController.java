package com.codesniper.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.codesniper.entity.SkuSaleAttrValue;
import com.codesniper.service.SkuSaleAttrValueService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * sku销售属性&值(SkuSaleAttrValue)表控制层
 *
 * @author CodeSniper
 * @since 2022-03-14 16:39:40
 */
@RestController
@RequestMapping("skuSaleAttrValue")
public class SkuSaleAttrValueController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private SkuSaleAttrValueService skuSaleAttrValueService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param skuSaleAttrValue 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<SkuSaleAttrValue> page, SkuSaleAttrValue skuSaleAttrValue) {
        return success(this.skuSaleAttrValueService.page(page, new QueryWrapper<>(skuSaleAttrValue)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.skuSaleAttrValueService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param skuSaleAttrValue 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody SkuSaleAttrValue skuSaleAttrValue) {
        return success(this.skuSaleAttrValueService.save(skuSaleAttrValue));
    }

    /**
     * 修改数据
     *
     * @param skuSaleAttrValue 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody SkuSaleAttrValue skuSaleAttrValue) {
        return success(this.skuSaleAttrValueService.updateById(skuSaleAttrValue));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.skuSaleAttrValueService.removeByIds(idList));
    }
}

