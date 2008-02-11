package com.lineadecodigo.java.util.collections;

/**
 * @file ListarConjunto.java
 * @version 1.1
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   31-julio-2007
 * @url  http://lineadecodigo.com/2007/08/03/listar-un-conjunto/
 * @description Listar los elementos de un conjunto.  
 */

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ListarConjunto {

	public static void main(String[] args) {
	    
		Set<String> hs = new HashSet<String>();
	    hs.add("Victor");
	    hs.add("Amaya");
	    hs.add("Amaya"); // Los elementos solo pueden estar una vez
	    hs.add("Javier");
	   
	    Iterator iter = hs.iterator();
	    while (iter.hasNext())
	      System.out.println(iter.next());
		
		
	}

}
