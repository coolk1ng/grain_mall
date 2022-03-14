package com.codesniper.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codesniper.dao.SpuInfoDao;
import com.codesniper.entity.SpuInfo;
import com.codesniper.service.SpuInfoService;
import org.springframework.stereotype.Service;

/**
 * spu信息(SpuInfo)表服务实现类
 *
 * @author CodeSniper
 * @since 2022-03-14 16:39:40
 */
@Service("spuInfoService")
public class SpuInfoServiceImpl extends ServiceImpl<SpuInfoDao, SpuInfo> implements SpuInfoService {

}

