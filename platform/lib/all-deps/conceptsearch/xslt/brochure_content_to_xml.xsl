<!-- <?xml version="1.0" encoding="UTF-8" ?> -->
<!--$Id: brochure_content_to_xml.xsl 126640 2008-12-04 13:39:36Z builder $ -->

<!--
    Document   : DoctorBio.xsl
    Created on : May 15, 2007, 4:25 PM
    Author     : daves
    Version    : $Id: brochure_content_to_xml.xsl 126640 2008-12-04 13:39:36Z builder $
    Description:
        This XSL stylesheet is used to transform the full content of the CCF brochure into individual XML documents that can be used 
        as the input to document tagging and indexing.
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0"
                xmlns:redirect="http://xml.apache.org/xalan/redirect" extension-element-prefixes="redirect">
  
  <xsl:import href="./brochure_generic.xsl"/>
  
  <xsl:output method="xml"/>
  
  <xsl:template match="/">
    <xsl:apply-templates select="brochure"></xsl:apply-templates>
  </xsl:template>
  
  <xsl:template match="page">
    <xsl:param name="selectedSection"/>
    <xsl:variable name="cleanTitle" select="translate(@title,' ','_')"/> 
    <xsl:variable name="filename" select="concat($workingDir,'xml-text-docs/',$cleanTitle,'_',$selectedSection,'.xml')" />
    <redirect:write file="$filename" select="$filename">      
      <doc><title><xsl:value-of select="@title"/></title>
        <text>
          <xsl:apply-templates select="sidebar"/>
          <xsl:apply-templates select="section" mode="useOnlyChosenSection">
            <xsl:with-param name="selectedSection" select="$selectedSection"/>
          </xsl:apply-templates>
          <xsl:apply-templates select="section" mode="useRequiredSection"/>
        </text>
      </doc>
    </redirect:write> 
  </xsl:template>
  
  <xsl:template match="section">
    <xsl:value-of select="title"/> <xsl:text>
      
    </xsl:text>     
    <xsl:value-of select="text"/><xsl:text>
      
    </xsl:text>     
    <xsl:apply-templates select="diagram"/><xsl:text>
      
    </xsl:text>     
    
  </xsl:template>
  
  <xsl:template match="section" mode="useRequiredSection">
    <xsl:if test="not(string(@class))">
      <xsl:apply-templates select="."/>
    </xsl:if>
  </xsl:template>
  
  <xsl:template match="section" mode="useOnlyChosenSection">
    <xsl:param name="selectedSection"/>
    <xsl:if test="@id=$selectedSection">
      <xsl:apply-templates select="."/>
    </xsl:if>
  </xsl:template>
  
  
  
  <xsl:template match="sidebar">
    <xsl:value-of select="title"/><xsl:text>
      
    </xsl:text>      
    <xsl:value-of select="text"/><xsl:text>
      
    </xsl:text>     
  </xsl:template>
  
  
  <xsl:template match="diagram">
    <xsl:apply-templates select="altText"/> 
  </xsl:template>
  
  <xsl:template match="altText">
    <xsl:value-of select="."/><xsl:text>  
      
    </xsl:text>     
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
    <xsl:variable name="filename" select="concat($workingDir,'xml-text-docs/',$cleanId,'_',$selectedSection,'.xml')" />
    <redirect:write file="$filename" select="$filename"> 
      <doc><title><xsl:value-of select="name"/></title>
        <text>
          <xsl:value-of select="name"/>
          <xsl:text>
            
          </xsl:text>
          <xsl:value-of select="title"/>
          <xsl:text>
            
          </xsl:text>
          <xsl:apply-templates select="specialties"></xsl:apply-templates>
          <xsl:text>
            
          </xsl:text>
          <xsl:apply-templates select="degrees"></xsl:apply-templates>
          <xsl:text>
            
          </xsl:text>
          <xsl:apply-templates select="doctoralDegrees"></xsl:apply-templates>
          <xsl:text>
            
          </xsl:text>                
          <xsl:apply-templates select="specialTraining"></xsl:apply-templates>
          <xsl:text>
            
          </xsl:text>
          <xsl:apply-templates select="personal"></xsl:apply-templates>
          <xsl:text>
            
          </xsl:text>

          <xsl:apply-templates select="section" mode="useOnlyChosenSection">
            <xsl:with-param name="selectedSection" select="$selectedSection"/>
          </xsl:apply-templates>

        </text>
      </doc>
    </redirect:write>
  </xsl:template>
  
  
  <xsl:template match="specialties">
    Specialties: <xsl:value-of select="."/>
  </xsl:template>
  
  <xsl:template match="doctoralDegrees">
    Doctoral Degree: <xsl:value-of select="."/>
  </xsl:template>
  <xsl:template match="degrees">
    Medical Degree: <xsl:value-of select="."/>
  </xsl:template>
  
  <xsl:template match="specialTraining">
    Special Training: <xsl:value-of select="."/>
  </xsl:template>
  
  <xsl:template match="personal">
    <xsl:value-of select="."/>
  </xsl:template>
  
  
  
  
  
</xsl:stylesheet>

