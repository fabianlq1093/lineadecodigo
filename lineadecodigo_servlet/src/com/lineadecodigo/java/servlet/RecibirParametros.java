package com.lineadecodigo.java.servlet;

/**
 * @file RecibirParametros.java
 * @version 1.1
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   25-dic-2007
 * @url    http://lineadecodigo.com/2007/12/25/recibir-parametros-en-un-servlet/
 * @description Servlet que procesa una petici—n de par‡metros via POST y GET  
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 public class RecibirParametros extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
  
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public RecibirParametros() {
		super();
	}   	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}  	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		//Capturamos los par‡metros
		String parametro1 = request.getParameter("texto1");
		String parametro2 = request.getParameter("texto2");
		   
		PrintWriter out;
		out = response.getWriter();
		   
		response.setContentType("text/html");
		  
		out.println("<html>");
		out.println("<head><title>Enviar parametros a un Servlet</title></head>");
		out.println("<body>");
		out.println("<h1>Enviar parametros a un Servlet</h1>");
		out.println("La primera palabra pasada como par&aacute;metro es <strong>" + parametro1 + "</strong><br>");
		out.println("La segunda palabra pasada como par&aacute;metro es <strong>" + parametro2 + "</strong><br>");
		out.println("<hr>");
		out.println("<a href='index.html'>Indice de ejemplos</a> | <a href='EnviarParametros.html'>Enviar parametros</a>");
		out.println("</body></html>");
				
	}   	  	    
}