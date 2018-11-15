<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@page import="es.indra.beans.Categoria"%>
	<%@page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Categorias disponibles</title>
</head>
<%@ include file="header.jsp"%>
<body>


	<table>

		<%
			List<Categoria> todas = (List<Categoria>) request.getAttribute("listaCategoria");
			for (Categoria cats : todas) {
		%>
		<tr>
			<td><%=cats.getId()%></td>
			<td><%=cats.getNombre()%></td>
		</tr>

		<%
			}
		%>
	</table>

</body>
<%@ include file="footer.jsp" %>
</html>