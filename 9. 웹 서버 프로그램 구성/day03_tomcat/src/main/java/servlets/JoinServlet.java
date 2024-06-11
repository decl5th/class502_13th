package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class JoinServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html"); // content-type는 UTF-8으로 설정해서 한글이 출력되도록 설정
        //resp.setCharacterEncoding("UTF-8");
        PrintWriter out = resp.getWriter();
        out.println("<h1>회원가입</h1>"); // 한글이 깨져서 출력 why? content-type을 알려주지 않았기 때문

    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
