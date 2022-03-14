package com.codesniper.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codesniper.dao.WmsWareOrderTaskDao;
import com.codesniper.entity.WmsWareOrderTask;
import com.codesniper.service.WmsWareOrderTaskService;
import org.springframework.stereotype.Service;

/**
 * 库存工作单(WmsWareOrderTask)表服务实现类
 *
 * @author CodeSniper
 * @since 2022-03-14 16:45:49
 */
@Service("wmsWareOrderTaskService")
public class WmsWareOrderTaskServiceImpl extends ServiceImpl<WmsWareOrderTaskDao, WmsWareOrderTask> implements WmsWareOrderTaskService {

}

