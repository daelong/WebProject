//��ٱ��Ͽ� �Խñ��� ��� ���� Ŭ����
package webproject;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import mall.Cart;

public class AddItemToCartServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		String writer = request.getParameter("WRITER");
		if(writer == null)
			throw new ServletException("�Խñ� ������ �Էµ��� �ʾҽ��ϴ�.");
		HttpSession session = request.getSession();
		Cart cart = (Cart)session.getAttribute("CART");
		if(cart == null)
			cart = new Cart();
		cart.addItem(writer, 1);
		session.setAttribute("CART", cart);
		response.sendRedirect("AddItemToCartResult.jsp?ITEM_NUM="+1);
	}
}
