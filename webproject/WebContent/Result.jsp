<%@ page contentType="text/html; charset=EUC-KR"%>
<% String result = request.getParameter("RESULT"); %>
<html>
<head>
<title>ȸ������</title>
</head>
<body>
	<H3>ȸ�� ���� ���</H3>
	<%
		if(result.equals("SUCCESS"))
			out.println("���ԵǾ����ϴ�.");
		else
			out.println("���Ե��� �ʾҽ��ϴ�.");
	%>
</body>
</html>