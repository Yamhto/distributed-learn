package com.yamhto.distributed.transation.spring.jta.service.impl;

import com.yamhto.distributed.transation.spring.jta.entity.secondary.Order;
import com.yamhto.distributed.transation.spring.jta.mapper.secondary.OrderMapper;
import com.yamhto.distributed.transation.spring.jta.service.OrderService;
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
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public Order saveOne(Order o) {
        orderMapper.saveOne(o.getOrdername(), o.getNum(), o.getPrice());
        return o;
    }
}
