//장바구니 목록을 만드는 서블릿 클래스
package webproject;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import mall.CartList;
import mall.Cart;

public class CartListServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		HttpSession session = request.getSession();
		Cart cart = (Cart)session.getAttribute("CART");
		if(cart != null) {
			CartList cartList = readDB(cart);
			request.setAttribute("CART_LIST", cartList);
		}
		else {
			request.setAttribute("CART_LIST", null);
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher("BoardTemplate.jsp?BODY_PATH=CartListView.jsp");
		dispatcher.forward(request, response);
	}
	//DB로부터 글 정보를 읽는 메서드
	private CartList readDB(Cart cart) throws ServletException{
		CartList cartList = new CartList();
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/webdb?serverTimezone=UTC","root","root");
			if(conn == null)
				throw new Exception("데이터베이스에 연결할 수 없습니다.");
			stmt = conn.createStatement();
			int itemNum = cart.getSize();
			for(int cnt = 0; cnt < itemNum; cnt++) {
//				System.out.println("확인");
				String writer = cart.getWriter(cnt);
				ResultSet rs = stmt.executeQuery("select seqNo, title, date, time from boardinfo1 where writer='" + writer + "';");
				if(!rs.next())
					throw new Exception("해당 게시글이 없습니다.[작성자 :" + writer + "]");
				String title = rs.getString("title");//cart.getTitle(cnt);
				int seqNo = rs.getInt("seqNo");//cart.getSeqNo(cnt);
				Date date = rs.getDate("date");//cart.getDate(cnt);
				Time time = rs.getTime("time");//cart.getTime(cnt);
				cartList.setSeqNo(cnt, seqNo);
				cartList.setTitle(cnt, title);
				cartList.setWriter(cnt, writer);
				cartList.setDate(cnt, date);
				cartList.setTime(cnt, time);
			}
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
		return cartList;
	}
	//ISO-8859-1문자열을 Unicode 문자열로 바꾸는 메서드
	private String toUnicode(String str) {
		if(str == null)
			return null;
		try {
			byte[] b = str.getBytes("ISO_8859_1");
			return new String(b);
		}
		catch(java.io.UnsupportedEncodingException uee) {
			System.out.println(uee.getMessage());
			return null;
		}
	}
}
