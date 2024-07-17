package org.choongang.member.api.controllers;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.choongang.member.controllers.RequestJoin;
import org.choongang.member.entities.Member;
import org.choongang.member.mappers.MemberMapper;
import org.choongang.member.services.JoinService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.IntStream;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/member") // 앞에 api가 붙어있는 주소
public class ApiMemberController {
    // 회원 이메일 조회 후 출력

    private final MemberMapper mapper;
    private final JoinService joinService;

    @PostMapping// POST /api/member
    public ResponseEntity join(@RequestBody RequestJoin form) {
        // Content-Type: application/json
        joinService.process(form);

        // 응답코드 201, 출력 바디 X
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/info/{email}")
    public Member info(@PathVariable("email") String email) {
        // Content-Type: application/json
        Member member = mapper.get(email);

        return member;
    }

    @GetMapping("/list")
    public List<Member> list() {
       List<Member> members = IntStream.rangeClosed(1, 10)
               .mapToObj(i -> Member.builder()
                       .email("user" + i + "@test.org")
                       .password("12345678")
                       .userName("user" + i)
                       .regDt(LocalDateTime.now())
                       .build())
               .toList();
       return members;
    }

    @GetMapping(path="/test", produces = "text/html;charset=UTF-8")
    public String test() {
        // Content-Type: text/plain
        return "안녕하세요";
    }

    @GetMapping("/test2")
    public void test2() {
      log.info("test2.....");
    }
}
