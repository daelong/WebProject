<%@ page contentType="text/html; charset=EUC-KR"%>
<%@ page import="java.sql.*"%>
<%
	String name = request.getParameter("name");
	String id = request.getParameter("id");
	String password = request.getParameter("password");
	if(name == null || id == null || password == null)
		throw new Exception("데이터를 입력하세요 ");
	Connection conn = null;
	Statement stmt = null;
	try{
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/webdb?serverTimezone=UTC", "root", "root");
		if(conn == null)
			throw new Exception("데이터를 연결할 수 없습니다.");
		stmt = conn.createStatement();
		String command = String.format("insert into userinfo(name, id, password) value('%s', '%s', '%s');", name, id, password);
		int rowNum = stmt.executeUpdate(command);
		if(rowNum < 1)
			throw new Exception("데이터를 DB에 입력할 수 없습니다.");
	}
	finally{
		try{
			stmt.close();
		}
		catch(Exception ignored){
		}
		try{
			conn.close();
		}
		catch(Exception ignored){
		}	
	}
	response.sendRedirect("SubscriptionResult.jsp");
%>
