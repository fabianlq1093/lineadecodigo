package com.lineadecodigo.java.util;

/**
 * @file ListarUnMapa.java
 * @version 1.1
 * @author 	Linea de Codigo (http://lineadecodigo.com)
 * @date   	8-julio-2007
 * @url		http://lineadecodigo.com/2007/07/13/listar-un-mapa-con-java-util/
 * @description Recorrer una estructura de tipo HashMap y mostrar sus elementos.
 */

import java.util.*;

public class ListarUnMapa {

	public static void main(String[] args) {
		
		Map<String,String> hm = new HashMap<String,String>();
		   
		hm.put("1","Luis");
		hm.put("2","Amaya");
		hm.put("3","Julio");

		// Añadimos un elemento con clave existente. Se sobrescribe su valor
		// ya que no puede haber valores duplicados
		hm.put("1","Victor");
		   
		Iterator it = hm.entrySet().iterator();
		
		while (it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println(e.getKey() + " " + e.getValue());
		}
	}

}

