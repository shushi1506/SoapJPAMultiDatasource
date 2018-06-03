package com.soap.demo;


/**
 * @author anhbt 5/14/2018
 * com.soap.demo
 */
//@Configuration
//@EnableJpaRepositories(
//        basePackages = {"com.soap.demo.qlcb.repository"},
//        entityManagerFactoryRef = "entityManagerFactoryqlcb",
//        transactionManagerRef = "transactionManagerqlcb")
//@EnableTransactionManagement
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

//    @Bean
//    @ConfigurationProperties("spring.datasource")
//    public DataSourceProperties firstDataSourceProperties() {
//        return new DataSourceProperties();
//    }
//
//    @Bean
//    @ConfigurationProperties("spring.datasource")
//    public DataSource qlcbDataSource() {
//        return firstDataSourceProperties().initializeDataSourceBuilder().build();
//    }
//
//    @Bean(name = "entityManagerFactoryqlcb")
//    public LocalContainerEntityManagerFactoryBean customerEntityManagerFactory(
//            EntityManagerFactoryBuilder builder) {
//        return builder
//                .dataSource(qlcbDataSource())
//                .packages(DmQuocGia.class)
//                .persistenceUnit("dbtd")
//                .build();
//    }
//
//    @Bean(name = "transactionManagerqlcb")
//    public PlatformTransactionManager transactionManager(
//            @Qualifier("entityManagerFactoryqlcb") EntityManagerFactory entityManagerFactory) {
//        return new JpaTransactionManager(entityManagerFactory);
//    }
}
