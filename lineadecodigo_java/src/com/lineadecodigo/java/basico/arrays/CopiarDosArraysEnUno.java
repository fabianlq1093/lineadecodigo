package com.lineadecodigo.java.basico.arrays;

/**
 * @file CopiarDosArraysEnUno.java
 * @version 1.1
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   6-octubre-2007
 * @url    http://lineadecodigo.com/2007/10/06/copiar-dos-arrays-en-uno-con-java
 * @description Uso del m�todo .arrayCopy para copiar dos arrays sobre uno.  
 */

public class CopiarDosArraysEnUno {


	public static void main(String[] args) {

		int a1[] = {1,2,3,4,5};
		int a2[] = {6,7,8,9,10};
		int a[] = new int[a1.length+a2.length];
	
		System.arraycopy(a1, 0, a, 0, a1.length);
		
		// Listamos el array y vemos que los �ltimos 5 elementos est�n a 0
		System.out.println("Array tras la primera copia");
		listarArray(a);
				
		System.arraycopy(a2, 0, a, a1.length, a2.length);
		
		System.out.println("Array tras la segunda copia");
		listarArray(a);
	}

	 public static void listarArray (int[] a){ 
	   for (int x=0;x<a.length;x++){
	     System.out.println(a[x]);
	   } 
	 }
	
	
}
