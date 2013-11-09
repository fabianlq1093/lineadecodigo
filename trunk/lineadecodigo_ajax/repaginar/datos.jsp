<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%
String[] provincias = {"Álava",
		"Albacete",
		"Alicante",
		"Almería",
		"Asturias",
		"Ávila",
		"Badajoz",
		"Barcelona",
		"Burgos",
		"Cáceres",
		"Cádiz",
		"Cantabria",
		"Castellón",
		"Ciudad Real",
		"Córdoba",
		"La Coruña",
		"Cuenca",
		"Gerona",
		"Granada",
		"Guadalajara",
		"Guipúzcoa",
		"Huelva",
		"Huesca",
		"Islas Baleares",
		"Jaén",
		"León",
		"Lérida",
		"Lugo",
		"Madrid",
		"Málaga",
		"Murcia",
		"Navarra",
		"Orense",
		"Palencia",
		"Las Palmas",
		"Pontevedra",
		"La Rioja",
		"Salamanca",
		"Segovia",
		"Sevilla",
		"Soria",
		"Tarragona",
		"Santa Cruz de Tenerife",
		"Teruel",
		"Toledo",
		"Valencia",
		"Valladolid",
		"Vizcaya",
		"Zamora",
		"Zaragoza"};


// Pagina que piden
int pagina = Integer.valueOf(request.getParameter("pagina"));
pagina=(pagina-1)*10;

out.println("<ul>");
for (int x=0;x<10;x++)
	out.println("<li>" + provincias[pagina+x] + "</li>");	
	
out.println("</ul>");

%>