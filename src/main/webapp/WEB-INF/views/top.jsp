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
<title>登録画面</title>
<link href="/css/commons.css" rel="stylesheet">
</head>
<body>
<p>パパット<br>
<!-- <span class="required"></span>は必須です</p>
 -->
<c:if test="${not empty errmsg}">
  <p class="error">${fn:escapeXml(errmsg)}</p>
</c:if>

<form:form action="top" method="post" >
  <fieldset class="label-60">
    <div>
      <label>ニックネーム</label><input type="text" name="name" value="${fn:escapeXml(param.name)}">
    </div>

  </fieldset>
  <input type="submit" value="確認">
</form:form>


<div>
  <a href="register">新規登録はこちら</a>
</div>
<div>
  <a href="decription">パパットとは</a>
</div>
</body>
</html>
