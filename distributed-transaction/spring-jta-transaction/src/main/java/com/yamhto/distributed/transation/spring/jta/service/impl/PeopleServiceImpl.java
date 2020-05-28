package com.yamhto.distributed.transation.spring.jta.service.impl;

import com.yamhto.distributed.transation.spring.jta.entity.primary.People;
import com.yamhto.distributed.transation.spring.jta.mapper.primary.PeopleMapper;
import com.yamhto.distributed.transation.spring.jta.service.PeopleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author yamhto
 * @since 2020-05-28
 */
@Service
public class PeopleServiceImpl extends ServiceImpl<PeopleMapper, People> implements PeopleService {

    @Autowired
    private PeopleMapper peopleMapper;

    @Override
    public People saveOne(People p) {
        peopleMapper.saveOne(p.getUsername(), p.getPassword(), p.getAge(), p.getHigher());
        return p;
    }
}
