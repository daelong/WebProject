<!-- ��ٱ��� ����� ����ϴ� jsp -->
<%@ page contentType="text/html; charset=EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<h4>��ٱ��� ����</h4>
<c:choose>
	<c:when test="${CART_LIST == null || CART_LIST.size <= 0 }">
		��ٱ��ϰ� ��� �ֽ��ϴ�.
	</c:when>
	<c:otherwise>
		<table border=1>
			<tr>
				<td width=70>����</td>
				<td width=50>��ȣ</td>
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