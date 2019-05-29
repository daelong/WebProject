<%@ page contentType="text/html; charset=EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<H4>좋아요 목록</H4>
<c:choose>
	<c:when test="${CART_LSIT == null || CART_LIST.size <= 0}">
	 게시물이 없습니다.
	 </c:when>
	 <c:otherwise>
	 	<table border=1>
	 		<tr>
	 			<td width=50>순번</td>
	 			<td width=250>제목</td>
	 			<td width=80>작성자</td>
	 			<td width=200>작성일자</td>
	 			<td wdith=200>작성시간</td>
	 		</tr>
	 		<c:forEach var="cnt" begin="0" end="${CART_LIST.size-1}">
	 			<tr>
	 				<td>${CART_LIST.seqno[cnt]}</td>
	 				<td>${CART_LIST.title[cnt]}</td>
	 				<td>${CART_LIST.writer[cnt]}</td>
	 				<td>${CART_LIST.date[cnt]}</td>
	 				<td>${CART_LIST.time[cnt]}</td>
	 			</tr>
	 		</c:forEach>
	 	</table>
	 </c:otherwise>
</c:choose>