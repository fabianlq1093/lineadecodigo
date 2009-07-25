package com.lineadecodigo.java.servlet;

/**
 * @file RespuestaXML.java
 * @version 1.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   25.julio.2009
 * @url  http://lineadecodigo.com/java/servlet-que-devuelve-xml/
 * @description Servlet que devuelve una respuesta XML
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RespuestaXML extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public RespuestaXML() {
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/xml");
		PrintWriter out = response.getWriter();
		out.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?><nombre>Linea de Codigo</nombre>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}

}
