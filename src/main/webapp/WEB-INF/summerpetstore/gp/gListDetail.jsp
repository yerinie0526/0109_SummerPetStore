<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>gListdetail</title>
        <style>
        	table {
        		text-align : center;
        		border-collapse : collapse;
        		border : 1px solid
        	}
        	tr, td {
        		text-align : center;
        		border-collapse : collapse;
        		border : 1px solid
        	}
        </style>
    </head>
<body>
<table>
	<tr>
		<td>제품 명</td>
		<td>${gpInfo.name}</td>
	</tr>
	<tr>
		<td>제품 번호</td>
		<td>${gpInfo.itmeId}</td>
	</tr>
</table>
<a href="gpApply">참가</a>
</body>
</html>