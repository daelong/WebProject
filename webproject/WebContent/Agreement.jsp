<%@ page contentType="text/html; charset=EUC-KR"%>
<%
	request.setCharacterEncoding("euc-kr");
	String id = request.getParameter("ID");
	String password = request.getParameter("PASSWORD");
	String name = request.getParameter("NAME");
	session.setAttribute("ID",id);
	session.setAttribute("PASSWORD",password);
	session.setAttribute("NAME",name);
%>

<html>
<head>
<title>ȸ������</title>
</head>
<body>
	<H3>���</H3>
	--------------------------------<BR>
	1. ȸ�� ������ �� ����Ʈ�� ��� ���ؼ��� ���˴ϴ�.<BR>
	2. �� ����Ʈ�� ���� ��� �����ϴ� ȸ���� Ż�� ó���մϴ�.<BR>
	--------------------------------<BR>
	<FORM ACTION=Subscribe.jsp METHOD=POST>
		���� ����� �����Ͻʴϱ�?
		<INPUT TYPE=RADIO NAME=AGREE VALUE=YES>������
		<INPUT TYPE=RADIO NAME=AGREE VALUE=NO>�������� ����<BR><BR>
		<INPUT TYPE=SUBMIT VALUE='Ȯ��'>
	</FORM>
</body>
</html>