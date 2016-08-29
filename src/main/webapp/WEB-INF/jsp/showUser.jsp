<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>用户列表</title>
</head>
<body>
	<table>
		<c:forEach items="${userList}" var="user">
			<tr height="10px">
				<td>${user.userName}</td>
				<td>${user.isOpen}</td>
				<td>${user.isAva}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
