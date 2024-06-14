<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="board.entities.BoardData" %>

<jsp:useBean id="item" class="board.entities.BoardData" scope="request" />
<%--request 범위로 넘겨서 양식 데이터 넘기면 DTO과정에서 값은 자동으로 넘어가도록 할 수 있음 단 프로퍼티가 동일해야함--%>
<jsp:setProperty name="item" property="subject" />
<jsp:setProperty name="item" property="content" />
<jsp:setProperty name="item" property="poster"  />

<%-- 이렇게 안씀 잘 EL식으로 더 간단하게 표현 가능
제목: <jsp: getProperty name="item" property="subject" /><br>
내용: <jsp: getProperty name="item" property="content" /><br>
작성자: <jsp: getProperty name="item" property="poster" /><br>
--%>

<%--
제목: ${item.getSubject()}<br>
--%>

<%--최종 간단식 속성명만 언급하더라도 표현 가능--%>
제목: ${item.subject}<br>
내용: ${item.content}<br>
작성자: ${item.poster}<br>


