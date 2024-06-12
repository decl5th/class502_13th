package filters;

import jakarta.servlet.ServletRequest;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletRequestWrapper;

public class CommonRequestWraaper extends HttpServletRequestWrapper {

    public CommonRequestWraaper(ServletRequest request) {
        super((HttpServletRequest) request); // super 제거하면 오류 왜? 상위 클래스에 기본 생성자가 없기 때문에 -> request

        // 요청 전 공통 처리 부분
        System.out.println("요청 전 공통 처리 코드....");
    }
}
