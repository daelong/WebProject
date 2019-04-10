<%@ page contentType="text/html; charset=EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>사칙연산</title>
</head>
<body>
덧셈의 결과는? <%= request.getAttribute("SUM") %><br>
뺄셈의 결과는? <%= request.getAttribute("DELETE") %><br>
곱셈의 결과는? <%= request.getAttribute("PRODUCT") %><br>
나눗셈의 결과는? <%= request.getAttribute("QUOTIENT") %><br>
</body>
</html>