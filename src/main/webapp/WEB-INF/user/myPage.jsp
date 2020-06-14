<%@ include file="../IncludeTop.jsp" %>

<table style="border:none;border-collapse:collapse;width:100%">
<tr>
	<td> <a href="<c:url value="/shop/editAccount.do"/>">내 정보 수정</a></td>
</tr>
<tr>
	<td>경매</td>
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
	<td>내가 참여한 공동구매</td>
</tr>
<c:foreach var="gp" items="${gpList}">
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
<tr>
	<td>팝니다(내가 장터에 올린 물품)</td>
</tr>
<c:foreach var="mi" items="${mList}">
	<tr>
		<td><a href="<c:url value='/spetstore/market/detail?itemId=${mi.itemId}'/>">${ai.name}</a></td>
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
 <td><b><a href='<c:url value="/shop/listOrders.do"/>'>My Orders</a></b></td>
 </tr>
</table>

<%@ include file="../IncludeBottom.jsp" %>