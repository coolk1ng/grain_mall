package com.codesniper.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.codesniper.entity.SmsCouponSpuRelation;
import com.codesniper.service.SmsCouponSpuRelationService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 优惠券与产品关联(SmsCouponSpuRelation)表控制层
 *
 * @author CodeSniper
 * @since 2022-03-14 16:55:46
 */
@RestController
@RequestMapping("smsCouponSpuRelation")
public class SmsCouponSpuRelationController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private SmsCouponSpuRelationService smsCouponSpuRelationService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param smsCouponSpuRelation 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<SmsCouponSpuRelation> page, SmsCouponSpuRelation smsCouponSpuRelation) {
        return success(this.smsCouponSpuRelationService.page(page, new QueryWrapper<>(smsCouponSpuRelation)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.smsCouponSpuRelationService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param smsCouponSpuRelation 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody SmsCouponSpuRelation smsCouponSpuRelation) {
        return success(this.smsCouponSpuRelationService.save(smsCouponSpuRelation));
    }

    /**
     * 修改数据
     *
     * @param smsCouponSpuRelation 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody SmsCouponSpuRelation smsCouponSpuRelation) {
        return success(this.smsCouponSpuRelationService.updateById(smsCouponSpuRelation));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.smsCouponSpuRelationService.removeByIds(idList));
    }
}

