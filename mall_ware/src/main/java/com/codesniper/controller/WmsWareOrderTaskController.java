package com.codesniper.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.codesniper.entity.WmsWareOrderTask;
import com.codesniper.service.WmsWareOrderTaskService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 库存工作单(WmsWareOrderTask)表控制层
 *
 * @author CodeSniper
 * @since 2022-03-14 16:45:49
 */
@RestController
@RequestMapping("wmsWareOrderTask")
public class WmsWareOrderTaskController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private WmsWareOrderTaskService wmsWareOrderTaskService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param wmsWareOrderTask 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<WmsWareOrderTask> page, WmsWareOrderTask wmsWareOrderTask) {
        return success(this.wmsWareOrderTaskService.page(page, new QueryWrapper<>(wmsWareOrderTask)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.wmsWareOrderTaskService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param wmsWareOrderTask 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody WmsWareOrderTask wmsWareOrderTask) {
        return success(this.wmsWareOrderTaskService.save(wmsWareOrderTask));
    }

    /**
     * 修改数据
     *
     * @param wmsWareOrderTask 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody WmsWareOrderTask wmsWareOrderTask) {
        return success(this.wmsWareOrderTaskService.updateById(wmsWareOrderTask));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.wmsWareOrderTaskService.removeByIds(idList));
    }
}

