<%@ page contentType="text/html; charset=euc-kr"%>
<%@ page import="java.io.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="euc-kr">
<title>사칙연산</title>
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
		out.println("파일이 존재하지 않습니다.");
	}
	catch(IOException ioe){
		out.println("파일을 읽을 수 없습니다.");
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