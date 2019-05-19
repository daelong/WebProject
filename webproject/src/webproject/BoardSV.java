package webproject;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;
import mall.Board;

public class BoardSV extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest request,
			          HttpServletResponse response)
	                  throws IOException, ServletException {
		String strUpperBoardID =
				request.getParameter("LAST_BOARD_ID");
		int upperBoardID;
		if (strUpperBoardID == null)
			upperBoardID = Integer.MAX_VALUE;
		else
			upperBoardID = Integer.parseInt(strUpperBoardID);
		Board list = readDB(upperBoardID);
		request.setAttribute("Board_List", list);
		RequestDispatcher dispatcher = request.getRequestDispatcher(
				                               "��θ�"); //13-7 ��θ�
		dispatcher.forward(request, response);
	}

	private Board readDB(int upperBoardID) 
		throws ServletException{
		Board list = new Board();
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName(
					"org.apache.commons.dbcp.PoolingDriver");
			conn = DriverManager.getConnection(
					"jdbc:apache:commons:dbcp:/wdbpool");
			if(conn == null)
				throw new Exception("�����ͺ��̽��� ������ �� �����ϴ�.");
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(
					"select * from board where boardID < " +
					upperBoardID + " order by boardID desc;");
			for (int cnt = 0; cnt < 5; cnt++) {
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
		// Unicode ���ڿ� �ٲٴ� �޼ҵ�
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
