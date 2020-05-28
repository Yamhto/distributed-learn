package com.yamhto.distributed.transation.spring.jta.service;

import com.yamhto.distributed.transation.spring.jta.entity.primary.People;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author yamhto
 * @since 2020-05-28
 */
public interface PeopleService extends IService<People> {

    public People saveOne(People p);

}
