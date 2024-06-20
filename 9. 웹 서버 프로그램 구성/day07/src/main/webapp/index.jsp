<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<c:url var="loginUrl" value="/member/login" />
<c:url var="joinUrl" value="/member/join" />
<c:url var="logoutUrl" value="/member/logout" />
<%--
    pageContext.setAttribute("member", "..");
    request.setAttribute("member", "...");
    == ${member}
--%>


<c:if test="${sessionScope.member == null}">
    <a href="${loginUrl}">로그인</a>
    <a href="${joinUrl}">회원가입</a>
</c:if>

<%--null 값이 아니면 로그인 상태--%>
<c:if test="${sessionScope.member != null}">
    ${sessionScope.member.userName}(${sessionScope.member.email})님 로그인...
    <a href="${logoutUrl}">로그아웃</a>
</c:if>

