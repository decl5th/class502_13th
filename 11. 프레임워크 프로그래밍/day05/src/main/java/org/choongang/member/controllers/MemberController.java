package org.choongang.member.controllers;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.choongang.member.entities.Member;
import org.choongang.member.services.JoinService;
import org.choongang.member.services.LoginService;
import org.choongang.member.validators.JoinValidator;
import org.choongang.member.validators.LoginValidator;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

@Slf4j
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

        return "redirect:/member/login";
    }
    /*
    @InitBinder
    public void initBinder(WebDataBinder binder){
        binder.setValidator(joinValidator);

    }
     */
    @GetMapping("/login")
    public String login(@ModelAttribute RequestLogin form, @CookieValue(name ="savedEmail", required = false) String saveEmail/*@SessionAttribute(name = "member", required = false) Member member*/) {
        // Member member = (Member) session.getAttribute("member");
        /*
        if(member != null){
            log.info(member.toString());
        }
        */
        if (saveEmail != null) {
            form.setSaveEmail(true);
            form.setEmail(saveEmail);
        }
        return "member/login";
    }

    @PostMapping("/login")
    public String loginPs(@Valid RequestLogin form, Errors errors) {
        loginValidator.validate(form, errors);

        loginService.process(form.getEmail());

        if(errors.hasErrors()){
            return "member/login";
        }

        // 로그인 처리 - loginservice와 연동

        loginService.process(form);

        return "redirect:/";
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate(); // 세션 비우기

        return "redirect:/member/login";
    }

    @GetMapping("/list")
    public String list(@Valid @ModelAttribute MemberSearch search, Errors errors) {

        log.info(search.toString());

        return "member/list";
    }

}
