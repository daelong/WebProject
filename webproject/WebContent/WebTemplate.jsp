<%@ page contentType="text/html; charset=EUC-KR"%>
<html>
<head>
<meta charset="EUC-KR">
<title>한빛미디어</title>
</head>
<body>
	<h4>한빛미디어</h4>
	<table border=1 cellpadding=10>
		<tr>
			<td width=150 valign=top>
				<a href="?BODY_PATH=Intro.html">회사 소개</a><br>
				<a href="books-info">책 정보</a><br>
				<a href="BBSInput.html">게시판 글쓰기</a><br>
				<a href="bbs-list">게시판 글읽기</a><br>
			</td>
			<td valign=top width=650>
				<jsp:include page="${param.BODY_PATH}"/>
			</td>
	</table>
	<h5>Copyright@ 1993-2010 한빛미디어(주)</h5>
</body>
</html>