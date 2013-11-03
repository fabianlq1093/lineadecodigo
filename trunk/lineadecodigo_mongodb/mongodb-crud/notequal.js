/**
 * @file borrar-db.js
 * @version 1.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   2-noviembre-2013
 * @url  http://lineadecodigo.com/mongodb/filtrar-datos-en-mongodb/
 * @description Utilización del método find para filtrar datos en MongoDB.
 */

conn = new Mongo();
db = conn.getDB("demografia");

cursor = db.ciudades.find({ciudad:'Madrid'});

while (cursor.hasNext()) {
  printjson(cursor.next());
}
