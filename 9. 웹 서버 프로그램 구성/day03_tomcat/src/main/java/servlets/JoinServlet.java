package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class JoinServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8"); // content-type는 UTF-8으로 설정해서 한글이 출력되도록 설정
        //resp.setCharacterEncoding("UTF-8");
        PrintWriter out = resp.getWriter();
        out.println("<h1>회원가입</h1>"); // 한글이 깨져서 출력 why? content-type을 알려주지 않았기 때문
        out.println("<form action='join' method='POST'>");
        out.println("이메일:<input type='text' name='email'><br>");
        out.println("비밀번호:<input type='password' name='password'><br>");
        out.println("비번 확인: <input type='password' name='confirmPassword'><br>");
        out.println("회원명: <input type='text' name='userName'><br>");
        out.println("취미:<input type='checkbox' name='hobby' value='football'>축구<br>");
        out.println("취미:<input type='checkbox' name='hobby' value='photography'>사진<br>");
        out.println("취미:<input type='checkbox' name='hobby' value='game'>게임<br>");
        out.println("취미:<input type='checkbox' name='hobby' value='movie'>영화<br>");
        out.println("취미:<input type='checkbox' name='hobby' value='drive'>드라이브<br>");

        out.println("<button type='submit'>회원가입</button>");
        out.println("</form>");

    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8"); // 서블릿 4버전까지 코드 입력해야함
        // 기본 유니코드 2바이트 형식, 서블릿 6버전부터 기본 유니코드가 3바이트로 한글이 깨지지 않음

        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String confirmPassword = req.getParameter("confirmPassword");
        String userName = req.getParameter("userName");
        String[] hobbies = req.getParameterValues("hobby"); // getParameter()는 데이터 하나만 조회

        System.out.printf("email = %s, password = %s, confirmPassword = %s, userName = %s%n", email, password, confirmPassword, userName);
        Arrays.stream(hobbies).forEach(s -> System.out.printf("hobby = %s%n", s));
    }
}
