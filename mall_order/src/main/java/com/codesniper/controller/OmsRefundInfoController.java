package com.codesniper.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.codesniper.entity.OmsRefundInfo;
import com.codesniper.service.OmsRefundInfoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 退款信息(OmsRefundInfo)表控制层
 *
 * @author CodeSniper
 * @since 2022-03-14 16:54:44
 */
@RestController
@RequestMapping("omsRefundInfo")
public class OmsRefundInfoController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private OmsRefundInfoService omsRefundInfoService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param omsRefundInfo 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<OmsRefundInfo> page, OmsRefundInfo omsRefundInfo) {
        return success(this.omsRefundInfoService.page(page, new QueryWrapper<>(omsRefundInfo)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.omsRefundInfoService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param omsRefundInfo 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody OmsRefundInfo omsRefundInfo) {
        return success(this.omsRefundInfoService.save(omsRefundInfo));
    }

    /**
     * 修改数据
     *
     * @param omsRefundInfo 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody OmsRefundInfo omsRefundInfo) {
        return success(this.omsRefundInfoService.updateById(omsRefundInfo));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.omsRefundInfoService.removeByIds(idList));
    }
}

