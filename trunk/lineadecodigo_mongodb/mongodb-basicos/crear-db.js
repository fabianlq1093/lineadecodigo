/**
 * @file crear-db.js
 * @version 1.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   15-junio-2013
 * @url  http://lineadecodigo.com/mongodb/crear-una-base-de-datos-en-mongodb/
 * @description Ejemplo que crea una base de datos de MongoBD
 */

conn = new Mongo();
db = conn.getDB("demografia");

// Borra la base de datos foo
db.comunidades.save({comunidad:'Madrid'});