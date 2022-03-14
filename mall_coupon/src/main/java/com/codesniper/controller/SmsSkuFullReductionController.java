package com.codesniper.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.codesniper.entity.SmsSkuFullReduction;
import com.codesniper.service.SmsSkuFullReductionService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 商品满减信息(SmsSkuFullReduction)表控制层
 *
 * @author CodeSniper
 * @since 2022-03-14 16:55:46
 */
@RestController
@RequestMapping("smsSkuFullReduction")
public class SmsSkuFullReductionController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private SmsSkuFullReductionService smsSkuFullReductionService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param smsSkuFullReduction 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<SmsSkuFullReduction> page, SmsSkuFullReduction smsSkuFullReduction) {
        return success(this.smsSkuFullReductionService.page(page, new QueryWrapper<>(smsSkuFullReduction)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.smsSkuFullReductionService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param smsSkuFullReduction 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody SmsSkuFullReduction smsSkuFullReduction) {
        return success(this.smsSkuFullReductionService.save(smsSkuFullReduction));
    }

    /**
     * 修改数据
     *
     * @param smsSkuFullReduction 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody SmsSkuFullReduction smsSkuFullReduction) {
        return success(this.smsSkuFullReductionService.updateById(smsSkuFullReduction));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.smsSkuFullReductionService.removeByIds(idList));
    }
}

