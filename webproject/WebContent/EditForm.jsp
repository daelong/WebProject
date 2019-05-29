<%@ page contentType="text/html; charset=EUC-KR"%>
<html>
<head>
<meta charset="EUC-KR">
<title>상품 정보 관리</title>
</head>
<body>
	<h4>상품 정보를 수정한 후 수정 버튼을 누르세요</h4>
	<form action=Update method=post>
	코드 : <input type=text name=code size=5 value='${CODE}' READONLY=TRUE><br>
	제목 : <input type=text name=title size=50 value='${TITLE}'><br>
	저자 : <input type=text name=writer size=20 value='${WRITER}'><br>
	가격 : <input type=text name=price size=8 value='${PRICE}'><br>
	<input type=submit value='수정'>
	</form>
</body>
</html>