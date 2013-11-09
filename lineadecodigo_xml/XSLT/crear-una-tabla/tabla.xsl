<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
   xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

<xsl:template match="/">
 <html>
 <body>
   <h1>Mis Libros</h1>

   <table border="1">
    <tr bgcolor="skyblue">
      <th align="left">Titulo</th>
      <th align="left">Autor</th>
    </tr>
  
   <xsl:for-each select="libros/libro">
    <tr>
      <td><xsl:value-of select="titulo"/></td>
      <td><xsl:value-of select="autor"/></td>
    </tr>
   </xsl:for-each>
   </table>

 	<br/><br/>
	<hr/>
	Articulo disponible en: <a href="http://lineadecodigo.com/xslt/crear-una-tabla-a-partir-de-datos-xml/">http://lineadecodigo.com/xslt/crear-una-tabla-a-partir-de-datos-xml/</a><br/>
	<a href="http://lineadecodigo.com" title="Linea de Codigo">lineadecodigo.com</a>

 </body>
 </html>
</xsl:template>
</xsl:stylesheet>