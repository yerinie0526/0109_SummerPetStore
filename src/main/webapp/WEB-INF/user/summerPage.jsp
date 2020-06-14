<%@ include file="../IncludeTop.jsp" %>

<table style="border:none;border-collapse:collapse;width:100%">
<tr>
	<td>용품</td>
</tr>
<c:foreach var="si" items="${sList}">
	<tr>
		<td><a href="<c:url value='/spetstore/spetitem/detail?itemId=${mi.itemId}'/>">${ai.name}</a></td>
	</tr>
	<tr>
		<td>
			[item pic]
		</td>
		<td>
			<table>
				<tr><td>${mi.itemId}</td></tr>
				<tr><td>${mi.istatus}</td></tr>
				<tr><td>${mi.price}</td></tr>
			</table>
		</td>
	</tr>
</c:foreach>
<tr>
	<td>진행중인 경매</td>
</tr>
<c:foreach var="ai" items="${aList}">
	<tr>
		<td><a href="<c:url value='/spetstore/auction/detail?itemId=${ai.auctionId}'/>">${ai.name}</a></td>
	</tr>
	<tr>
		<td>
			[item pic]
		</td>
		<td>
			<table>
				<tr><td>${ai.actionId}</td></tr>
				<tr><td>${ai.astatus}</td></tr>
				<tr><td>${ai.minPrice}</td></tr>
				<tr><td>${ai.curMaxPrice}</td></tr>
			</table>
		</td>
	</tr>
</c:foreach>
<tr>
	<td>진행중인 공동구매</td>
</tr>
<c:foreach var="gp" items="${spetgpList}">
	<tr>
		<td><a href="<c:url value='/spetstore/gp/detail?itemId=${gp.itemId}'/>">${gp.name}</a></td>
	</tr>
	<tr>
		<td>
			[item pic]
		</td>
		<td>
			<table>
				<tr><td>${gp.itemId}</td></tr>
				<tr><td>${gp.gpstatus}</td></tr>
				<tr><td>${gp.price}</td></tr>
				<tr><td>${gp.sale}</td></tr>
			</table>
		</td>
	</tr>
</c:foreach>
</table>

<%@ include file="../IncludeBottom.jsp" %>