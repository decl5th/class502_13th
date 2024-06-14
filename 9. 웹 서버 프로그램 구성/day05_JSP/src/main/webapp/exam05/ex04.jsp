<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<%--나이에 따른 아이들 신분 기준 정하기--%>

<c:choose>
    <c:when test="${param.age < 8}">
        유딩
    </c:when>
    <c:when test="${param.age < 14}">
        잼민
    </c:when>
    <c:when test="${param.age < 17}">
        흑염룡
    </c:when>
    <c:when test="${param.age < 20}">
        고딩
    </c:when>
    <c:otherwise>
        성인
    </c:otherwise>
</c:choose>
