package org.choongang.member.validators;

import org.choongang.global.validators.Validator;
import org.choongang.member.controllers.RequestJoin;


// RequestJoin을 검증하는 joinValidator
// joinService내에서 joinValidator를 사용하겠다
public class JoinValidator implements Validator<RequestJoin> {

    @Override
    public void check(RequestJoin form) {
        /* 필수 항목 검증 - 이메일, 비번, 비번확인, 회원명, 약관 동의 */
        // 필수 항목이 필요하면 추가하고 필요없으면 제거 하는 방향으로 잡기 위해 인터페이스 생성
    }
}
