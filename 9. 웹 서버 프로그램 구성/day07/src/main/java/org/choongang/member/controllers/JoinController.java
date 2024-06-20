package org.choongang.member.controllers;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.choongang.global.exceptions.CommonException;
import org.choongang.member.services.JoinService;
import org.choongang.member.services.MemberServiceProvider;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/member/join")
public class JoinController extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/templates/member/join.jsp");
        rd.forward(req, resp);
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //여기에 서비스 연동(추가)
        try {
            JoinService service = MemberServiceProvider.getInstance().joinService();
            service.process(req); // req가 정의되어 있지 않으니 서비스 내부에서 정의해서 변환시키겠음
        } catch (CommonException e) {
            // alert 형태로 자바스크립트를 띄울 건데 태그 안에서 contentType이 text/html이 되어야 함
            resp.setContentType("text/html; charset=UTF-8");
            resp.setStatus(e.getStatus());
            PrintWriter out = resp.getWriter();
            out.printf("<script>alert('%s');</script>", e.getMessage());

        }
    }
}
