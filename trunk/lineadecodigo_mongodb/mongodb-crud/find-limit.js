/**
 * @file find-limit.js
 * @version 1.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   1-febrero-2014
 * @url  http://lineadecodigo.com/mongodb/consultas-mongodb-con-limite-de-documentos/
 * @description Realizar consultas find limitando el nœmero de documentos a devolver.
 */

conn = new Mongo();
db = conn.getDB("demografia");

cursor = db.ciudades.find().limit(2);

while (cursor.hasNext()) {
  printjson(cursor.next());
}
