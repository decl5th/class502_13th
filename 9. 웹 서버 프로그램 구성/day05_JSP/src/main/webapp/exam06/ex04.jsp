<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<h1>ex04.jsp - 상단</h1>
<%--
<c:import url="inc.jsp"/>
${html}
${html}
<h1>ex04.jsp - 하단</h1>
--%>

<c:import url="inc.jsp">
    <c:param name="num1" value="100" />
    <c:param name="num2" value="200" />
</c:import>

<h1>ex04.jsp - 하단</h1>