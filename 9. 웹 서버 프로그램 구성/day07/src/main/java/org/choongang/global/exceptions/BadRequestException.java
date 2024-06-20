package org.choongang.global.exceptions;

import jakarta.servlet.http.HttpServletResponse;

//검증 실패 할 때 알려줄 에러 주로 4xx, 응답코드
public class BadRequestException extends CommonException {

    // 기본생성자로 400대 에러 나올시 출력될 문구 표시
    public BadRequestException() {
        this("잘못된 요청입니다.");
    }

    public BadRequestException(String message) {
        // 응답 코드 400으로 고정 상수형태로 400 표시
        super(message, HttpServletResponse.SC_BAD_REQUEST);
    }
}
