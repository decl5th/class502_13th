package org.choongang.global.configs;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class DBConn {
    private static SqlSessionFactory factory;

    static {
        try {
            Reader reader = Resources.getResourceAsReader("org/choongang/global/configs/mybatis-config.xml");

            factory = new SqlSessionFactoryBuilder().build(reader);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    // sql 실행하고 바로 반영할 수 있도록 autocommit 활성화
    public static SqlSession getSession(boolean autoCommit) {
        String mode = System.getenv("mode"); // 환경변수
        if (mode != null && mode.equals("test")) autoCommit = false; // 수동적으로 커밋 설정 롤백 가능케함
        return factory.openSession(autoCommit);
    }

    public static SqlSession getSession() {
        return getSession(true);
    }
}
