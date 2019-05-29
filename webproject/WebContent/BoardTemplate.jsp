<%@ page contentType="text/html; charset=EUC-KR"%>
<html>
<head>
<meta charset="EUC-KR">
<title>CUKBM</title>
</head>
<body>
	<h1>CUKBM</h1>
	<table border=1 cellpadding=10>
		<tr>
			<td width=150 valign=top>
				<a href="?BODY_PATH=BoardInput.html">게시판글쓰기</a><br>
				<a href="?BODY_PATH=Board">게시판 글읽기</a><br>
				<a href="cart-list">좋아요 목록</a>
			</td>
			<td valign=top width=650>
				<jsp:include page="${param.BODY_PATH}"/>
			</td>
		</tr>
	</table>
</body>
</html>