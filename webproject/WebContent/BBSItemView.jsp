<%@ page contentType="text/html; charset=EUC-KR"%>
<jsp:useBean id="bbsItem" class="mall.BBSItem"/>
<jsp:setProperty name="bbsItem" property="seqNo" value="${param.SEQ_NO}"/>
<%bbsItem.readDB();%>
<html>
<head>
<meta charset="EUC-KR">
<title>�Խñ� �б�</title>
</head>
<body>
	<h4>�Խñ� �б�</h4>
	[����]${bbsItem.title}<br>
	[�ۼ���]${bbsItem.writer}
	[�ۼ��Ͻ�]${bbsItem.date}${bbsItem.time}<br>
			----------------------------------------<br>
	${bbsItem.content}
</body>
</html>