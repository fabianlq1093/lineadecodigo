/**
 * @file contar-elementos-distintos.sql
 * @version 1.0
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   28-enero-2013
 * @url		http://lineadecodigo.com/sql/contar-elementos-distintos-con-sql/
 * @description Cuenta los resultados de una consulta, pero solo los que sean distintos
 */

select count(distinct ideditorial) from libros