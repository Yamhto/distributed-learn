package com.yamhto.distributed.transation.spring.jpa.service;

import com.yamhto.distributed.transation.spring.jpa.entity.Order;

import java.util.List;

/**
 * @author yamhto
 * @className: OrderService.java
 * @package com.yamhto.distributed.transation.spring.jpa.service
 * @description:
 * @date 2020/5/28 10:52
 */
public interface OrderService {

    //查询所有
    List<Order> findAll();

    //保存或更新
    void save(Order order);

    //根据主键 tvId 删除
    void deleteById(Long id);
}
