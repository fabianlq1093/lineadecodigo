package com.lineadecodigo.groovy.basicos

/**
 * @file HolaMundo.groovy
 * @version 1.0
 * @author Victor Cuervo (http://lineadecodigo.com)
 * @date   14-diciembre-2012
 * @url    http://lineadecodigo.com/groovy/lectura-por-consola-en-groovy/
 * @description Programa en Groovy que nos permite realizar una lectura por consola
 */

def leerConsola = {
	println "Dame un dato"
	def texto = it.readLine();
	print "La cadena insertada en consola ha sido '$texto'"
}

System.in.withReader leerConsola