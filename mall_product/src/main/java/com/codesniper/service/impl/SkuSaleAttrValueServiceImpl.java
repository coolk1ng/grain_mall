package com.codesniper.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codesniper.dao.SkuSaleAttrValueDao;
import com.codesniper.entity.SkuSaleAttrValue;
import com.codesniper.service.SkuSaleAttrValueService;
import org.springframework.stereotype.Service;

/**
 * sku销售属性&值(SkuSaleAttrValue)表服务实现类
 *
 * @author CodeSniper
 * @since 2022-03-14 16:39:40
 */
@Service("skuSaleAttrValueService")
public class SkuSaleAttrValueServiceImpl extends ServiceImpl<SkuSaleAttrValueDao, SkuSaleAttrValue> implements SkuSaleAttrValueService {

}

