package com.yamhto.distributed.transation.spring.jta.conf;

import com.atomikos.icatch.jta.UserTransactionImp;
import com.atomikos.icatch.jta.UserTransactionManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.jta.JtaTransactionManager;

import javax.transaction.UserTransaction;

/**
 * @author yamhto
 * @className: JtaTransactionManagerConfig.java
 * @package com.yamhto.distributed.transation.spring.jta.conf
 * @description:
 * @date 2020/5/28 16:16
 */
@Configuration
public class JtaTransactionManagerConfig {

    @Bean(name = "XATA")
    public JtaTransactionManager regTransactionManager() {
        UserTransactionManager userTransactionManager = new UserTransactionManager();
        UserTransaction userTransaction = new UserTransactionImp();
        return new JtaTransactionManager(userTransaction, userTransactionManager);
    }
}
