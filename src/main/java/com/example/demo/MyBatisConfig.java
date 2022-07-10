package com.example.demo;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

    @Configuration
    // Spring Boot 앱의 설정 역할
    @MapperScan(basePackages = "com.example.demo.dao")
    //앞으로 작성하게 될 DAO 클래스의 패키지

    public class MyBatisConfig {
        @Bean
        public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
            SqlSessionFactoryBean sessionFactory = new
                    SqlSessionFactoryBean();
            sessionFactory.setDataSource(dataSource);
            sessionFactory.setMapperLocations(new
                    PathMatchingResourcePatternResolver().getResources("classpath:mapper/*.xml"));
            //소스 내부의 "classpath:mapper/*.xml"은 앞으로 SQL문을 작성할 mapper.xml 파일의 경로가 될 것
                    return sessionFactory.getObject();
}
}
