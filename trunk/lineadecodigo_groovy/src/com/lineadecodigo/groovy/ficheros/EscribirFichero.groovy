package com.lineadecodigo.groovy.ficheros

/**
 * @file EscribirFichero.groovy
 * @version 1.0
 * @author Victor Cuervo (http://lineadecodigo.com)
 * @date   2-enero-2013
 * @url    http://lineadecodigo.com/groovy/escribir-un-fichero-con-groovy/
 * @description Crear un ficherio de texto en Groovy
 */


def fichero = new File("borrame.txt")
fichero.write("Contenido del fichero")
