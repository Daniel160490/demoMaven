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
		<!-- Declaro variable para recoger datos del otro jsp -->
			<%! 
				String mensaje; %>
			<%
				mensaje = request.getParameter("NOM");
			%>
			<!-- esto hace lo mismo que si le paso la variable mensaje -->
			<p> Hola, <%= request.getParameter("NOM") %> </p> 
		
		</div>
	</body>

</html>