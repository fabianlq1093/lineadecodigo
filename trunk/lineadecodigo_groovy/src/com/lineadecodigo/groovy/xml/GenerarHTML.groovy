/**
 * @file GenerarHTML.groovy
 * @version 1.0
 * @author victor (http://lineadecodigo.com)
 * @date   02/01/2013
 * @url    http://lineadecodigo.com/groovy/crear-una-pagina-web-html-mediante-groovy/
 * @description C—digo que genera un fichero HTML
 */

package com.lineadecodigo.groovy.xml

def sw = new StringWriter();
def paginaweb = new groovy.xml.MarkupBuilder(sw)

paginaweb.html({
	head({
		title("Pagina Web Generada Con Groovy")
	})
	body({
		h1("Pagina creada con Groovy")
		p("Esto es una pagina generada mediante un programa Groovy")
		hr()		
		a(href:"http://lineadecodigo.com","Linea de Codigo")
	})
})

def fichero = new File("index.html")
fichero.write(sw.toString())
