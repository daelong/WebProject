<%@ page contentType="text/html; charset=EUC-KR" isErrorPage="true"%>
<% response.setStatus(200); %>
<html>
<head>
<meta charset="EUC-KR">
<title>������ ���̽� ����</title>
</head>
<body>
	<h3>�����ͺ��̽� ����</h3>
	���� �޽���:<%= exception.getMessage() %>
</body>
</html>