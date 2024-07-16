<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<h1>회원 목록</h1>
<form:form method="get" autocomplete="off" modelAttribute="memberSearch">
    가입일
    <form:input path="sDate" />
    <form:errors path="sDate" />
    ~
    <form:input path="eDate" />
    <form:errors path="sDate" />
    <button type="submit">검색</button>
</form:form>