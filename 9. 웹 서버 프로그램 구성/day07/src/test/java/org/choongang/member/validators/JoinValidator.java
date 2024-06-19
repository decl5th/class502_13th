package org.choongang.member.validators;

import org.choongang.global.exceptions.BadRequestException;
import org.choongang.global.validators.EmailValidator;
import org.choongang.global.validators.RequiredValidator;
import org.choongang.global.validators.Validator;
import org.choongang.member.controllers.RequestJoin;
import org.choongang.member.exceptions.DuplicatedMemberException;
import org.choongang.member.mapper.MemberMapper;


// RequestJoin을 검증하는 joinValidator
// joinService내에서 joinValidator를 사용하겠다
public class JoinValidator implements Validator<RequestJoin>, RequiredValidator, EmailValidator {

    // DB 쿼리에 대한 의존성 추가
    private MemberMapper mapper;
    public JoinValidator(MemberMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public void check(RequestJoin form) {
        /* 필수 항목 검증 - 이메일, 비번, 비번확인, 회원명, 약관 동의 */
        // 필수 항목이 필요하면 추가하고 필요없으면 제거 하는 방향으로 잡기 위해 인터페이스 생성

        String email = form.getEmail();
        String password = form.getPassword();
        String confirmPassword = form.getConfirmPassword();
        String userName = form.getUserName();
        boolean termsAgree = form.isTermsAgree();

        checkRequired(email, new BadRequestException("이메일을 입력하세요."));
        checkRequired(password, new BadRequestException("비밀번호를 입력하세요."));
        checkRequired(confirmPassword, new BadRequestException("비밀번호를 확인하세요."));
        checkRequired(userName, new BadRequestException("회원명를 입력하세요."));
        // 약관 동의
        checkTrue(termsAgree, new BadRequestException("약관에 동의하세요."));
        // checktrue 생성하고나서 추가됨 왜? boolean값이라서

        // 비번, 비번 확인 일치 여부
        checkTrue(password.equals(confirmPassword), new BadRequestException("비밀번호가 일치하지 않습니다."));

        // 이메일 형식 체크는 어디서든 쓸수 있는 양식이라 global에다 따로 빼서 작성해서 가져오는 식으로 설정
        if (!checkEmail(email)) {
            throw new BadRequestException("이메일 형식이 아닙니다.");
        }

        // 비번 자리수 체크
        checkTrue(password.length() >= 8, new BadRequestException("비밀번호는 8자리 이상 입력하세요"));

        //이미 가입된 회원인지 체크, 0이 되어야지 맞는거쥐
        checkTrue(mapper.exist(email) == 0L, new DuplicatedMemberException());

    }
}
