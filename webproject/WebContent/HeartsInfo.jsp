<!-- 게시글 정보 목록을 출력하는 jsp페이지 -->
<%@ page contentType="text/html; charset=EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<h4>게시판 정보 보기</h4>
	<table border=1>
		<tr>
			<td width=80>작성자 아이디</td>
			<td width=70>작성자</td>
			<td width=300>제목</td>
			<td width=40>순번</td>
			<td width=90>작성일자</td>
			<td width=70>작성시각</td>
			<td width=60>&nbsp;</td>
		</tr>
		<c:forEach var="cnt" begin="0" end="${Board_List.listSize-1}">>
			<tr>
				<td>${Board_List.boardIDList[cnt]}</td>
				<td>${Board_List.nameList[cnt]}</td>
				<td>${Board_List.titleList[cnt]}</td>
				<td>${Board_List.boardList[cnt]}</td>
				<td>${Board_List.dateList[cnt]}</td>
				<td>${Board_List.timeList[cnt]}</td>
				<td><a href='#' onClick='window.open("add-board-to-cart?CODE=${Board_List.title[cnt]}", "cart_result", "width=400, height=150").focus()'>좋아요 담기</a></td>
			</tr>				
		</c:forEach>
</table>
<c:if test="${!Board_List.lastPage}">
	<a href='board-info?LAST_CODE=${Board_List.title[Board_List.size-1]}'>다음 페이지</a>
</c:if>