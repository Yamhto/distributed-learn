package com.yamhto.distributed.transation.spring.jpa.service.impl;

import com.yamhto.distributed.transation.spring.jpa.entity.Order;
import com.yamhto.distributed.transation.spring.jpa.repository.OrderRepository;
import com.yamhto.distributed.transation.spring.jpa.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yamhto
 * @className: OrderServiceImpl.java
 * @package com.yamhto.distributed.transation.spring.jpa.service.impl
 * @description:
 * @date 2020/5/28 10:54
 */
@Service
public class OrderServiceImpl implements OrderService  {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    @Override
    public void save(Order order) {
         orderRepository.save(order);
    }

    @Override
    public void deleteById(Long id) {
        orderRepository.deleteById(id);
    }
}
