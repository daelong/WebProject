<%@ page contentType="text/html; charset=EUC-KR"%>
<html>
<head>
<meta charset="EUC-KR">
<title>��ǰ ���� ����</title>
</head>
<body>
	<h4>��ǰ ������ ������ �� ���� ��ư�� ��������</h4>
	<form action=Update method=post>
	�ڵ� : <input type=text name=code size=5 value='${CODE}' READONLY=TRUE><br>
	���� : <input type=text name=title size=50 value='${TITLE}'><br>
	���� : <input type=text name=writer size=20 value='${WRITER}'><br>
	���� : <input type=text name=price size=8 value='${PRICE}'><br>
	<input type=submit value='����'>
	</form>
</body>
</html>