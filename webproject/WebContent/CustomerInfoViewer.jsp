<%@ page contentType="text/html; charset=EUC-KR"%>
<html>
<head>
<meta charset="EUC-KR">
<title>회원정보</title>
</head>
<body>
	<jsp:useBean class="mall.PersonnalInfo" id="pinfo" /> <!-- scope="request" -->
	<jsp:setProperty name="pinfo" property="*" /> 
	이름 : <jsp:getProperty name="pinfo" property="name" /><br>
	성별 : <jsp:getProperty name="pinfo" property="gender" /><br>
	나이 : <jsp:getProperty name="pinfo" property="age" />
</body>
</html>