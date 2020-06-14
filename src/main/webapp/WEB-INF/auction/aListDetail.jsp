<%@ include file="../IncludeTop.jsp" %>

<p>${auctionModel.name}</p>
<ul>
	<li> 마감  ${auctionModel.deadline}</li>
	<li> 현재 최고 가격 : ${auctionModel.curMaxPrice} </li>
	<li> 물품 번호 : ${auctionModel.auctionId}</li>
	<li> 동물 종 : ${auctionModel.categoryId}</li>
	<li> 상품 종류 : ${auctionModel.ItemKind}</li>
	<li> 거래 방식 : ${auctionModel.pMethod}</li>
	<li> 최저가 : ${auctionModel.minPrice}</li>
	<li> 상세 설명 : ${auctionModel.description}</li>
</ul>

<p><a href="<c:url value='/spetstore/auction/priceregister' />">가격 제시/수정하기</a></p>

<%@ include file="../IncludeBottom.jsp" %>