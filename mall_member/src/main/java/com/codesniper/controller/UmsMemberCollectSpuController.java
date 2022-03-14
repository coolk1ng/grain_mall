package com.codesniper.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.codesniper.entity.UmsMemberCollectSpu;
import com.codesniper.service.UmsMemberCollectSpuService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 会员收藏的商品(UmsMemberCollectSpu)表控制层
 *
 * @author CodeSniper
 * @since 2022-03-14 16:55:15
 */
@RestController
@RequestMapping("umsMemberCollectSpu")
public class UmsMemberCollectSpuController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private UmsMemberCollectSpuService umsMemberCollectSpuService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param umsMemberCollectSpu 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<UmsMemberCollectSpu> page, UmsMemberCollectSpu umsMemberCollectSpu) {
        return success(this.umsMemberCollectSpuService.page(page, new QueryWrapper<>(umsMemberCollectSpu)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.umsMemberCollectSpuService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param umsMemberCollectSpu 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody UmsMemberCollectSpu umsMemberCollectSpu) {
        return success(this.umsMemberCollectSpuService.save(umsMemberCollectSpu));
    }

    /**
     * 修改数据
     *
     * @param umsMemberCollectSpu 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody UmsMemberCollectSpu umsMemberCollectSpu) {
        return success(this.umsMemberCollectSpuService.updateById(umsMemberCollectSpu));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.umsMemberCollectSpuService.removeByIds(idList));
    }
}

