<%@ page contentType="text/html; charset=EUC-KR"%>
<%@ page import="java.io.*"%>
<%
	String agree = request.getParameter("AGREE");
	String result = null;
	if(agree.equals("YES")){
		String id = (String)session.getAttribute("ID");
		String password = (String)session.getAttribute("PASSWORD");
		String name = (String)session.getAttribute("NAME");
		String filename = id + ".txt";
		PrintWriter writer = null;
		try{
			String filePath = application.getRealPath("/WEB-INF/bbs" + filename);
			writer = new PrintWriter(filePath);
			writer.println("���̵�" + id);
			writer.println("�н�����" + password);
			writer.println("�̸�" + name);
			result = "SUCCESS";
		}
		catch(IOException ioe){
			result = "FAIL";
		}
		finally{
			try{
				writer.close();
			}
			catch(Exception e){
			}
		}
	}
	else{
		result = "FAIL";
	}
	session.invalidate();
	response.sendRedirect("Result.jsp?RESULT=" + result);
%>