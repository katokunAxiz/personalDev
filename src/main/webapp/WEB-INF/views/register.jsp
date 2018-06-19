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
	<form:form action="insertConfirm" method="post" modelAttribute="insertForm">
  <fieldset class="label-60">
    <div>
      <label class="required">ニックネーム</label><form:input path="name" />
    </div>
     <div>
      <label class="required">パスワード</label><form:input path="name" />
    </div>
	</fieldset>
  <input type="submit" value="確認">
  <div>
  <a href="question">モック</a>
</div>
</form:form>

</body>
</html>