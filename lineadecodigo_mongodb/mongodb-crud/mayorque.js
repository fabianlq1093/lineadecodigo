/**
 * @file mayorque.js
 * @version 1.0
 * @author V’ctor Cuervo (http://lineadecodigo.com)
 * @date   2-noviembre-2013
 * @url  http://lineadecodigo.com/mongodb/consultas-mayor-que-en-mongodb/
 * @description Uso del operador $gt y $gte para realizar consultas mayor que en MongoDB.
 */

conn = new Mongo();
db = conn.getDB("demografia");

cursor = db.ciudades.find({habitantes:{$gt:1000000}});

while (cursor.hasNext()) {
  printjson(cursor.next());
}
