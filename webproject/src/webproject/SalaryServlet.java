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
		out.println("<HEAD><TITLE>연봉 측정기</TITLE></HEAD>");
		out.println("<BODY>");
		String str = request.getParameter("TIME");
		int time = Integer.parseInt(str);
		if( time >= 15) {
			out.println("당신의 연봉은 7500만원 이상입니다.");
		}else if( time >= 10) {
			out.println("당신의 연봉은 5000만원 이상입니다.");
		}else if( time >= 5) {
			out.println("당신의 연봉은 3000만원 이상입니다.");
		}else {
			out.println("더욱 분발 하십시요.");
		}
		out.println("</BODY>");
		out.println("</HTML>");
	}
}


