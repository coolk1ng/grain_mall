package com.codesniper.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.codesniper.entity.UmsMemberLevel;
import com.codesniper.service.UmsMemberLevelService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 会员等级(UmsMemberLevel)表控制层
 *
 * @author CodeSniper
 * @since 2022-03-14 16:55:15
 */
@RestController
@RequestMapping("umsMemberLevel")
public class UmsMemberLevelController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private UmsMemberLevelService umsMemberLevelService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param umsMemberLevel 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<UmsMemberLevel> page, UmsMemberLevel umsMemberLevel) {
        return success(this.umsMemberLevelService.page(page, new QueryWrapper<>(umsMemberLevel)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.umsMemberLevelService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param umsMemberLevel 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody UmsMemberLevel umsMemberLevel) {
        return success(this.umsMemberLevelService.save(umsMemberLevel));
    }

    /**
     * 修改数据
     *
     * @param umsMemberLevel 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody UmsMemberLevel umsMemberLevel) {
        return success(this.umsMemberLevelService.updateById(umsMemberLevel));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.umsMemberLevelService.removeByIds(idList));
    }
}

