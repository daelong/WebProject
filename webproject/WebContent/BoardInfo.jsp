<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h4>�Խ��� ��� ����</h4>
	<table border=1>
		<tr>
			<td width=80>�ۼ��� ���̵�</td>
			<td width=70>�ۼ���</td>
			<td width=300>����</td>
			<td width=40>����</td>
			<td width=90>�ۼ�����</td>
			<td width=70>�ۼ��ð�</td>
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
</body>
</html>