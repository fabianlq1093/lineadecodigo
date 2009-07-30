<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sumar datos</title>
</head>
<body>

<h1>Sumar datos</h1>

<%
String datoUno = request.getParameter("dato1");
String datoDos = request.getParameter("dato2");

try {
	int uno = Integer.parseInt(request.getParameter("dato1"));
	int dos = Integer.parseInt(request.getParameter("dato2"));
	int suma = uno + dos;

	out.println("La suma de " + datoUno + " + " + datoDos + " = " + Integer.toString(suma));


} catch(NumberFormatException nfe) {
	out.println("Los datos recibidos no son números enteros");
}


%>

<br><br>
<hr>
Art&iacute;culo disponible en: <a href="http://lineadecodigo.com/java/recibir-un-parametro-numerico-en-una-jsp/">http://lineadecodigo.com/java/recibir-un-parametro-numerico-en-una-jsp/</a><br/>
<a href="http://lineadecodigo.com" title="Linea de Codigo">lineadecodigo.com</a>


</body>
</html>