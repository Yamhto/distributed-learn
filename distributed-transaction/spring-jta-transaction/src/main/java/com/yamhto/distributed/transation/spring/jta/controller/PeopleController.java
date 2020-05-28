package com.yamhto.distributed.transation.spring.jta.controller;


import com.yamhto.distributed.transation.spring.jta.entity.secondary.Order;
import com.yamhto.distributed.transation.spring.jta.entity.primary.People;
import com.yamhto.distributed.transation.spring.jta.service.OrderService;
import com.yamhto.distributed.transation.spring.jta.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Random;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author yamhto
 * @since 2020-05-28
 */
@RestController
@RequestMapping("/people")
public class PeopleController {

    @Autowired
    private PeopleService peopleService;

    @Autowired
    private OrderService orderService;

    @RequestMapping("save")
    @ResponseBody
    @Transactional
    public String save() {
        try {
            People p = new People();
            p.setUsername("jta" + new Random().nextInt(1000));
            p.setPassword(new Random().nextFloat() * 1000 + 6000 + "");
            p.setAge("13");
            p.setHigher("100");
            peopleService.saveOne(p);

            Order order = new Order();
            order.setOrdername("jta" + new Random().nextInt(1000));
            order.setNum("3");
            order.setPrice("100");
            orderService.saveOne(order);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("JTA " + e.getMessage());
        }

        return "S";
    }

}
