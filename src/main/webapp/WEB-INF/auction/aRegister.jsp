<%@ include file="../IncludeTop.jsp" %>

<form:form modelAttribute="actionModel" action="aRegister">
<p>
	<form:label path="name">상품명 : </form:label>
	<form:input path="name" />
	<form:errors path="name" />
</p>
<p>
	<form:label path="">동물 종 : </form:label>
	<form:select path="categoryIds">
		<option value="">--pet kind--</option>
		<form:options items="${categoryIds}"/>
	</form:select>
	<form:errors path="categoryId" />
</p>
<p>
	<form:label path="">상품 종류 : </form:label>
	<form:select path="itemKinds">
		<option value="">--Item Kind--</option>
		<form:options items="${itemKinds}"/>
	</form:select>
	<form:errors path="itemKind" />
</p>
<p>
	<form:label path="">마감 : </form:label>
	<form:input path="deadline" />
	<form:errors path="dealine" />
</p>
<p>
	<form:label path="">거래 방식 : </form:label>
	<form:radiobuttons items="${pMethods}" path="pMethod"/>
	<form:errors path="pMethod" />
</p>
<p>
	<form:label path="">설명 : </form:label>
	<form:textarea path="description" cols="20" row="3"/>
	<form:errors path="description" />
</p>
<p>
	<form:label path="">최저가 : </form:label>
	<form:input path="minPrice" />
	<form:errors path="minPrice" />
</p>
<input type="submit" value="등록하기" />
<input type="button" value="취소"/>
</form:form>

<%@ include file="../IncludeBottom.jsp" %>