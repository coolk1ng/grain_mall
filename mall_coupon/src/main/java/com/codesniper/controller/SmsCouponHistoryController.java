package com.codesniper.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.codesniper.entity.SmsCouponHistory;
import com.codesniper.service.SmsCouponHistoryService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 优惠券领取历史记录(SmsCouponHistory)表控制层
 *
 * @author CodeSniper
 * @since 2022-03-14 16:55:46
 */
@RestController
@RequestMapping("smsCouponHistory")
public class SmsCouponHistoryController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private SmsCouponHistoryService smsCouponHistoryService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param smsCouponHistory 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<SmsCouponHistory> page, SmsCouponHistory smsCouponHistory) {
        return success(this.smsCouponHistoryService.page(page, new QueryWrapper<>(smsCouponHistory)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.smsCouponHistoryService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param smsCouponHistory 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody SmsCouponHistory smsCouponHistory) {
        return success(this.smsCouponHistoryService.save(smsCouponHistory));
    }

    /**
     * 修改数据
     *
     * @param smsCouponHistory 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody SmsCouponHistory smsCouponHistory) {
        return success(this.smsCouponHistoryService.updateById(smsCouponHistory));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.smsCouponHistoryService.removeByIds(idList));
    }
}

