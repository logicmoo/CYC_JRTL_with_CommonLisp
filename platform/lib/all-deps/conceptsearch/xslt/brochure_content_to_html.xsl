<?xml version="1.0" encoding="UTF-8" ?>
<!--$Id: brochure_content_to_html.xsl 126640 2008-12-04 13:39:36Z builder $ -->

<!--
    Document   : DoctorBio.xsl
    Created on : May 15, 2007, 4:25 PM
    Author     : daves
    Version    : $Id: brochure_content_to_html.xsl 126640 2008-12-04 13:39:36Z builder $
    Description:
        This XSL stylesheet is used to transform the full content of the CCF brochure into individual HTML documents for display to users
        in response to queries.
-->


<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0"
                xmlns:redirect="http://xml.apache.org/xalan/redirect" extension-element-prefixes="redirect">
  
  <xsl:import href="./brochure_generic.xsl"/>
  
  <xsl:output method="html"/>
  
  <xsl:param name="workingDir"/>
  
  <xsl:template match="/">
    <xsl:apply-templates select="brochure"></xsl:apply-templates>
  </xsl:template>
  
  <xsl:template match="page">
    <xsl:param name="selectedSection"/>
    <xsl:variable name="cleanTitle" select="translate(@title,' ','_')"/> 
    <xsl:variable name="filename" select="concat($workingDir,'derived-html-docs/',$cleanTitle,'_',$selectedSection,'.html')" />
    <redirect:write file="$filename" select="$filename"> 
      <html>
        <head>
          <title><xsl:value-of select="@title"/></title>
          <meta http-equiv="Content-Type" content="text/html;charset=UTF-8"/>
          <script type="text/javascript" src="/ConceptSearch/resources/yui/yahoo-dom-event/yahoo-dom-event.js"></script> 
          <script type="text/javascript" src="/ConceptSearch/resources/yui/container/container-min.js"></script>
          <script type="text/javascript" src="/ConceptSearch/resources/yui/connection/connection-min.js"></script>
          <script type="text/javascript" src="/ConceptSearch/resources/cyc-yui.js"></script>
          <link type="text/css" rel="stylesheet" href="/ConceptSearch/resources/yui/reset-fonts-grids/reset-fonts-grids.css"/>
          <link type="text/css" rel="stylesheet" href="/ConceptSearch/resources/yui/container/assets/container.css"/>
          <script type="text/javascript" src="/ConceptSearch/resources/MochiKit-1.3.1/packed/MochiKit/MochiKit.js"></script>
          <script type="text/javascript" src="/ConceptSearch/resources/plotkit-0.9.1/PlotKit/Base.js"></script>
          <!-- <script type="text/javascript" src="/ConceptSearch/resources/plotkit-0.9.1/PlotKit/PlotKit_Packed.js"></script> -->
          <script type="text/javascript" src="/ConceptSearch/resources/plotkit-0.9.1/PlotKit/Layout.js"></script>
          <script type="text/javascript" src="/ConceptSearch/resources/plotkit-0.9.1/PlotKit/Canvas.js"></script>
          <script type="text/javascript" src="/ConceptSearch/resources/plotkit-0.9.1/PlotKit/SweetCanvas.js"></script>
          <script type="text/javascript" src="/ConceptSearch/resources/plotkit-0.9.1/PlotKit/EasyPlot.js"></script>
          <script type="text/javascript" src="/ConceptSearch/resources/plotkit-overrides.js"></script>
          <script type="text/javascript" src="/ConceptSearch/resources/plotkit-legends.js"></script>
          <link type="text/css" rel="stylesheet" href="/ConceptSearch/resources/outcomes-doc.css"/>
          <script language="JavaScript" src="/ConceptSearch/resources/explanation-panel-asset.js"></script>
          <script language="JavaScript" src="/ConceptSearch/resources/panel-assets.js"></script>
          <script language="JavaScript" src="/ConceptSearch/resources/scripts.js"></script>
          <!-- <script language="JavaScript" src="/ConceptSearch/resources/conceptLearning.js"></script>
          <link href="/ConceptSearch/resources/conceptLearning.css" rel="stylesheet" type="text/css"/> -->
        </head>
        <body>
          <div id="panel1"></div> 
       <!--   <div id="addInfoBox">
            <div class="hd"></div>
            <div class="bd"><img src="/ConceptSearch/resources/img/learnIcon.gif"></img></div>
          </div> -->
          <div id="page_title"><div class="bd"><span class="title"><xsl:value-of select="@title"/></span></div></div>
          <div id="sideBar1">
            <div class="bd">
              <xsl:apply-templates select="sidebar"/>
            </div>
          </div>
          <div id="main_body">
            <div class="bd">
              <xsl:apply-templates select="section" mode="useOnlyChosenSection">
                <xsl:with-param name="selectedSection" select="$selectedSection"/>
              </xsl:apply-templates>
              <xsl:apply-templates select="section" mode="useRequiredSection"/>
            </div>
          </div>         
        </body>
      </html>
    </redirect:write> 
  </xsl:template>
  
  <xsl:template match="section">
    <div class="bodyItem">
      <xsl:if test="diagram//@bg">
        <xsl:attribute name="style">background:<xsl:value-of select="diagram//@bg"/>;<xsl:if test="diagram//@textColor">color: <xsl:value-of select="diagram//@textColor"/></xsl:if>
        </xsl:attribute>
      </xsl:if>
      <div class="hd">
        <xsl:if test="diagram//@textColor"><xsl:attribute name="style">color: <xsl:value-of select="diagram//@textColor"/>
          </xsl:attribute>
        </xsl:if>
        <xsl:value-of select="title"/>
        
      </div>
      <div class="bd">
        <xsl:if test="diagram//@imgAlign"><span><xsl:apply-templates select="diagram"/></span></xsl:if>
        <xsl:copy-of select="text"/>
        <xsl:if test="not(diagram//@imgAlign)"><div><xsl:apply-templates select="diagram"/></div></xsl:if>
        <xsl:apply-templates select="procVolGraph"/>
      </div>
      
    </div>
    
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
    <div id="{@id}" class="sideBar">
      <div class="bd"><span class="sideBarTitle"><xsl:value-of select="title"/></span><br/><span class="sideBarBody"><xsl:value-of select="text"/></span>
        <xsl:apply-templates select="diagram"/> 
      </div>
    </div>
  </xsl:template>
  
  <xsl:template match="sidebar" mode="useRequiredSidebars">
    <xsl:if test="not(string(@class))">
      <xsl:apply-templates select="."/>
    </xsl:if>
  </xsl:template>
  
  <xsl:template match="sidebar" mode="useOnlyChosenSidebar">
    <xsl:param name="selectedSidebar"/>
    <xsl:if test="@id=$selectedSidebar">
      <xsl:apply-templates select="."/>
    </xsl:if>
  </xsl:template>
  
  
  <xsl:template match="diagram">
    <xsl:variable name="imgUrl" select="concat('/ConceptSearch/img/',@id,'.png')" />
    <img> <xsl:attribute name="src"><xsl:value-of select="$imgUrl"/></xsl:attribute><xsl:if test="@imgAlign"><xsl:attribute name="style">margin-right=25ps; margin-left: 25px;float:<xsl:value-of select="@imgAlign"/></xsl:attribute></xsl:if>
    </img>
  </xsl:template>
  
  <xsl:template match="procVolGraph">
    <xsl:variable name="graphVar" select="@id"/>
    <table width="100%" align="center">
      <tr align="center">
        <td>
          <table>
            <tr>
              <td>#</td>
              <td><div><canvas width="400" height="150"><xsl:attribute name="id"><xsl:value-of select="$graphVar"/></xsl:attribute></canvas></div></td>
            </tr>
          </table>
        </td>
      </tr>
    </table>
    <script>
      <xsl:apply-templates select="options"/>
      var procVol=<xsl:value-of select="data"/>;
      var layout = new Layout("bar", options);
      function drawGraph() {
      layout.addDataset("Valve Procedure Volume", procVol);
      layout.evaluate();
      var <xsl:value-of select="$graphVar"/> = new SweetCanvasRenderer($("<xsl:value-of select="$graphVar"/>"), layout);
      <xsl:value-of select="$graphVar"/>.render();
      }
      drawGraph();
    </script>
    <div class="disclaimer">
      This graph, based on a small sample of patient data, is given for demonstration purposes only.
    </div>
  </xsl:template>
  
  <xsl:template match="options">
    var options= {
    "IECanvasHTC": "/ConceptSearch/resources/plotkit-0.9.1/PlotKit/iecanvas.htc",
    "padding": {left: -10, right: 0, top: 10, bottom: 30},
    <xsl:apply-templates select="xTicks"/>
    <xsl:apply-templates select="yAxis"/>
    <xsl:apply-templates select="yTicks"/>
    };
  </xsl:template>
  
  <xsl:template match="xTicks">
    "xTicks":<xsl:value-of select="."/>,
  </xsl:template>
  
  <xsl:template match="yTicks">
    "yTicks":<xsl:value-of select="."/>,
  </xsl:template>
  
  <xsl:template match="yAxis">
    "yAxis":<xsl:value-of select="."/>,
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
    <xsl:apply-templates select="bio" mode="pickNone">        
    </xsl:apply-templates>
  </xsl:template>
  
  
  <xsl:template match="bio" mode="pickNone">    
    <xsl:apply-templates select="."/>
  </xsl:template>
  
  
  <xsl:template match="bio">
    <xsl:param name="selectedSection"/>
    <xsl:variable name="cleanId" select="translate(@id,' ','_')"/> 
    <xsl:variable name="filename" select="concat($workingDir,'derived-html-docs/',$cleanId,'_',$selectedSection,'.html')" />
    <redirect:write file="$filename" select="$filename"> 
      <html>
        <head>
          <title>Cleveland Clinic Physicians</title>
          <meta http-equiv="Content-Type" content="text/html;charset=UTF-8"/>

          <script type="text/javascript" src="/ConceptSearch/resources/yui/yahoo-dom-event/yahoo-dom-event.js"></script> 
          <script type="text/javascript" src="/ConceptSearch/resources/yui/container/container-min.js"></script>
          <script type="text/javascript" src="/ConceptSearch/resources/yui/connection/connection-min.js"></script>
          <script type="text/javascript" src="/ConceptSearch/resources/cyc-yui.js"></script>
          <link type="text/css" rel="stylesheet" href="/ConceptSearch/resources/yui/reset-fonts-grids/reset-fonts-grids.css"/>
          <link type="text/css" rel="stylesheet" href="/ConceptSearch/resources/yui/container/assets/container.css"/>
          <script type="text/javascript" src="/ConceptSearch/resources/MochiKit-1.3.1/packed/MochiKit/MochiKit.js"></script>
          <script type="text/javascript" src="/ConceptSearch/resources/plotkit-0.9.1/PlotKit/Base.js"></script>
          <script type="text/javascript" src="/ConceptSearch/resources/plotkit-0.9.1/PlotKit/Layout.js"></script>
          <script type="text/javascript" src="/ConceptSearch/resources/plotkit-0.9.1/PlotKit/Canvas.js"></script>
          <script type="text/javascript" src="/ConceptSearch/resources/plotkit-0.9.1/PlotKit/SweetCanvas.js"></script>
          <script type="text/javascript" src="/ConceptSearch/resources/plotkit-0.9.1/PlotKit/EasyPlot.js"></script>
          <script type="text/javascript" src="/ConceptSearch/resources/plotkit-overrides.js"></script>
          <script type="text/javascript" src="/ConceptSearch/resources/plotkit-legends.js"></script>
          <link type="text/css" rel="stylesheet" href="/ConceptSearch/resources/outcomes-doc.css"/>
          <script language="JavaScript" src="/ConceptSearch/resources/explanation-panel-asset.js"></script>
          <script language="JavaScript">
            YAHOO.util.Event.addListener(window, "load", initExplanationPanel);
          </script>          
          <script type="text/javascript" src="/ConceptSearch/resources/scripts.js"></script>
          <style type ="text/css">
            #sideBar {background:#222222; border:none}
            #sideBar1 {background:transparent; border:none}
            #titleBar {background:#BBBBBB; border:none; border:none;}
            #body2 {border:none; background: transparent}
            #body2 .hd {background:transparent; border:none; color:black}
            #title { border:none; background:transparent; vertical-align: text-bottom; }
            #panel1 {text-align: left; background-color:white }
            .title { border:none; background: transparent; vertical-align: text-bottom; height=75px; font-style:italic; font-size:250%; font-family: Century-Schoolbook, Times, serif; border:none;}
            .sideBarTitle {font-size:350%; color: #bbbbbb; font-family: Century-Schoolbook, Times, serif; font-style:italic;}
            .sideBarBody {color:#DDDDDD; font-family: Century-Schoolbook, Times, serif;}
            .bodyItem1Title {color:#aaaaaa; background:transparent}
            .bodyItem1Body {color:#abcdef; border:none}
            .bioSection{background-color:rgb(237,243,250);}
            .bioItem .heading{color: red;}
            .bioData {padding: 10px; text-align:justify;}
            .bioName {font-size:140%; background-color:rgb(65, 89, 104); color: white; text-align:right; padding-right: 2px}
            .bioTitle {font-size: 85%;  background-color:rgb(65, 89, 104); color: white; text-align:right}
            .bioItem {margin-top: 8pt; }
            .bioImage div {padding: 10px;}
            .bioImage img {background-color:rgb(65, 89, 104); padding:5px}
            .popup {border-bottom: 1px dotted;}
          </style>         
        </head>
        <body>
          <div id="doc">
            <div id="bd">
              <table class="bioSection">
                <tr style="vertical-align:top;">
                  <td >
                    <div class="bioData">
                      <div class="bioName"><div><xsl:value-of select="name"></xsl:value-of></div>
                        <div class="bioTitle"><xsl:value-of select="title"></xsl:value-of></div>
                      </div>
                      <div class="bioItem"><span class="heading">Specialties: </span><xsl:value-of select="specialties"></xsl:value-of></div>
                      <xsl:apply-templates select="degrees"></xsl:apply-templates>
                      <xsl:apply-templates select="doctoralDegrees"></xsl:apply-templates>
                      <xsl:apply-templates select="specialTraining"></xsl:apply-templates>
                      <xsl:apply-templates select="personal"></xsl:apply-templates>
                    </div>     
                  </td>
                  <td class="bioImage"><div><img width="164" height="218">
                    <xsl:attribute name="src"><xsl:text>/ConceptSearch/img/</xsl:text><xsl:value-of select="@id"/><xsl:text>.png</xsl:text></xsl:attribute></img></div>
                  </td>
                </tr>
              </table>
            </div>
          </div>  
          <xsl:apply-templates select="section" mode="useOnlyChosenSection">
            <xsl:with-param name="selectedSection" select="$selectedSection"/>
          </xsl:apply-templates>
        </body>
      </html>
    </redirect:write>
  </xsl:template>
  
  <xsl:template match="doctoralDegrees">
    <div class="bioItem"><span class="heading">Doctoral Degree: </span><xsl:value-of select="."></xsl:value-of></div>
  </xsl:template>
  <xsl:template match="degrees">
    <div class="bioItem"><span class="heading">Medical Degree: </span><xsl:value-of select="."></xsl:value-of></div>
  </xsl:template>
  <xsl:template match="specialTraining">
    <div class="bioItem"><span class="heading">Special Training: </span><xsl:value-of select="."></xsl:value-of></div>
  </xsl:template>
  <xsl:template match="personal">
    <div class="bioItem"><xsl:value-of select="."></xsl:value-of></div>
  </xsl:template>
  
  
  
  
  
</xsl:stylesheet>

