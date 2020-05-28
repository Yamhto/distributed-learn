package com.yamhto.distributed.transation.spring.jpa.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

/**
 * @author yamhto
 * @className: TransactionManagements.java
 * @package com.yamhto.distributed.transation.spring.jpa.config
 * @description:
 * @date 2020/5/28 14:51
 */
//@Configuration
public class TransactionManagements {

    @Bean(name = "jpaTxManager")
    public PlatformTransactionManager jpaTxManager(EntityManagerFactory emf) {
        return new JpaTransactionManager(emf);
    }

    @Bean(name = "dataSourceTxManager")
    public PlatformTransactionManager dataSourceTxManager(DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }
}
