package com.lineadecodigo.groovy.basicos

/**
 * @file CrearClase.groovy
 * @version 1.0
 * @author Ariel Carraro
 * @date   26/enero/2014
 * @url    http://lineadecodigo.com/groovy/xxx/
 * @description Creaci—n de una clase en Groovy
 */

static main(args) {
	def miPC=new Computadora(marca:"DELL",modelo:"1501")
	def miPortatil=new Computadora_Portatil()

	miPortatil.with{
		memoria="1.7GiB"
		procesador="AMD V120 Processor"
	}

	println "Mi PC:"
	println "marca >> ${miPC.marca} , modelo >> ${miPC.modelo}"

	println "Mi PC portatil:"
	println "memoria >> ${miPortatil.memoria} , procesador >> ${miPortatil.procesador}"

}

class Computadora {
	String marca
	String modelo

	//constructor
	Computadora(){}
}

class Computadora_Portatil extends Computadora{
	String memoria
	String procesador
	
	//constructor
	Computadora_Portatil(){}
}