package com.yamhto.sharingsphere;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author yamhto
 * @className: SharingJdbcApplication.java
 * @package com.yamhto.sharingsphere
 * @description:
 * @date 2020/6/2 14:12
 */
@SpringBootApplication
@MapperScan("com.yamhto.sharingsphere.mapper")
public class SharingJdbcApplication {

    public static void main(String[] args) {
        SpringApplication.run(SharingJdbcApplication.class, args);
    }
}
