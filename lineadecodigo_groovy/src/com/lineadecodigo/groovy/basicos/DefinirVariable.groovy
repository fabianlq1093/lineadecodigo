package com.lineadecodigo.groovy.basicos

/**
* @file DefinirVariable.groovy
* @version 1.0
* @author Victor Cuervo (http://lineadecodigo.com)
* @date   13/noviembre/2012
* @url    http://lineadecodigo.com/groovy/definir-una-variable-en-groovy/
* @description Define una variable en un programa Groovy
*/


// Variables Genéricas
def variable = "Víctor"
println "Hola $variable"

variable = 123
println "Hola $variable"

// Variables tipadas
String nombre = "Víctor"
println "Hola $nombre"

// Conversiones permitidas
nombre = 123;
println "Hola $nombre"

// Conversiones no permitidas
//int numero = 123
//numero = "123"