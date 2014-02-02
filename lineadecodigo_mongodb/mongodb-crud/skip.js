/**
 * @file skip.js
 * @version 1.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   2-febrero-2014
 * @url  http://lineadecodigo.com/mongodb/mongodb-skip-omitir-resultados/
 * @description Omitir documentos en las conultas MongoDB
 */

conn = new Mongo();
db = conn.getDB("demografia");


function mostrarDatos(cursor) {
	while (cursor.hasNext()){
		printjson(cursor.next());
	}
}

cursor = db.ciudades.find().skip(2);
mostrarDatos(cursor);
