package org.choongang.global.filters;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;

@WebFilter("/*") // * : 모든 요청
public class CommonFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        // 모든 요청에 적용시킬 수 있는 필터로 제작
        chain.doFilter(new CommonRequestWrapper(request), response);
    }
}
