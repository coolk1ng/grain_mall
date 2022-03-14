package com.codesniper.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codesniper.dao.WmsPurchaseDetailDao;
import com.codesniper.entity.WmsPurchaseDetail;
import com.codesniper.service.WmsPurchaseDetailService;
import org.springframework.stereotype.Service;

/**
 * (WmsPurchaseDetail)表服务实现类
 *
 * @author CodeSniper
 * @since 2022-03-14 16:45:49
 */
@Service("wmsPurchaseDetailService")
public class WmsPurchaseDetailServiceImpl extends ServiceImpl<WmsPurchaseDetailDao, WmsPurchaseDetail> implements WmsPurchaseDetailService {

}

