package webproject;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class ReaderServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
//		request.setCharacterEncoding("euc-kr");
		String code = request.getParameter("code");
		if(code == null)
			response.sendRedirect("Error.jsp");
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName(
					"com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/webdb?serverTimezone=UTC","root","root");
			if(conn == null)
				throw new Exception("�����ͺ��̽��� ������ �� �����ϴ�.");
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from goodsinfo where code='"+ code + "';");
			if(!rs.next())
				throw new Exception("��ǰ�ڵ� (" + code + ")�� �ش��ϴ� �����Ͱ� �����ϴ�.");
			String title = rs.getString("title");
			String writer = rs.getString("writer");
			int price = rs.getInt("price");
			request.setAttribute("CODE", code);
			request.setAttribute("TITLE", title);
			request.setAttribute("WRITER", writer);
			request.setAttribute("PRICE", price);
		}
		catch(Exception ignored){
		}
		finally {
			try{
				stmt.close();
			}
			catch(Exception ignored){
			}
			try {
				conn.close();
			}
			catch(Exception ignored) {
			}
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher("EditForm.jsp");
		dispatcher.forward(request, response);
	}
}
