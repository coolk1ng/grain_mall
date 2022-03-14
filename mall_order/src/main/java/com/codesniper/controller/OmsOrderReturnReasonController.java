package com.codesniper.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.codesniper.entity.OmsOrderReturnReason;
import com.codesniper.service.OmsOrderReturnReasonService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 退货原因(OmsOrderReturnReason)表控制层
 *
 * @author CodeSniper
 * @since 2022-03-14 16:54:44
 */
@RestController
@RequestMapping("omsOrderReturnReason")
public class OmsOrderReturnReasonController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private OmsOrderReturnReasonService omsOrderReturnReasonService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param omsOrderReturnReason 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<OmsOrderReturnReason> page, OmsOrderReturnReason omsOrderReturnReason) {
        return success(this.omsOrderReturnReasonService.page(page, new QueryWrapper<>(omsOrderReturnReason)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.omsOrderReturnReasonService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param omsOrderReturnReason 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody OmsOrderReturnReason omsOrderReturnReason) {
        return success(this.omsOrderReturnReasonService.save(omsOrderReturnReason));
    }

    /**
     * 修改数据
     *
     * @param omsOrderReturnReason 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody OmsOrderReturnReason omsOrderReturnReason) {
        return success(this.omsOrderReturnReasonService.updateById(omsOrderReturnReason));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.omsOrderReturnReasonService.removeByIds(idList));
    }
}

