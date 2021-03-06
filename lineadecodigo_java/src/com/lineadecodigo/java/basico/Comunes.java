package com.lineadecodigo.java.basico;

/**
 * @file Comunes.java
 * @version 1.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   25/marzo/2009
 * @url  
 * @description Clase con un conjunto de operaciones comunes
 */

public final class Comunes {
	
	// Validaci�n de si una cadena es un n�mero
	public static boolean isNumeric(String cadena){
		try {
			Integer.parseInt(cadena);
			return true;
		} catch (NumberFormatException nfe){		
			return false;
		}
	}
}
