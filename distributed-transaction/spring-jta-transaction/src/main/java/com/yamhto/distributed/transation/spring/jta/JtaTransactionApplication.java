package com.yamhto.distributed.transation.spring.jta;

import com.yamhto.distributed.transation.spring.jta.conf.Db1Properties;
import com.yamhto.distributed.transation.spring.jta.conf.Db2Properties;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @author yamhto
 * @className: JtaTransactionApplication.java
 * @package com.yamhto.distributed.transation.spring.jta
 * @description:
 * @date 2020/5/28 16:10
 */
@SpringBootApplication
@EnableConfigurationProperties({Db1Properties.class, Db2Properties.class})
public class JtaTransactionApplication {

    public static void main(String[] args) {
        SpringApplication.run(JtaTransactionApplication.class, args);
    }
}
