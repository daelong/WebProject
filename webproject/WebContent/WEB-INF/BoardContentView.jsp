<%@ page contentType="text/html; charset=EUC-KR"%>
<jsp:useBaen id="boardItem" class="mall.BoardItem" />
<jsp:setProperty name="boardItem" property="seqNo" value="${param.SEQ_NO}" />
<% boardItem.readDB(); %>
<h4>�Խñ� �б�</h4>
[����]${boardItem.title}<br>
[�ۼ���]${boardItem.writer}
[�ۼ��Ͻ�]${boardItem.date}${boardItem.time}<br>
---------------------------------------------<br>
${boardItem.content}