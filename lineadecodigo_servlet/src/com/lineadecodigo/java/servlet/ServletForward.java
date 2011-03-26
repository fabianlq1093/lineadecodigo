package com.lineadecodigo.java.servlet;

/**
 * @file ServletForward.java
 * @version 1.1
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   26-marzo-2011
 * @url    http://lineadecodigo.com/java/reenviar-peticion-a-otro-servlet/
 * @description Servlet que reenvía la petición a otro Servlet
 */


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletForward extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletForward() {
        super();    
   }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("MiPrimerServlet").forward(request, response); 
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}

}
