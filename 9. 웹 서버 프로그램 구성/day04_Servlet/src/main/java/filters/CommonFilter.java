package filters;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;

//@WebFilter("/*")
public class CommonFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init 출력 확인");
        String key1 = filterConfig.getInitParameter("key1");
        String key2 = filterConfig.getInitParameter("key2");
        System.out.printf("key1 = %s, key2 = %s%n", key1, key2);
    }

    @Override
    public void destroy() {
        System.out.println("destroy 출력 확인");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

       // System.out.println("CommonFilter - 요청 전"); 이렇게 코드를 직접 정의하면 좋지 않으니 wrapper 보내자

        chain.doFilter(new CommonRequestWraaper(request), response);

        //System.out.println("CommonFilter - 응답 후");
    }
}
