<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<caption>今までのお片づけ一覧</caption>
		<thead>
			<tr>
				<th>日付</th>
				<th>モノ1</th>
				<th>モノ2</th>
				<th>モノ3</th>
				<th>目的</th>
				<th>きっかけ</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${result}" var="result">
				<tr>
					<td>${fn:escapeXml(result.date)}</td>
					<td>${fn:escapeXml(result.object1}</td>
					<td>${fn:escapeXml(result.object2)}</td>
					<td>${fn:escapeXml(result.object3)}</td>
					<td>${fn:escapeXml(result.purpose)}</td>
					<td>${fn:escapeXml(result.trigger)}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

	<div>
  <a href="menu">メニュー</a>
</div>
</body>
</html>