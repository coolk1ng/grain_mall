package com.codesniper.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.codesniper.entity.UmsMemberLoginLog;
import com.codesniper.service.UmsMemberLoginLogService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 会员登录记录(UmsMemberLoginLog)表控制层
 *
 * @author CodeSniper
 * @since 2022-03-14 16:55:15
 */
@RestController
@RequestMapping("umsMemberLoginLog")
public class UmsMemberLoginLogController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private UmsMemberLoginLogService umsMemberLoginLogService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param umsMemberLoginLog 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<UmsMemberLoginLog> page, UmsMemberLoginLog umsMemberLoginLog) {
        return success(this.umsMemberLoginLogService.page(page, new QueryWrapper<>(umsMemberLoginLog)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.umsMemberLoginLogService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param umsMemberLoginLog 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody UmsMemberLoginLog umsMemberLoginLog) {
        return success(this.umsMemberLoginLogService.save(umsMemberLoginLog));
    }

    /**
     * 修改数据
     *
     * @param umsMemberLoginLog 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody UmsMemberLoginLog umsMemberLoginLog) {
        return success(this.umsMemberLoginLogService.updateById(umsMemberLoginLog));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.umsMemberLoginLogService.removeByIds(idList));
    }
}

