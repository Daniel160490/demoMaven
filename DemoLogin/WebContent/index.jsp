<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LOGIN</title>
<link rel="stylesheet" href="/static/css/bootstrap.css">
<link rel="stylesheet" href="/static/css/bootstrap-theme.css">

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"
	integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp"
	crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
	integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
	crossorigin="anonymous"></script>
</head>


<body>

	<form class="form-signin" name="FORM1" METHOD="POST"
		ACTION="Servlet">
		<div class="text-center mb-4">
			<div class="form-label-group">

				Usuario: <input class="form-control" type=text NAME="NOM" SIZE="25">
			</div>
			<p>
			<div class="form-label-group">
				Contraseña: <input class="form-control" type=password NAME="pass"
					SIZE="25">
			</div>

			<p>
			<div class="form-label-group">
				<select name="idioma">
					<option option selected value="0">Selecciona un idioma</option>
					<option value="español">Español</option>
					<option value="ingles">Ingles</option>
				</select>
			</div>

			<br>

				<input class="btn btn-lg btn-primary btn-block" type=SUBMIT
					VALUE="Acceder">
		</div>

	</form>
	</div>

	<script src="/static/js/bootstrap.js"></script>
</body>
</html>
