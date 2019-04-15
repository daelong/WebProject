<%@ page contentType="text/html; charset=euc-kr"%>
<%@ page import="java.io.*"%>
<%
	String name = (String)session.getAttribute("NAME");
	String title = (String)session.getAttribute("TITLE");
	String content = (String)session.getAttribute("CONTENT");
	String filename = (String)session.getAttribute("FILENAME");
	String result;
	PrintWriter writer = null;
	try{
		String filePath = application.getRealPath("/WEB-INF/bbs/" + filename);
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
	session.invalidate();
	response.sendRedirect("BBSPostResult.jsp?RESULT=" + result);
%>