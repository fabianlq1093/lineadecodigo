/**
 * @file and.js
 * @version 1.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   2-febrero-2014
 * @url  http://lineadecodigo.com/mongodb/operador-mongodb-and/
 * @description Utilizar el operador AND en MongoDB
 */

conn = new Mongo();
db = conn.getDB("demografia");


function mostrarDatos(cursor) {
	while (cursor.hasNext()){
		printjson(cursor.next());
	}
}

// AND implicito
cursor = db.ciudades.find({ciudad:/^M/,habitantes:{$lt:1000000}});
mostrarDatos(cursor);

// Operador AND
cursor = db.ciudades.find({$and: [{ciudad:/^M/},{habitantes:{$lt:1000000}}]});
mostrarDatos(cursor);