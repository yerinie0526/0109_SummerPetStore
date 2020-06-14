<%@ include file="../IncludeTop.jsp" %>

<table style="border:none;border-collapse:collapse;width:100%">
	<tr>
		<td>Search Item by condition</td>
	</tr>
	<tr>
		<td>
			<form action="<c:url value="/shop/acution/aSearch.do"/>" method="post">
		      	<select name="categoryId"> 
		      		<option value="">--Select pet kind--</option>
		      		<option value="1">dog</option>
		      		<option value="2">cat</option>
		      		<option value="3">fish</option>
		      	</select>
		      	<select name="itemKind"> <!-- itemKind 보기 생각해보기 -->
		      		<option value="">--Select itemkind--</option>
		      		<option value="1">bath product</option>
		      		<option value="2">feeding Item</option>
		      		<option value="3">care Item</option>
		      	</select>
		        <input type="text" name="keyword" size="14" />
		        <input type="submit" value="search">
		   </form>
		</td>
		<td>
			<select name="astatus"> 
		      	<option value="1" selected="selected">All</option>
		      	<option value="2">In progress</option>
		      	<option value="3">Expired</option>
		    </select>
		    <select name="order">
		      	<option value="1">popular</option>
		      	<option value="2" selected="selected">date</option>
		   </select>
		</td>
		<td>
			<a href="/spetstore/auction/aregister">경매 등록하기</a>
		</td>
	</tr>
</table>
<table style="border:none;border-collapse:collapse;width:100%">
<c:foreach var="ai" items="${aList}">
	<tr>
		<td><a href="<c:url value='/spetstore/auction/detail?auctionId=${ai.auctionId}'/>">${ai.name}</a></td>
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
		<td>
			${ai.deadline}
		</td>
	</tr>
</c:foreach>
</table>
<%@ include file="../IncludeBottom.jsp" %>