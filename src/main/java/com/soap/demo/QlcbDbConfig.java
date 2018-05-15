package com.soap.demo;


import com.soap.demo.qlcb.model.DmQuocGia;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.util.Properties;

/**
 * @author anhbt 5/14/2018
 * com.soap.demo
 */
@Configuration
@EnableJpaRepositories(
        basePackages = {"com.soap.demo.qlcb.repository"},
        entityManagerFactoryRef = "entityManagerFactoryqlcb",
        transactionManagerRef = "transactionManagerqlcb")
@EnableTransactionManagement
public class QlcbDbConfig {
//    @Bean(name = "transactionManager2")
//    @Primary
//    public PlatformTransactionManager transactionManager2() {
//        return new JpaTransactionManager(entityManagerFactory2().getObject());
//    }
//
//    @Bean(name = "entityManagerFactory2")
//    @Primary
//    public LocalContainerEntityManagerFactoryBean entityManagerFactory2() {
//
//        HibernateJpaVendorAdapter jpaVendorAdapter = new HibernateJpaVendorAdapter();
//
//        LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();
//        factoryBean.setDataSource(dataSource2());
//        factoryBean.setJpaVendorAdapter(jpaVendorAdapter);
//        factoryBean.setJpaProperties(hibernateProperties());
//
//        factoryBean.setPackagesToScan("com.soap.demo.qlcb.repository");
//        factoryBean.setPersistenceUnitName("dbtd");
//
//        return factoryBean;
//    }
//
//    @Primary
//    @Bean(name = "dataSource2")
//    @ConfigurationProperties(prefix = "spring.datasource")
//    public DataSource dataSource2() {
//        return DataSourceBuilder
//                .create()
//                .build();
//    }
//
//    private Properties hibernateProperties() {
//        final Properties hibernateProperties = new Properties();
//        hibernateProperties.setProperty("hibernate.dialect", "org.hibernate.dialect.OracleDialect");
//        hibernateProperties.setProperty("hibernate.hbm2ddl.auto", "update");
//        return hibernateProperties;
//    }

    @Bean
    @Primary
    @ConfigurationProperties("spring.datasource")
    public DataSourceProperties firstDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean
    @Primary
    @ConfigurationProperties("spring.datasource")
    public DataSource firstDataSource() {
        return firstDataSourceProperties().initializeDataSourceBuilder().build();
    }
    @Primary
    @Bean(name = "entityManagerFactoryqlcb")
    public LocalContainerEntityManagerFactoryBean customerEntityManagerFactory(
            EntityManagerFactoryBuilder builder) {
        return builder
                .dataSource(firstDataSource())
                .packages(DmQuocGia.class)
                .persistenceUnit("dbtd")
                .build();
    }

    @Primary
    @Bean(name = "transactionManagerqlcb")
    public PlatformTransactionManager transactionManager(
            @Qualifier("entityManagerFactoryqlcb") EntityManagerFactory entityManagerFactory) {
        return new JpaTransactionManager(entityManagerFactory);
    }
}
