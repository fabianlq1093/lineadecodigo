/**
 * @file count.js
 * @version 1.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   2-febrero-2014
 * @url  http://lineadecodigo.com/mongodb/total-de-registros-con-mongodb-count/
 * @description Cuenta el nœmero de elementos
 */

conn = new Mongo();
db = conn.getDB("demografia");

printjson(db.ciudades.find({ciudad:/^M/}).count());
printjson(db.ciudades.count());