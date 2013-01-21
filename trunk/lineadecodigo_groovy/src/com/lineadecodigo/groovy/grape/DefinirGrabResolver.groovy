package com.lineadecodigo.groovy.grape

/**
 * @file DefinirGrabResolver.groovy
 * @version 1.0
 * @author Víctor Cuervo - http://lineadecodigo.com
 * @date   20.enero.2013
 * @url    http://lineadecodigo.com/groovy/uso-de-grabresolver-en-groovy/
 * @description Uso de @Grapes y @GrabResolver
 */

//es necesaria para usar Grapes
import groovy.grape.Grape
//para crear el archivo
import java.io.FileOutputStream
import java.io.IOException

@GrabResolver(name='itextpdf', root='http://maven.itextpdf.com/')
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
    document.add(new Paragraph("url"));
    document.close();
    println "Se ha creado el documento PDF"
}


