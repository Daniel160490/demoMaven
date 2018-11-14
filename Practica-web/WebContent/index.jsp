<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Creacion de Categorias</title>
</head>
<body>


	<form class="form-signin" name="FORM1" METHOD="POST"
		ACTION="Servlet">
		<div class="text-center mb-4">
			<div class="form-label-group">
				ID: <input class="form-control" type=text NAME="id" SIZE="25">
			</div>
			<br>
			<div class="form-label-group">
				Nombre de categoria: <input class="form-control" type=text
					NAME="nombre" SIZE="25">
			</div>

			<br> 
			<input class="btn btn-lg btn-primary btn-block"
					type=SUBMIT VALUE=" Añadir ">
		</div>

	</form>
	
	
</body>
</html>