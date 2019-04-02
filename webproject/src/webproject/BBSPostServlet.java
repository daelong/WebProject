package webproject;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class BBSPostServlet extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String name = request.getParameter("NAME");
		String title = request.getParameter("TITLE");
		String content = request.getParameter("CONTENT");
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter out = response.getWriter();
		out.println("<HTML>");
		out.println("<HEAD><TITLE>게시판 글쓰기 - 출력화면</TITLE></HEAD>");
		out.println("<BODY>");
		out.printf("이름 : %s<BR>", name);
		out.printf("제목 : %s<BR>", title);
		out.println("--------<BR>");
		out.printf("<PRE>%s<PRE>", content);
		out.println("--------<BR>");
		out.println("저장되었습니다.");
		out.println("</BODY>");
		out.println("</HTML>");
	}

}
