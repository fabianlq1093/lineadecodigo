package com.lineadecodigo.groovy.xml

/**
 * @file CrearFicheroXML.groovy
 * @version 1.0
 * @author V’ctor Cuervo (http://lineadecodigo.com)
 * @date   02/01/2013
 * @url    http://lineadecodigo.com/groovy/generar-un-fichero-xml-con-groovy/
 * @description Programa que genera un fichero con una estructura XML
 */


// Creamos un constructor de cadenas
def sw = new StringWriter()

println "Definiendo XML..."
def xml = new groovy.xml.MarkupBuilder(sw)
xml.libros{
  libro(autor:"Cervantes","El Quijote")
  libro(autor:"Homero","La Iliada")
  libro(autor:"Camilo Jose Cela","Viaje a la Alcarria")
}

println "Generando fichero..."
def f = new File("libros.xml")
f.write(sw.toString())

println "Fin."