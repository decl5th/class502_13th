<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<c:set var="num" value="10" />
<c:if test="${num % 2 == 1}">
홀수 입니다.
</c:if>
<%--else if와 같이 기능 --%>
<c:if test="${!(num % 2 == 1)}">
짝수 입니다.
</c:if>
<br>

<%--간단한 조건식은 EL 삼항 조건식을 통해서 표현--%>
${num % 2 == 1 ? '홀수입니다.' : '짝수 입니다.'}