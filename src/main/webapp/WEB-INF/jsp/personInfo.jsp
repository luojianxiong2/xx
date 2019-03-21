<%@ page language="java" pageEncoding="UTF-8"
	contentType="text/html;charset=UTF-8"%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>会员信息</title>
</head>

<body>
	<h3>编号:${PERSON.personId }</h3>
	<h3>姓名:${PERSON.personName }</h3>
	<h3>性别:${PERSON.personSex==0?'男':'女' }</h3>
	<h3>生日:<fmt:formatDate value="${PERSON.personDate}" pattern="yyyy年MM月dd日 "/> </h3>
	<h3>靓照:<img src="/springmvc_2/public/images/${PERSON.personImg}"/></h3>
</body>
</html>