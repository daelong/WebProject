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
			<td width=40>����</td>
			<td width=70>�ۼ���</td>
			<td width=300>����</td>
			<td width=90>�ۼ�����</td>
			<td width=70>�ۼ��ð�</td>
		</tr>
		<c:forEach var="cnt" begin="0" end="${Board_List.listSize-1}">>
			<tr>
				<td>${Board_List.seqNo[cnt]}</td>
				<td>${Board_List.writer[cnt]}</td>
				<td>${Board_List.title[cnt]}</td>
				<td>${Board_List.date[cnt]}</td>
				<td>${Board_List.time[cnt]}</td>
			</tr>				
		</c:forEach>
</body>
</html>