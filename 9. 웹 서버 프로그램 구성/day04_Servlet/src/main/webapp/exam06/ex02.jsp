<%@ page contentType="text/html; charset=UTF-8" %>
<%-- 여기서는 key1의 값은 null 출력 왜? pageContext는 현재의 페이지에서만 조회가 가능한데 여기는 ex02이기 때문에 --%>
<%-- 하지만 request로 메서드가 들어가면 하나의 요청이 처리되는 범위에서 가능하기 때문에 value 출력됨  --%>

<%
    String key1 = (String)pageContext.getAttribute("key1");
    //String key1 = (String)request.getAttribute("key1");
%>

<div>
ex02-key1: <%=key1%>
</div>