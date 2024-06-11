package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class LoginServlet extends HttpServlet {
    // private int num; 인스턴스 변수 정의 -> 지양 why? 동시성의 문제로 설정한 값이 통제를 벗어나기 때문에
    // 쓰레드에서 여러개로 접근하다가 음수 나왔던 예제가 대표적인 예
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("로그인!");
    }
}
