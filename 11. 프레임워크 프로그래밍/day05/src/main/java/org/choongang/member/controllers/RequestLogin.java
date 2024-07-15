package org.choongang.member.controllers;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RequestLogin {

    @NotBlank
    private String email;

    @NotBlank
    private String password;

    private boolean saveEmail;
}
