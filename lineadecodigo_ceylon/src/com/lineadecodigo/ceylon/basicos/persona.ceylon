/**
 * @file Persona.ceylon
 * @version 0.1
 * @author Ariel Carraro
 * @date   28.diciembre.2012
 * @url   http://lineadecodigo.com/ceylon/crear-una-clase-en-ceylon/
 * @description Programa que imprime un mensaje
 */
 
doc "Clase Persona"
by "Ariel Carraro"
class Persona(){
	shared void verMsg(){
	  print("funcionando...desde Ceylon");
	}
}
//se pude considerar la funci—n "main" del programa
void run(){
  verPersona(Persona());
}

void verPersona(Persona persona){
	persona.verMsg();
}