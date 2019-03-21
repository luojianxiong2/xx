<%@ page language="java" pageEncoding="UTF-8"
	contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>会员列表</title>
</head>

<body>
	<table border="1" width="500">
		<tr>
			<th>序号</th>
			<th>姓名</th>
			<th>操作</th>
		</tr>
		<c:forEach varStatus="i" items="${LIST}" var="temp">
		<tr>
			<td>${i.count}</td>
			<td>${temp.personName}</td>
			<td><a href="/springmvc_2/person/load?id=${temp.personId}">查看详情</a>&nbsp;<a href="/springmvc_2/person/del?id=${temp.personId}">移除</a></td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>