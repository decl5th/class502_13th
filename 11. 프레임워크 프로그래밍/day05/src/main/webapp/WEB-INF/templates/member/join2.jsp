<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<c:url var="actionUrl" value="/member/join" />
${commonValue} <!-- 명시한 속성값 -->
<br>
<%--
<spring:message code="LOGIN_MSG" arguments="user01,USER01"/>
--%>
<spring:message code="LOGIN_MSG">
    <spring:argument value="사용자01" />
    <spring:argument value="USER01" />
</spring:message>
<h1>
    <spring:message code="회원가입" />
</h1>

<form:form method="POST" action="${actionUrl}" autocomplete="off" modelAttribute="requestJoin">

    <dl>
        <dt>
            <spring:message code="이메일" />
        </dt>
        <dd>
            <form:input path="email" cssClass="input-txt" cssStyle="border-color: red;"/>
            <%--
            <input type="text" name="email" value="${requestJoin.email}">
            <form:input type="email" path="email" />
            --%>
        </dd>
    </dl>
    <dl>
        <dt>
            <spring:message code="비밀번호"/>
        </dt>
        <dd>
            <!--<input type="password" name="password">-->
            <form:password path="password" />
        </dd>
    </dl>
    <dl>
        <dt>
            <spring:message code="비밀번호_확인" />
        </dt>
        <dd>
            <!--<input type="password" name="confirmPassword">-->
            <form:password path="confirmPassword" />
        </dd>
    </dl>
    <dl>
        <dt>
            <spring:message code="회원명" />
        </dt>
        <dd>
            <!--<input type="text" name="userName">-->
            <form:input path="userName" />
        </dd>
    </dl>
    <%--
    <dl>
        <dt>취미</dt>
        <dd>
            <form:radiobuttons path="hobby" items="${hobbies2}" itemLabel="code" itemValue="value" />

                <form:select path="hobby">
                    <option value=''>- 선택하세요 -</option>
                    <form:option value="hobby0" label="취미0" />
                    <form:options items="${hobbies2}" itemLabel="code" itemValue="value"/>
                </form:select>
                
            <form:select path="hobby" items="${hobbies}" />

            ${requestJoin.hobby[1]}
            콜렉션에 들어간 값 조회

            <form:checkboxes path="hobby" items="${hobbies}" />

        </dd>
    </dl>
    <dl>
        <dt>주소</dt>
        <dd>
                                <!--중복된 커맨드 객체의 매핑-->
            <form:input path="addr.zipCode" placeholder="우편번호" />
            <form:input path="addr.address" placeholder="주소" />
            <form:input path="addr.addressSub" placeholder="나머지 주소" />
        </dd>
    </dl>
    --%>
    <dl>
        <dt>
            <spring:message code="약관동의" />
        </dt>
        <dd>
            <!--
           <input type="checkbox" name="agree" value="true" id="agree">
           <label for="agree">회원가입 약관에 동의합니다.</label>
           -->
            <form:checkbox path="agree" value="true" label="회원가입 약관에 동의합니다." />
       </dd>
   </dl>
   <button type="submit">
       <spring:message code="가입하기" />
   </button>
</form:form>