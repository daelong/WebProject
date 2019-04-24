package webproject;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import mall.PersonnalInfo;

public class CustomerInfoSetting extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		PersonnalInfo pinfo = new PersonnalInfo();
		pinfo.setName("����ȣ");
		pinfo.setGender('��');
		pinfo.setAge(23);
		request.setAttribute("pinfo", pinfo);
		RequestDispatcher dispatcher = request.getRequestDispatcher("CustomerInfoViewer.jsp");
		dispatcher.forward(request, response);
	}

}
