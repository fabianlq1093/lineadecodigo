/**
 * @file borrar-db.js
 * @version 1.0
 * @author Victor Cuervo (http://lineadecodigo.com)
 * @date   2-noviembre-2013
 * @url  http://lineadecodigo.com/mongodb/recorrer-un-cursor-en-mongodb/
 * @description Como recorrer un listado de documentos mediante un cursor en MongoDB.
 */

conn = new Mongo();
db = conn.getDB("demografia");

cursor = db.ciudades.find();

while (cursor.hasNext()) {
  doc = cursor.next();
 
  // Imprimir un documento
  printjson(doc);
  
  // Imprimir campos de un documento
  print("En " + doc.ciudad + " hay " + doc.habitantes + " habitantes.");
}