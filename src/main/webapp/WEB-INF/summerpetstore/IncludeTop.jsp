<!-- index로 가는 버튼/카트/로그인 유무(로그인한 상태인 경우, 마이페이지 버튼 보임)/itemKind 선택/검색창 및 검색 버튼-->
<%@ page contentType="text/html" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
  <title>SummerPetStore</title>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <meta http-equiv="Cache-Control" content="max-age=0">
  <meta http-equiv="Cache-Control" content="no-cache">
  <meta http-equiv="expires" content="0">
  <meta http-equiv="Expires" content="Tue, 01 Jan 1980 1:00:00 GMT">
  <meta http-equiv="Pragma" content="no-cache">
<!--   <link rel="stylesheet" href="../style/petstore.css" type="text/css" /> -->
</head>

<body bgcolor="white">
<table class="top">
  <tr>
  
    <td>
      <a href="<c:url value="/spetstore/index.jsp"/>">
        (홈으로 가는 버튼)</a>
    </td>
    
    <td style="text-align:right">
      <a href="<c:url value="/user/myPage/cart.jsp"/>">
        (카트로 가는 버튼)</a>
      <c:if test="${empty userSession.account}" >
        <a href="<c:url value="/spetstore/login/signonForm.jsp"/>">
          (로그인 해야함 버튼)</a>
      </c:if>
      <c:if test="${!empty userSession.account}" >
        <a href="<c:url value="/logout"/>">	<!-- controller에서 로그아웃 처리하기 -->
          (로그인 된 상태 버튼)</a>
        <a href="<c:url value="/spetstore/user/myPage.jsp"/>">
         (마이페이지 가는 버튼)</a>
      </c:if>
    </td>
    
    <td style="text-align:left">
      <form action="<c:url value="/spetstore/spetitem/categoryView.jsp"/>" method="post">
      	<select name="itemKind"> <!-- itemKind 보기 생각해보기 -->
      		<option value="">itemkind 선택</option>
      		<option value="1">목욕용품</option>
      		<option value="2">먹이</option>
      		<option value="3">관리용품</option>
      	</select>
        <input type="text" name="keyword" size="14" />
        <input type="submit" value="검색">
      </form>
    </td>
  </tr>
</table>
</body>
</html>
<%@ include file="IncludeQuickHeader.jsp" %>
