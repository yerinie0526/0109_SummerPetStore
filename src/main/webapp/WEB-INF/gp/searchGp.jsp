<%@ include file="../IncludeTop.jsp" %>

<table style="border:none;border-collapse:collapse;width:100%">
	<tr>
		<td>Search Item by condition</td>
	</tr>
	<tr>
		<td>
			<form action="<c:url value="/spetstore/acution/SearchGp.do"/>" method="post">
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
	</tr>
</table>
<table style="border:none;border-collapse:collapse;width:100%">
<c:foreach var="gp" items="${gpList}">
	<tr>
		<td>${gp.name}</td>
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
		<td>
			${gp.deadline}
		</td>
	</tr>
</c:foreach>
</table>
<%@ include file="../IncludeBottom.jsp" %>