package com.yamhto.distributed.transation.spring.jta.conf;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

/**
 * @author yamhto
 * @className: RepositoryPrimaryConfig.java
 * @package com.yamhto.distributed.transation.spring.jta.conf
 * @description:
 * @date 2020/5/28 16:17
 */
//@Configuration
//@MapperScan(basePackages = "com.yamhto.distributed.transation.spring.jta.mapper.primary", sqlSessionTemplateRef  = "sqlSessionTemplatePrimary")
@Deprecated
public class RepositoryPrimaryConfig {
    @Autowired
    private Environment env;
    @Autowired
    @Qualifier("primaryDS")
    private DataSource primaryDS;

    @Bean(name = "sqlSessionFactoryPrimary")
    @Primary
    public SqlSessionFactory sqlSessionFactoryPrimary() throws Exception {
        SqlSessionFactoryBean fb = new SqlSessionFactoryBean();
        fb.setDataSource(primaryDS);
        fb.setTypeAliasesPackage(env.getProperty("mybatis.typeAliasesPackage"));//指定基包
        fb.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(env.getProperty("mybatis.mapperLocations")));//指定xml文件位置
        return fb.getObject();
    }

    @Bean(name = "sqlSessionTemplatePrimary")
    @Primary
    public SqlSessionTemplate sqlSessionTemplatePrimary(@Qualifier("sqlSessionFactoryPrimary") SqlSessionFactory sqlSessionFactory) throws Exception {
        SqlSessionTemplate sqlSessionTemplate = new SqlSessionTemplate(sqlSessionFactory);
        return sqlSessionTemplate;
    }

}
