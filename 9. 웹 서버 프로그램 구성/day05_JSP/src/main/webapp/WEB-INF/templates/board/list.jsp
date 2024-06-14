<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<h1>게시글 목록</h1>

<%--items는 속성명이고 $안에 있는 items는 리스트값인데 그 리스트 값이 var에 담겨서 카운트되어 반복 출력--%>
<%--${item.속석명}을 통해 자동으로 getter 호출--%>
<ul>
<c:forEach var="item" items="${items}" varStatus="status">
    <li>
        ${item.subject} / ${item.content} / ${item.poster} / ${item.regDt}
        <div>
            index: ${status.index} / count: ${status.count} / first: ${status.first} / last: ${status.last} / current: ${status.current}
        </div>
    </li>
</c:forEach>
</ul>