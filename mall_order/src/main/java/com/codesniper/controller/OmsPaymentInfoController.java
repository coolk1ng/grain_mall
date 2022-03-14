package com.codesniper.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.codesniper.entity.OmsPaymentInfo;
import com.codesniper.service.OmsPaymentInfoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 支付信息表(OmsPaymentInfo)表控制层
 *
 * @author CodeSniper
 * @since 2022-03-14 16:54:44
 */
@RestController
@RequestMapping("omsPaymentInfo")
public class OmsPaymentInfoController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private OmsPaymentInfoService omsPaymentInfoService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param omsPaymentInfo 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<OmsPaymentInfo> page, OmsPaymentInfo omsPaymentInfo) {
        return success(this.omsPaymentInfoService.page(page, new QueryWrapper<>(omsPaymentInfo)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.omsPaymentInfoService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param omsPaymentInfo 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody OmsPaymentInfo omsPaymentInfo) {
        return success(this.omsPaymentInfoService.save(omsPaymentInfo));
    }

    /**
     * 修改数据
     *
     * @param omsPaymentInfo 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody OmsPaymentInfo omsPaymentInfo) {
        return success(this.omsPaymentInfoService.updateById(omsPaymentInfo));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.omsPaymentInfoService.removeByIds(idList));
    }
}

