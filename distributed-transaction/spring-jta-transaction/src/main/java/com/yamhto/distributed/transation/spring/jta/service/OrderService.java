package com.yamhto.distributed.transation.spring.jta.service;

import com.yamhto.distributed.transation.spring.jta.entity.secondary.Order;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author yamhto
 * @since 2020-05-28
 */
public interface OrderService extends IService<Order> {

    public Order saveOne(Order o);
}
