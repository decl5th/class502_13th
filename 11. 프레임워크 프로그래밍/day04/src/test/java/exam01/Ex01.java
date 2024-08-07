package exam01;

import config.AppCtx;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Transactional
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = AppCtx.class)
public class Ex01 {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    void test1() {
        // 이 때 PreparedStatementCreator는 함수형 인터페이스이기 때문에 람다식으로 줄여 쓰는게 가능하다
        KeyHolder keyHolder = new GeneratedKeyHolder();
        int result = jdbcTemplate.update(con -> {
                String sql = "INSERT INTO MEMBER(SEQ, EMAIL, PASSWORD, USER_NAME) values(SEQ_MEMBER.NEXTVAL, ?,?,?)";

                PreparedStatement pstmt = con.prepareStatement(sql, new String[] {"SEQ"});
                pstmt.setString(1, "user05@test.org");
                pstmt.setString(2, "12345678");
                pstmt.setString(3, "user05");

                return pstmt;
        }, keyHolder);

        System.out.println("result = " + result);
        Number key = keyHolder.getKey();
    }
}
