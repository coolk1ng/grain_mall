package com.codesniper.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.codesniper.entity.UmsMemberCollectSubject;
import com.codesniper.service.UmsMemberCollectSubjectService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 会员收藏的专题活动(UmsMemberCollectSubject)表控制层
 *
 * @author CodeSniper
 * @since 2022-03-14 16:55:15
 */
@RestController
@RequestMapping("umsMemberCollectSubject")
public class UmsMemberCollectSubjectController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private UmsMemberCollectSubjectService umsMemberCollectSubjectService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param umsMemberCollectSubject 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<UmsMemberCollectSubject> page, UmsMemberCollectSubject umsMemberCollectSubject) {
        return success(this.umsMemberCollectSubjectService.page(page, new QueryWrapper<>(umsMemberCollectSubject)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.umsMemberCollectSubjectService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param umsMemberCollectSubject 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody UmsMemberCollectSubject umsMemberCollectSubject) {
        return success(this.umsMemberCollectSubjectService.save(umsMemberCollectSubject));
    }

    /**
     * 修改数据
     *
     * @param umsMemberCollectSubject 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody UmsMemberCollectSubject umsMemberCollectSubject) {
        return success(this.umsMemberCollectSubjectService.updateById(umsMemberCollectSubject));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.umsMemberCollectSubjectService.removeByIds(idList));
    }
}

