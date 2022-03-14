package com.codesniper.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codesniper.dao.ProductAttrValueDao;
import com.codesniper.entity.ProductAttrValue;
import com.codesniper.service.ProductAttrValueService;
import org.springframework.stereotype.Service;

/**
 * spu属性值(ProductAttrValue)表服务实现类
 *
 * @author CodeSniper
 * @since 2022-03-14 16:39:40
 */
@Service("productAttrValueService")
public class ProductAttrValueServiceImpl extends ServiceImpl<ProductAttrValueDao, ProductAttrValue> implements ProductAttrValueService {

}

