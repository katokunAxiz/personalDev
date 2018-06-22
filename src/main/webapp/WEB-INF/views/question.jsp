<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>


</head>
<body>
	<c:if test="${not empty errmsg}">
		<p class="error">${fn:escapeXml(errmsg)}</p>
	</c:if>

	<form:form action="challenge" method="post">
		<fieldset class="label-60">
			<div>
				<div id=object>
					片づけしたいものは何ですか？ <label>その1</label><input type="text" name="object1"
						value="${fn:escapeXml(param.object1)}"> <label>その2</label><input
						type="text" name="object2" value="${fn:escapeXml(param.object2)}">
					<label>その3</label><input type="text" name="object3"
						value="${fn:escapeXml(param.object3)}">
				</div>
				<div id=purpose>
					なぜ片付けたいですか？ <select>
						<option value="${fn:escapeXml(param.purpose)}">選択肢1</option>
						<option value="${fn:escapeXml(param.purpose)}">選択肢2</option>
						<option value="${fn:escapeXml(param.purpose)}">選択肢3</option>
					</select>
				</div>
				<div id=trigger>
					片付けるきっかけを記入してください <label></label><input type="text" name="trigger"
						value="${fn:escapeXml(param.trigger)}">
				</div>
			</div>
		</fieldset>
		<input type="submit" value="OK">
	</form:form>

</body>
</html>