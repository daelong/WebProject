<%@ page contentType="text/html; charset=EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>��Ģ����</title>
</head>
<body>
������ �����? <%= request.getAttribute("SUM") %><br>
������ �����? <%= request.getAttribute("DELETE") %><br>
������ �����? <%= request.getAttribute("PRODUCT") %><br>
�������� �����? <%= request.getAttribute("QUOTIENT") %><br>
</body>
</html>