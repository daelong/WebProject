<%@ page contentType="text/html; charset=euc-kr"%>
<html>
<head>
<meta charset="EUC-KR">
<title>�Խ��� �۾��� - ��� ȭ��</title>
</head>
<body>
	<h2>�۾���</h2>
	<%
		String str = request.getParameter("RESULT");
		if(str.equals("SUCCESS"))
			out.println("����Ǿ����ϴ�.");
		else
			out.println("���Ͽ� �����͸� �� �� �����ϴ�.");
	%>
</body>
</html>