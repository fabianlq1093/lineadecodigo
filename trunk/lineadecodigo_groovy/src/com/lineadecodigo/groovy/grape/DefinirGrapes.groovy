package com.lineadecodigo.groovy.grape

/**
 * @file DefinirGrapes.groovy
 * @version 1.0
 * @author Ariel Carraro - http://lineadecodigo.com/author/ariel/
 * @date   02.enero.2013
 * @url    http://lineadecodigo.com/groovy/xxx/
 * @description Uso de @Grapes para el uso de la librería itextpdf sin agregarla a la classpath
 */

//es necesaria para usar Grapes
import groovy.grape.Grape
//para crear el archivo
import java.io.FileOutputStream
import java.io.IOException

@Grapes(@Grab(group='com.itextpdf', module='itextpdf', version='5.1.2'))

//librería itextpdf para crear el documento PDF
import com.itextpdf.text.Document
import com.itextpdf.text.DocumentException
import com.itextpdf.text.Paragraph
import com.itextpdf.text.pdf.PdfWriter


//método principal del programa
principal()

def principal()throws DocumentException, IOException{
	def documento="micodigo.pdf"
	Document document = new Document();
    PdfWriter.getInstance(document, new FileOutputStream(documento));
    document.open();
    document.add(new Paragraph("Usando Grapes en Groovy"));
    document.add(new Paragraph("http://lineadecodigo.com"));
    document.close();
    println "Se ha creado el documento PDF"
}


