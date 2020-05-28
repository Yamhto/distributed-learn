package com.yamhto.distributed.transation.spring.jta.conf;

import com.atomikos.jdbc.AtomikosDataSourceBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * @author yamhto
 * @className: DataSourceConfig.java
 * @package com.yamhto.distributed.transation.spring.jta.conf
 * @description:
 * @date 2020/5/28 16:14
 */
//@Configuration
@Deprecated
public class DataSourceConfig {

    @Autowired
    private Environment env;

    @Bean(name = "primaryDS")
    @Primary
    public DataSource primaryDataSource() throws Exception {
        AtomikosDataSourceBean ds = new AtomikosDataSourceBean();
        ds.setXaDataSourceClassName("com.alibaba.druid.pool.xa.DruidXADataSource");
        ds.setUniqueResourceName("primaryRN");
        ds.setPoolSize(5);
        ds.setXaProperties(build("yamhto.primary.datasource."));
        return ds;
    }

    @Bean(name = "secondaryDS")
    public DataSource dataSource() throws Exception {
        AtomikosDataSourceBean ds = new AtomikosDataSourceBean();
        ds.setXaDataSourceClassName("com.alibaba.druid.pool.xa.DruidXADataSource");
        ds.setUniqueResourceName("secondaryRN");
        ds.setPoolSize(5);
        ds.setXaProperties(build("yamhto.secondary.datasource."));
        return ds;
    }

    private Properties build(String prefix) {
        Properties prop = new Properties();
        prop.put("url", env.getProperty(prefix + "url"));
        prop.put("username", env.getProperty(prefix + "username"));
        prop.put("password", env.getProperty(prefix + "password"));
        prop.put("driverClassName", env.getProperty(prefix + "driverClassName"));

        return prop;
    }
}
