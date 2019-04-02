package webproject;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class AdderServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String str1 = request.getParameter("NUM1");
		String str2 = request.getParameter("NUM2");
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		int sum = num1 + num2;
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter out = response.getWriter();
		out.println("<HTML>");
		out.println("<HEAD><TITLE>두수의 합 - 출력화면</TITLE></HEAD>");
		out.printf("%d + %d = %d", num1, num2, sum);
		out.println("<BODY>");
		out.println("</BODY>");
		out.println("</HTML>");
	}
}
