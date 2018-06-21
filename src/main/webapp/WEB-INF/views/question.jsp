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
<SCRIPT LANGUAGE="JavaScript">
function FuncSetText()
{
var frm=document.forms[0];
var idx = frm.cmb.selectedIndex;
if (-1 != idx)
frm.txt.value = frm.cmb.options[idx].text; 
}
</SCRIPT>
</head>
<body>
	<div>
		<div>
			<select name="purpose" title>
				<option value="選択肢1">選択肢1</option>
				<option value="選択肢2">選択肢2</option>
				<option value="選択肢3">その他</option>
			</select>
		</div>
		<div>
				
		</div>
		<div>
			<a>何で片付けたいの?</a> <label></label><input type="text" name="name"
				value="${fn:escapeXml(param.name)}">
		</div>
		<a href="condition">これで</a>
	</div>
</body>
</html>