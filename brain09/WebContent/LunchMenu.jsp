<%@ page contentType="text/html; charset=EUC-KR"%>
<%
	String arr[]={"�Ұ�� ���", "���Ƕ��̽�", "�ᱹ��"};
	request.setAttribute("MENU", arr);
%>
<jsp:forward page="LunchMenuView.jsp"/>