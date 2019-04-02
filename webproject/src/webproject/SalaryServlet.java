package webproject;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SalaryServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter out = response.getWriter();
		
		out.println("<HTML>");
		out.println("<HEAD><TITLE>���� ������</TITLE></HEAD>");
		out.println("<BODY>");
		String str = request.getParameter("TIME");
		int time = Integer.parseInt(str);
		if( time >= 15) {
			out.println("����� ������ 7500���� �̻��Դϴ�.");
		}else if( time >= 10) {
			out.println("����� ������ 5000���� �̻��Դϴ�.");
		}else if( time >= 5) {
			out.println("����� ������ 3000���� �̻��Դϴ�.");
		}else {
			out.println("���� �й� �Ͻʽÿ�.");
		}
		out.println("</BODY>");
		out.println("</HTML>");
	}
}

