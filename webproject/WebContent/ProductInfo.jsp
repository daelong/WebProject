<%@ page contentType="text/html; charset=EUC-KR"%>
<%@ page import="mall.ProductInfo" %>
<%
	ProductInfo product = new ProductInfo();
	product.setName("��������ũ3ȣ");
	product.setPrice(20000);
	request.setAttribute("PRODUCT", product);
	RequestDispatcher dispatcher = request.getRequestDispatcher("ProductInfoView.jsp");
	dispatcher.forward(request, response);

%>