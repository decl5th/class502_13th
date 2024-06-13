<%@ page contentType="text/html; charset=UTF-8" %>

<h1>ex01_via 페이지</h1>

<%
    request.setCharacterEncoding("UTF-8");
    String id = request.getParameter("id");
    String pw = request.getParameter("password");

    out.print("id: " + id);
    out.print("<br>");
    out.print("pw: " + pw);
    out.print("<br>");

    System.out.println("버퍼에서 지워져 화면에 안보이는 via 페이지");
%>

<jsp:forward page="ex01_result.jsp">
    <jsp:param name="age" value="30" />
</jsp:forward>

