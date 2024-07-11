package org.choongang.member.controllers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping()
public class MemberController {
    /*
    @GetMapping("/join")
    //@RequestMapping(path="/member/join", method = {RequestMethod.GET, RequestMethod.POST})
    public String join() {

        return "member/join";
    }

    @PostMapping("/join")
    public String JoinPs(RequestJoin form) {

        return "redirect:/member/login";
    }

     */


    @GetMapping("/member/join")
    public ModelAndView join() {

        ModelAndView mv = new ModelAndView();
        mv.addObject("message", "안녕하세요.");
        mv.setViewName("member/join");

        return mv;
    }


}
