package webproject;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class AnimalServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		String food = request.getParameter("FOOD");
		HttpSession session = request.getSession();
		session.setAttribute("FOOD", food);
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<HTML>");
		out.println("<HEAD><TITLE>성격테스트</TITLE></HEAD>");
		out.println("<BODY>");
		out.println("<H3>좋아하는 동물은?<H3>");
		out.println("<FORM ACTION=result>");
		out.println("<INPUT TYPE=TEXTFIELD NAME=ANIMAL>");
		out.println("<INPUT TYPE=SUBMIT VALUE='확인'>");
		out.println("</FORM>");
		out.println("</BODY>");
		out.println("</HTML>");
	}

}
