/**
 * @file borrar-db.js
 * @version 1.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   2-noviembre-2013
 * @url  http://lineadecodigo.com/mongodb/consultar-un-documento-con-mongodb-findone/
 * @description Recuperar un œnico documento mediante MongoDB findOne
 */

conn = new Mongo();
db = conn.getDB("demografia");

documento = db.ciudades.findOne();

printjson(documento);