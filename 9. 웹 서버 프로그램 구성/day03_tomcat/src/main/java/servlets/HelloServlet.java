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

        String common1 = req.getServletContext().getInitParameter("common1");
        System.out.println(common1);
    }
    /*
    @Override
    public void init() throws ServletException {
        System.out.println("init출력");
    }
     */

    @Override
    public void init(ServletConfig config) throws ServletException {
        // HelloServlet만 조회 가능
        String key1 = config.getInitParameter("key1");
        String key2 = config.getInitParameter("key2");
        System.out.printf("key1 = %s, key2 = %s%n", key1, key2);

        // 모든 서블릿이 조회 가능
        String common1 = config.getServletContext().getInitParameter("common1");
        String common2 = config.getServletContext().getInitParameter("common2");
        System.out.printf("common1 = %s, common2 = %s%n", common1, common2);
    }

    @Override
    public void destroy() {
        System.out.println("destroy출력");
    }
}
