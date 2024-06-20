package org.choongang.member.services;

import org.apache.ibatis.session.SqlSession;
import org.choongang.global.configs.DBConn;
import org.choongang.member.mapper.MemberMapper;
import org.choongang.member.validators.JoinValidator;
import org.choongang.member.validators.LoginValidator;

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

    public SqlSession getSession() {
        return DBConn.getSession();
    }

    public MemberMapper memberMapper() {
        return getSession().getMapper(MemberMapper.class); // MemberMapper 구현 객체를 만들어준다
    }

    public JoinValidator joinValidator() {
        return new JoinValidator(memberMapper());
    }

    // 조립 필요함 계속해서 추가될거고 그렇게 추가하면 소스를 보여줄 필요없이 객체 통제가 원할
    // 개방 폐쇄의 원칙이 잘 적용된다
    public JoinService joinService() {
        return new JoinService(joinValidator(), memberMapper());
    }

    public LoginValidator loginValidator() {
        return new LoginValidator();
    }

    public LoginService loginService() {
        return new LoginService(loginValidator(), memberMapper()); // 생성과 동시에 반환
        // memberMapper가 추가됨에 따라 주입해주면 바로 적용됨
    }
}
