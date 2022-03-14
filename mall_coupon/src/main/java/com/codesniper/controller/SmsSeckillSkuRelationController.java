package com.codesniper.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.codesniper.entity.SmsSeckillSkuRelation;
import com.codesniper.service.SmsSeckillSkuRelationService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 秒杀活动商品关联(SmsSeckillSkuRelation)表控制层
 *
 * @author CodeSniper
 * @since 2022-03-14 16:55:46
 */
@RestController
@RequestMapping("smsSeckillSkuRelation")
public class SmsSeckillSkuRelationController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private SmsSeckillSkuRelationService smsSeckillSkuRelationService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param smsSeckillSkuRelation 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<SmsSeckillSkuRelation> page, SmsSeckillSkuRelation smsSeckillSkuRelation) {
        return success(this.smsSeckillSkuRelationService.page(page, new QueryWrapper<>(smsSeckillSkuRelation)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.smsSeckillSkuRelationService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param smsSeckillSkuRelation 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody SmsSeckillSkuRelation smsSeckillSkuRelation) {
        return success(this.smsSeckillSkuRelationService.save(smsSeckillSkuRelation));
    }

    /**
     * 修改数据
     *
     * @param smsSeckillSkuRelation 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody SmsSeckillSkuRelation smsSeckillSkuRelation) {
        return success(this.smsSeckillSkuRelationService.updateById(smsSeckillSkuRelation));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.smsSeckillSkuRelationService.removeByIds(idList));
    }
}

