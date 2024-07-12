<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:url var="actionUrl" value="/member/join" />
${commonValue} <!-- 명시한 속성값 -->

<h1>회원 가입</h1>

<form:form method="POST" action="${actionUrl}" autocomplete="off" modelAttribute="requestJoin">
    <dl>
        <dt>이메일</dt>
        <dd>
            <!--<input type="text" name="email" value="${requestJoin.email}">-->
            <form:input type="email" path="email" />
        </dd>
    </dl>
    <dl>
        <dt>비밀번호</dt>
        <dd>
            <!--<input type="password" name="password">-->
            <form:password path="password" />
        </dd>
    </dl>
    <dl>
        <dt>비밀번호 확인</dt>
        <dd>
            <!--<input type="password" name="confirmPassword">-->
            <form:password path="confirmPassword" />
        </dd>
    </dl>
    <dl>
        <dt>회원명</dt>
        <dd>
            <!--<input type="text" name="userName">-->
            <form:input path="userName" />
        </dd>
    </dl>
    <dl>
        <dt>취미</dt>
        <dd>
            <!--
            ${requestJoin.hobby[1]}
            콜렉션에 들어간 값 조회
            -->
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
    <dl>
        <dt>약관동의</dt>
        <dd>
            <!--
           <input type="checkbox" name="agree" value="true" id="agree">
           <label for="agree">회원가입 약관에 동의합니다.</label>
           -->
            <form:checkbox path="agree" value="true" label="회원가입 약관에 동의합니다." />
       </dd>
   </dl>
   <button type="submit">가입하기</button>
</form:form>