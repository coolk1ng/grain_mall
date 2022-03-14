package com.codesniper.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.codesniper.entity.WmsWareInfo;
import com.codesniper.service.WmsWareInfoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 仓库信息(WmsWareInfo)表控制层
 *
 * @author CodeSniper
 * @since 2022-03-14 16:45:49
 */
@RestController
@RequestMapping("wmsWareInfo")
public class WmsWareInfoController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private WmsWareInfoService wmsWareInfoService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param wmsWareInfo 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<WmsWareInfo> page, WmsWareInfo wmsWareInfo) {
        return success(this.wmsWareInfoService.page(page, new QueryWrapper<>(wmsWareInfo)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.wmsWareInfoService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param wmsWareInfo 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody WmsWareInfo wmsWareInfo) {
        return success(this.wmsWareInfoService.save(wmsWareInfo));
    }

    /**
     * 修改数据
     *
     * @param wmsWareInfo 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody WmsWareInfo wmsWareInfo) {
        return success(this.wmsWareInfoService.updateById(wmsWareInfo));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.wmsWareInfoService.removeByIds(idList));
    }
}

