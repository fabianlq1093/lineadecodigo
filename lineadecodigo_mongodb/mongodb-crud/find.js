/**
 * @file borrar-db.js
 * @version 1.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   2-noviembre-2013
 * @url  http://lineadecodigo.com/mongodb/consultas-con-mongodb-find/
 * @description Como realizar consultas sobre las colecciones mediante el método MongoDB find.
 */

conn = new Mongo();
db = conn.getDB("demografia");

cursor = db.ciudades.find();

while (cursor.hasNext()) {
  printjson(cursor.next());
}
