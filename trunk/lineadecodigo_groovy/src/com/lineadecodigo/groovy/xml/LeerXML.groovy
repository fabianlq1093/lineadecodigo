package com.lineadecodigo.groovy.xml

/**
 * @file LeerXML.groovy
 * @version 1.0
 * @author Victor Cuervo (http://lineadecodigo.com)
 * @date   1-enero-2013
 * @url    http://lineadecodigo.com/groovy/leer-un-xml-con-groovy/
 * @description Programa Groovy que lee un XML
 */



def libros = new XmlSlurper().parse(new File('libros.xml'))
for (libro in libros.libro) {
	println "El libro titulado $libro fue escrito por ${libro.@autor}"
}


