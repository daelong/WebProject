<%@ page contentType="text/html; charset=EUC-KR"%>
<jsp:useBean id="boardItem" class="mall.BoardItem"/>
<jsp:setProperty name="boardItem" property="seqNo" value="${param.SEQ_NO}"/>
<%boardItem.readDB(); %>
<html>
<head>
<meta charset="EUC-KR">
<title>�Խñ� �б�</title>
</head>
<body>
	<h4>�Խñ� �б�</h4>
	[����]${boardItem.title}<br>
	[�ۼ���]${boardItem.writer}
	[�ۼ��Ͻ� ]${boardItem.date}${boardItem.time}<br>
	----------------------------------------------<br>
	${boardItem.content}
</body>
</html>