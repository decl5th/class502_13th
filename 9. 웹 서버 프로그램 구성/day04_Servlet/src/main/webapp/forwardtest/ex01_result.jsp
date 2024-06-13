<%@ page contentType="text/html; charset=UTF-8" %>

<h1>ex01_result 페이지</h1>

<%
    request.setCharacterEncoding("UTF-8");
    String id = request.getParameter("id");
    String pw = request.getParameter("password");

    out.print("id: " + id);
    out.print("<br>");
    out.print("pw: " + pw);
    out.print("<br>");
    out.print("<br>");

    String age = request.getParameter("age");
    out.print("age: " + age);

     System.out.println("result 페이지");
%>




