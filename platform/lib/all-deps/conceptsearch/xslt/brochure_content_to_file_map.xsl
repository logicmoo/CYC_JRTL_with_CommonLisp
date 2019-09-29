<?xml version="1.0" encoding="UTF-8" ?>
<!--$Id: brochure_content_to_file_map.xsl 126640 2008-12-04 13:39:36Z builder $ -->

<!--
    Document   : DoctorBio.xsl
    Created on : May 15, 2007, 4:25 PM
    Author     : daves
    Version    : $Id: brochure_content_to_file_map.xsl 126640 2008-12-04 13:39:36Z builder $
    Description:
        This XSL stylesheet produces the map file that maps XML files to HTML files, which will be used by the document indexer to associate the
        content in the document index with the HTML document that should be shown to the user in response to their queries.
-->


<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">

  <xsl:import href="./brochure_generic.xsl"/>
  
  <xsl:output method="text"/>
  
  <!-- TODO customize transformation rules 
         syntax recommendation http://www.w3.org/TR/xslt 
    -->

  <xsl:template match="/">
    <xsl:apply-templates/>
  </xsl:template>  
  
  <xsl:template match="page">
    <xsl:param name="selectedSection"/>
    <xsl:variable name="cleanTitle" select="translate(@title,' ','_')"/>
    <xsl:variable name="parentStem" select="concat('http://tomcat/html-content/',$cleanTitle)"/>
    <xsl:variable name="parentURLName" select="concat($parentStem,'_','.html')"/>
    <xsl:variable name="html_filename" select="concat($workingDir,'derived-html-docs/',$cleanTitle,'_',$selectedSection,'.html')" />
    <xsl:variable name="xml_filename" select="concat($workingDir, 'xml-text-docs/',$cleanTitle,'_',$selectedSection,'.xml')" />
    <xsl:variable name="url" select="concat($parentStem,'_',$selectedSection,'.html')"/>
    ("<xsl:value-of select="$html_filename"/>"<xsl:text> </xsl:text>"<xsl:value-of select="$xml_filename"/>"<xsl:text> </xsl:text>"<xsl:value-of select="$url"/>" <xsl:text> "</xsl:text> <xsl:value-of select="$parentURLName"/>")
  </xsl:template>
  
  <xsl:template match="biographies">
    <xsl:param name="selectedSection"/>
    <xsl:for-each select="bio//section">
      <xsl:if test="@class='pickOne'">
        <xsl:apply-templates select="." mode="selectedSection" >
          <xsl:with-param name="selectedSection" select="@id"/>
        </xsl:apply-templates>
      </xsl:if>
    </xsl:for-each>
    <xsl:apply-templates select="bio" mode="pickNone"/>        
  </xsl:template>  
  
  <xsl:template match="bio" mode="pickNone">    
    <xsl:apply-templates select="."/>
  </xsl:template>
  
  <xsl:template match="bio">
    <xsl:param name="selectedSection"/>
    <xsl:variable name="cleanId" select="translate(@id,' ','_')"/>
    <xsl:variable name="html_filename" select="concat($workingDir,'derived-html-docs/',$cleanId,'_',$selectedSection,'.html')" />
    <xsl:variable name="xml_filename" select="concat($workingDir,'xml-text-docs/',$cleanId,'_',$selectedSection,'.xml')" />
    <xsl:variable name="url" select="concat('http://tomcat/html-content/',$cleanId,'_',$selectedSection,'.html')"/>
    <xsl:variable name="parentURL" select="concat('http://tomcat/html-content/',$cleanId,'_','.html')"/>
    ("<xsl:value-of select="$html_filename"/>"<xsl:text> </xsl:text>"<xsl:value-of select="$xml_filename"/>"<xsl:text> </xsl:text>"<xsl:value-of select="$url"/>" <xsl:text> "</xsl:text> <xsl:value-of select="$parentURL"/>")
  </xsl:template>
  
  
</xsl:stylesheet>

