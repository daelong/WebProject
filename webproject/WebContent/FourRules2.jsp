<%@ page contentType="text/html; charset=EUC-KR"%>
<%@ page import="java.io.*" %>
<html>
<head>
<meta charset="EUC-KR">
<title>��Ģ���� ����</title>
</head>
<body>
<%
	String str1 = (String)session.getAttribute("SUM");
	String str2 = (String)session.getAttribute("DELETE");
	String str3 = (String)session.getAttribute("PRODUCT");
	String str4 = (String)session.getAttribute("QUOTIENT");
	String str5 = (String)session.getAttribute("NUM1");
	String str6 = (String)session.getAttribute("NUM2");
	String filename = (String)session.getAttribute("FILENAME");
	
	int sum = Integer.parseInt(str1);
	int delete = Integer.parseInt(str2);
	int product = Integer.parseInt(str3);
	int quotient = Integer.parseInt(str4);
	int num1 = Integer.parseInt(str5);
	int num2 = Integer.parseInt(str6);
	//String result;
	PrintWriter writer = null;
	try{
		String filePath = application.getRealPath("/WEB-INF" + filename);
		writer.println("ù ��° �� : " + num1);
		writer.println("�� ��° �� : " + num2);
		writer.println("���� ��� : " + sum);
		writer.println("�� ��� : " + delete);
		writer.println("���� ��� : " + product);
		writer.println("���� ��� : " + quotient);
		//result = "SUCCESS";
	}catch(IOException ioe){
		//result = "FAIL";
	}
	finally{
		try{
			writer.close();
		}
		catch(Exception e){
		}
	}
	response.sendRedirect("FourRulesResult.jsp?SUM=" + sum);
	response.sendRedirect("FourRulesResult.jsp?DELETE=" + delete);
	response.sendRedirect("FourRulesResult.jsp?PRODUCT=" + product);
	response.sendRedirect("FourRulesResult.jsp?QUOTIENT=" + quotient);

%>
</body>
</html>