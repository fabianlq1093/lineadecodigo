<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

<xsl:template match="/">
 <html>
 <body>
   <h1>Mis Libros de más de 30€</h1>

   <xsl:for-each select="libros/libro">
     <xsl:if test="precio>=30">
       <p> 
        Titulo:<xsl:value-of select="titulo"/><br/>
        Autor:<xsl:value-of select="autor"/><br/>
		 Precio:<xsl:value-of select="precio"/>
      </p>
     </xsl:if>
   </xsl:for-each>

 </body>
 </html>
</xsl:template>
</xsl:stylesheet>
