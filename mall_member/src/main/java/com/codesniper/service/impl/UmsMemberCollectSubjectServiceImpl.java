package com.codesniper.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codesniper.dao.UmsMemberCollectSubjectDao;
import com.codesniper.entity.UmsMemberCollectSubject;
import com.codesniper.service.UmsMemberCollectSubjectService;
import org.springframework.stereotype.Service;

/**
 * 会员收藏的专题活动(UmsMemberCollectSubject)表服务实现类
 *
 * @author CodeSniper
 * @since 2022-03-14 16:55:15
 */
@Service("umsMemberCollectSubjectService")
public class UmsMemberCollectSubjectServiceImpl extends ServiceImpl<UmsMemberCollectSubjectDao, UmsMemberCollectSubject> implements UmsMemberCollectSubjectService {

}

