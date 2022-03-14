package com.codesniper.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codesniper.dao.SpuImagesDao;
import com.codesniper.entity.SpuImages;
import com.codesniper.service.SpuImagesService;
import org.springframework.stereotype.Service;

/**
 * spu图片(SpuImages)表服务实现类
 *
 * @author CodeSniper
 * @since 2022-03-14 16:39:40
 */
@Service("spuImagesService")
public class SpuImagesServiceImpl extends ServiceImpl<SpuImagesDao, SpuImages> implements SpuImagesService {

}

