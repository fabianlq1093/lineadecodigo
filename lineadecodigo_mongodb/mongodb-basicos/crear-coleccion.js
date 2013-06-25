/**
 * @file crear-coleccion.js
 * @version 1.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   15-junio-2013
 * @url  http://lineadecodigo.com/mongodb/crear-una-coleccion-en-mongodb/
 * @description Utilización del método createCollection para crear una colección en MongoDB.
 */

conn = new Mongo();
db = conn.getDB("foo");
// Creamos la coleccion
db.createCollection('test');