package org.choongang.member.tests;

import com.github.javafaker.Faker;
import org.apache.ibatis.session.SqlSession;
import org.choongang.global.configs.DBConn;
import org.choongang.member.entities.Member;
import org.choongang.member.mapper.MemberMapper;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

public class MemberMapperTest {

    private SqlSession session;
    private MemberMapper mapper;

    @BeforeEach
    void init() {
        session = DBConn.getSession(false); // 테스트 끝나면 rollback 하겠다는 의미
        mapper = session.getMapper(MemberMapper.class);
    }

    @Test
    @DisplayName("회원 등록, 조회 테스트")
    void registerTest() {
        Faker faker = new Faker(Locale.ENGLISH);
        Member member = new Member();
        member.setEmail(System.currentTimeMillis() + faker.internet().emailAddress());
        member.setPassword(faker.regexify("\\w{8,16}").toLowerCase());
        member.setUserName(faker.name().fullName());

        int result = mapper.register(member); // 등록
        assertEquals(1, result);

        long cnt = mapper.exist(member.getEmail()); // 등록 회원 있는지 테스트
        assertEquals(1L, cnt);

        //조회하고 회원의 이메일과 일치하는 지 확인
        Member member2 = mapper.get(member.getEmail()); // 이메일로 조회되는 회원이 있는지 테스트

        assertEquals(member.getEmail(), member2.getEmail());
        assertEquals(member.getPassword(), member2.getPassword());
        assertEquals(member.getUserName(), member2.getUserName());

    }

    @AfterEach
    void destroy() {
        session.rollback(); // 테스트 이후엔 데이터를 남길 필요가 없기 때문
    }
}
