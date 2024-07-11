package org.choongang.config;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DBConfig {

    @Bean(destroyMethod = "close")
    public DataSource dataSource() {
        DataSource ds = new DataSource();
        /* 연결 설정 B */
        ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        ds.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
        ds.setUsername("Spring");
        ds.setPassword("oracle");
        /* 연결 설정 D */

        /* 커넥션 풀 설정 B */
        ds.setInitialSize(2);
        ds.setMaxActive(10);
        ds.setTestWhileIdle(true);
        ds.setMinEvictableIdleTimeMillis(1000 * 60); // 기본값이라 따로 추가 안해도 됨
        ds.setTimeBetweenEvictionRunsMillis(1000 * 5); // 기본값이라 따로 추가 안해도 됨
        /* 커넥션 풀 설정 D */

        return ds;
    }
}
