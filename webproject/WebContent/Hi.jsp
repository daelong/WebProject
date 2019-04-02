<%@ page contentType="text/html; charset=EUC-KR"%>
<html>
<head>
<meta charset="EUC-KR">
<title>인사하기</title>
</head>
<body>		
	안녕하세요 <%= request.getParameter("YOURNAME") %>님
</body>
</html>