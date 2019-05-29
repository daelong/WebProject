package webproject;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.*;
import java.sql.*;
import mall.BoardItem;

public class BoardItemServlet {

	//�����ͺ��̽��κ��� �Խñ��� �д� �޼���
	public BoardItem readDB() throws ServletException{
		BoardItem item = new BoardItem();
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/webdb?serverTimezone=UTC","root","root");
			if(conn == null)
				throw new Exception("�����ͺ��̽��� ������ �� �����ϴ�.");
			stmt = conn.createStatement();
			String boardIdList;
			ResultSet rs = stmt.executeQuery("select * from boardinfo1 where seqno = '" + item.seqNo + "';");
			 if (rs.next()) {
	                item.setTitle(rs.getString("title"));         // ����
	                item.setContent(rs.getString("content"));     // ����
	                item.setWriter(rs.getString("writer"));       // �ۼ���
	                item.setDate(rs.getDate("date"));            // ��������
	                item.setTime(rs.getTime("time"));            // ����ð�
			 }
		}
		catch(Exception e) {
			throw new ServletException(e);
		}
		finally {
			try {
				stmt.close();
			}
			catch(Exception ignored	) {
			}
			try {
				conn.close();
			}
			catch(Exception ignored) {
			}
		}
	}

}
