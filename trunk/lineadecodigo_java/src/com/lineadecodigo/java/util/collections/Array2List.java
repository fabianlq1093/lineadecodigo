package com.lineadecodigo.java.util.collections;

/**
 * @file Array2List.java
 * @version 1.1
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   24-jun-2006
 * @url    http://lineadecodigo.com/2007/06/30/convertir-un-array-en-una-lista/
 * @description Convertir un array en una lista mediante el framework Collections y el método .asList 
 */

import java.util.*;

public class Array2List {

	public static void main(String[] args) {
		//Declaramos un array de cadenas
	    String[] cadenas = new String[3];
	    cadenas[0] = "Victor";
	    cadenas[1] = "Amaya";
	    cadenas[2] = "Luis";

	    // Declaramos una lista
	    List lista = new ArrayList();
	   
	    // Convertimos el array en una lista
	    // mediante la clase estática Arrays
	    lista = Arrays.asList(cadenas);

	    // Obtenemos un iterador y recorremos la lista
	    Iterator iter = lista.iterator();

	    while (iter.hasNext())
	      System.out.println(iter.next());
   
	}
}
