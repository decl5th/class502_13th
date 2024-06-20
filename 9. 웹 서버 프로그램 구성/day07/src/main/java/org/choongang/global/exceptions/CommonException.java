package org.choongang.global.exceptions;

import jakarta.servlet.http.HttpServletResponse;

public class CommonException extends RuntimeException {
    private int status; // 얘가 응답 코드 보여줄거임 2xx, 3xx, 4xx, 5xx 등등

    // 기본 생성자 정의, 숫자가 아닌 상수 형태로 500을 넣어줌
    public CommonException(String message) {
        this(message, HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
    }

    public CommonException(String message, int status) {
        super(message);
        this.status = status;
    }

    // 응답코드를 조회하기 위한 get메서드 정의
    public int getStatus() {
        return status;
    }
}
