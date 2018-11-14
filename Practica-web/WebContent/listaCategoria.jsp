<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Categorias disponibles</title>
</head>
<body>

	<div>
	<h1>Listado de Categorias</h1>
		<p>
			<%=request.getParameter("nombre")%>
		</p>
		<br>
		<a class="btn btn-lg btn-primary btn-block" href="index.jsp">ATRAS</a>
	</div>

</body>
</html>