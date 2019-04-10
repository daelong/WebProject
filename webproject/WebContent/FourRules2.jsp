<%@ page contentType="text/html; charset=EUC-KR"%>
<%@ page import="java.io.*" %>
<html>
<head>
<meta charset="EUC-KR">
<title>사칙연산 저장</title>
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
		writer.println("첫 번째 수 : " + num1);
		writer.println("두 번째 수 : " + num2);
		writer.println("더한 결과 : " + sum);
		writer.println("뺀 결과 : " + delete);
		writer.println("곱한 결과 : " + product);
		writer.println("나눈 결과 : " + quotient);
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