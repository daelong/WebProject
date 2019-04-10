package webproject;

import java.io.*;
import java.util.Date;
import javax.servlet.*;
import javax.servlet.http.*;

import Model.FourRulesModel;

public class FourRulesServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		String str1 = request.getParameter("NUM1");
		String str2 = request.getParameter("NUM2");
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		int sum = num1 + num2;
		int delete = num1 - num2;
		int product = num1*num2;
		int quotient = num1/num2;
		Date date = new Date();
		Long time = date.getTime();
		String filename = time + ".txt";
		
		FourRulesModel model = new FourRulesModel();
		model.setNum1(num1);
		model.setNum2(num2);
		model.setSum(sum);
		model.setDelete(delete);
		model.setProduct(product);
		model.setQuotient(quotient);
		/*
		request.setAttribute("SUM", sum);
		request.setAttribute("DELETE", delete);
		request.setAttribute("PRODUCT", product);
		request.setAttribute("QUOTIENT", quotient);
		
		response.sendRedirect("FourRulesResult.jsp?SUM=" + sum);
		response.sendRedirect("FourRulesResult.jsp?DELETE=" + delete);
		response.sendRedirect("FourRulesResult.jsp?PRODUCT=" + product);
		response.sendRedirect("FourRulesResult.jsp?QUOTIENT=" + quotient);
		*/
		HttpSession session = request.getSession();
		session.setAttribute("NUM1", num1);
		session.setAttribute("NUM2", num2);
		session.setAttribute("SUM", sum);
		session.setAttribute("DELETE", delete);
		session.setAttribute("PRODUCT", product);
		session.setAttribute("QUOTIENT", quotient);
		session.setAttribute("FILENAME", filename);
		RequestDispatcher dispatcher = request.getRequestDispatcher("FourRulesResult.jsp");
		dispatcher.forward(request, response);
		
	}

}
