/**
 * @file notequal.js
 * @version 1.0
 * @author V’ctor Cuervo (http://lineadecodigo.com)
 * @date   2-noviembre-2013
 * @url  http://lineadecodigo.com/mongodb/mongodb-not-equal/
 * @description Como conseguir consultas de negaci—n mediante MongoDB Not Equal..
 */

conn = new Mongo();
db = conn.getDB("demografia");

cursor = db.ciudades.find({ciudad:{$ne:'Madrid'}});

while (cursor.hasNext()) {
  printjson(cursor.next());
}
