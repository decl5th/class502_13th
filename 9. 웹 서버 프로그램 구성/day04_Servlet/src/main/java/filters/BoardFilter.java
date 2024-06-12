package filters;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import org.junit.jupiter.api.Order;

import java.io.IOException;


@WebFilter("/board/*")
@Order(1)
public class BoardFilter implements Filter {
   // 요청과 응답 사이에서 걸러주는 기능
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        System.out.println("BoardFilter - 요청 전");

        chain.doFilter(request, response); // ✔중요✔ 다음 필터 또는 서블릿의 처리 메서드 실행

        System.out.println("BoardFilter - 응답 후");
    }
}
