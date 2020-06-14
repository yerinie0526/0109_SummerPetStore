<%@ include file="../IncludeTop.jsp" %>

<h2>${apriceregist.name}</h2>
<p>가격 제시 완료!</p>
<table>
	<c:set var="aNum" value="1"/>
	<c:foreach var="jpi" items="${aJPTop5}">
	<tr>
		<td> <c:out value="${eNum}"/>등 : ${aJPTop5.offerPrice}</td>
	</tr>
	<c:set var="eNum" value="${aNum+1}"/>
	</c:foreach>
</table>
<p>나의 가격 : ${apriceregist.myaPrice}</p>
<%@ include file="../IncludeBottom.jsp" %>