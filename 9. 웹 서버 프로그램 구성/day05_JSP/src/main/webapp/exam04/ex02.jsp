<%@ page contentType="text/html; charset=UTF-8" %>
<%--num이 속성명이면서 변수로 작동되어 동일하게 접근 가능--%>
<%--범위가 좁을 수록 먼저 적용 그래서 출력화면에 300출력--%>
<%
    application.setAttribute("num", 100);
    request.setAttribute("num", 200);
    pageContext.setAttribute("num", 300);

    pageContext.setAttribute("max-num", 1000);
%>

<%--해당 범위에 있는 속성을 가져올 수 있다(값 조회)--%>
pageContext.num : ${pageScope.num}<br>
request.num : ${requestScope.num}<br>
application.num : ${application['num']}<br>

<%--해당 범위에 있는 속성을 가져올 수 있다(값 조회)--%>
max-num : ${pageScope['max-num']}<br>