<%@ page contentType="text/html; charset=EUC-KR"%>
<html>
<head>
<meta charset="EUC-KR">
<title>QnA�Խ���</title>
</head>
<body>
	<h2>QnA�Խ��� �۾���</h2>
		<form action=QnAPost.jsp method=post>
			�̸� : <input type=text name=NAME><br>
			���� : <input type=text name=TITLE><br>
			<textarea rows="5" cols="50" name=CONTENT></textarea><br>
			<input type=submit value='����'>
			<input type=reset value='���'>
		</form>
</body>
</html>