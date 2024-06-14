<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.time.*" %>

<jsp:useBean id="now" class="java.time.LocalDateTime" />
<%--시간과 날짜가 출력되는지 체크 출력안됨 왜? 기본생성자가 없기 때문에--%>
${now}
