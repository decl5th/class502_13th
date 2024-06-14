<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<%--속성별로 범위 확인하는 법
    pageScope| requestScope | sessionScope | applicationScope
    기본값 pageScope
--%>
<c:set var="num1" value="100" />

<%--속성의 범위 변경 --%>
<c:set var="num1" value="200" scope="request" />
<c:set var="num1" value="300" scope="application" />

<%--속성 값 제거 remove scope 범위지정 안해서 모든 범위 값 삭제
<c:remove var="num1" />
--%>

<%--속성 값 제거 remove scope 범위지정 --%>
<c:remove var="num1" scope="page" />
<c:remove var="num1" scope="request" />

pageScope.num1 : ${pageScope.num1}<br>
requestScope.num1 : ${requestScope.num1}<br>
sessionScope.num1 : ${sessionScope.num1}<br>
applicationScope.num1 : ${applicationScope.num1}<br>