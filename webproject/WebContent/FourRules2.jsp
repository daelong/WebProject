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
		writer.println("ù ��° �� : " + str5);
		writer.println("�� ��° �� : " + str6);
		writer.println("���� ��� : " + str1);
		writer.println("�� ��� : " + str2);
		writer.println("���� ��� : " + str3);
		writer.println("���� ��� : " + str4);
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