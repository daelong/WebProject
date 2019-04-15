<%@ page contentType="text/html; charset=EUC-KR"%>
<%@ page import="java.io.*" %>
<%
	String str1 = (String)session.getAttribute("SUM");
	String str2 = (String)session.getAttribute("DELETE");
	String str3 = (String)session.getAttribute("PRODUCT");
	String str4 = (String)session.getAttribute("QUOTIENT");
	String str5 = (String)session.getAttribute("NUM1");
	String str6 = (String)session.getAttribute("NUM2");

	String result;
	PrintWriter writer = null;
	try{
		String filePath = application.getRealPath("/WEB-INF/bbs/answer.txt");
		writer = new PrintWriter(filePath);
		writer.println("첫 번째 수 : " + str5);
		writer.println("두 번째 수 : " + str6);
		writer.println("더한 결과 : " + str1);
		writer.println("뺀 결과 : " + str2);
		writer.println("곱한 결과 : " + str3);
		writer.println("나눈 결과 : " + str4);
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
	session.invalidate();
	response.sendRedirect("FourRulesResult.jsp?RESULT=" + result);
%>