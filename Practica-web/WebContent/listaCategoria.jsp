<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@page import="java.util.List"%>
	<%@page import="es.indra.beans.Categoria"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Categorias disponibles</title>
</head>
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
</html>