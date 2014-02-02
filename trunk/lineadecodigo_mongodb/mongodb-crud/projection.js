/**
 * @file projection.js
 * @version 1.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   2-febrero-2014
 * @url  http://lineadecodigo.com/mongodb/mongodb-projection-seleccionar-campos-de-un-documento/
 * @description Projection, seleccionar campos a la hora de realizar la consulta.
 */

conn = new Mongo();
db = conn.getDB("demografia");


function mostrarDatos(cursor) {
	while (cursor.hasNext()){
		printjson(cursor.next());
	}
}

// Projection (Es solo sacar parte de los campos)
cursor = db.ciudades.find({habitantes:{$gt:1000000}},{ciudad:1});
mostrarDatos(cursor);

// Para el ID hay que deshabilitarlo explicitamente
cursor = db.ciudades.find({habitantes:{$gt:1000000}},{ciudad:1,_id:0});
mostrarDatos(cursor);

// Si queremos excluir uno solo, este es el que ponemos a cero. Se muestran los demas
cursor = db.ciudades.find({habitantes:{$gt:1000000}},{_id:0});
mostrarDatos(cursor);
