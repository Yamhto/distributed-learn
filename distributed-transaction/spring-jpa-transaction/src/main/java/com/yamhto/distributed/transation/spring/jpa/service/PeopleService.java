package com.yamhto.distributed.transation.spring.jpa.service;

import com.yamhto.distributed.transation.spring.jpa.entity.People;

import java.util.List;

/**
 * @author yamhto
 * @className: PeopleService.java
 * @package com.yamhto.distributed.transation.spring.jpa.service
 * @description:
 * @date 2020/5/28 10:52
 */
public interface PeopleService {

    //查询所有
    List<People> findAll();

    People queryForOne(Long id);

    //保存或更新
    void save(People people);

    //根据主键 tvId 删除
    void deleteById(Long id);

}
