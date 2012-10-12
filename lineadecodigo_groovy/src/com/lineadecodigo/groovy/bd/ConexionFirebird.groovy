package com.lineadecodigo.groovy.bd

/**
* @file ConexionFirebird.groovy
* @version 1.0
* @author Ariel Carrado (http://lineadecodigo.com)
* @date   12-octubre-2012
* @url    http://lineadecodigo.com/groovy/conexion-a-base-de-datos-firebird-desde-groovy/
* @description Conectarnos a una base de datos Firebird desde Groovy
*/


import groovy.sql.*

class ConexionFirebird {
	
	public static void main(String ... args){
		
			def direccionBase="jdbc:firebirdsql://localhost/C:/Program Files/Firebird/Firebird_2_5/examples/empbuild/EMPLOYEE.FDB"
			def usuario="sysdba"
			def password="masterkey"
			def consulta="select *from country"
			def driverConexion="org.firebirdsql.jdbc.FBDriver"
			def sql= Sql.newInstance(direccionBase,usuario,password,driverConexion)
			sql.eachRow(consulta){ fila ->
				println fila.country + "  "+ fila.currency
			}
		}

}
