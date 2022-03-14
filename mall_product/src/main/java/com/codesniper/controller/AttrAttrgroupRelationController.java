package com.codesniper.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.codesniper.entity.AttrAttrgroupRelation;
import com.codesniper.service.AttrAttrgroupRelationService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 属性&属性分组关联(AttrAttrgroupRelation)表控制层
 *
 * @author CodeSniper
 * @since 2022-03-14 16:39:40
 */
@RestController
@RequestMapping("attrAttrgroupRelation")
public class AttrAttrgroupRelationController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private AttrAttrgroupRelationService attrAttrgroupRelationService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param attrAttrgroupRelation 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<AttrAttrgroupRelation> page, AttrAttrgroupRelation attrAttrgroupRelation) {
        return success(this.attrAttrgroupRelationService.page(page, new QueryWrapper<>(attrAttrgroupRelation)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.attrAttrgroupRelationService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param attrAttrgroupRelation 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody AttrAttrgroupRelation attrAttrgroupRelation) {
        return success(this.attrAttrgroupRelationService.save(attrAttrgroupRelation));
    }

    /**
     * 修改数据
     *
     * @param attrAttrgroupRelation 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody AttrAttrgroupRelation attrAttrgroupRelation) {
        return success(this.attrAttrgroupRelationService.updateById(attrAttrgroupRelation));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.attrAttrgroupRelationService.removeByIds(idList));
    }
}

