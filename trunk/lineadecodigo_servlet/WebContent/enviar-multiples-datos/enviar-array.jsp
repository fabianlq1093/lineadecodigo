<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Enviar array</title>
</head>
<body>

<h1>Enviar un array</h1>


Sus aficiones favoritas son:<br/>

<%
	
	String[] favoritos = request.getParameterValues("favoritos");
	
	for(String favorito: favoritos)
		out.println(favorito + "<br/>");

%>


<br><br>
<hr>
Art&iacute;culo disponible en: <a href="http://lineadecodigo.com/java/enviar-un-array-a-una-jsp/">http://lineadecodigo.com/java/enviar-un-array-a-una-jsp/</a><br/>
<a href="http://lineadecodigo.com" title="Linea de Codigo">lineadecodigo.com</a>


</body>
</html>