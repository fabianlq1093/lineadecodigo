/**
 * @file or.js
 * @version 1.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   2-febrero-2014
 * @url  http://lineadecodigo.com/mongodb/operador-mongodb-or/
 * @description Utilizar operadores OR end MongoDB
 */

conn = new Mongo();
db = conn.getDB("demografia");


function mostrarDatos(cursor) {
	while (cursor.hasNext()){
		printjson(cursor.next());
	}
}

// OR. Que emiecen por M o que empiecen pro Z
cursor = db.ciudades.find({$or:[{ciudad:/^M/},{ciudad:/^Z/}]});
mostrarDatos(cursor);