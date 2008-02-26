package com.lineadecodigo.java.file;

import java.io.File;

/**
 * @file LeerFichero.java
 * @version 1.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   26-febrero-08
 * @url    http://lineadecodigo.com/
 * @description Borrar un fichero desde un programa Java
 */


public class BorrarFichero {

	public static void main(String[] args) {
		
		String sFichero = "fichero.txt";
		File f = new File(sFichero);
		
		if (f.delete())
			System.out.println("El fichero " + sFichero + " ha sido borrado correctamente");
		else
			System.out.println("El fichero " + sFichero + " no se ha podido borrar");

	}

}
