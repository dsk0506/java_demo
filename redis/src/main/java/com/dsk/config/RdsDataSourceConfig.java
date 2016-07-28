package com.dsk.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

/**
 * Created by dsk on 16/7/28.
 */
@Configuration
@MapperScan(basePackages = RdsDataSourceConfig.PACKAGE, sqlSessionFactoryRef = "rdsSqlSessionFactory")
public class RdsDataSourceConfig {

    static final String PACKAGE = "com.dsk.mapper";

    @Value("jdbc:mysql://localhost:3306/test1")
    private String dbUrl;
    @Value("root")
    private String dbUser;
    @Value("root")
    private String dbPassword;

    @Bean(name = "rdsDataSource")
    public DruidDataSource rdsDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl(dbUrl);
        dataSource.setUsername(dbUser);
        dataSource.setPassword(dbPassword);
        return dataSource;
    }

    @Bean(name = "rdsTransactionManager")
    public DataSourceTransactionManager rdsTransactionManager() {
        return new DataSourceTransactionManager(rdsDataSource());
    }

    @Bean(name = "rdsSqlSessionFactory")
    public SqlSessionFactory rdsSqlSessionFactory(@Qualifier("rdsDataSource") DruidDataSource rdsDataSource) throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(rdsDataSource);
        return sessionFactory.getObject();
    }
}

