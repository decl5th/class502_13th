package org.choongang.member.services;

import org.apache.ibatis.session.SqlSession;
import org.choongang.global.configs.DBConn;
import org.choongang.member.mapper.MemberMapper;
import org.choongang.member.validators.JoinValidator;

// 멤버 쪽 객체 조립기
public class MemberServiceProvider {
    private static MemberServiceProvider instance;

    // 기본 생성자 차단
    private MemberServiceProvider() {}

    // 기능적인 것만 제공하기 때문에 객체 생성 하지 않게 싱글톤으로 형성
    public static MemberServiceProvider getInstance() {
        if (instance == null) {
            instance = new MemberServiceProvider();
        }
        return instance;
    }

    public MemberMapper memberMapper() {
        SqlSession session = DBConn.getSession();
        return session.getMapper(MemberMapper.class); // MemberMapper 구현 객체를 만들어준다
    }

    public JoinValidator joinValidator() {
        return new JoinValidator(memberMapper());
    }

    // 조립 필요함 계속해서 추가될거고 그렇게 추가하면 소스를 보여줄 필요없이 객체 통제가 원할
    // 개방 폐쇄의 원칙이 잘 적용된다
    public JoinService joinService() {
        return new JoinService(joinValidator());
    }
}
