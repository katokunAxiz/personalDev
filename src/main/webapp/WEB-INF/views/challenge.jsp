<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:if test="${not empty purpose}">
  <p class="changed">${fn:escapeXml(purpose)}</p>
</c:if>

<c:if test="${not empty trigger}">
  <p class="changed">${fn:escapeXml (trigger)}</p>
</c:if>
<c:if test="${not empty top}">
  <p class="changed">${fn:escapeXml (top)}</p>
</c:if>
<div>
  <a href="question">もどる</a>
</div>
<div>
  <a href="challengeConfirm">挑戦！</a>
</div>
</body>
</html>