<!-- 장바구니 목록을 출력하는 jsp -->
<%@ page contentType="text/html; charset=EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<h4>장바구니 관리</h4>
<c:choose>
	<c:when test="${CART_LIST == null || CART_LIST.size <= 0 }">
		장바구니가 비어 있습니다.
	</c:when>
	<c:otherwise>
		<table border=1>
			<tr>
				<td width=70>제목</td>
				<td width=50>번호</td>
			</tr>
			<c:forEach var="cnt" begin="0" end="${CART_LIST.size}">
				<tr>
					<td>${CART_LIST.seqNo[cnt]}</td>
					<td>${CART_LIST.title[cnt]}</td>
					<td>${CART_LIST.writer[cnt]}</td>
					<td>${CART_LIST.date[cnt]}</td>
					<td>${CART_LIST.time[cnt]}</td>
				</tr>
			</c:forEach>
		</table>
	</c:otherwise>
</c:choose>