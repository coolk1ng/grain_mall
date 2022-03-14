package com.codesniper.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codesniper.dao.UmsMemberReceiveAddressDao;
import com.codesniper.entity.UmsMemberReceiveAddress;
import com.codesniper.service.UmsMemberReceiveAddressService;
import org.springframework.stereotype.Service;

/**
 * 会员收货地址(UmsMemberReceiveAddress)表服务实现类
 *
 * @author CodeSniper
 * @since 2022-03-14 16:55:15
 */
@Service("umsMemberReceiveAddressService")
public class UmsMemberReceiveAddressServiceImpl extends ServiceImpl<UmsMemberReceiveAddressDao, UmsMemberReceiveAddress> implements UmsMemberReceiveAddressService {

}

