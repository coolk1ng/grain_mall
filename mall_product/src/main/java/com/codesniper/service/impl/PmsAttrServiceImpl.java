package com.codesniper.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codesniper.dao.PmsAttrDao;
import com.codesniper.entity.PmsAttr;
import com.codesniper.service.PmsAttrService;
import org.springframework.stereotype.Service;

/**
 * 商品属性(PmsAttr)表服务实现类
 *
 * @author CodeSniper
 * @since 2022-03-14 16:39:40
 */
@Service("pmsAttrService")
public class PmsAttrServiceImpl extends ServiceImpl<PmsAttrDao, PmsAttr> implements PmsAttrService {

}

