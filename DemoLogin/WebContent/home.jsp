<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HOME</title>
</head>
<body>
	<div>
		<p>
			Bienvenido,
			<%=request.getParameter("NOM")%>
		</p>
	</div>
</body>
<%@ include file="footer.jsp" %>
</html>