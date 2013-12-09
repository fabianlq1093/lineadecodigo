/**
 * @file menorque.js
 * @version 1.0
 * @author V’ctor Cuervo (http://lineadecodigo.com)
 * @date   8-noviembre-2013
 * @url  http://lineadecodigo.com/mongodb/consultas-menor-que-en-mongodb/
 * @description Explicaci—n de como realizar consultas menor que en MongoDB mediante el uso de los operadores $ly y $lte.
 */

conn = new Mongo();
db = conn.getDB("demografia");

cursor = db.ciudades.find({habitantes:{$lt:1000000}});

while (cursor.hasNext()) {
  printjson(cursor.next());
}
