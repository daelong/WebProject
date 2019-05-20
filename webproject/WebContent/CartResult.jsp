<!-- 좋아요 목록을 담기의 결과를 출력하는 jsp -->
<%@ page contentType="text/html; charset=EUC-KR"%>
<html>
<head>
<meta charset="EUC-KR">
<title>좋아요 담기</title>
</head>
<body>
	<h4>좋아요 담기</h4>
	좋아요 목록에 ${param.ITEM_NUM}개의 상품을 담았습니다.<br><br>
	<a href='#' onClick='self.close()'>닫기</a>
</body>
</html>