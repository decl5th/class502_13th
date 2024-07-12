package org.choongang.member.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/member")
public class MemberController {

    @GetMapping("/join")
    public String join(Model model) {

        RequestJoin form = new RequestJoin();
        model.addAttribute("requestJoin", form);

        return "member/join";
    }

    @PostMapping("/join")
    public String joinPs(RequestJoin form) {

        log.info(form.toString());

        return "member/join";
    }

    @GetMapping("/login")
    public String login() {

        return "member/login";
    }

   // private final Logger log = LoggerFactory.getLogger(MemberController.class); //자기 클래스 지정
    /*
    @GetMapping("/join")
    //@RequestMapping(path = "/member/join", method = RequestMethod.GET)
    public String join1() {
        log.info("{},{} 없음", "mode1", "mode2"); // 교체될 수 있는 부분은 중괄호를 이용하여 표시
        return "member/join";
    }

    @GetMapping(path = "/join", params = {"mode=join"})
    //@RequestMapping(path="/member/join", method = {RequestMethod.GET, RequestMethod.POST})
    public String join() {
        log.info("mode=join");
        return "member/join";
    }

    @PostMapping(value = "/join", headers = "appkey=1234", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public String JoinPs(RequestJoin form) {
        log.info("joinPs 실행...");
       // return "redirect:/member/login";
        return "/member/login";
    }
    */


    /*
    @GetMapping("/member/join")
    public ModelAndView join() {

        ModelAndView mv = new ModelAndView();
        mv.addObject("message", "안녕하세요.");
        mv.setViewName("member/join");

        return mv;
    }

     */


}
