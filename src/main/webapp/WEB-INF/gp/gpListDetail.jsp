<%@ include file="../IncludeTop.jsp" %>

<h2>${GpModel.name}</h2>
<ul>
	<li> 마감  ${GpModel.deadline}</li>
	<li> 물품 번호 : ${GpModel.itemId}</li>
	<li> 동물 종 : ${GpModel.categoryId}</li>
	<li> 상품 종류 : ${GpModel.ItemKind}</li>
	<li> 상세 설명 : ${GpModel.description}</li>
	<li> 가격 : ${GpModel.item.price}</li>
</ul>

<h2>${GpModel.numOfcon}명 공동구매시, ${sale} % 할인 된 ${GpModel.gpprice}원</h2>
<p>${GpModel.numOfcon}(목표 정원)/${GpModel.currentCon}(현재 참여자 수)</p>

<p><a href="<c:url value='/spetstore/gp/gpsuc?itemId=${GpModel.itemId}' />">참가</a></p>

<%@ include file="../IncludeBottom.jsp" %>