<%@ page contentType="text/html; charset=EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta charset="EUC-KR">
<title>게시판</title>
</head>
<body>
	<h4>게시판 목록 보기</h4>
	<table border=1>
		<tr>
			<td width=40>순번</td>
			<td width=300>제목</td>
			<td width=80>작성자</td>
			<td width=90>작성일자</td>
			<td width=70>작성시각</td>
		</tr>
		<c:forEach var="cnt" begin="0" end="${Board_List.listSize-1}">>
			<tr>
				<td>${Board_List.boardIDList[cnt]}</td>
				<td>${Board_List.nameList[cnt]}</td>
				<td>${Board_List.titleList[cnt]}</td>
				<td>${Board_List.boardList[cnt]}</td>
				<td>${Board_List.dateList[cnt]}</td>
				<td>${Board_List.timeList[cnt]}</td>
			</tr>				
		</c:forEach>
	</table>
	<c:if test="${!Board_List.lastPage}">
		<a href='board-list?LAST_BOARD_ID=${Board_List.boardIDList[listSize-1]}'>다음 페이지</a>
	</c:if>
</body>
</html>