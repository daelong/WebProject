<%@ page contentType="text/html; charset=EUC-KR"%>
<jsp:useBaen id="boardItem" class="mall.BoardItem" />
<jsp:setProperty name="boardItem" property="seqNo" value="${param.SEQ_NO}" />
<% boardItem.readDB(); %>
<h4>게시글 읽기</h4>
[제목]${boardItem.title}<br>
[작성자]${boardItem.writer}
[작성일시]${boardItem.date}${boardItem.time}<br>
---------------------------------------------<br>
${boardItem.content}