package com.codesniper.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codesniper.dao.WmsWareOrderTaskDetailDao;
import com.codesniper.entity.WmsWareOrderTaskDetail;
import com.codesniper.service.WmsWareOrderTaskDetailService;
import org.springframework.stereotype.Service;

/**
 * 库存工作单(WmsWareOrderTaskDetail)表服务实现类
 *
 * @author CodeSniper
 * @since 2022-03-14 16:45:49
 */
@Service("wmsWareOrderTaskDetailService")
public class WmsWareOrderTaskDetailServiceImpl extends ServiceImpl<WmsWareOrderTaskDetailDao, WmsWareOrderTaskDetail> implements WmsWareOrderTaskDetailService {

}

