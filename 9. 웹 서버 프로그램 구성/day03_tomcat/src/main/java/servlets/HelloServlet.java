package servlets;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class HelloServlet extends HttpServlet {
    // get은 조회 post는 작성 이에 대한 메서드 확인

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // HttpServletRequest HttpServletResponse 요청과 응답
        // 위의 2개의 객체를 톰캣이 생성
        // 사용자 url 주소 servlet 클래스를 연결

        //System.out.println("안녕하세요~!");
        System.out.println("doGet출력");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("init출력");
    }

    @Override
    public void destroy() {
        System.out.println("destroy출력");
    }
}
