/**
 * @file consulta-basica.sql
 * @version 1.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   28-enero-2013
 * @url		http://lineadecodigo.com/sql/contar-el-numero-de-registros-en-sql/
 * @description Consulta el nœmero de registros de una consulta
 */

select count(idautor) from libros where idautor=1
select count(*) from libros