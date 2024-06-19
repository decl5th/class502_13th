<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="layout" tagdir="/WEB-INF/tags/layouts" %>
<c:url var="actionUrl" value="/member/join" />
<layout:main title="회원가입">
    <h1>회원가입</h1>
    <form method="post" action="${actionUrl}" autocomplete="off">
        <dl>
            <dt>email</dt>
            <dd>
                <input type="text" name="email">
            </dd>
        </dl>
        <dl>
            <dt>password</dt>
            <dd>
                <input type="password" name="password">
            </dd>
        </dl>
        <dl>
            <dt>confirm pw</dt>
                <dd>
                    <input type="password" name="confirmPassword">
                </dd>
        </dl>
        <dl>
            <dt>username</dt>
               <dd>
                   <input type="text" name="userName">
               </dd>
        </dl>
        <div>
            <input type="checkbox" name="termsAgree" value="true" id="termsAgree">
            <label for="termsAgree">회원가입 약관에 동의합니다.</label>
        </div>
        <button type="submit">가입하기</button>
    </form>
</layout:main>