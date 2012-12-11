package com.lineadecodigo.groovy.listas

/**
 * @file ListarListaClosures.groovy
 * @version 1.0
 * @author Victor Cuervo (http://lineadecodigo.com)
 * @date   11-diciembre-2012
 * @url    http://lineadecodigo.com/groovy/listar-lista-con-closures-en-groovy/
 * @description Programa que crea una lista en Groovy y la recorre con un closure
 */

// Definir y recorrer una lista
def lista = ["Victor","Julio","Mar’a","Ignacio","Virginia"]

// Recorrer una lista con un closure  
println "Imprimimos lista mediante un closure"  
def imprimir ={println it}
lista.each imprimir