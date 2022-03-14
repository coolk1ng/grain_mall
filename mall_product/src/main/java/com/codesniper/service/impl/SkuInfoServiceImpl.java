package com.codesniper.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codesniper.dao.SkuInfoDao;
import com.codesniper.entity.SkuInfo;
import com.codesniper.service.SkuInfoService;
import org.springframework.stereotype.Service;

/**
 * sku信息(SkuInfo)表服务实现类
 *
 * @author CodeSniper
 * @since 2022-03-14 16:39:40
 */
@Service("skuInfoService")
public class SkuInfoServiceImpl extends ServiceImpl<SkuInfoDao, SkuInfo> implements SkuInfoService {

}

