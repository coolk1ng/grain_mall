package com.codesniper.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codesniper.dao.WmsWareSkuDao;
import com.codesniper.entity.WmsWareSku;
import com.codesniper.service.WmsWareSkuService;
import org.springframework.stereotype.Service;

/**
 * 商品库存(WmsWareSku)表服务实现类
 *
 * @author CodeSniper
 * @since 2022-03-14 16:45:49
 */
@Service("wmsWareSkuService")
public class WmsWareSkuServiceImpl extends ServiceImpl<WmsWareSkuDao, WmsWareSku> implements WmsWareSkuService {

}

