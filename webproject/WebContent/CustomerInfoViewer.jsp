<%@ page contentType="text/html; charset=EUC-KR"%>
<html>
<head>
<meta charset="EUC-KR">
<title>ȸ������</title>
</head>
<body>
	<jsp:useBean class="mall.PersonnalInfo" id="pinfo" /> <!-- scope="request" -->
	<jsp:setProperty name="pinfo" property="*" /> 
	�̸� : <jsp:getProperty name="pinfo" property="name" /><br>
	���� : <jsp:getProperty name="pinfo" property="gender" /><br>
	���� : <jsp:getProperty name="pinfo" property="age" />
</body>
</html>