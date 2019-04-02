<%@ page contentType="text/html; charset=EUC-KR"%>
<html>
<head>
<meta charset="EUC-KR">
<title>QnA게시판</title>
</head>
<body>
	<h2>QnA게시판 글쓰기</h2>
		<form action=QnAPost.jsp method=post>
			이름 : <input type=text name=NAME><br>
			제목 : <input type=text name=TITLE><br>
			<textarea rows="5" cols="50" name=CONTENT></textarea><br>
			<input type=submit value='저장'>
			<input type=reset value='취소'>
		</form>
</body>
</html>