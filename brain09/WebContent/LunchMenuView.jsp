<%@ contentType="text/html; charset=EUC-KR"%>
<html>
<head>
<meta charset="EUC-KR">
<title>구내 식당</title>
</head>
<body>
<h3>오늘의 메뉴입니다.</h3>
<UL>
	<c:forEach var="dish" items="${MENU}">
		<LI>${dish}</LI>
</UL>
</body>
</html>