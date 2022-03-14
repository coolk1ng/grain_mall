package com.codesniper.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codesniper.dao.BrandDao;
import com.codesniper.entity.Brand;
import com.codesniper.service.BrandService;
import org.springframework.stereotype.Service;

/**
 * 品牌(Brand)表服务实现类
 *
 * @author CodeSniper
 * @since 2022-03-14 16:39:40
 */
@Service("brandService")
public class BrandServiceImpl extends ServiceImpl<BrandDao, Brand> implements BrandService {

}

