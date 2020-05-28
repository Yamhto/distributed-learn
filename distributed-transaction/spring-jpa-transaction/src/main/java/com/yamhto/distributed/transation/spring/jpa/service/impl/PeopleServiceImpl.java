package com.yamhto.distributed.transation.spring.jpa.service.impl;

import com.yamhto.distributed.transation.spring.jpa.entity.Order;
import com.yamhto.distributed.transation.spring.jpa.entity.People;
import com.yamhto.distributed.transation.spring.jpa.repository.OrderRepository;
import com.yamhto.distributed.transation.spring.jpa.repository.PeopleRepository;
import com.yamhto.distributed.transation.spring.jpa.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yamhto
 * @className: PeopleServiceImpl.java
 * @package com.yamhto.distributed.transation.spring.jpa.service.impl
 * @description:
 * @date 2020/5/28 10:54
 */
@Service
public class PeopleServiceImpl implements PeopleService {

    @Autowired
    private PeopleRepository peopleRepository;

    @Override
    public List<People> findAll() {
        return peopleRepository.findAll();
    }

    @Override
    public People queryForOne(Long id) {
        return peopleRepository.getOne(id);
    }

    @Override
    public void save(People people) {
        peopleRepository.save(people);
    }

    @Override
    public void deleteById(Long id) {
        peopleRepository.deleteById(id);
    }

}
