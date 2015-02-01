package com.lineadecodigo.java.basico.variables;

/**
 * @file TiposDatoObjeto.java
 * @version 1.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   31/enero/2015
 * @url		http://lineadecodigo.com/java/tipo-de-objeto-boolean/
 * @description Operaciones para crear y modificar un objeto boolean
 */

public class TipoDatoBoolean {

	public static void main(String[] args) {
		
		Boolean b1 = new Boolean(false);
	    Boolean b2 = new Boolean("true");

	    System.out.println(b1.booleanValue());
	    System.out.println(b2.booleanValue());

	}

}
