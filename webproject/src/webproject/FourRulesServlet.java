package webproject;

import java.io.*;
import java.util.Date;
import javax.servlet.*;
import javax.servlet.http.*;

import Model.FourRulesModel;

public class FourRulesServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		request.setCharacterEncoding("euc-kr");
		String str1 = request.getParameter("NUM1");
		String str2 = request.getParameter("NUM2");
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);

		FourRulesModel model = new FourRulesModel();
		model.setNum1(num1);
		model.setNum2(num2);
		model.setSum(new Integer(num1 + num2));
		model.setDelete(new Integer(num1 - num2));
		model.setProduct(new Integer(num1*num2));
		model.setQuotient(new Integer(num1/num2));

		HttpSession session = request.getSession();
		session.setAttribute("NUM1", Integer.toString(num1));
		session.setAttribute("NUM2", Integer.toString(num2));
		session.setAttribute("SUM", Integer.toString(new Integer(num1 + num2)));
		session.setAttribute("DELETE", Integer.toString(new Integer(num1 - num2)));
		session.setAttribute("PRODUCT", Integer.toString(new Integer(num1*num2)));
		session.setAttribute("QUOTIENT", Integer.toString(new Integer(num1/num2)));
		//session.setAttribute("FILENAME", filename);
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter out = response.getWriter();
		RequestDispatcher dispatcher = request.getRequestDispatcher("FourRules2.jsp");
		dispatcher.forward(request, response);
		
	}

}
