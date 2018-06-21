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
<c:if test="${not empty errmsg}">
  <p class="error">${fn:escapeXml(errmsg)}</p>
</c:if>
<form:form action="nameChange" method="post" >
  <fieldset class="label-60">
    <div>
      <label>ニックネーム</label><input type="text" name="newname" value="${fn:escapeXml(param.name)}">
    </div>
  </fieldset>

  <input type="submit" value="これでよし">
</form:form>
  <div>
  <a href="menu">やーめた</a>
</div>
</body>
</html>