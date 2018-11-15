<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<footer
	style="background-color: green; text-align: center; color: white;">

	IDIOMA SELECCIONADO:
	<%
	//out.println(session.getValue("idioma"));
	%>
	<%
		Cookie[] cookies = request.getCookies();
		for (int i = 0; i < cookies.length; i++) {
			Cookie cookieActual = cookies[i];
			String identificador = cookieActual.getName();
			String valor = cookieActual.getValue();
			if (identificador.equals("usuario")) {
				out.println(session.getValue(valor));
			}
		}
	%>
</footer>