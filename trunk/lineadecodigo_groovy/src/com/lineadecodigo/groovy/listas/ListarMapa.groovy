package com.lineadecodigo.groovy.listas

/**
 * @file ListarMapa.groovy
 * @version 1.0
 * @author Victor Cuervo (http://lineadecodigo.com)
 * @date   16-diciembre-2012
 * @url    http://lineadecodigo.com/groovy/definir-un-mapa-con-groovy/
 * @description Programa nos permite definr un mapa y listar el contenido del mismo mediante un closure
 */

// Definir un mapa
def mapa = ["c1":"Victor","c2":"Julio","c3":"Elena","c4":"Patricia"]

// Recorrer un mapa con un clousure
def imprimirMapa = {println "$it.key = $it.value" }
mapa.each imprimirMapa
