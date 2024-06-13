<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page isErrorPage="true" %>
<h1>Error 발생!!</h1>

<%=exception.getMessage()%>
<%
    exception.printStackTrace();
%>