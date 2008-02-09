package com.lineadecodigo.java.util;

/**
 * @file RecorrerListaHaciaAtras.java
 * @version 1.1
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   16-julio-2007
 * @url    http://lineadecodigo.com/2007/07/19/recorrer-una-lista-hacia-atras-en-java/
 * @description Recorrer una lista desde el último elemento hacía el primero
 */


import java.util.*;

public class RecorrerListaHaciaAtras {


	public static void main(String[] args) {
	
		  // Definimos una ArrayList
	    List<String> list = new ArrayList<String>();

	    // Añadimos elementos
	    list.add("Victor");
	    list.add("Amaya");
	    list.add("Julio");

	    // Obtenemos un Iterador y recorremos la lista.
	    ListIterator iter = list.listIterator(list.size());
	    while (iter.hasPrevious())
	      System.out.println(iter.previous());

	}

}
