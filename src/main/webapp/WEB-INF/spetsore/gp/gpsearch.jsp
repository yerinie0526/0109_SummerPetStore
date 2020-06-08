<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>gpsearch.jsp</title>
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
	<h2>공동구매 리스트</h2>
	<table>
		<tr>
			<td>이름</td>
			<td>물품 번호</td>
		</tr>
		<c:forEach var="gp" items="${gpLists}">
			<tr>
				<td> <a href="<c:url value='/spetstore/item?itemId=${gpLists.itemId}'/>">${gp.name}</a></td>
				<td> ${gp.itemId}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>