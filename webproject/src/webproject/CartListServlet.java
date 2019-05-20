//��ٱ��� ����� ����� ���� Ŭ����
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
		if( cart != null) {
			CartList cartList = readDB(cart);
			request.setAttribute("Cart_List", cartList);
		}
		else {
			request.setAttribute("CART_LIST", null);
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher("WebTemplate.jsp?BODY_PATH=CartListView.jsp");
		dispatcher.forward(request, response);
	}
	//DB�κ��� �� ������ �д� �޼���
	private CartList readDB(Cart cart) throws ServletException{
		CartList cartList = new CartList();
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/webdb?serverTimezone=UTC","root","root");
			if(conn == null)
				throw new Exception("�����ͺ��̽��� ������ �� �����ϴ�.");
			stmt = conn.createStatement();
			int itemNum = cart.getSize();
			for(int cnt = 0; cnt < itemNum; cnt++) {
				String title = cart.getTitle(cnt);
				int number = cart.getNumber(cnt);
				ResultSet rs = stmt.executeQuery("select title from usersinfo" + "where title='" + title + "';");
				if(!rs.next())
					throw new Exception("�ش� ��ǰ�� �����ϴ�.[��ǰ�ڵ�:" + title + "]");
				cartList.setTitle(cnt, title);
				cartList.setNumber(cnt, number);
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
	//ISO-8859-1���ڿ��� Unicode ���ڿ��� �ٲٴ� �޼���
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
