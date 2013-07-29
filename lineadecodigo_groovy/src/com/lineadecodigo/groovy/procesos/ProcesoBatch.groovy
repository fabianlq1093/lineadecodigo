package com.lineadecodigo.groovy.procesos

/**
 * @file ejecuta.groovy
 * @version 0.0.1
 * @author Ariel Carraro
 * @date   23-julio-2012
 * @url    http://lineadecodigo.com/groovy/ejecutar-un-proceso-batch-en-groovy/
 * @description Script groovy que ejecuta un proceso externo (*.exe)
 */

def programa="miscomandos.exe"
def sub="cmd /c start "+programa
Process p=sub.execute()
println p.text