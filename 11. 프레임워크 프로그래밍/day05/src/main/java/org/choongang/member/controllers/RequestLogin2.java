package org.choongang.member.controllers;

import lombok.Builder;
import lombok.Getter;

// 생서자 매개변수로 정의
// 값만 담을 수 있는 클래스
@Builder
@Getter
public record RequestLogin2(
        String email,
        String password
) {}
