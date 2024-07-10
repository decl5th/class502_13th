package exam01;

import config.AppCtx;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = AppCtx.class)
public class Ex01 {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    void test1() {
        // 이 때 PreparedStatementCreator는 함수형 인터페이스이기 때문에 람다식으로 줄여 쓰는게 가능하다
        int result = jdbcTemplate.update(con -> {
                String sql = "INSERT INTO MEMBER(SEQ, EMAIL, PASSWORD, USER_NAME) values(SEQ_MEMBER.NEXTVAL, ?,?,?)";

                PreparedStatement pstmt = con.prepareStatement(sql);
                pstmt.setString(1, "user04@test.org");
                pstmt.setString(2, "12345678");
                pstmt.setString(3, "user04");

                return pstmt;
        });

        System.out.println("result = " + result);
    }
}
