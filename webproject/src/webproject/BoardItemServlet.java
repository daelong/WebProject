package webproject;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.*;
import java.sql.*;
import mall.BoardItem;

public class BoardItemServlet {

	//데이터베이스로부터 게시글을 읽는 메서드
	public BoardItem readDB() throws ServletException{
		BoardItem item = new BoardItem();
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/webdb?serverTimezone=UTC","root","root");
			if(conn == null)
				throw new Exception("데이터베이스에 연결할 수 없습니다.");
			stmt = conn.createStatement();
			String boardIdList;
			ResultSet rs = stmt.executeQuery("select * from boardinfo1 where seqno = '" + item.seqNo + "';");
			 if (rs.next()) {
	                item.setTitle(rs.getString("title"));         // 제목
	                item.setContent(rs.getString("content"));     // 내용
	                item.setWriter(rs.getString("writer"));       // 작성자
	                item.setDate(rs.getDate("date"));            // 저장일자
	                item.setTime(rs.getTime("time"));            // 저장시각
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
