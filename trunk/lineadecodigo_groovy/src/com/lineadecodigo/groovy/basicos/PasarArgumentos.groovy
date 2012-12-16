package com.lineadecodigo.groovy.basicos

/**
 * @file PasarArgumentos.groovy
 * @version 1.0
 * @author Ariel Carraro (http://lineadecodigo.com)
 * @date   14-diciembre-2012
 * @url    http://lineadecodigo.com/groovy/paso-de-argumentos-en-groovy/
 * @description Programa que recupera los argumentos enviados como inicio del programa.
 */

if(args){
  args.each(){ it->
    println "Hola $it"
  }  
} else {
   println "no introduciste nada"
}