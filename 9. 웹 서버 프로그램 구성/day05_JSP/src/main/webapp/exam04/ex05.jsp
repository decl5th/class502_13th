<%@ page contentType="text/html; charset=UTF-8" %>
<%--user-agent : 브라우저 정보--%>
User-Agent: ${header['User-Agent']}<br>

<%--쿠키 객체가 출력됨--%>
JSESSIONID : ${cookie.JSESSIONID}<br>

<%--getValue 메서드를 통한 쿠키값 문자열 출력--%>
JSESSIONID : ${cookie.JSESSIONID.getValue()}<br>
<%--명칭만 가지고도 호출 가능--%>
JSESSIONID : ${cookie.JSESSIONID.value}<br>

key1 : ${initParam.key1}<br>


URI: ${pageContext.getRequest().getRequestURI()}<br>
URI: ${pageContext.request.requestURI}<br>
