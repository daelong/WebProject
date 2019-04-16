package webproject;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class BBSPost extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		request.setCharacterEncoding("euc-kr");
		String name = (String)request.getParameter("NAME");
		String title = request.getParameter("TITLE");
		String content = (String)request.getParameter("CONTENT");
		Date date = new Date();
		Long time = date.getTime();
		String filename = time + ".txt";
		
		response.setContentType("text/html;charset=euc-kr");
		String result;
		ServletContext context = getServletContext();
		PrintWriter writer = null;
		try{
			String filePath = context.getRealPath("/WEB-INF/bbs/" + filename);
			writer = new PrintWriter(filePath);
			writer.println("이름 : " + name);
			writer.println("제목 : " + title);
			writer.println("내용 : " + content);
			result = "SUCCESS";
		}catch(IOException ioe){
			result = "FAIL";
		}
		finally{
			try{
				writer.close();
			}
			catch(Exception e){
			}
		}
		response.sendRedirect("BBSPostResult.jsp?RESULT=" + result);
	}

}
