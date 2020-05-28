package com.yamhto.distributed.transation.spring.jpa.controller;

import com.yamhto.distributed.transation.spring.jpa.entity.People;
import com.yamhto.distributed.transation.spring.jpa.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

/**
 * @author yamhto
 * @className: PeopleController.java
 * @package com.yamhto.distributed.transation.spring.jpa.controller
 * @description:
 * @date 2020/5/28 10:58
 */
@Controller
@RequestMapping("/people")
public class PeopleController {

    @Autowired
    private PeopleService peopleService;

    @GetMapping("findAll")
    @ResponseBody
    public String findAll() {
        return peopleService.findAll().toString();
    }

    @GetMapping("save")
    public String save() {
        People people = new People();
        people.setUsername("name" + new Random().nextInt(1000));
        people.setPassword(new Random().nextFloat() * 1000 + 6000 + "");
        people.setAge("13");
        people.setHigher("100");
        peopleService.save(people);
        return "redirect:/people/findAll";
    }

    @RequestMapping("transation")
    @Transactional()
    @ResponseBody
    public String transation() {
        try {
            peopleService.deleteById(3L);

            int a = 5/0;

            peopleService.deleteById(2L);
        } catch (Exception e) {
            e.printStackTrace();

            /**
             * 必须抛出RuntimeException，否则不会回滚事务
             */

            throw  new RuntimeException(e.getMessage());
        }

        return "S";
    }
}
