#!/bin/sh

# Script to build and deploy LarKC plugins on tomcat
# Build plugins, convert .larkc files to .war files, copy .war files to 
# the tomcat webapps directory
# This script assumes that sudo is installed
#
# Author: Christoph 'Gigi' Fuchs <christoph.fuchs@sti2.at>

# Path to the LarKC root 
# Please change accordingly
ROOT="/home/gigi/workspaces/LarKC/LarKC"



# Changing paths below this line should not be necessary

# Path to LarKC platform
PLATFORM="${ROOT}/platform"

# Path to JEE extensions
JEE="${ROOT}/jee_extensions"

# Path to tomcat webapps directory
# usually /var/lib/tomcat6/webapps (set this path accordingly!)
TOMCAT_WEBAPPS="/var/lib/tomcat6/webapps"

# Path to compiled LarKC plugin directory. 
PLUGINS="${ROOT}/plugins"
DIST_PLUGINS="${PLATFORM}/dist/plugins"

# Path to .war plugin files 
WAR_FILES="build/war"

# 1) Build the platform
echo Building platform
cd ${PLATFORM}
ant

# 2) Build plugins
echo Building plugins
cd ${PLUGINS}
ant

# 3) Copy platform jar to jee_extensions
echo Copy platform jar to jee_exensions
cp -v ${PLATFORM}/dist/bin/larkc-platform.jar ${JEE}/lib
cp -v ${PLATFORM}/dist/bin/larkc-platform.jar ${JEE}/webapp_lib

# 4) Build JEE extensions
echo Building JEE extensions
cd ${JEE}
ant

# 5) Batch convert .larkc to .war
echo Batch convert .larkc files to .war files
mkdir -v ${WAR_FILES}

java -jar build/jar/larkc_jee_converter.jar ${DIST_PLUGINS}/PassItOnTransformer.larkc ${WAR_FILES}/PassItOnTransformer.war eu.larkc.plugin.transform.passitontransformer.PassItOnTransformer query_transformer
java -jar build/jar/larkc_jee_converter.jar ${DIST_PLUGINS}/SPARQLToTriplePatternQueryTransformer.larkc ${WAR_FILES}/SPARQLToTriplePatternQueryTransformer.war eu.larkc.plugin.transform.sparqltotriplepatternquerytransformer.SPARQLToTriplePatternQueryTransformer query_transformer

java -jar build/jar/larkc_jee_converter.jar ${DIST_PLUGINS}/SindiceTriplePatternIdentifier.larkc ${WAR_FILES}/SindiceTriplePatternIdentifier.war eu.larkc.plugin.identify.sindice.SindiceTriplePatternIdentifier identifier
java -jar build/jar/larkc_jee_converter.jar ${DIST_PLUGINS}/SimpleFileReaderIdentifier.larkc ${WAR_FILES}/SimpleFileReaderIdentifier.war eu.larkc.plugin.identify.filereader.SimpleFileReaderIdentifier identifier
java -jar build/jar/larkc_jee_converter.jar ${DIST_PLUGINS}/UrbanSindiceIdentifier.larkc ${WAR_FILES}/UrbanSindiceIdentifier.war eu.larkc.plugin.identify.sindice.UrbanSindiceIdentifier identifier

java -jar build/jar/larkc_jee_converter.jar ${DIST_PLUGINS}/NullDataTransformer.larkc ${WAR_FILES}/NullDataTransformer.war eu.larkc.plugin.transform.nulldatatransformer.NullDataTransformer data_transformer
java -jar build/jar/larkc_jee_converter.jar ${DIST_PLUGINS}/xml2rdf_transformer.larkc ${WAR_FILES}/xml2rdf_transformer.war eu.larkc.plugin.transform.urbancomputing.ubl.XML2RDFTransformer data_transformer

java -jar build/jar/larkc_jee_converter.jar ${DIST_PLUGINS}/GrowingDataSetSelecter.larkc ${WAR_FILES}/GrowingDataSetSelecter.war eu.larkc.plugin.select.simple.GrowingDataSetSelecter selecter
java -jar build/jar/larkc_jee_converter.jar ${DIST_PLUGINS}/SPARQLKeyword.larkc ${WAR_FILES}/SpreadingActivationSelecter.war eu.larkc.plugin.select.sparqlkeyword.SASelecter selecter
java -jar build/jar/larkc_jee_converter.jar ${DIST_PLUGINS}/SPARQLKeyword.larkc ${WAR_FILES}/BaseLineFTSelecter.war eu.larkc.plugin.select.sparqlkeyword.BaseLineFTSelecter selecter

java -jar build/jar/larkc_jee_converter.jar ${DIST_PLUGINS}/IrisRuleReasoner.larkc ${WAR_FILES}/IrisRuleReasoner.war eu.larkc.plugin.reason.irisrulereasoner.IrisRuleBasedReasoner reasoner
java -jar build/jar/larkc_jee_converter.jar ${DIST_PLUGINS}/SparqlQueryEvaluationReasoner.larkc ${WAR_FILES}/SparqlQueryEvaluationReasoner.war eu.larkc.plugin.reason.simple.SparqlQueryEvaluationReasoner reasoner

# 6) Copy .wars to tomcat webapps folder (deploy them)
echo Deploying war files
sudo cp -v ${WAR_FILES}/*.war ${TOMCAT_WEBAPPS}

# Note:
# I don't copy the platform.jar, jee.jars and plugins 
# to the simple_pipeline demo because I set everything
# up using project dependencies.
# This would be the last thing to do before shipping it.
