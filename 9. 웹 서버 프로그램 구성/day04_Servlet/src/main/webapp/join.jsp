<%@ page contentType="text/html; charset=UTF-8" %>

<%-- 스크립틀릿 --%>
<%
 // _jspService() 지역 내부
    int num1 = 100;
    int num2 = 200;
    int result = num1 + num2;
    out.write("result=" + result);

    out.write("<br>이름:" + name);
    print();
%>
<br>

<%-- JSP 주석(번역 X) ... --%>
<%--
<%=num1%> + <%=num2%> = <%=result%>
--%>

<%-- 선언문 --%>
<%!
 // 클래스명 바로 아래쪽 - 멤버 변수 재확인
    String name = "이이름";
    void print() {
        System.out.println(name);
    }
%>

