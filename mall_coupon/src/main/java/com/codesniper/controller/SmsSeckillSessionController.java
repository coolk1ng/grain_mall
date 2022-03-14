package com.codesniper.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.codesniper.entity.SmsSeckillSession;
import com.codesniper.service.SmsSeckillSessionService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 秒杀活动场次(SmsSeckillSession)表控制层
 *
 * @author CodeSniper
 * @since 2022-03-14 16:55:46
 */
@RestController
@RequestMapping("smsSeckillSession")
public class SmsSeckillSessionController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private SmsSeckillSessionService smsSeckillSessionService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param smsSeckillSession 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<SmsSeckillSession> page, SmsSeckillSession smsSeckillSession) {
        return success(this.smsSeckillSessionService.page(page, new QueryWrapper<>(smsSeckillSession)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.smsSeckillSessionService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param smsSeckillSession 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody SmsSeckillSession smsSeckillSession) {
        return success(this.smsSeckillSessionService.save(smsSeckillSession));
    }

    /**
     * 修改数据
     *
     * @param smsSeckillSession 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody SmsSeckillSession smsSeckillSession) {
        return success(this.smsSeckillSessionService.updateById(smsSeckillSession));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.smsSeckillSessionService.removeByIds(idList));
    }
}

