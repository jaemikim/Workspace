<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<table border="1" width="90%">
  <tr>
    <td align="center">
    	<%
    		if(session.getAttribute("userId") == null) {
 			%>
 			    	<a href="../session02/loginForm.jsp">�ΰ���</a>    
 			<%
    		} else {
    		%>
    			<a href="../session02/logout.jsp">�α׾ƿ�</a>
    		<%	
    		}
    	%>

    </td>
    
    
    
    
    
    <td align="center">�Խ���</td>
    <td align="center">�Խ���(����¡)</td>
  </tr>
</table>