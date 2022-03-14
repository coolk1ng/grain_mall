package com.codesniper.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codesniper.dao.WmsWareInfoDao;
import com.codesniper.entity.WmsWareInfo;
import com.codesniper.service.WmsWareInfoService;
import org.springframework.stereotype.Service;

/**
 * 仓库信息(WmsWareInfo)表服务实现类
 *
 * @author CodeSniper
 * @since 2022-03-14 16:45:49
 */
@Service("wmsWareInfoService")
public class WmsWareInfoServiceImpl extends ServiceImpl<WmsWareInfoDao, WmsWareInfo> implements WmsWareInfoService {

}

