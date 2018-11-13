<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Resultado</title>
	</head>
	
	<body>
		<div>
			<%! 
				String mensaje; %>
			<%
				mensaje = request.getParameter("NOM");
			%>
			<p> Hola, <%= mensaje %> </p> 
		
		</div>
	</body>

</html>