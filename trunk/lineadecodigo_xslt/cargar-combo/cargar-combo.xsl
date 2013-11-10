<?xml version="1.0" encoding="ISO-8859-1"?>

<xsl:stylesheet version="1.0"
   xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

<xsl:template match="/">

 <html>
 <h1>Cargar combo con XSLT</h1>
 <body>
   Autores:<select>
   <xsl:for-each select="libros/libro">
     <option><xsl:value-of select="titulo"/></option>
   </xsl:for-each>
   </select>
   
    <br/><br/>
	<hr/>
	Articulo disponible en: <a href="http://lineadecodigo.com/xslt/cargar-un-combo-con-xslt/">http://lineadecodigo.com/xslt/cargar-un-combo-con-xslt/</a><br/>
	<a href="http://lineadecodigo.com" title="Linea de Codigo">lineadecodigo.com</a>
   
   
 </body>
 </html>
</xsl:template>

</xsl:stylesheet>