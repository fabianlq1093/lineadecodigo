/**
 * @file like.js
 * @version 1.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   2-febrero-2014
 * @url  http://lineadecodigo.com/mongodb/consultas-mongodb-like/
 * @description Realizar consultas LIKE con MongoDB
 */

conn = new Mongo();
db = conn.getDB("demografia");

cursor = db.ciudades.find().limit(2);

while (cursor.hasNext()) {
  printjson(cursor.next());
}
