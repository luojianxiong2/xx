<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>SpringMVC测试视图</title>
<link rel="stylesheet" style="text/css" href="/springmvc_2/public/css/my.css"/>
<script type="text/javascript" src="/springmvc_2/public/js/jquery-1.8.3.js"></script>
<script type="text/javascript">
	alert($);
</script>
</head>
<body>
	<h1>SpringMVC测试视图</h1>
	<h1 class="txtfont">接收共享数据:${requestScope.STR}&nbsp;&nbsp;${requestScope.ARR}</h1>
	<img alt="凤姐" src="/springmvc_2/public/images/3.jpg"/>
</body>
</html>