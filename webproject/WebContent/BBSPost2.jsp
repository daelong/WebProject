<%@ page contentType="text/html; charset=EUC-KR"%>
<%@ page import="java.io.*"%>
<html>
<head>
<meta charset="EUC-KR">
<title>�Խñ� ����</title>
</head>
<body>
<%
	String name = (String)session.getAttribute("NAME");
	String title = (String)session.getAttribute("TITLE");
	String content = (String)session.getAttribute("CONTENT");
	String filename = (String)session.getAttribute("FILENAME");
	String result;
	PrintWriter writer = null;
	try{
		String filePath = application.getRealPath("/WEB-INF/bbs" + filename);
		writer = new PrintWriter(filePath);
		writer.println("�̸� : " + name);
		writer.println("���� : " + title);
		writer.println("���� : " + content);
		result = "SUCCESS";
	}catch(IOException ioe){
		result = "FAIL";
	}
	finally{
		try{
			writer.close();
		}
		catch(Exception e){
		}
	}
	response.sendRedirect("BBSPostResult.jsp?RESULT=" + result);
%>
</body>
</html>