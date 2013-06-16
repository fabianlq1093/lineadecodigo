/**
 * @file borrar-db.js
 * @version 1.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   25-marzo-2013
 * @url  http://lineadecodigo.com/mongodb/borrar-una-base-de-datos-en-mongodb/
 * @description Ejemplo que borra una base de datos de MongoBD
 */

conn = new Mongo();
db = conn.getDB("foo");

// Borra la base de datos foo
db.dropDatabase();
