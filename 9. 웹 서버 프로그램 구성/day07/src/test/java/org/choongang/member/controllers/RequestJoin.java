package org.choongang.member.controllers;

import lombok.Builder;
import lombok.Data;

//데이터를 전달하는 DTO
@Data
@Builder
public class RequestJoin {
    private String email;
    private String password;
    private String confirmPassword;
    private String userName;
    private boolean termsAgree;
}
