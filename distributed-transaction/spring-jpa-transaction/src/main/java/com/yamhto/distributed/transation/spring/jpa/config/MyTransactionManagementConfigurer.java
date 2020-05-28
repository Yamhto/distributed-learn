package com.yamhto.distributed.transation.spring.jpa.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

import javax.annotation.Resource;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;


/**
 * @author yamhto
 * @className: MyTransactionManagementConfigurer.java
 * @package com.yamhto.distributed.transation.spring.jpa.config
 * @description: 多事务管理的情况下, 指定默认使用哪个事务管理器进行事务管理
 * @date 2020/5/28 14:25
 */
//@Configuration
@ConditionalOnClass(PlatformTransactionManager.class)
public class MyTransactionManagementConfigurer implements TransactionManagementConfigurer {

    @Resource(name = "jpaTxManager")
    private PlatformTransactionManager platformTransactionManager;

    @Override
    public TransactionManager annotationDrivenTransactionManager() {
        return platformTransactionManager;
    }


}
