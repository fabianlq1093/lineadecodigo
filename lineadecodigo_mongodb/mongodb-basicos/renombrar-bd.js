/**
 * @file borrar-db.js
 * @version 1.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   25-marzo-2013
 * @url  http://lineadecodigo.com/mongodb/renombrar-una-base-de-datos-en-mongodb/
 * @description Pasos para renombrar una base de datos en MongoDB d—nde no existe la sentencia renameDatabase.
 */

conn = new Mongo();
db = conn.getDB("foo");

// Copiamos una base de datos en otra
db.copyDatabase('foo', 'foo2');

// Borra la base de datos foo
db.dropDatabase();
