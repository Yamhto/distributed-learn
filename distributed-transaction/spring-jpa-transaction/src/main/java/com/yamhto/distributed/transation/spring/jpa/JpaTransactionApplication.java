package com.yamhto.distributed.transation.spring.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AdviceMode;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author yamhto
 * @className: JpaTransactionApplication.java
 * @package com.yamhto.distributed.transation.spring.jpa
 * @description:
 * @date 2020/5/28 11:04
 */

@SpringBootApplication
@EnableTransactionManagement(mode = AdviceMode.PROXY) //默认代理，还有 ASPECTJ 模式
public class JpaTransactionApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaTransactionApplication.class, args);
    }
}
