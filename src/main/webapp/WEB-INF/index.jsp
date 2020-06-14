<!-- index로 가는 버튼/카트/로그인 유무(로그인한 상태인 경우, 마이페이지 버튼 보임)/itemKind 선택/검색창 및 검색 버튼-->
<%@ include file="IncludeTop.jsp" %> 
<table style="border:none;border-collapse:collapse;width:100%">
  <tr>
    <td style="text-align:left;vertical-align:top;width:100%">
      <table style="border:none;border-collapse:collapse;width:80%">
        <tr>
          <td valign="top">                    
            <!-- SIDEBAR -->
            <table id="index">
              <tr>
                <td>
                <c:if test="${!empty userSession.account}">
			       <b><i><font size="4" color="RED">Welcome ${userSession.account.firstName}!</font></i></b>
                </c:if>&nbsp;
                </td>
              </tr>
              <tr>
                <td>
                  <a href="<c:url value="/shop/viewCategory.do?categoryId=FISH"/>">
                     <img border="0" src="../images/fish_icon.gif" /></a>
                </td>
              </tr>
              <tr>
                <td>
                  <a href="<c:url value="/shop/viewCategory.do?categoryId=DOGS"/>">
                    <img border="0" src="../images/dogs_icon.gif" /></a>
                </td>
              </tr>
              <tr>
                <td>
                  <a href="<c:url value="/shop/viewCategory.do?categoryId=CATS"/>">
                    <img border="0" src="../images/cats_icon.gif" /></a>
                </td>
              </tr>
              <tr>
                <td>
                  <a href="<c:url value="/shop/viewCategory.do?categoryId=REPTILES"/>">
                    <img border="0" src="../images/reptiles_icon.gif" /></a>
                </td>
              </tr>
              <tr>
                <td>
                  <a href="<c:url value="/shop/viewCategory.do?categoryId=BIRDS"/>">
                    <img border="0" src="../images/birds_icon.gif" /></a>
                </td>
              </tr>
            </table>
          </td>
          <td style="text-align:center;background-color:white;height:300;width:100%">
            MAIN IMAGE
            <p>main contents</p>
          </td>
        </tr>
      </table>
    </td>
  </tr>
</table>

<%-- <%@ include file="IncludeBanner.jsp" %> --%>

<%@ include file="IncludeBottom.jsp" %>
