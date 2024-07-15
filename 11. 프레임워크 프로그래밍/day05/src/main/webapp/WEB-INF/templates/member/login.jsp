<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<c:url var="actionUrl" value="/member/join" />
<h1>
    <spring:message code="로그인" />
</h1>
<form:form method="POST" action="${actionUrl}" autocomplete="off" modelAttribute="requestJoin">
    <dl>
    <dt>
    <spring:message code="이메일" />
    </dt>
    <dd>
    <form:input path="email"/>
    <form:errors path="email"/>
    </dd>
    </dl>
    <dl>
    <dt>
    <spring:message code="비밀번호" />
    </dt>
    <dd>
    <form:password path="password" />
    <form:errors path="password" />
    </dd>
    </dl>
    <div class="save-email">
        <input type="checkbox" name="saveEmail" value="true" id="saveEmail"${cookie.savedEmail == null ? '' : ' checked'}>
        <label for="saveEmail">
            <spring:message code="이메일_기억하기" />
        </label>
    </div>
    <button type="submit">
        <spring:message code="로그인하기" />
    </button>
</form:form>