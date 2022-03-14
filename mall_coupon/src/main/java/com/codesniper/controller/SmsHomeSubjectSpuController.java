package com.codesniper.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.codesniper.entity.SmsHomeSubjectSpu;
import com.codesniper.service.SmsHomeSubjectSpuService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 专题商品(SmsHomeSubjectSpu)表控制层
 *
 * @author CodeSniper
 * @since 2022-03-14 16:55:46
 */
@RestController
@RequestMapping("smsHomeSubjectSpu")
public class SmsHomeSubjectSpuController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private SmsHomeSubjectSpuService smsHomeSubjectSpuService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param smsHomeSubjectSpu 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<SmsHomeSubjectSpu> page, SmsHomeSubjectSpu smsHomeSubjectSpu) {
        return success(this.smsHomeSubjectSpuService.page(page, new QueryWrapper<>(smsHomeSubjectSpu)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.smsHomeSubjectSpuService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param smsHomeSubjectSpu 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody SmsHomeSubjectSpu smsHomeSubjectSpu) {
        return success(this.smsHomeSubjectSpuService.save(smsHomeSubjectSpu));
    }

    /**
     * 修改数据
     *
     * @param smsHomeSubjectSpu 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody SmsHomeSubjectSpu smsHomeSubjectSpu) {
        return success(this.smsHomeSubjectSpuService.updateById(smsHomeSubjectSpu));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.smsHomeSubjectSpuService.removeByIds(idList));
    }
}

