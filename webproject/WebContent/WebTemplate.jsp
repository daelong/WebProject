<%@ page contentType="text/html; charset=EUC-KR"%>
<html>
<head>
<meta charset="EUC-KR">
<title>�Ѻ��̵��</title>
</head>
<body>
	<h4>�Ѻ��̵��</h4>
	<table border=1 cellpadding=10>
		<tr>
			<td width=150 valign=top>
				<a href="?BODY_PATH=Intro.html">ȸ�� �Ұ�</a><br>
				<a href="books-info">å ����</a><br>
				<a href="BBSInput.html">�Խ��� �۾���</a><br>
				<a href="bbs-list">�Խ��� ���б�</a><br>
			</td>
			<td valign=top width=650>
				<jsp:include page="${param.BODY_PATH}"/>
			</td>
	</table>
	<h5>Copyright@ 1993-2010 �Ѻ��̵��(��)</h5>
</body>
</html>