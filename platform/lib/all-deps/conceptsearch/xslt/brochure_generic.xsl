<?xml version="1.0" encoding="UTF-8" ?>
<!--$Id: brochure_generic.xsl 126640 2008-12-04 13:39:36Z builder $ -->

<!--
    Document   : brochure_generic.xsl
    Created on : June 6, 2007, 3:12 PM
    Author     : rck
    Version    : $Id: brochure_generic.xsl 126640 2008-12-04 13:39:36Z builder $
    Description:
        Basic transform that trampolines from the pages to the sections.
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  
  <xsl:param name="workingDir"/>
  
  <xsl:template match="brochure">
    <xsl:param name="selectedSection"/>
    <xsl:for-each select="page//section">
      <xsl:if test="@class='pickOne'">
        <xsl:apply-templates select="." mode="selectedSection" >
          <xsl:with-param name="selectedSection" select="@id"/>
        </xsl:apply-templates>
      </xsl:if>
    </xsl:for-each>
    <xsl:apply-templates select="page" mode="pickNone"/>        
    <xsl:apply-templates select="biographies"/>
  </xsl:template>
  
  <xsl:template match="section" mode="selectedSection">
    <xsl:param name="selectedSection"/>
    <xsl:apply-templates select="..">
      <xsl:with-param name="selectedSection" select="$selectedSection"/>
    </xsl:apply-templates>
  </xsl:template> 
  
  <xsl:template match="page" mode="pickNone">    
    <xsl:apply-templates select="."/>
  </xsl:template>
  
</xsl:stylesheet>
