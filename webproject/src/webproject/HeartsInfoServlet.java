package webproject;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;
import java.sql.*;
import mall.Board;

public class HeartsInfoServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		String lowerBoardID = request.getParameter("LAST_BOARD_ID");
		if(lowerBoardID == null)
			lowerBoardID = "00000";
		Board list = readDB(lowerBoardID);
		request.setAttribute("LAST_BOARD_ID", list);
		RequestDispatcher dispatcher = request.getRequestDispatcher("WebTemplate.jsp?BODY_PATH=HeartsInfoView.jsp");
		dispatcher.forward(request, response);
	}
	
	//데이터베이스로부터 좋아요 정보를 읽는 메서드
	private Board readDB(String lowerCode) throws ServletException{
		Board list = new Board();
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName("org.apache.commons.dbcp.PoolingDriver");
			conn = DriverManager.getConnection("org.apache.commons.dbcp:/wdbpool");
			if(conn == null)
				throw new Exception("데이터베이스에 연결할 수 없습니다.");
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from goodsinfo where code > '" + lowerCode + "'order by code asc;");
			for(int cnt = 0; cnt < 5; cnt++) {
				if(!rs.next())
					break;
				list.setBoardID(cnt, rs.getInt("boardID"));
				list.setName(cnt, toUnicode(
						rs.getString("name")));
				list.setTitle(cnt, toUnicode(
						rs.getString("title")));
				list.setBoard(cnt, toUnicode(
						rs.getString("board")));
				list.setDate(cnt, rs.getDate("date"));
				list.setTime(cnt, rs.getTime("time"));
			}
			if(!rs.next())
				list.setLastPage(true);
		}
		catch(Exception e) {
			throw new ServletException(e);
		}
		finally {
			try {
				stmt.close();
			}
			catch(Exception ignored) {
			}
			try {
				conn.close();
			}
			catch(Exception ignored) {
			}
		}
		return list;
	}
	//ISO-8859-1 문자열을 Unicode 문자열로 바꾸는 메서드
	private String toUnicode(String str) {
		if(str == null)
			return null;
		try {
			byte[] b = str.getBytes("ISO-8859-1");
			return new String(b);
		}
		catch(java.io.UnsupportedEncodingException uee) {
			System.out.println(uee.getMessage());
			return null;
		}
	}
}
