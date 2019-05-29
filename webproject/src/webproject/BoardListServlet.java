package webproject;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;
import mall.BoardList;

public class BoardListServlet extends HttpServlet {
//	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest request,
			          HttpServletResponse response)
	                  throws IOException, ServletException {
		String strUpperSeqNo =
				request.getParameter("LAST_SEQ_NO");
		int upperSeqNo;
		if (strUpperSeqNo == null)
			upperSeqNo = Integer.MAX_VALUE;
		else
			upperSeqNo = Integer.parseInt(strUpperSeqNo);
		BoardList list = readDB(upperSeqNo);
		request.setAttribute("Board_List", list);
		RequestDispatcher dispatcher = request.getRequestDispatcher(
				                               "BoardListView.jsp"); //13-7 경로명
		dispatcher.forward(request, response);
	}

	private BoardList readDB(int upperSeqNo) 
		throws ServletException{
		BoardList list = new BoardList();
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName(
					"com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/webdb?serverTimezone=UTC","root","root");
			if(conn == null)
				throw new Exception("데이터베이스에 연결할 수 없습니다.");
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(
					"select * from boardinfo1 where seqNo <" +
					upperSeqNo + " order by seqno desc;");
			for (int cnt = 0; cnt < 5; cnt++) {
				if(!rs.next())
					break;
				list.setSeqNo(cnt, rs.getInt("seqNo"));
				list.setWriter(cnt, rs.getString("writer"));
				list.setTitle(cnt, rs.getString("title"));
				list.setDate(cnt, rs.getDate("date"));
				list.setTime(cnt, rs.getTime("time"));
			}
			if (!rs.next())
				list.setLastPage(true);
		}
		catch (Exception e) {
			throw new ServletException(e);
		}
		finally {
			try {
				stmt.close();
			}
			catch (Exception ignored) {
			}
			try {
				conn.close();
			}
			catch(Exception ignored) {
			}
		}
		return list;
	}
	private String toUnicode(String str) {
		// Unicode 문자열 바꾸는 메소드
		if (str == null)
		return null;
		try {
			byte[] b = str.getBytes("ISO-8859-1");
			return new String(b);
		}
		catch (java.io.UnsupportedEncodingException uee) {
			System.out.println(uee.getMessage());
			return null;
		}
	}
	
}
