package com.codesniper.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codesniper.dao.WmsPurchaseDao;
import com.codesniper.entity.WmsPurchase;
import com.codesniper.service.WmsPurchaseService;
import org.springframework.stereotype.Service;

/**
 * 采购信息(WmsPurchase)表服务实现类
 *
 * @author CodeSniper
 * @since 2022-03-14 16:45:49
 */
@Service("wmsPurchaseService")
public class WmsPurchaseServiceImpl extends ServiceImpl<WmsPurchaseDao, WmsPurchase> implements WmsPurchaseService {

}

