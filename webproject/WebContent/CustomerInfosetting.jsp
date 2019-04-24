<%@ page contentType="text/html; charset=EUC-KR"%>
<jsp:useBean class="mall.PersonnalInfo" id="pinfo" scope="request" />
<jsp:setProperty name="pinfo" property="name" value="±èÇö¼ö" />
<jsp:setProperty name="pinfo" property="gender" value="³²" />
<jsp:setProperty name="pinfo" property="age" value="23" />
<jsp:forward page="CustomerInfoViewer.jsp" />
