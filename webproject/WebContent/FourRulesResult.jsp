<%@ page contentType="text/html; charset=euc-kr"%>
<%@ page import="java.io.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="euc-kr">
<title>��Ģ����</title>
</head>
<body>
<%
	BufferedReader reader = null;
	try{
		String filePath = application.getRealPath("/WEB-INF/bbs/answer.txt");
		reader = new BufferedReader(new FileReader(filePath));
		while(true){
			String str0 = reader.readLine();
			if(str0 == null)
				break;
			out.println(str0 + "<br>");
		}
	}
	catch(FileNotFoundException fnfe){
		out.println("������ �������� �ʽ��ϴ�.");
	}
	catch(IOException ioe){
		out.println("������ ���� �� �����ϴ�.");
	}
	finally{
		try{
			reader.close();
		}
		catch(Exception e){
		}
	}
%>
</body>
</html>