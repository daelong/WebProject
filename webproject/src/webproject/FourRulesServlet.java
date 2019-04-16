package webproject;

import java.io.*;
import java.util.Date;
import javax.servlet.*;
import javax.servlet.http.*;

public class FourRulesServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		request.setCharacterEncoding("euc-kr");
		String str1 = request.getParameter("NUM1");
		String str2 = request.getParameter("NUM2");
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		
		String result;
		ServletContext context = getServletContext();
		PrintWriter writer = null;
		try{
			String filePath = context.getRealPath("/WEB-INF/bbs/answer.txt");
			writer = new PrintWriter(filePath);
			writer.println("첫 번째 수 : " + num1);
			writer.println("두 번째 수 : " + num2);
			writer.println("더한 결과 : " + new Integer(num1+num2));
			writer.println("뺀 결과 : " + new Integer(num1-num2));
			writer.println("곱한 결과 : " + new Integer(num1*num2));
			writer.println("나눈 결과 : " + new Integer(num1/num2));
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
		response.sendRedirect("FourRulesResult.jsp?RESULT=" + result);
	}

}
