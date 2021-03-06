package com.soap.demo;



import com.soap.demo.qltb.model.AuthItem;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;

import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;


/**
 * @author anhbt 5/14/2018
 * com.soap.demo
 */
@Configuration
@EnableJpaRepositories(
        basePackages = {"com.soap.demo.qltb.repository"},
        entityManagerFactoryRef = "entityManagerFactoryqltb",
        transactionManagerRef = "transactionManagerqltb")
@EnableTransactionManagement
public class QltbDbConfig {
    @Bean
    @Primary
    @ConfigurationProperties("app.datasource")
    public DataSourceProperties secondDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean
    @Primary
    @ConfigurationProperties("app.datasource")
    public DataSource qltbDataSource() {
        return secondDataSourceProperties().initializeDataSourceBuilder().build();
    }
    @Primary
    @Bean(name = "entityManagerFactoryqltb")
    public LocalContainerEntityManagerFactoryBean customerEntityManagerFactory(
            EntityManagerFactoryBuilder builder) {
        return builder
                .dataSource(qltbDataSource())
                .packages(AuthItem.class)
                .persistenceUnit("orcl")
                .build();
    }
    @Primary
    @Bean(name = "transactionManagerqltb")
    public PlatformTransactionManager transactionManager(
            @Qualifier("entityManagerFactoryqltb") EntityManagerFactory entityManagerFactory) {
        return new JpaTransactionManager(entityManagerFactory);
    }
}
