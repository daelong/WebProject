<%@ page contentType="text/html; charset=EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head><title>게시판</title></head>
<body>
<h4>게시판 목록 보기</h4>
<table border=1>
	<tr>
		<td width=40>순번</td>
		<td width=300>제목</td>
		<td width=80>작성자</td>
		<td width=90>작성일자</td>
		<td width=70>작성시각</td>
		<td width=120>&nbsp;</td>
	</tr>
	<c:forEach var="cnt" begin="0" end="${Board_List.listSize-1}">
		<tr>
			<td>${Board_List.seqNo[cnt]}</td>
			<td><a href='BoardTemplate.jsp?BODY_PATH=BoardItemView.jsp?SEQ_NO=${Board_List.seqNo[cnt]}'>${Board_List.title[cnt]}</a></td>
			<td>${Board_List.writer[cnt]}</td>
			<td>${Board_List.date[cnt]}</td>
			<td>${Board_List.time[cnt]}</td>
			<td><a href='#' onClick='window.open("add-item-to-cart?WRITER=${Board_List.writer[cnt]}","cart_result", "width=400, height=150").focus()'>좋아요</a></td>
		</tr>
	 </c:forEach>
</table>
<c:if test="${!Board_List.lastPage}">
	<a href='Board?LAST_SEQ_NO=${Board_List.seqNo[Board_List.listSize-1]}'>다음페이지</a>
</c:if>
</body>
</html>