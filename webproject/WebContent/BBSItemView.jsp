<%@ page contentType="text/html; charset=EUC-KR"%>
<jsp:useBean id="bbsItem" class="mall.BBSItem"/>
<jsp:setProperty name="bbsItem" property="seqNo" value="${param.SEQ_NO}"/>
<%bbsItem.readDB();%>
<html>
<head>
<meta charset="EUC-KR">
<title>게시글 읽기</title>
</head>
<body>
	<h4>게시글 읽기</h4>
	[제목]${bbsItem.title}<br>
	[작성자]${bbsItem.writer}
	[작성일시]${bbsItem.date}${bbsItem.time}<br>
			----------------------------------------<br>
	${bbsItem.content}
</body>
</html>