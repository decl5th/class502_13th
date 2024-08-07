package config;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class AppCtx {

    @Bean(destroyMethod = "close")
    public DataSource dataSource() {
        DataSource ds = new DataSource();
        /* DB 연결 설정 B */
        ds.setDriverClassName("oracle.jdbc.OracleDriver");
        ds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
        ds.setUsername("SPRING");
        ds.setPassword("oracle");
        /* DB 연결 설정 D */

        /* 커넥션 풀 설정 B */
        ds.setTestWhileIdle(true); // 유효 객에 유효성 체크
        ds.setInitialSize(2);
        ds.setMaxActive(10);
        ds.setTimeBetweenEvictionRunsMillis(10 * 1000); // 10초에 한번 씩 연결 상 태 체크확인
        ds.setMinEvictableIdleTimeMillis(1000 * 60 ); // 유휴 객체 생존 시간 1분으로 설정
        /* 커넥션 풀 설정 D */

        return ds;
    }

    @Bean
    public JdbcTemplate jdbcTemplate() {
        return new JdbcTemplate(dataSource());
    }
}
