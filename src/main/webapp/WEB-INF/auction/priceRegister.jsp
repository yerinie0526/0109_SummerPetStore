<%@ include file="../IncludeTop.jsp" %>

<p>${apriceregist.name}</p>
<table>
<tr>
	<td>
		<table>
		<c:set var="aNum" value="1"/>
			<c:foreach var="jpi" items="${aJPTop5}">
			<tr>
				<td> <c:out value="${eNum}"/>등 : ${aJPTop5.offerPrice}</td>
			</tr>
			<c:set var="eNum" value="${aNum+1}"/>
			</c:foreach>
		</table>
	</td>
	<td>
		<form:form modelAttribute="apriceregist" action="priceRegistersuc">
			<form:label path="">나의 가격 : </form:label>
			<form:input path="myaPrice" />
			<form:errors path="myaPrice" />
		<input type="submit" value="제시/수정" />
		</form:form> 
	</td>
</tr>
</table>

<%@ include file="../IncludeBottom.jsp" %>