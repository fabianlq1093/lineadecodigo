/**
 * @file in.js
 * @version 1.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   2-febrero-2014
 * @url  http://lineadecodigo.com/mongodb/operador-mongodb-in/
 * @description Realizar consultas IN con MongoDB
 */

conn = new Mongo();
db = conn.getDB("demografia");


function mostrarDatos(cursor) {
	while (cursor.hasNext()){
		printjson(cursor.next());
	}
}

cursor = db.ciudades.find({ciudad:{$in:['Avila','Zamora','Madrid']}});
mostrarDatos(cursor);