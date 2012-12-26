package com.lineadecodigo.groovy.ficheros

/**
 * @file LeerContenidoFichero.groovy
 * @version 1.0
 * @author Victor Cuervo (http://lineadecodigo.com)
 * @date   16-diciembre-2012
 * @url    http://lineadecodigo.com/groovy/mostrar-el-contenido-de-un-fichero-con-groovy/
 * @description Programa que lee e contenido de un fichero de texto y lo muestra por pantalla
 */

def linea = 1
def listarFichero = { println "$linea - $it"; linea++; }
new File ("text.txt").eachLine listarFichero
