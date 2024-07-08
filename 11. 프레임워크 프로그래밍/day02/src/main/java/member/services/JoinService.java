package member.services;


import member.controllers.RequestJoin;
import member.dao.MemberDao;
import member.entities.Member;
import member.validators.JoinValidator;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class JoinService {

    private JoinValidator validator;

    private MemberDao memberDao;

    // 기본 생성자가 정의되어있지 않고 매개변수가 있는 생성자
    public JoinService(JoinValidator validator, MemberDao memberDao) {
        // 생성자가 하나만 정의되어 있고 DI할 수 있게 매개변수의 정의만 해도
        // 객체를 생성하기 위한 조건으로 의존성 해결하고 객체 생성
        // 자동 스캔 범위일 때만 가능
        this.validator = validator;
        this.memberDao = memberDao;
    }

    public void process(RequestJoin form) {
        validator.check(form);  // joinService는 validator 객체, form 객체를 의존 -> 의존성

        // 데이터 영구 저장 - DAO(Data Access Object)
        Member member = Member.builder()
                        .email(form.getEmail())
                        .password(form.getPassword())
                        .userName(form.getUserName())
                        .regDt(LocalDateTime.now())
                        .build();

        memberDao.register(member);
    }
}
