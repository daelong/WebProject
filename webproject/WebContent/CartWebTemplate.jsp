<!-- ��ٱ��� �޴��� �ִ� �� ���ø� -->
<%@ page contentType="text/html; charset=EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta charset="EUC-KR">
<title>CUK</title>
</head>
<body>
	<h1>CUK</h1>
	<table border=1 cellpadding=10>
		<tr>
		<td width=190 valign=top>
			<c:choose>
				<c:when test="${sessionScopeLOGIN_ID == null }">
					<jsp:include page="LoginWindow.html"/>
				</c:when>
				<c:otherwise>
					<jsp:include page="LogoutWindow.jsp"/>
				</c:otherwise>
			</c:choose>
			<a href="WebTemplate.jsp?BODY_PATH=Intro.html">����Ʈ �Ұ�</a><br>
			<a href="cart-list">��ٱ���</a><br>
		</td>
		<td valign=top width=650>
			<jsp:include page="${param.BODY_PATH}"/>
		</td>
		</tr>
	</table>
</body>
</html>