<%@ page contentType="text/html; charset=EUC-KR"%>
<%@ page import="java.io.*" %>
<html>
<head>
<meta charset="EUC-KR">
<title>���� �б�</title>
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
			out.println("������ �������� �ʽ��ϴ�.");
		}
		catch(IOException ie){
			out.println("������ �������� �ʽ��ϴ�.");
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