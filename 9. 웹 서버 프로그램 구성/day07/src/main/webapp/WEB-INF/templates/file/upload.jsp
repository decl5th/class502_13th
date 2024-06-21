<%--업로드 양식 페이지--%>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<c:url var="actionUrl" value="/file/upload" />

<%--post 형식으로 해야 파일이 업로드 진행--%>
<form method="post" action="${actionUrl}">
    제목 : <input type="text" name="subject"><br>
    내용 : <input type="text" name="content"><br>
    파일첨부 : <input type="file" name="file"><br>
    <button type="submit">작성하기</button>
</form>