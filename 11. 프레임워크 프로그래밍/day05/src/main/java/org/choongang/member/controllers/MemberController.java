package org.choongang.member.controllers;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.choongang.member.services.JoinService;
import org.choongang.member.services.LoginService;
import org.choongang.member.validators.JoinValidator;
import org.choongang.member.validators.LoginValidator;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {

    private final JoinValidator joinValidator;
    private final JoinService joinService;
    private final LoginService loginService;
    private final LoginValidator loginValidator;

    @GetMapping("/join")
    public String join(@ModelAttribute RequestJoin form) {

        return "member/join";
    }

    @PostMapping("/join")
    public String joinPs(@Valid RequestJoin form, Errors errors) { // @Valid ⭐⭐
        // 회원 가입 데이터 검증
        joinValidator.validate(form, errors);

        if (errors.hasErrors()) { // reject, rejectValue가 한번이라도 호출되면 true
            return "member/join";
        }

        joinService.process(form); // 회원 가입 처리

        return "redirect:/member/join";
    }
    /*
    @InitBinder
    public void initBinder(WebDataBinder binder){
        binder.setValidator(joinValidator);

    }

     */
    @GetMapping("/login")
    public String login(@ModelAttribute RequestLogin form) {

        return "member/login";
    }

    @PostMapping("/login")
    public String loginPs(@Valid RequestLogin form, Errors errors) {
        loginValidator.validate(form, errors);

        loginService.process(form);

        if(errors.hasErrors()){
            return "member/login";
        }

        return "redirect:/";
    }

}
