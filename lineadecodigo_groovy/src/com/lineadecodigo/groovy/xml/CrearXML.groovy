package com.lineadecodigo.groovy.xml

/**
 * @file CrearXML.groovy
 * @version 1.0
 * @author Victor Cuervo (http://lineadecodigo.com)
 * @date   1-enero-2012
 * @url    http://lineadecodigo.com/groovy/crear-un-xml-con-groovy/
 * @description Crear un XML utilizando Groovy
 */

// Creamos un constructor de cadenas
def sw = new StringWriter()

def xml = new groovy.xml.MarkupBuilder(sw)
xml.libros{
  libro(autor:"Cervantes","El Quijote")
  libro(autor:"Homero","La Iliada")
  libro(autor:"Camilo Jose Cela","Viaje a la Alcarria")
  libro(autor:"Camilo Jose Cela","La Colmena")
  libro(autor:"Valerio Massimo Manfredi","Talos de Esparta")
  libro(autor:"Valerio Massimo Manfredi","La òltima Legi—n")
}

println sw