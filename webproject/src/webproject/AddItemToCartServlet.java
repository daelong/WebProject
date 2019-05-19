package webproject;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import mall.Cart;

public class AddItemToCartServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		String title = request.getParameter("TITLE");
		if(title == null)
			throw new ServletException("게시글 제목이 입력되지 않았습니다.");
		HttpSession session = request.getSession();
		Cart cart = (Cart)session.getAttribute("CART");
		if(cart == null)
			cart = new Cart();
		cart.addItem(title, 1);
		session.setAttribute("CART", cart);
		response.sendRedirect("AddItemToCartResult.jsp?ITEM_NUM="+1);
	}
}
