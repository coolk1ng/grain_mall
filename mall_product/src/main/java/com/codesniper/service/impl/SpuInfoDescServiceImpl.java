package com.codesniper.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codesniper.dao.SpuInfoDescDao;
import com.codesniper.entity.SpuInfoDesc;
import com.codesniper.service.SpuInfoDescService;
import org.springframework.stereotype.Service;

/**
 * spu信息介绍(SpuInfoDesc)表服务实现类
 *
 * @author CodeSniper
 * @since 2022-03-14 16:39:40
 */
@Service("spuInfoDescService")
public class SpuInfoDescServiceImpl extends ServiceImpl<SpuInfoDescDao, SpuInfoDesc> implements SpuInfoDescService {

}

