<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@page import="java.util.*" %>
   <%@page import="model.TblUsuariocl2" %>
   <%@taglib uri="http://java.sun.com/jsp/jstl/core"   prefix="c" %> 
   <%@taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">Listado de Usuario</h1>
<h2 align="center">
<a  href="RegistrarUsuario.jsp" style="text-decoration:none">Registrar Usuario</a>
</h2>
<table align="center" border="2">
<tr>
<td>Codigo</td>
<td>Usuario</td>
<td>Password</td>
</tr>
<%
List<TblUsuariocl2> listaUsuariocl2s=(List<TblUsuariocl2>)request.getAttribute("listadousuario");
if(listaUsuariocl2s!=null){
	
for(TblUsuariocl2 lis:listaUsuariocl2s){
%>
<tr>
<td>
<%=lis.getIdusuariocl2()%>
</td>
<td>
<%=lis.getUsuariocl2()%>
</td>
<td>
<%=lis.getPasswordcl2() %>
</td>
</tr>
<%
      }//cerramos la condicion...
}   //cerramos el bucle
%>
</table>

</body>
</html>