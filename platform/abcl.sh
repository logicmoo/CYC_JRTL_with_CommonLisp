#!/bin/sh

# abcl.in

# Copyright (C) 2004 Peter Graves
# Copyright (C) 2009 Erik Huelsmann

# This program is free software; you can redistribute it and/or
# modify it under the terms of the GNU General Public License
# as published by the Free Software Foundation; either version 2
# of the License, or (at your option) any later version.

# This program is distributed in the hope that it will be useful,
# but WITHOUT ANY WARRANTY; without even the implied warranty of
# MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
# GNU General Public License for more details.

# You should have received a copy of the GNU General Public License
# along with this program; if not, write to the Free Software
# Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
#export CLASSPATH="/mnt/dddd/workspace/phase02-jrtl/platform/bin-eclipse:/cp/lib/xml-apis-1.4.01.jar:/cp/lib/ublsupport/ublsupport.jarcp/lib/slf4j-log4j12-1.7.5.jar:/cp/lib/slf4j-api-1.7.5.jar:/cp/lib/servlet-api-3.0.20100224.jar:/cp/lib/scala-reflect-2.10.2.jar:/cp/lib/scala-library-2.10.2.jar:/cp/lib/scala-compiler-2.10.2.jar:/cp/lib/procyon-core-0.5.33-enigma.jar:/cp/lib/procyon-compilertools-0.5.33-enigma.jar:/cp/lib/org.osgi.core-4.2.0.jar:/cp/lib/org.osgi.core-1.4.0.jar:/cp/lib/org.osgi.compendium-4.2.0.jar:/cp/lib/org.openl.lib.poi.dev-5.9.4.1.jar:/cp/lib/org.appdapter.lib.remote-1.2.4-20160803.212630-10.jar:/cp/lib/org.appdapter.lib.remote-1.1.6-SNAPSHOT.jar:/cp/lib/org.appdapter.lib.bind.jena-1.2.3.jar:/cp/lib/org.appdapter.lib.bind.jena-1.1.6-SNAPSHOT.jar:/cp/lib/org.appdapter.bundle.xload-1.2.4-20160803.212610-8.jar:/cp/lib/org.appdapter.bundle.fileconv-1.1.6-SNAPSHOT.jar:/cp/lib/org.appdapter.bundle.debug-1.1.6-SNAPSHOT.jar:/cp/lib/org.appdapter.bundle.core-1.1.6-SNAPSHOT.jar:/cp/lib/org.apache.servicemix.specs.activation-api-1.1-1.8.0.jar:/cp/lib/org.apache.servicemix.bundles.xmlresolver-1.2_3.jar:/cp/lib/org.apache.servicemix.bundles.xerces-2.11.0_1.jar:/cp/lib/org.apache.servicemix.bundles.lucene-3.0.3_2.jar:/cp/lib/org.apache.servicemix.bundles.junit-4.7_3.jar:/cp/lib/org.apache.servicemix.bundles.javax.mail-1.4.1_4.jar:/cp/lib/kaon2.jar:/cp/lib/jsp-api-2.1-glassfish-2.1.v20100127.jar:/cp/lib/jsp-2.1-glassfish-2.1.v20100127.jar:/cp/lib/jide-oss-3.5.5.jar:/cp/lib/jetty-xml-8.0.4.v20111024.jar:/cp/lib/jetty-webapp-8.0.4.v20111024.jar:/cp/lib/jetty-util-8.0.4.v20111024.jar:/cp/lib/jetty-servlet-8.0.4.v20111024.jar:/cp/lib/jetty-server-8.0.4.v20111024.jar:/cp/lib/jetty-security-8.0.4.v20111024.jar:/cp/lib/jetty-io-8.0.4.v20111024.jar:/cp/lib/jetty-http-8.0.4.v20111024.jar:/cp/lib/jetty-continuation-8.0.4.v20111024.jar:/cp/lib/httpcore-osgi-4.3.jar:/cp/lib/httpclient-osgi-4.3.1.jar:/cp/lib/h2-1.3.157.jar:/cp/lib/ext.bundle.xml.xerces-1.1.6-SNAPSHOT.jar:/cp/lib/ext.bundle.xml.dom4j_161-1.1.6-SNAPSHOT.jar:/cp/lib/ext.bundle.osgi.common-1.1.6-SNAPSHOT.jar:/cp/lib/ext.bundle.openconverters-1.1.6-SNAPSHOT.jar:/cp/lib/ext.bundle.math.jscience_50SNAP-1.0.9.jar:/cp/lib/ext.bundle.jena_all_2_10_1-1.1.6-SNAPSHOT.jar:/cp/lib/ext.bundle.apache_httpclient-1.1.6-SNAPSHOT.jar:/cp/lib/ecj-3.5.1.jar:/cp/lib/cycSparqlEndpoint.jar:/cp/lib/customSysParam.jar:/cp/lib/commons-math-3.0-SNAPSHOT.jar:/cp/lib/commons-logging-1.1.3.jar:/cp/lib/commons-lang-2.4.jar:/cp/lib/commons-codec-1.6.jar:/cp/lib/com.springsource.org.apache.log4j-1.2.16.jar:/cp/lib/com.springsource.com.ibm.icu-3.4.5.jar:/cp/lib/bsf.jar:/cp/lib/bsf-utils-3.1.jar:/cp/lib/bsf-api-3.1.jar:/cp/lib/bsf-all-3.1.jar:/cp/lib/axis-jaxrpc-1.4.jar:/cp/lib/axis-1.4.jar:/cp/ext/servlet.jar:/cp/ext/owlim-big-3.1.a7.jar:/cp/ext/ordi-trree-adapter-3.1.a6.jar:/cp/ext/ordi-model-0.5.jar:/cp/ext/openrdf-sesame-2.2.4-onejar.jar:/cp/ext/junit-4.5.jar:/cp/ext/javagat/GAT-engine.jar:/cp/ext/javagat/GAT-API.jar:/cp/ext/iri.jar:/cp/ext/GAT/Adaptors/shared/wsdl4j.jar:/cp/ext/GAT/Adaptors/shared/puretls.jar:/cp/ext/GAT/Adaptors/shared/mail.jar:/cp/ext/GAT/Adaptors/shared/jaxrpc.jar:/cp/ext/GAT/Adaptors/shared/cryptix32.jar:/cp/ext/GAT/Adaptors/shared/cryptix.jar:/cp/ext/GAT/Adaptors/shared/cryptix-asn1.jar:/cp/ext/GAT/Adaptors/shared/commons-httpclient-3.1.jar:/cp/ext/GAT/Adaptors/shared/commons-discovery.jar:/cp/ext/GAT/Adaptors/shared/bcprov-jdk15-133.jar:/cp/ext/concurrent.jar:/cp/ext/GAT/Adaptors/GenericAdaptor/GenericAdaptor.jar:/cp/lib/jff/jcommon-1.0.0.jar:/cp/lib/jff/hamcrest-core-1.1.jar:/cp/lib/jff/guava-12.0.jar:/cp/lib/jff/jfreechart-1.0.0.jar:/cp/lib/jff/guava-12.0-sources.jar:/cp/lib/jff/javassist-3.12.1.GA.jar:/cp/lib/jff/log4j-1.2.16.jar:/cp/lib/jff/commons-lang3-3.1.jar:/cp/lib/jff/dom4j-1.6.1.jar:/cp/lib/jff/junit-4.10.jar:/cp/lib/jff/reflections-0.9.8.jar:/cp/lib/jff/miglayout-core-4.2.jar:/cp/lib/jff/jsr305-1.3.9.jar:/cp/lib/jff/miglayout-swing-4.2.jar:/workspace/phase02-jrtl/platform/dist/abcl-contrib.jar:/usr/lib/jvm/java-8-oracle/lib/tools.jar"

. set_classpath.sh

java \
  -cp "$CLASSPATH" \
  -server -Xms5000m -Xmx8000m -XX:ReservedCodeCacheSize=96m  -XX:+DoEscapeAnalysis -XX:+UseCompressedOops -XX:+UseConcMarkSweepGC -XshowSettings:vm \
  org.armedbear.lisp.Main \
  "$@"


#exec /usr/lib/jvm/java-8-oracle/jre/bin/java \
#  -cp  /mnt/dddd/workspace/phase02-jrtl/platform/bin-eclipse:"$CLASSPATH" \
#  -d64 -XX:+UseG1GC -XshowSettings:vm -Xmx8g -Xss4g -XX:+CMSClassUnloadingEnabled -XX:MaxPermSize=1g \
#  org.armedbear.lisp.Main \
#  "$@"

