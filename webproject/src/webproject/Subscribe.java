package webproject;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Subscribe extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		request.setCharacterEncoding("euc-kr");
		String agree = request.getParameter("AGREE");
		String result = null;
		HttpSession session = request.getSession();
		ServletContext context = getServletContext();
		if(agree.equals("YES")) {
			String id = (String)session.getAttribute("ID");
			String password = (String)session.getAttribute("PASSWORD");
			String name = (String)session.getAttribute("NAME");
			PrintWriter writer = null;
			try {
				String filePath = context.getRealPath("/WEB-INF/" + id + ".txt");
				writer = new PrintWriter(filePath);
				writer.println("아이디 : " + id);
				writer.println("패스워드 : " + password);
				writer.println("이름 : " + name);
				result = "SUCCESS";
			}catch( IOException ioe) {
				result = "FAIL";
			}
			finally {
				try {
					writer.close();
				}
				catch(Exception e) {
				}
			}
		}
		else {
			result = "FAIL";
		}
		session.invalidate();
		response.sendRedirect("Result.jsp?RESULT=" + result);
		
	}

}
