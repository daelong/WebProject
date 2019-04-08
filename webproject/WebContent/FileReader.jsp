<%@ page contentType="text/html; charset=EUC-KR"%>
<%@ page import="java.io.*" %>
<html>
<head>
<meta charset="EUC-KR">
<title>파일 읽기</title>
</head>
<body>
	<%
		BufferedReader reader = null;
		try{
			String filePath = application.getRealPath("/WEB-INF/input.txt");
			reader = new BufferedReader(new FileReader(filePath));
			while(true){
				String str = reader.readLine();
				if(str == null)
					break;
				out.println(str + "<br>");
			}
		}
		catch(FileNotFoundException fnfe){
			out.println("파일이 존재하지 않습니다.");
		}
		catch(IOException ie){
			out.println("파일이 존재하지 않습니다.");
		}
		finally{
			try{
				reader.close();
			}
			catch (Exception e){
			}
		}
	%>
</body>
</html>