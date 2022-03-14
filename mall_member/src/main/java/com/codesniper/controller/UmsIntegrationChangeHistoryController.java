package com.codesniper.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.codesniper.entity.UmsIntegrationChangeHistory;
import com.codesniper.service.UmsIntegrationChangeHistoryService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 积分变化历史记录(UmsIntegrationChangeHistory)表控制层
 *
 * @author CodeSniper
 * @since 2022-03-14 16:55:15
 */
@RestController
@RequestMapping("umsIntegrationChangeHistory")
public class UmsIntegrationChangeHistoryController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private UmsIntegrationChangeHistoryService umsIntegrationChangeHistoryService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param umsIntegrationChangeHistory 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<UmsIntegrationChangeHistory> page, UmsIntegrationChangeHistory umsIntegrationChangeHistory) {
        return success(this.umsIntegrationChangeHistoryService.page(page, new QueryWrapper<>(umsIntegrationChangeHistory)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.umsIntegrationChangeHistoryService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param umsIntegrationChangeHistory 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody UmsIntegrationChangeHistory umsIntegrationChangeHistory) {
        return success(this.umsIntegrationChangeHistoryService.save(umsIntegrationChangeHistory));
    }

    /**
     * 修改数据
     *
     * @param umsIntegrationChangeHistory 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody UmsIntegrationChangeHistory umsIntegrationChangeHistory) {
        return success(this.umsIntegrationChangeHistoryService.updateById(umsIntegrationChangeHistory));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.umsIntegrationChangeHistoryService.removeByIds(idList));
    }
}

