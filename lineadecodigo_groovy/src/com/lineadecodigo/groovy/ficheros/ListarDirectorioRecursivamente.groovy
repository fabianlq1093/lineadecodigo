package com.lineadecodigo.groovy.ficheros

/**
 * @file ListarDirectorioRecursivamente.groovy
 * @version 1.0
 * @author victor (http://lineadecodigo.com)
 * @date   03/01/2013
 * @url    http://lineadecodigo.com/groovy/listar-un-directorio-de-forma-recursiva-con-groovy/
 * @description Programa que lista un directorio y todos los directorios que son contenidos de forma recursiva.
 */


def listar = { println it }
def directorio = "/users/victor/Documents"

print "Listando el directorio $directorio de forma recursiva"
new File (directorio).eachFileRecurse listar
