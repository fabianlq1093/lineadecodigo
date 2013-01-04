package com.lineadecodigo.groovy.ficheros

/**
 * @file ListarDirectorio.groovy
 * @version 1.0
 * @author Victor Cuervo (http://lineadecodigo.com)
 * @date   31-diciembre-2012
 * @url    http://lineadecodigo.com/groovy/listar-un-directorio-con-groovy/
 * @description Programa que lista los ficheros de un directorio de forma recursiva
 */

def listar = { println it }
def directorio = "/users/victor/Documents"

println "Listando el directorio $directorio"
new File (directorio).eachFile listar

println "Listando en una sola l’nea"
new File ("/users/victor/Documents").eachFile { println it }