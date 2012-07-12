/**
 * @file Closures.groovy
 * @version 1.0
 * @author Ariel Carraro (http://lineadecodigo.com)
 * @date   12/07/2012
 * @url    http://lineadecodigo.com/groovy/groovy-un-vistazo-a-los-closures/
 * @description Formas de definir los Closures en Groovy
 */

//solo imprime el mensaje "Hola desde un closure"
def hola={
  println("Hola desde un closure")
}
//invocar closure "hola"
hola()

//2. closure con un parámetro
// multiplica un número por 2
def doble={ n ->
        return n*2
}
//invocar closure "doble"
def numero=doble(5)
println("el doble de 5 es "+numero)
// también puede escribirse println "el doble de 5 es ${numero}"

//3. closure con dos parámetros
def var="Bienvenido"
// imprime el valor de var y el parámetro que le envie el usuario
def msg1={it -> println "${var}  ${it}"}
//invocamos el closure, debe salir el mensaje "Bienvenido mundo"
msg1("mundo") 

//4. closure más complejo
//defino un closure con dos parámetros
def otro={metodo, parametro -> metodo(parametro)}
//ahora defino dos closure que reciben un solo parámetro
def inicio={it -> println "Hola ${it}"}
def fin={it -> println "Adios ${it}"}
//invoco el closure "otro"
otro(inicio,"Fernando")
otro(fin,"Fernando")

//5. mandar una lista a un closure
//defino una lista
def lista=["Andrea","Fernando","Antonio","Lucero","Veronica"]
//uso el closure "inicio"
println "\n"
lista.each inicio


//6. closures y diccionarios
//defino el diccionario
def dicc=['Fernando':31,'Veronica':27,'María':43,'Yezmin':26,'Horacio':15]
def suma=0
//defino el closure
def edadTotal={ x ->
  x.each{
   suma+=it.value
  // println("obtener valor: "+it.value+ "  obtener llave o identificador: "+it.key)
  }
  println("Suma total de edades: "+suma)
}
//invoco el closure
edadTotal(dicc)