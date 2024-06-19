package org.choongang.member.exceptions;

import org.choongang.global.exceptions.BadRequestException;

public class DuplicatedMemberException extends BadRequestException {
    // 기본 생성자 정의하고 문구를 고정
    public DuplicatedMemberException(String message) {
        // 응답 코드 4xx 대로 출력
        super("이미 가입된 회원입니다.");
    }
}
