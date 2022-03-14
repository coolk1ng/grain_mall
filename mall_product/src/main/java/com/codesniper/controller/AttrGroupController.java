package com.codesniper.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.codesniper.entity.AttrGroup;
import com.codesniper.service.AttrGroupService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 属性分组(AttrGroup)表控制层
 *
 * @author CodeSniper
 * @since 2022-03-14 16:39:40
 */
@RestController
@RequestMapping("attrGroup")
public class AttrGroupController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private AttrGroupService attrGroupService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param attrGroup 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<AttrGroup> page, AttrGroup attrGroup) {
        return success(this.attrGroupService.page(page, new QueryWrapper<>(attrGroup)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.attrGroupService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param attrGroup 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody AttrGroup attrGroup) {
        return success(this.attrGroupService.save(attrGroup));
    }

    /**
     * 修改数据
     *
     * @param attrGroup 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody AttrGroup attrGroup) {
        return success(this.attrGroupService.updateById(attrGroup));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.attrGroupService.removeByIds(idList));
    }
}

