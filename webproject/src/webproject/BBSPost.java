package webproject;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

import Model.BBSPostModel;

public class BBSPost extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		request.setCharacterEncoding("euc-kr");
		String name = (String)request.getParameter("NAME");
		String title = (String)request.getParameter("TITLE");
		String content = (String)request.getParameter("CONTENT");
		Date date = new Date();
		Long time = date.getTime();
		String filename = time + ".txt";
		
		BBSPostModel model = new BBSPostModel();
		model.setName(name);
		model.setTitle(title);
		model.setContent(content);
		
		HttpSession session = request.getSession();
		session.setAttribute("NAME", name);
		session.setAttribute("TITLE", title);
		session.setAttribute("CONTENT", content);
		session.setAttribute("FILENAME", filename);
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter out = response.getWriter();
		RequestDispatcher dispatcher = request.getRequestDispatcher("BBSPost2.jsp");
		dispatcher.forward(request, response);
	}

}
