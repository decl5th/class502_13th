<%@ page contentType="text/html; charset=UTF-8" %>
<h1>ex03.jsp</h1>

<%-- 페이지 이동이 이루어지는 예시 url 변경되어 있고 응답코드 302 --%>
<%
    response.sendRedirect("ex02.jsp");
%>