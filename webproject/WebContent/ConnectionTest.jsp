<%@ page contentType="text/html; charset=EUC-KR"%>
<%@ page import="java.sql.*" %>
<html>
<head>
<meta charset="EUC-KR">
<title>�����ͺ��̽��� �����ϱ�</title>
</head>
<body>
<h3>�����ͺ��̽� ���� �׽�Ʈ</h3>
<%
	Class.forName("com.mysql.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/webdb?serverTimezone=UTC","root", "root");
	if(conn != null){
		out.print("webdb �����ͺ��̽��� �����߽��ϴ�.<br>");
		conn.close();
		out.print("webdb �����ͺ��̽��� �������� �������ϴ�.<br>");
	}
	else{
		out.print("webdb �����ͺ��̽��� ������ �� �����ϴ�.<br>");
	}
%>
</body>
</html>