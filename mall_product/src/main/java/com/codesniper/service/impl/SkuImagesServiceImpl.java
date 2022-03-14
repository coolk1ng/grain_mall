package com.codesniper.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codesniper.dao.SkuImagesDao;
import com.codesniper.entity.SkuImages;
import com.codesniper.service.SkuImagesService;
import org.springframework.stereotype.Service;

/**
 * sku图片(SkuImages)表服务实现类
 *
 * @author CodeSniper
 * @since 2022-03-14 16:39:40
 */
@Service("skuImagesService")
public class SkuImagesServiceImpl extends ServiceImpl<SkuImagesDao, SkuImages> implements SkuImagesService {

}

