<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"  xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

<xsl:template match="libros">

 <html>
 <body>
 <h1>Mi primer documento XSLT</h1>
  <strong>Libro:</strong> <xsl:value-of select="libro/titulo"/>
  <br/>
  <strong>Autor:</strong> <xsl:value-of select="libro/autor"/>
 </body>
 </html>

</xsl:template>
</xsl:stylesheet>