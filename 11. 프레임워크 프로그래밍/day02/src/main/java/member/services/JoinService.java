package member.services;


import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import member.controllers.RequestJoin;
import member.dao.MemberDao;
import member.entities.Member;
import member.validators.JoinValidator;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
/* @RequiredArgsConstructor가 밑의 로직 역할을 대신 해줌
public JoinService(JoinValidator validator) {
        this.validator = validator;
}
 */
public class JoinService {

    private final JoinValidator validator;

    @NonNull
    // 얘를 통해서 생성자 매개변수에 추가
    // 대신 상수 형태가 아니라서 변형 가능한 매개변수로 설정 가능
    private MemberDao memberDao;

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
