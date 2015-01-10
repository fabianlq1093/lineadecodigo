<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Obtener la fecha en un JSP</title>
</head>
<body>
<h1>Obtener la fecha en un JSP</h1>

<%
 java.util.Calendar cal = java.util.Calendar.getInstance(java.util.Locale.US);
 java.util.Date date = cal.getTime();
 java.text.DateFormat formateadorHora = java.text.DateFormat.getTimeInstance(java.text.DateFormat.FULL);
 java.text.DateFormat formateadorFecha = java.text.DateFormat.getDateInstance(java.text.DateFormat.FULL);

 out.println(formateadorFecha.format(date));
 out.println(formateadorHora.format(date));
%>

<br><br>
<hr>
Art&iacute;culo disponible en: <a href="http://lineadecodigo.com/2008/01/16/obtener-la-fecha-en-un-jsp/">http://lineadecodigo.com/2008/01/16/obtener-la-fecha-en-un-jsp/</a><br/>
<a href="http://lineadecodigo.com" title="Linea de Codigo">lineadecodigo.com</a>


</body>
</html>