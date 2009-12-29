<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"  xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

<xsl:template match="/">
 <html>
 <body>
   <h1>Mis Libros</h1>

   El numero de libros es de	
   <xsl:value-of select="count(/libros/libro)"/>

 </body>
 </html>
</xsl:template>
</xsl:stylesheet>
