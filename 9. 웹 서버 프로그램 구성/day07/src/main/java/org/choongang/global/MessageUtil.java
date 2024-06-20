package org.choongang.global;


import jakarta.servlet.http.HttpServletResponse;
import org.choongang.global.exceptions.CommonException;

import java.io.IOException;
import java.io.PrintWriter;

public class MessageUtil {
    // 정적 메서드로 정의
    public static void alertError(Exception e, HttpServletResponse resp) throws IOException {
        // alert 형태로 자바스크립트를 띄울 건데 태그 안에서 contentType이 text/html이 되어야 함
        resp.setContentType("text/html; charset=UTF-8");
        if (e instanceof CommonException commonException) {
            // CommonException commonException = (CommonException) e;
            resp.setStatus(commonException.getStatus());
        }
        PrintWriter out = resp.getWriter();
        out.printf("<script>alert('%s');</script>", e.getMessage());
        // history.back()을 통해서 알람뜨고 나서 다시 가입화면으로 되돌아감 but 히든 프레임으로 회원가입 창에서 알람창에 띄우고 해놨으니 histroy back 지워줌
    }

    public static void go(String url, String target, HttpServletResponse resp) throws IOException {
       target = target == null || target.isBlank() ? "self" : target;

        resp.setContentType("text/html; charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.printf("<script>%s.location.href='%s';</script>", target, url);
    }

    public static void go(String url, HttpServletResponse resp) throws IOException {
        go(url, "self", resp);
    }
}
