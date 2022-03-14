package com.codesniper.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.codesniper.entity.WmsPurchaseDetail;
import com.codesniper.service.WmsPurchaseDetailService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (WmsPurchaseDetail)表控制层
 *
 * @author CodeSniper
 * @since 2022-03-14 16:45:49
 */
@RestController
@RequestMapping("wmsPurchaseDetail")
public class WmsPurchaseDetailController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private WmsPurchaseDetailService wmsPurchaseDetailService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param wmsPurchaseDetail 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<WmsPurchaseDetail> page, WmsPurchaseDetail wmsPurchaseDetail) {
        return success(this.wmsPurchaseDetailService.page(page, new QueryWrapper<>(wmsPurchaseDetail)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.wmsPurchaseDetailService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param wmsPurchaseDetail 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody WmsPurchaseDetail wmsPurchaseDetail) {
        return success(this.wmsPurchaseDetailService.save(wmsPurchaseDetail));
    }

    /**
     * 修改数据
     *
     * @param wmsPurchaseDetail 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody WmsPurchaseDetail wmsPurchaseDetail) {
        return success(this.wmsPurchaseDetailService.updateById(wmsPurchaseDetail));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.wmsPurchaseDetailService.removeByIds(idList));
    }
}

