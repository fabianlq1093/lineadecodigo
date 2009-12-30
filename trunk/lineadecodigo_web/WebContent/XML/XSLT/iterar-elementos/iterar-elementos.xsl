<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"  xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

<xsl:template match="/">
 <html>
 <body>
   <h1>Mis Libros</h1>

    <xsl:for-each select="libros/libro">
    <p> 
     <strong>Titulo:</strong><xsl:value-of select="titulo"/><br/>
     <strong>Autor:</strong><xsl:value-of select="autor"/>
    </p>
   </xsl:for-each>


 </body>
 </html>
</xsl:template>
</xsl:stylesheet>
