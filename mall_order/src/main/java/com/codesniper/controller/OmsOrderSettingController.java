package com.codesniper.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.codesniper.entity.OmsOrderSetting;
import com.codesniper.service.OmsOrderSettingService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 订单配置信息(OmsOrderSetting)表控制层
 *
 * @author CodeSniper
 * @since 2022-03-14 16:54:44
 */
@RestController
@RequestMapping("omsOrderSetting")
public class OmsOrderSettingController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private OmsOrderSettingService omsOrderSettingService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param omsOrderSetting 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<OmsOrderSetting> page, OmsOrderSetting omsOrderSetting) {
        return success(this.omsOrderSettingService.page(page, new QueryWrapper<>(omsOrderSetting)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.omsOrderSettingService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param omsOrderSetting 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody OmsOrderSetting omsOrderSetting) {
        return success(this.omsOrderSettingService.save(omsOrderSetting));
    }

    /**
     * 修改数据
     *
     * @param omsOrderSetting 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody OmsOrderSetting omsOrderSetting) {
        return success(this.omsOrderSettingService.updateById(omsOrderSetting));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.omsOrderSettingService.removeByIds(idList));
    }
}

