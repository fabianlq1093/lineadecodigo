package com.lineadecodigo.java.servlet;

/**
 * @file ObtenerXForwardedFor.java
 * @version 1.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   10.octubre.2009
 * @url  http://lineadecodigo.com/java/recuperar-la-cabecera-x-forwarded-for/
 * @description Acceder a las cabeceras HTTP para recuperar X-Forwarded-For
 */

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 public class ObtenerXForwardedFor extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
   static final long serialVersionUID = 1L;

	public ObtenerXForwardedFor() {
		super();
	}   	
		
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 String sIP = request.getHeader("X-FORWARDED-FOR");
		 
		 PrintWriter out = response.getWriter();
		 out.print("La IP origen ha llegado por: " + sIP);

	}  	
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}   	  	    
}