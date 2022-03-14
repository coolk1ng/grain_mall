package com.codesniper.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.codesniper.entity.UmsMemberStatisticsInfo;
import com.codesniper.service.UmsMemberStatisticsInfoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 会员统计信息(UmsMemberStatisticsInfo)表控制层
 *
 * @author CodeSniper
 * @since 2022-03-14 16:55:15
 */
@RestController
@RequestMapping("umsMemberStatisticsInfo")
public class UmsMemberStatisticsInfoController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private UmsMemberStatisticsInfoService umsMemberStatisticsInfoService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param umsMemberStatisticsInfo 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<UmsMemberStatisticsInfo> page, UmsMemberStatisticsInfo umsMemberStatisticsInfo) {
        return success(this.umsMemberStatisticsInfoService.page(page, new QueryWrapper<>(umsMemberStatisticsInfo)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.umsMemberStatisticsInfoService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param umsMemberStatisticsInfo 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody UmsMemberStatisticsInfo umsMemberStatisticsInfo) {
        return success(this.umsMemberStatisticsInfoService.save(umsMemberStatisticsInfo));
    }

    /**
     * 修改数据
     *
     * @param umsMemberStatisticsInfo 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody UmsMemberStatisticsInfo umsMemberStatisticsInfo) {
        return success(this.umsMemberStatisticsInfoService.updateById(umsMemberStatisticsInfo));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.umsMemberStatisticsInfoService.removeByIds(idList));
    }
}

