//장바구니에 게시글을 담는 서블릿 클래스
package webproject;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import mall.Cart;

public class AddItemToCartServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		String writer = request.getParameter("WRITER");
		if(writer == null)
			throw new ServletException("게시글 제목이 입력되지 않았습니다.");
		HttpSession session = request.getSession();
		Cart cart = (Cart)session.getAttribute("CART");
		if(cart == null)
			cart = new Cart();
		cart.addItem(writer, 1);
		session.setAttribute("CART", cart);
		response.sendRedirect("AddItemToCartResult.jsp?ITEM_NUM="+1);
	}
}
