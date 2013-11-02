/**
 * @file borrar-db.js
 * @version 1.0
 * @author Victor Cuervo (http://lineadecodigo.com)
 * @date   2-noviembre-2013
 * @url  http://lineadecodigo.com/mongodb/cursor-foreach-en-mongodb
 * @description Utilizaci—n del cursor forEach en MongoDB para recorrer los documentos de una consulta.
 */

conn = new Mongo();
db = conn.getDB("demografia");

function cursor (doc) {
	print("En " + doc.ciudad + " hay " + doc.habitantes + " habitantes.");
}

db.ciudades.find().forEach(cursor);

db.ciudades.find().forEach( function(doc) {
	print("En " + doc.ciudad + " hay " + doc.habitantes + " habitantes.");
} );


