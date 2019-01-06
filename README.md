# CYC_JRTL_with_CommonLisp

Most Worked-on Feature set * Full compatibility with LarKC Platform http://larkc.eu * This library is a drop-in replacement to the subl.jar of OpenCyc

Un-Armed Bear Common Lisp for Java - LispSharp

A specialized re-implementation of Armed Bear Common Lisp.

(see http://common-lisp.net/project/armedbear)

Extra features * Passes additional CL ANSI-TESTS * Also Runs under .NET/Mono as an EXE and DLL * Requires no Java/JVM

This allows OpenCyc to use common-lisp * Generate .java files from lisp source files instead of .class files. This allows users to go back in and re-edit the generated .java files.

Licence: GPLv2 + Classpath Exception

Project Information

Labels: 
lisp java ikvm .net LispSharp lisp.net


Understanding Source Directories:
~~~~
  ./abcl/    Close to normal ABCL in order to make merging easier
  ./platform/src/org/armedbar/  Abnormal ABCL merged with LarKC
  ./platform/src/com/cyc/tool/  CYC JRTL initially from LarKC with CommonLisp
  ./platform/src/com/cyc/cycjava/  LarKC stripped down cyc.jar
~~~~

# Building

~~~~
root@gitlab:/opt# git clone https://github.com/TeamSPoon/CYC_JRTL_with_CommonLisp
Cloning into 'CYC_JRTL_with_CommonLisp'...
remote: Enumerating objects: 147, done.
remote: Counting objects: 100% (147/147), done.
remote: Compressing objects: 100% (138/138), done.
remote: Total 126930 (delta 14), reused 70 (delta 2), pack-reused 126783
Receiving objects: 100% (126930/126930), 208.24 MiB | 15.62 MiB/s, done.
Resolving deltas: 100% (65844/65844), done.
Checking out files: 100% (7790/7790), done.

root@gitlab:/opt# cd CYC_JRTL_with_CommonLisp/

root@gitlab:/opt/CYC_JRTL_with_CommonLisp# tar xfvz /mnt/gggg/researchcyc-4.0q.tgz
researchcyc-4.0q/
researchcyc-4.0q/server/
researchcyc-4.0q/server/cyc/
researchcyc-4.0q/server/cyc/run/
researchcyc-4.0q/server/cyc/run/plugins/
researchcyc-4.0q/server/cyc/run/units/
......
researchcyc-4.0q/doc/CycAdministratorHandbook.pdf
researchcyc-4.0q/README.txt
~~~~

~~~~
root@gitlab:/opt/CYC_JRTL_with_CommonLisp# rm -rf platform/
root@gitlab:/opt/CYC_JRTL_with_CommonLisp# mv researchcyc-4.0q/server/cyc/run/ platform
root@gitlab:/opt/CYC_JRTL_with_CommonLisp# git checkout platform/ -f
root@gitlab:/opt/CYC_JRTL_with_CommonLisp/platform#./build-cyc-java.sh
~~~~

~~~~
root@gitlab:/opt/CYC_JRTL_with_CommonLisp/platform# ./build-cyc-java.sh


Removing previous Build...
Done.

 Sourcing our CLASSPATH

CLASSPATH=lib/slf4j-api-1.7.5.jar:lib/slf4j-log4j12-1.7.5.jar:/usr/lib/jvm/java-8-openjdk-amd64/lib/tools.jar:/usr/lib/jvm/java-8-openjdk-amd64/lib/sa-jdi.jar:lib/org.appdapter.lib.bind.jena-1.2.3.jar:lib/owlapi-osgidistribution-4.1.4.jar:lib/kshared-2.0.jar:lib/axis-1.4.jar:lib/org.appdapter.bundle.core-1.1.6-SNAPSHOT.jar:lib/JGoSVG.jar:lib/glite-security-delegation-java.jar:lib/itinnov-grid-types-omii1.jar:lib/itinnov-grid-service-types-omii1.jar:lib/services_AdvertServiceEntry_stubs.jar:lib/wss4j-1.5.0-itinnov-2.jar:lib/org.osgi.core-4.2.0.jar:lib/org.openl.lib.poi.dev-5.9.4.1.jar:lib/commons-lang-2.4.jar:lib/unicode_panel.jar:lib/srm.jar:lib/cog-provider-gt4_0_0-2.3.jar:lib/edtftpj-1.5.2.jar:lib/j2ssh-core-0.2.9.jar:lib/looks.jar:lib/castor-0.9.6.jar:lib/glite-security-trustmanager.jar:lib/xpp3-1.1.3.4d_b4_min.jar:lib/org.apache.servicemix.specs.activation-api-1.1-1.8.0.jar:lib/hamcrest-core-1.1.jar:lib/commons-codec-1.6.jar:lib/jgraph.jar:lib/cog-abstraction-common-2.1.jar:lib/javassist-3.12.1.GA.jar:lib/cog-resources-1.0.jar:lib/postgresql-9.1-901.jdbc4.jar:lib/SgeAdaptor.jar:lib/cyc.jar:lib/lb.jar:lib/wsrf_core_stubs.jar:lib/log4j-1.2.12.jar:lib/jetty-continuation-8.0.4.v20111024.jar:lib/guava-12.0-sources.jar:lib/glite-jdl-api-java.jar:lib/owlsyntax.jar:lib/owlim-big-3.1.a7.jar:lib/jcalendar.jar:lib/jce-jdk13-131.jar:lib/gram-utils.jar:lib/commons-lang3-3.1.jar:lib/hivemind-jmx-1.1.1.jar:lib/xmlsec.jar:lib/LocalAdaptor.jar:lib/cog-certrequest-1.0.jar:lib/pddl4j.jar:lib/ext.bundle.osgi.common-1.1.6-SNAPSHOT.jar:lib/rhino-1.7.7.1.jar:lib/services_IndexServiceProxyService_stubs.jar:lib/cog-provider-gt2-2.2.jar:lib/naming-common.jar:lib/commons-digester.jar:lib/syntax.jar:lib/MercuryAdaptor.jar:lib/wsdl4j.jar:lib/cog-gridfaces-1.0.jar:lib/gram-stubs.jar:lib/cog-provider-gt2ft-1.0.jar:lib/concurrent.jar:lib/itinnov-grid-client-helpers-omii1.jar:lib/itinnov-grid-client-cli-omii1.1.jar:lib/jdom.jar:lib/jcommon-1.0.16.jar:lib/ecj-3.5.1.jar:lib/org.apache.servicemix.bundles.lucene-3.0.3_2.jar:lib/guava-12.0.jar:lib/GridsamAdaptor.jar:lib/org.appdapter.bundle.xload-1.2.4-20160803.212610-8.jar:lib/customSysParam.jar:lib/j2ssh-common-0.2.2.jar:lib/ext.bundle.jena_all_2_10_1-1.1.6-SNAPSHOT.jar:lib/icu4j_3.4.4.jar:lib/cog-url.jar:lib/gson-2.3.1.jar:lib/reflections-0.9.8.jar:lib/xml-apis-1.4.01.jar:lib/ordi-model-0.5.jar:lib/itinnov-grid-client-echo-omii1.jar:lib/wms3.1.jar:lib/arq-extra.jar:lib/JGo.jar:lib/cryptix32.jar:lib/cog-provider-condor-2.0.jar:lib/ZorillaAdaptor.jar:lib/axis-jaxrpc-1.4.jar:lib/jetty-http-8.0.4.v20111024.jar:lib/org.appdapter.lib.remote-1.2.4-20160803.212630-10.jar:lib/itinnov-grid-service-utils-omii1.jar:lib/jakarta-regexp-1.2.jar:lib/JGoInstruments.jar:lib/junit-4.10.jar:lib/smartsockets-1.51.jar:lib/bsf-api-3.1.jar:lib/asm-all-3.1.jar:lib/BrowserLauncher2-1_3.jar:lib/jfreechart-1.0.13.jar:lib/ext.bundle.xml.dom4j_161-1.1.6-SNAPSHOT.jar:lib/jsp-api-2.1-glassfish-2.1.v20100127.jar:lib/2p.jar:lib/xbean-2.1.0.jar:lib/hivemind-1.1.1.jar:lib/globus_delegation_stubs.jar:lib/puretls.jar:lib/cog-axis.jar:lib/GliteAdaptor.jar:lib/org.apache.servicemix.bundles.xmlresolver-1.2_3.jar:lib/jide-oss-3.5.5.jar:lib/wss4j.jar:lib/globus_wsrf_rft.jar:lib/itinnov-gridservit-0.3.0.jar:lib/bsf-all-3.1.jar:lib/antlr-2.7.5.jar:lib/forms-1.3.0.jar:lib/jsr305-1.3.9.jar:lib/jetty-util-8.0.4.v20111024.jar:lib/xstream-1.1.1-patched.jar:lib/httpclient-osgi-4.3.1.jar:lib/jep-2.4.1.jar:lib/cog-gridshell-1.0.jar:lib/kazuki.jar:lib/ext.bundle.xml.xerces-1.1.6-SNAPSHOT.jar:lib/jacl-1.2.6.jar:lib/SshTrileadAdaptor.jar:lib/wsrf_core.jar:lib/ordi-trree-adapter-3.1.a6.jar:lib/ublsupport.jar:lib/subl.jar:lib/runnersFramework-2.0.jar:lib/jetty-io-8.0.4.v20111024.jar:lib/commons-httpclient-3.1.jar:lib/wsrf_tools.jar:lib/cryptix.jar:lib/GenericAdaptor.jar:lib/commons-discovery-0.4.jar:lib/cog-jglobus.jar:lib/cog-provider-clref-gt3_2_1.jar:lib/procyon-core-0.5.33-enigma.jar:lib/jaas.jar:lib/cog-provider-ssh-2.1.jar:lib/junit-4.5.jar:lib/cog-karajan-0.33.jar:lib/graphlayout-1.2.1.jar:lib/glite-security-util-java.jar:lib/xalan.jar:lib/bsf-utils-3.1.jar:lib/stax-api-1.0.1.jar:lib/swingx-1.6.jar:lib/jgss.jar:lib/scala-compiler-2.10.2.jar:lib/cog-grapheditor-0.47.jar:lib/jena-dig.jar:lib/tcljava-1.2.6.jar:lib/miglayout-core-4.2.jar:lib/docking-frames-common.jar:lib/bcprov-jdk15-133.jar:lib/jetty-xml-8.0.4.v20111024.jar:lib/wsrf_mds_usefulrp_schema_stubs.jar:lib/javax.xml.soap-api-1.3.6.jar:lib/jetty-server-8.0.4.v20111024.jar:lib/org.appdapter.bundle.debug-1.1.6-SNAPSHOT.jar:lib/backport-util-concurrent.jar:lib/gridsam-schema-2.0.1.jar:lib/miglayout-swing-4.2.jar:lib/cog-util-0.91.jar:lib/org.appdapter.bundle.fileconv-1.1.6-SNAPSHOT.jar:lib/org.apache.servicemix.bundles.xerces-2.11.0_1.jar:lib/mail.jar:lib/commons-math-3.0-SNAPSHOT.jar:lib/cog-provider-local-2.0.jar:lib/scala-reflect-2.10.2.jar:lib/cog-provider-clref-gt4_0_0.jar:lib/globus_delegation_service.jar:lib/cog-provider-webdav-1.0.jar:lib/SftpTrileadAdaptor.jar:lib/org.apache.servicemix.bundles.junit-4.7_3.jar:lib/GlobusAdaptor.jar:lib/org.osgi.core-1.4.0.jar:lib/java-json.jar:lib/wsrf_provider_jce.jar:lib/CommandlineSshAdaptor.jar:lib/commons-logging-1.1.3.jar:lib/cog-certmanagement-1.0.jar:lib/cog-provider-gt3_2_1-2.0.jar:lib/cog-trap-1.0.jar:lib/naming-resources.jar:lib/owlapi-distribution-4.1.4.jar:lib/globus_wsrf_rendezvous_service.jar:lib/gram-client.jar:lib/jetty-servlet-8.0.4.v20111024.jar:lib/orphanNodesAlg.jar:lib/drmaa.jar:lib/servlet.jar:lib/com.springsource.org.apache.log4j-1.2.16.jar:lib/addressing-1.0.jar:lib/JFlex.jar:lib/globus_wsrf_mds_aggregator_stubs.jar:lib/javaff_lrta_bounded_children_heap-0.0.1-SNAPSHOT.jar:lib/jakarta-slide-webdavlib-2.0.jar:lib/zoni.jar:lib/cycSparqlEndpoint.jar:lib/SftpAdaptor.jar:lib/itinnov-grid-client-staterepos-omii1.1.jar:lib/globus_wsrf_rft_stubs.jar:lib/xercesImpl.jar:lib/h2-1.3.157.jar:lib/json.jar:lib/servlet-api-3.0.20100224.jar:lib/jetty-security-8.0.4.v20111024.jar:lib/scala-library-2.10.2.jar:lib/hivemind-lib-1.1.1.jar:lib/JGoLayout.jar:lib/jfreechart-1.0.0.jar:lib/globus_wsrf_rendezvous_stubs.jar:lib/itinnov-grid-utils-omii1.jar:lib/docking-frames-core.jar:lib/cryptix-asn1.jar:lib/openrdf-sesame-2.2.4-onejar.jar:lib/naming-java.jar:lib/JGoWeb.jar:lib/java_websocket.jar:lib/procyon-compilertools-0.5.33-enigma.jar:lib/ext.bundle.apache_httpclient-1.1.6-SNAPSHOT.jar:lib/naming-factory.jar:lib/commonj.jar:lib/com.springsource.com.ibm.icu-3.4.5.jar:lib/opensaml.jar:lib/cog-jobmanager.jar:lib/commons-vfs-1.0.jar:lib/wstx-asl-3.2.9.jar:lib/KoalaAdaptor.jar:lib/itinnov-grid-comms-omii1.1.jar:lib/iri.jar:lib/xml-apis.jar:lib/xml4j.jar:lib/cog-setup-0.91.jar:lib/activation.jar:lib/wsrf_mds_index_stubs.jar:lib/commons-vfs2-2.1.jar:lib/httpcore-osgi-4.3.jar:lib/trilead-ssh2-build213-RK.jar:lib/junit.jar:lib/itinnov-grid-client-swing-omii1.jar:lib/org.appdapter.lib.core-1.1.6-SNAPSHOT.jar:lib/commons-beanutils.jar:lib/kaon2.jar:lib/bsf.jar:lib/ext.bundle.openconverters-1.1.6-SNAPSHOT.jar:lib/cog-abstraction-examples-2.1.jar:lib/ekitspell.jar:lib/commons-cli-1.0.jar:lib/omii-security-utils-1.1.jar:lib/SftpGanymedAdaptor.jar:lib/org.osgi.compendium-4.2.0.jar:lib/gridsam-core-2.0.1.jar:lib/jaxrpc.jar:lib/globus_wsrf_rft_client.jar:lib/jaxen-1.1.1.jar:lib/ublsupport/ublsupport.jar:lib/ganymed-ssh2-build211beta4.jar:lib/jetty-webapp-8.0.4.v20111024.jar:lib/gridsam-client.jar:lib/commons-collections-3.0.jar:lib/ext.bundle.math.jscience_50SNAP-1.0.9.jar:lib/jsp-2.1-glassfish-2.1.v20100127.jar:lib/org.apache.servicemix.bundles.javax.mail-1.4.1_4.jar:lib/dom4j-1.6.1.jar:ext/owlim-big-3.1.a7.jar:ext/concurrent.jar:ext/ordi-model-0.5.jar:ext/asm-all-3.1.jar:ext/ordi-trree-adapter-3.1.a6.jar:ext/junit-4.5.jar:ext/javagat/adaptors/SshTrileadAdaptor/SshTrileadAdaptor.jar:ext/javagat/adaptors/SshTrileadAdaptor/trilead-ssh2-build213-RK.jar:ext/javagat/adaptors/MercuryAdaptor/MercuryAdaptor.jar:ext/javagat/adaptors/GenericAdaptor/GenericAdaptor.jar:ext/javagat/adaptors/SftpAdaptor/j2ssh-core-0.2.9.jar:ext/javagat/adaptors/SftpAdaptor/jce-jdk13-131.jar:ext/javagat/adaptors/SftpAdaptor/SftpAdaptor.jar:ext/javagat/adaptors/SftpGanymedAdaptor/SftpGanymedAdaptor.jar:ext/javagat/adaptors/SftpGanymedAdaptor/ganymed-ssh2-build211beta4.jar:ext/javagat/adaptors/CommandlineSshAdaptor/CommandlineSshAdaptor.jar:ext/javagat/adaptors/LocalAdaptor/LocalAdaptor.jar:ext/javagat/adaptors/SgeAdaptor/SgeAdaptor.jar:ext/javagat/adaptors/SgeAdaptor/drmaa.jar:ext/javagat/castor-1.1.1-xml.jar:ext/javagat/commons-logging-1.1.jar:ext/javagat/GAT-API.jar:ext/javagat/GAT-engine.jar:ext/javagat/log4j-1.2.13.jar:ext/javagat/xmlParserAPIs.jar:ext/servlet.jar:ext/GAT/Adaptors/SshTrileadAdaptor/SshTrileadAdaptor.jar:ext/GAT/Adaptors/SshTrileadAdaptor/trilead-ssh2-build213-RK.jar:ext/GAT/Adaptors/SftpTrileadAdaptor/SftpTrileadAdaptor.jar:ext/GAT/Adaptors/SftpTrileadAdaptor/trilead-ssh2-build213-RK.jar:ext/GAT/Adaptors/GridsamAdaptor/itinnov-grid-types-omii1.jar:ext/GAT/Adaptors/GridsamAdaptor/itinnov-grid-service-types-omii1.jar:ext/GAT/Adaptors/GridsamAdaptor/wss4j-1.5.0-itinnov-2.jar:ext/GAT/Adaptors/GridsamAdaptor/axis-1.2.1-itinnov-1.jar:ext/GAT/Adaptors/GridsamAdaptor/xmlsec.jar:ext/GAT/Adaptors/GridsamAdaptor/itinnov-grid-client-helpers-omii1.jar:ext/GAT/Adaptors/GridsamAdaptor/itinnov-grid-client-cli-omii1.1.jar:ext/GAT/Adaptors/GridsamAdaptor/GridsamAdaptor.jar:ext/GAT/Adaptors/GridsamAdaptor/itinnov-grid-client-echo-omii1.jar:ext/GAT/Adaptors/GridsamAdaptor/itinnov-grid-service-utils-omii1.jar:ext/GAT/Adaptors/GridsamAdaptor/xbean-2.1.0.jar:ext/GAT/Adaptors/GridsamAdaptor/itinnov-gridservit-0.3.0.jar:ext/GAT/Adaptors/GridsamAdaptor/xalan.jar:ext/GAT/Adaptors/GridsamAdaptor/gridsam-schema-2.0.1.jar:ext/GAT/Adaptors/GridsamAdaptor/servlet.jar:ext/GAT/Adaptors/GridsamAdaptor/addressing-1.0.jar:ext/GAT/Adaptors/GridsamAdaptor/itinnov-grid-client-staterepos-omii1.1.jar:ext/GAT/Adaptors/GridsamAdaptor/itinnov-grid-utils-omii1.jar:ext/GAT/Adaptors/GridsamAdaptor/saaj.jar:ext/GAT/Adaptors/GridsamAdaptor/itinnov-grid-comms-omii1.1.jar:ext/GAT/Adaptors/GridsamAdaptor/endorsed/saaj.jar:ext/GAT/Adaptors/GridsamAdaptor/activation.jar:ext/GAT/Adaptors/GridsamAdaptor/itinnov-grid-client-swing-omii1.jar:ext/GAT/Adaptors/GridsamAdaptor/stax-api-1.0.jar:ext/GAT/Adaptors/GridsamAdaptor/commons-cli-1.0.jar:ext/GAT/Adaptors/GridsamAdaptor/omii-security-utils-1.1.jar:ext/GAT/Adaptors/GridsamAdaptor/gridsam-core-2.0.1.jar:ext/GAT/Adaptors/GridsamAdaptor/gridsam-client.jar:ext/GAT/Adaptors/MercuryAdaptor/MercuryAdaptor.jar:ext/GAT/Adaptors/GenericAdaptor/GenericAdaptor.jar:ext/GAT/Adaptors/GlobusAdaptor/services_AdvertServiceEntry_stubs.jar:ext/GAT/Adaptors/GlobusAdaptor/cog-provider-gt4_0_0-2.3.jar:ext/GAT/Adaptors/GlobusAdaptor/castor-0.9.6.jar:ext/GAT/Adaptors/GlobusAdaptor/xpp3-1.1.3.4d_b4_min.jar:ext/GAT/Adaptors/GlobusAdaptor/cog-abstraction-common-2.1.jar:ext/GAT/Adaptors/GlobusAdaptor/cog-resources-1.0.jar:ext/GAT/Adaptors/GlobusAdaptor/wsrf_core_stubs.jar:ext/GAT/Adaptors/GlobusAdaptor/gram-utils.jar:ext/GAT/Adaptors/GlobusAdaptor/xmlsec.jar:ext/GAT/Adaptors/GlobusAdaptor/cog-certrequest-1.0.jar:ext/GAT/Adaptors/GlobusAdaptor/axis.jar:ext/GAT/Adaptors/GlobusAdaptor/services_IndexServiceProxyService_stubs.jar:ext/GAT/Adaptors/GlobusAdaptor/cog-provider-gt2-2.2.jar:ext/GAT/Adaptors/GlobusAdaptor/naming-common.jar:ext/GAT/Adaptors/GlobusAdaptor/commons-digester.jar:ext/GAT/Adaptors/GlobusAdaptor/cog-gridfaces-1.0.jar:ext/GAT/Adaptors/GlobusAdaptor/gram-stubs.jar:ext/GAT/Adaptors/GlobusAdaptor/cog-provider-gt2ft-1.0.jar:ext/GAT/Adaptors/GlobusAdaptor/concurrent.jar:ext/GAT/Adaptors/GlobusAdaptor/antlr.jar:ext/GAT/Adaptors/GlobusAdaptor/j2ssh-common-0.2.2.jar:ext/GAT/Adaptors/GlobusAdaptor/cog-url.jar:ext/GAT/Adaptors/GlobusAdaptor/cog-provider-condor-2.0.jar:ext/GAT/Adaptors/GlobusAdaptor/jakarta-regexp-1.2.jar:ext/GAT/Adaptors/GlobusAdaptor/globus_delegation_stubs.jar:ext/GAT/Adaptors/GlobusAdaptor/cog-axis.jar:ext/GAT/Adaptors/GlobusAdaptor/wss4j.jar:ext/GAT/Adaptors/GlobusAdaptor/globus_wsrf_rft.jar:ext/GAT/Adaptors/GlobusAdaptor/xstream-1.1.1-patched.jar:ext/GAT/Adaptors/GlobusAdaptor/cog-gridshell-1.0.jar:ext/GAT/Adaptors/GlobusAdaptor/wsrf_core.jar:ext/GAT/Adaptors/GlobusAdaptor/wsrf_tools.jar:ext/GAT/Adaptors/GlobusAdaptor/cog-jglobus.jar:ext/GAT/Adaptors/GlobusAdaptor/cog-provider-clref-gt3_2_1.jar:ext/GAT/Adaptors/GlobusAdaptor/jaas.jar:ext/GAT/Adaptors/GlobusAdaptor/cog-provider-ssh-2.1.jar:ext/GAT/Adaptors/GlobusAdaptor/cog-karajan-0.33.jar:ext/GAT/Adaptors/GlobusAdaptor/xalan.jar:ext/GAT/Adaptors/GlobusAdaptor/jgss.jar:ext/GAT/Adaptors/GlobusAdaptor/cog-grapheditor-0.47.jar:ext/GAT/Adaptors/GlobusAdaptor/wsrf_mds_usefulrp_schema_stubs.jar:ext/GAT/Adaptors/GlobusAdaptor/backport-util-concurrent.jar:ext/GAT/Adaptors/GlobusAdaptor/cog-util-0.91.jar:ext/GAT/Adaptors/GlobusAdaptor/cog-provider-local-2.0.jar:ext/GAT/Adaptors/GlobusAdaptor/cog-provider-clref-gt4_0_0.jar:ext/GAT/Adaptors/GlobusAdaptor/globus_delegation_service.jar:ext/GAT/Adaptors/GlobusAdaptor/cog-provider-webdav-1.0.jar:ext/GAT/Adaptors/GlobusAdaptor/GlobusAdaptor.jar:ext/GAT/Adaptors/GlobusAdaptor/wsrf_provider_jce.jar:ext/GAT/Adaptors/GlobusAdaptor/cog-certmanagement-1.0.jar:ext/GAT/Adaptors/GlobusAdaptor/cog-provider-gt3_2_1-2.0.jar:ext/GAT/Adaptors/GlobusAdaptor/cog-trap-1.0.jar:ext/GAT/Adaptors/GlobusAdaptor/naming-resources.jar:ext/GAT/Adaptors/GlobusAdaptor/globus_wsrf_rendezvous_service.jar:ext/GAT/Adaptors/GlobusAdaptor/gram-client.jar:ext/GAT/Adaptors/GlobusAdaptor/addressing-1.0.jar:ext/GAT/Adaptors/GlobusAdaptor/globus_wsrf_mds_aggregator_stubs.jar:ext/GAT/Adaptors/GlobusAdaptor/jakarta-slide-webdavlib-2.0.jar:ext/GAT/Adaptors/GlobusAdaptor/globus_wsrf_rft_stubs.jar:ext/GAT/Adaptors/GlobusAdaptor/xercesImpl.jar:ext/GAT/Adaptors/GlobusAdaptor/globus_wsrf_rendezvous_stubs.jar:ext/GAT/Adaptors/GlobusAdaptor/naming-java.jar:ext/GAT/Adaptors/GlobusAdaptor/naming-factory.jar:ext/GAT/Adaptors/GlobusAdaptor/commonj.jar:ext/GAT/Adaptors/GlobusAdaptor/opensaml.jar:ext/GAT/Adaptors/GlobusAdaptor/saaj.jar:ext/GAT/Adaptors/GlobusAdaptor/cog-jobmanager.jar:ext/GAT/Adaptors/GlobusAdaptor/xml-apis.jar:ext/GAT/Adaptors/GlobusAdaptor/xml4j.jar:ext/GAT/Adaptors/GlobusAdaptor/cog-setup-0.91.jar:ext/GAT/Adaptors/GlobusAdaptor/activation.jar:ext/GAT/Adaptors/GlobusAdaptor/wsrf_mds_index_stubs.jar:ext/GAT/Adaptors/GlobusAdaptor/j2ssh-core-0.2.2.jar:ext/GAT/Adaptors/GlobusAdaptor/junit.jar:ext/GAT/Adaptors/GlobusAdaptor/commons-beanutils.jar:ext/GAT/Adaptors/GlobusAdaptor/cog-abstraction-examples-2.1.jar:ext/GAT/Adaptors/GlobusAdaptor/commons-cli-1.0.jar:ext/GAT/Adaptors/GlobusAdaptor/globus_wsrf_rft_client.jar:ext/GAT/Adaptors/GlobusAdaptor/commons-collections-3.0.jar:ext/GAT/Adaptors/GlobusAdaptor/xml-apis-1.1.jar:ext/GAT/Adaptors/ZorillaAdaptor/ZorillaAdaptor.jar:ext/GAT/Adaptors/ZorillaAdaptor/smartsockets-1.51.jar:ext/GAT/Adaptors/ZorillaAdaptor/zoni.jar:ext/GAT/Adaptors/GliteAdaptor/axis-1.4.jar:ext/GAT/Adaptors/GliteAdaptor/glite-security-delegation-java.jar:ext/GAT/Adaptors/GliteAdaptor/srm.jar:ext/GAT/Adaptors/GliteAdaptor/glite-security-trustmanager.jar:ext/GAT/Adaptors/GliteAdaptor/lb.jar:ext/GAT/Adaptors/GliteAdaptor/wsrf_core_stubs.jar:ext/GAT/Adaptors/GliteAdaptor/glite-jdl-api-java.jar:ext/GAT/Adaptors/GliteAdaptor/cog-jglobus-1.4.jar:ext/GAT/Adaptors/GliteAdaptor/gram-stubs.jar:ext/GAT/Adaptors/GliteAdaptor/cog-url.jar:ext/GAT/Adaptors/GliteAdaptor/wms3.1.jar:ext/GAT/Adaptors/GliteAdaptor/cog-axis.jar:ext/GAT/Adaptors/GliteAdaptor/GliteAdaptor.jar:ext/GAT/Adaptors/GliteAdaptor/wss4j.jar:ext/GAT/Adaptors/GliteAdaptor/wsrf_core.jar:ext/GAT/Adaptors/GliteAdaptor/glite-security-util-java.jar:ext/GAT/Adaptors/GliteAdaptor/servlet.jar:ext/GAT/Adaptors/GliteAdaptor/addressing-1.0.jar:ext/GAT/Adaptors/GliteAdaptor/globus_wsrf_mds_aggregator_stubs.jar:ext/GAT/Adaptors/GliteAdaptor/saaj.jar:ext/GAT/Adaptors/GliteAdaptor/activation.jar:ext/GAT/Adaptors/GliteAdaptor/log4j-1.2.13.jar:ext/GAT/Adaptors/CommandlineSshAdaptor/CommandlineSshAdaptor.jar:ext/GAT/Adaptors/shared/wsdl4j.jar:ext/GAT/Adaptors/shared/cryptix32.jar:ext/GAT/Adaptors/shared/puretls.jar:ext/GAT/Adaptors/shared/commons-logging-1.1.jar:ext/GAT/Adaptors/shared/commons-httpclient-3.1.jar:ext/GAT/Adaptors/shared/cryptix.jar:ext/GAT/Adaptors/shared/bcprov-jdk15-133.jar:ext/GAT/Adaptors/shared/mail.jar:ext/GAT/Adaptors/shared/commons-codec-1.3.jar:ext/GAT/Adaptors/shared/cryptix-asn1.jar:ext/GAT/Adaptors/shared/jaxrpc.jar:ext/GAT/Adaptors/shared/commons-discovery.jar:ext/GAT/Adaptors/KoalaAdaptor/kshared-2.0.jar:ext/GAT/Adaptors/KoalaAdaptor/mysql-connector-java-3.1.13-bin.jar:ext/GAT/Adaptors/KoalaAdaptor/runnersFramework-2.0.jar:ext/GAT/Adaptors/KoalaAdaptor/cog-jglobus.jar:ext/GAT/Adaptors/KoalaAdaptor/KoalaAdaptor.jar:ext/GAT/Adaptors/KoalaAdaptor/log4j-1.2.13.jar:ext/GAT/Adaptors/LocalAdaptor/LocalAdaptor.jar:ext/GAT/Adaptors/SgeAdaptor/SgeAdaptor.jar:ext/GAT/Adaptors/SgeAdaptor/drmaa.jar:ext/openrdf-sesame-2.2.4-onejar.jar:ext/iri.jar:ext/ublsupport/ublsupport.jar



Ignore the below ant failure with code 255..


Starting build
Buildfile: /opt/CYC_JRTL_with_CommonLisp/platform/build.xml

abcl.clean.maybe:

abcl.copy.lisp:
     [copy] Copying 748 files to /opt/CYC_JRTL_with_CommonLisp/platform/build/classes

abcl.stage:
     [copy] Copying 1 file to /opt/CYC_JRTL_with_CommonLisp/platform/build/classes

abcl.init:
     [echo] java.version: 1.8.0_191

abcl.java.warning:

abcl.jsr-223.notice:

abcl.compile.java:
    [javac] Compiling 3531 source files to /opt/CYC_JRTL_with_CommonLisp/platform/build/classes
    [javac] warning: [options] bootstrap class path not set in conjunction with -source 1.6
    [javac] Note: Some input files use or override a deprecated API.
    [javac] Note: Recompile with -Xlint:deprecation for details.
    [javac] Note: Some input files use unchecked or unsafe operations.
    [javac] Note: Recompile with -Xlint:unchecked for details.
    [javac] 1 warning
    [javac] Creating empty /opt/CYC_JRTL_with_CommonLisp/platform/build/classes/com/cyc/cycjava/package-info.class

abcl.system.uptodate:

abcl.system.update.maybe:

abcl.fasls.uptodate:

abcl.compile.lisp:
     [echo]
     [echo] Compiling Lisp system
     [echo] from /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp
     [echo]  to  /opt/CYC_JRTL_with_CommonLisp/platform/build/classes/org/armedbear/lisp
     [java] DEBUG: First SUBLFILE
     [java] Armed Bear Common Lisp 1.5.0-uabcl-dev (built Sun Jan 06 2019 12:51:48 UTC)
     [java] Java 1.8.0_191 Oracle Corporation
     [java] OpenJDK 64-Bit Server VM
     [java] Low-level initialization completed in 0.63 seconds.

...<SNIP>...

     [java] ; (IN-PACKAGE "SYSTEM")
     [java] ; (DEFVAR *COMPILER-MACROS* ...)
     [java] ; (DEFUN COMPILER-MACRO-FUNCTION ...)
     [java] ; (DEFUN (SETF COMPILER-MACRO-FUNCTION) ...)
     [java] ; (DEFMACRO DEFINE-COMPILER-MACRO ...)
     [java] ; (DEFUN COMPILER-MACROEXPAND-1 ...)
     [java] ; (DEFUN COMPILER-MACROEXPAND ...)
     [java] ; Wrote /opt/CYC_JRTL_with_CommonLisp/platform/build/classes/org/armedbear/lisp/compiler-macro.abcl (0.115 seconds)
     [java] ; Loading /opt/CYC_JRTL_with_CommonLisp/platform/build/classes/org/armedbear/lisp/compiler-macro.abcl ...
     [java] ; Loaded /opt/CYC_JRTL_with_CommonLisp/platform/build/classes/org/armedbear/lisp/compiler-macro.abcl (0.012 seconds)
     [java] ; Compiling /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/jvm-instructions.lisp ...
     [java] ; (IN-PACKAGE #:JVM)
     [java] ; (DECLAIM (INLINE U2 ...))
     [java] ; (DEFKNOWN U2 ...)
     [java] ; (DEFUN U2 ...)
     [java] ; (DEFKNOWN S1 ...)
     [java] ; (DEFUN S1 ...)
     [java] ; (DEFKNOWN S2 ...)
     [java] ; (DEFUN S2 ...)
     [java] ; (DEFCONST *OPCODE-TABLE* ...)
     [java] ; (DEFCONST *OPCODES* ...)
     [java] ; (DEFSTRUCT JVM-OPCODE ...)
     [java] ; (DEFUN %DEFINE-OPCODE ...)

...<SNIP>...

     [java] ; (IN-PACKAGE :SYSTEM)
     [java] ; (DOLIST (FS #) ...)
     [java] ; (IN-PACKAGE :CL)
     [java] ; (IN-PACKAGE :CL)
     [java] ; (DOLIST (SYSTEM::FS #) ...)
     [java] ; (IN-PACKAGE :CL)
     [java] ; (DOLIST (SYSTEM::FS #) ...)
     [java] ; (IN-PACKAGE :CL)
     [java] ; (DOLIST (SYSTEM::FS #) ...)
     [java] ; (IN-PACKAGE :CL)
     [java] ; (DOLIST (SYSTEM::FS #) ...)
     [java] ; Wrote /opt/CYC_JRTL_with_CommonLisp/platform/build/classes/org/armedbear/lisp/autoloads-gen.abcl (0.132 seconds)
     [java] ; Compiling /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/autoloads.lisp ...
     [java] ; (IN-PACKAGE "SYSTEM")
     [java] ; (AUTOLOAD (QUOTE SIMPLE-FORMAT) ...)
     [java] ; Wrote /opt/CYC_JRTL_with_CommonLisp/platform/build/classes/org/armedbear/lisp/autoloads.abcl (0.001 seconds)
     [java] ;COMMON-LISP:FILL triggers autoloading of fill ...
     [java] ; Autoloaded fill (0.001 seconds)
     [java] ;COMMON-LISP:REPLACE triggers autoloading of replace ...
     [java] ; Autoloaded replace (0.002 seconds)
     [java]
     [java] ; Compilation unit finished
     [java] ;   Caught 4 STYLE-WARNING conditions
     [java] ;   The following functions were used but not defined:
     [java] ;     SYSTEM::SOURCE
     [java]
     [java] 176.919 seconds real time
     [java] 245928359 cons cells

BUILD FAILED
/opt/CYC_JRTL_with_CommonLisp/platform/build.xml:304: The following error occurred while executing this line:
/opt/CYC_JRTL_with_CommonLisp/platform/build.xml:323: Java returned: 255

Total time: 4 minutes 32 seconds


Ignore the above ant failure with code 255..


Starting final build
Buildfile: /opt/CYC_JRTL_with_CommonLisp/platform/build.xml

abcl.clean.maybe:

abcl.copy.lisp:

abcl.stage:

abcl.init:
     [echo] java.version: 1.8.0_191

abcl.java.warning:

abcl.jsr-223.notice:

abcl.compile.java:
    [javac] Compiling 5 source files to /opt/CYC_JRTL_with_CommonLisp/platform/build/classes
    [javac] warning: [options] bootstrap class path not set in conjunction with -source 1.6
    [javac] 1 warning

abcl.system.uptodate:

abcl.system.update.maybe:

abcl.fasls.uptodate:

abcl.compile.lisp:
     [echo]
     [echo] Compiling Lisp system
     [echo] from /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp
     [echo]  to  /opt/CYC_JRTL_with_CommonLisp/platform/build/classes/org/armedbear/lisp
     [java] DEBUG: First SUBLFILE
     [java] Armed Bear Common Lisp 1.5.0-uabcl-dev (built Sun Jan 06 2019 12:59:39 UTC)
     [java] Java 1.8.0_191 Oracle Corporation
     [java] OpenJDK 64-Bit Server VM
     [java] Low-level initialization completed in 0.647 seconds.
     [java] ;  Loading /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/autoloads-gen.lisp ...
     [java] ;  Loaded /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/autoloads-gen.lisp (0.04 seconds)
     [java] ;  Loading /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/autoloads.lisp ...
     [java] ;  Loaded /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/autoloads.lisp (0.001 seconds)
     [java] ;  Loading /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/early-defuns.lisp ...
     [java] ;  Loaded /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/early-defuns.lisp (0.008 seconds)
     [java] ;  Loading /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/backquote.lisp ...
     [java] ;  Loaded /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/backquote.lisp (0.005 seconds)
     [java] ;  Loading /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/destructuring-bind.lisp ...
     [java] ;  COMMON-LISP:CHAR= triggers autoloading of org.armedbear.lisp.CharacterFunctions ...
     [java] ;   Autoloaded org.armedbear.lisp.CharacterFunctions (0.003 seconds)
     [java] ;  COMMON-LISP:LAST triggers autoloading of org.armedbear.lisp.last ...
     [java] ;   Autoloaded org.armedbear.lisp.last (0.001 seconds)
     [java] ;  Loaded /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/destructuring-bind.lisp (0.029 seconds)
     [java] ;  Loading /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/defmacro.lisp ...
     [java] ;  Loaded /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/defmacro.lisp (0.004 seconds)
     [java] ;  Loading /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/setf.lisp ...
     [java] ;  Loaded /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/setf.lisp (0.015 seconds)
     [java] ;  Loading /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/fdefinition.lisp ...
     [java] ;  SYSTEM::%SET-ARGLIST triggers autoloading of org.armedbear.lisp.arglist ...
     [java] ;   Autoloaded org.armedbear.lisp.arglist (0.001 seconds)
     [java] ;  Loaded /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/fdefinition.lisp (0.005 seconds)
     [java] ;  Loading /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/featurep.lisp ...
     [java] ;  Loaded /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/featurep.lisp (0.003 seconds)
     [java] ;  Loading /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/read-conditional.lisp ...
     [java] ;  Loaded /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/read-conditional.lisp (0.001 seconds)
     [java] ;  Loading /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/macros.lisp ...
     [java] ;  Loaded /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/macros.lisp (0.011 seconds)
     [java] ;  Loading /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/read-circle.lisp ...
     [java] ;  Loaded /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/read-circle.lisp (0.01 seconds)
     [java] ;  Loading /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/inline.lisp ...
     [java] ;  Loaded /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/inline.lisp (0.001 seconds)
     [java] ;  Loading /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/proclaim.lisp ...
     [java] ;  COMMON-LISP:MAKE-HASH-TABLE triggers autoloading of make-hash-table ...
     [java] ;   Autoloaded make-hash-table (0.002 seconds)
     [java] ;  SYSTEM::%MAKE-HASH-TABLE triggers autoloading of org.armedbear.lisp.HashTableFunctions ...
     [java] ;   Autoloaded org.armedbear.lisp.HashTableFunctions (0.006 seconds)
     [java] ;  Loaded /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/proclaim.lisp (0.014 seconds)
     [java] ;  Loading /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/arrays.lisp ...
     [java] ;  Loaded /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/arrays.lisp (0.004 seconds)
     [java] ;  Loading /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/compiler-macro.lisp ...
     [java] ;  Loaded /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/compiler-macro.lisp (0.003 seconds)
     [java] ;  Loading /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/subtypep.lisp ...
     [java] ;  Loaded /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/subtypep.lisp (0.047 seconds)
     [java] ;  Loading /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/typep.lisp ...
     [java] ;  Loaded /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/typep.lisp (0.003 seconds)
     [java] ;  Loading /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/signal.lisp ...
     [java] ;  Loaded /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/signal.lisp (0.005 seconds)
     [java] ;  Loading /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/list.lisp ...
     [java] ;  Loaded /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/list.lisp (0.002 seconds)
     [java] ;  Loading /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/require.lisp ...
     [java] ;  Loaded /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/require.lisp (0.001 seconds)
     [java] ;  Loading /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/precompiler.lisp ...
     [java] ;  COMMON-LISP:STRINGP triggers autoloading of org.armedbear.lisp.StringFunctions ...
     [java] ;   Autoloaded org.armedbear.lisp.StringFunctions (0.01 seconds)
     [java] ;  SYSTEM::SET-FUNCTION-INFO-VALUE triggers autoloading of org.armedbear.lisp.function_info ...
     [java] ;   Autoloaded org.armedbear.lisp.function_info (0.001 seconds)
     [java] ;  Loaded /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/precompiler.lisp (0.105 seconds)
     [java] ;  Loading /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/extensible-sequences-base.lisp ...
     [java] ;  COMMON-LISP:ADJOIN triggers autoloading of adjoin ...
     [java] ;    COMMON-LISP:COPY-LIST triggers autoloading of org.armedbear.lisp.copy_list ...
     [java] ;     Autoloaded org.armedbear.lisp.copy_list (0.001 seconds)
     [java] ;   Autoloaded adjoin (0.005 seconds)
     [java] ;  COMMON-LISP:STRING= triggers autoloading of strings ...
     [java] ;   Autoloaded strings (0.048 seconds)
     [java] ;  Loaded /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/extensible-sequences-base.lisp (0.074 seconds)
     [java] ;  Loading /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/sequences.lisp ...
     [java] ;  Loaded /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/sequences.lisp (0.012 seconds)
     [java] ;  Loading /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/error.lisp ...
     [java] ;  Loaded /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/error.lisp (0.003 seconds)
     [java] ;  Loading /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/defpackage.lisp ...
     [java] ;  Loaded /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/defpackage.lisp (0.022 seconds)
     [java] ;  Loading /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/define-modify-macro.lisp ...
     [java] ;  Loaded /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/define-modify-macro.lisp (0.033 seconds)
     [java] ;  Loading /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/defstruct.lisp ...
     [java] ;  Loaded /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/defstruct.lisp (0.177 seconds)
     [java] ; COMMON-LISP:CONCATENATE triggers autoloading of concatenate ...
     [java] ;  Autoloaded concatenate (0.005 seconds)
     [java] ; COMMON-LISP:MAKE-STRING triggers autoloading of make-string ...
     [java] ;  Autoloaded make-string (0.001 seconds)
     [java] ; SYSTEM::%MAKE-ARRAY triggers autoloading of org.armedbear.lisp.make_array ...
     [java] ;  Autoloaded org.armedbear.lisp.make_array (0.005 seconds)
     [java] ;  Loading /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/restart.lisp ...
     [java] ;  COMMON-LISP:ASSOC triggers autoloading of assoc ...
     [java] ;   Autoloaded assoc (0.022 seconds)
     [java] ;  COMMON-LISP:LDIFF triggers autoloading of ldiff ...
     [java] ;   Autoloaded ldiff (0.002 seconds)
     [java] ;  COMMON-LISP:MAPCAN triggers autoloading of map1 ...
     [java] ;   Autoloaded map1 (0.006 seconds)
     [java] ;  Loaded /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/restart.lisp (0.12 seconds)
     [java] ;  Loading /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/late-setf.lisp ...
     [java] ;  Loaded /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/late-setf.lisp (0.009 seconds)
     [java] ;  Loading /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/debug.lisp ...
     [java] ;  Loaded /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/debug.lisp (0.033 seconds)
     [java] ;  Loading /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/print.lisp ...
     [java] ;  Loaded /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/print.lisp (0.017 seconds)
     [java] ;  Loading /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/pprint-dispatch.lisp ...
     [java] ;   Loading /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/pprint.lisp ...
     [java] ;     Loading /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/print-object.lisp ...
     [java] ;      Loading /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/clos.lisp ...
     [java] ;      COMMON-LISP:UNION triggers autoloading of sets ...
     [java] ;       Autoloaded sets (0.026 seconds)
     [java] ;      COMMON-LISP:REMOVE-DUPLICATES triggers autoloading of remove-duplicates ...
     [java] ;       Autoloaded remove-duplicates (0.01 seconds)
     [java] ;      COMMON-LISP:BUTLAST triggers autoloading of butlast ...
     [java] ;       Autoloaded butlast (0.003 seconds)
     [java] ;      SYSTEM::SIMPLE-LIST-REMOVE-DUPLICATES triggers autoloading of org.armedbear.lisp.simple_list_remove_duplicates ...
     [java] ;       Autoloaded org.armedbear.lisp.simple_list_remove_duplicates (0.001 seconds)
     [java] ;      COMMON-LISP:REMOVE-IF triggers autoloading of remove ...
     [java] ;         Loading /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/delete.lisp ...
     [java] ;         Loaded /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/delete.lisp (0.032 seconds)
     [java] ;       Autoloaded remove (0.08 seconds)
     [java] ;      COMMON-LISP:DELETE-DUPLICATES triggers autoloading of delete-duplicates ...
     [java] ;       Autoloaded delete-duplicates (0.006 seconds)
     [java] ;      COMMON-LISP:FIND-IF-NOT triggers autoloading of find ...
     [java] ;       Autoloaded find (0.077 seconds)
     [java] ;       Loading /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/loop.lisp ...
     [java] ;       Loaded /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/loop.lisp (0.145 seconds)
     [java] ;      COMMON-LISP:REVAPPEND triggers autoloading of revappend ...
     [java] ;       Autoloaded revappend (0.001 seconds)
     [java] ;      SYSTEM:%ALLOCATE-FUNCALLABLE-INSTANCE triggers autoloading of org.armedbear.lisp.FuncallableStandardObject ...
     [java] ;       Autoloaded org.armedbear.lisp.FuncallableStandardObject (0.002 seconds)
     [java] ;      COMMON-LISP:SORT triggers autoloading of sort ...
     [java] ;          Loading /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/collect.lisp ...
     [java] ;          Loaded /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/collect.lisp (0.004 seconds)
     [java] ;       Autoloaded sort (0.069 seconds)
     [java] ;       Loading /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/mop.lisp ...
     [java] ;       Loaded /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/mop.lisp (0.003 seconds)
     [java] ;      Loaded /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/clos.lisp (0.998 seconds)
     [java] ;     Loaded /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/print-object.lisp (1.011 seconds)
     [java] ;    COMMON-LISP:BYTE triggers autoloading of ldb ...
     [java] ;     Autoloaded ldb (0.003 seconds)
     [java] ;    COMMON-LISP:REDUCE triggers autoloading of reduce ...
     [java] ;     Autoloaded reduce (0.009 seconds)
     [java] ;   COMMON-LISP:PARSE-INTEGER triggers autoloading of parse-integer ...
     [java] ;    Autoloaded parse-integer (0.003 seconds)
     [java] ;   Loaded /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/pprint.lisp (1.616 seconds)
     [java] ;  COMMON-LISP:COUNT-IF triggers autoloading of count ...
     [java] ;   Autoloaded count (0.024 seconds)
     [java] ;  Loaded /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/pprint-dispatch.lisp (1.684 seconds)
     [java] ;  Loading /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/defsetf.lisp ...
     [java] ;  Loaded /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/defsetf.lisp (0.01 seconds)
     [java] ;  Loading /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/package.lisp ...
     [java] ;  Loaded /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/package.lisp (0.01 seconds)
     [java] ; COMMON-LISP:FLOAT triggers autoloading of org.armedbear.lisp.FloatFunctions ...
     [java] ;  Autoloaded org.armedbear.lisp.FloatFunctions (0.007 seconds)
     [java] Startup completed in 3.261 seconds.
     [java] ;TOP-LEVEL::TOP-LEVEL-LOOP triggers autoloading of top-level ...
     [java] ;   Loading /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/inspect.lisp ...
     [java] ;   Loaded /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/inspect.lisp (0.013 seconds)
     [java] ; Autoloaded top-level (0.053 seconds)
     [java] Type ":help" for a list of available commands.
     [java] CL-USER(1): ;EXTENSIONS:COMPILE-SYSTEM triggers autoloading of compile-system ...
     [java] ;   Loading /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/compile-file.lisp ...
     [java] ;    Loading /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/compiler-pass2.lisp ...
     [java] ;     Loading /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/compiler-types.lisp ...
     [java] ;     SYSTEM::PARSE-LAMBDA-LIST triggers autoloading of parse-lambda-list ...
     [java] ;      Autoloaded parse-lambda-list (0.012 seconds)
     [java] ;     Loaded /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/compiler-types.lisp (0.038 seconds)
     [java] ;     Loading /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/known-functions.lisp ...
     [java] ;     COMMON-LISP:EXPT triggers autoloading of org.armedbear.lisp.MathFunctions ...
     [java] ;      Autoloaded org.armedbear.lisp.MathFunctions (0.007 seconds)
     [java] ;     Loaded /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/known-functions.lisp (0.018 seconds)
     [java] ;     Loading /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/known-symbols.lisp ...
     [java] ;      Loading /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/jvm-class-file.lisp ...
     [java] ;      COMMON-LISP:SUBSTITUTE triggers autoloading of substitute ...
     [java] ;       Autoloaded substitute (0.022 seconds)
     [java] ;      COMMON-LISP:COPY-SEQ triggers autoloading of copy-seq ...
     [java] ;       Autoloaded copy-seq (0.007 seconds)
     [java] ;      Loaded /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/jvm-class-file.lisp (0.296 seconds)
     [java] ;      Loading /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/java.lisp ...
     [java] ;      JAVA::GET-DEFAULT-CLASSLOADER triggers autoloading of org.armedbear.lisp.JavaClassLoader ...
     [java] ;       Autoloaded org.armedbear.lisp.JavaClassLoader (0.005 seconds)
     [java] ;      COMMON-LISP:GET-PROPERTIES triggers autoloading of org.armedbear.lisp.get_properties ...
     [java] ;       Autoloaded org.armedbear.lisp.get_properties (0.0 seconds)
     [java] ;      Loaded /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/java.lisp (0.07 seconds)
     [java] ;     Loaded /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/known-symbols.lisp (0.448 seconds)
     [java] ;     Loading /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/dump-form.lisp ...
     [java] ;     Loaded /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/dump-form.lisp (0.008 seconds)
     [java] ;     Loading /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/jvm-instructions.lisp ...
     [java] ;      Loading /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/compiler-error.lisp ...
     [java] ;      Loaded /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/compiler-error.lisp (0.013 seconds)
     [java] ;     COMMON-LISP:MAKE-STRING-OUTPUT-STREAM triggers autoloading of make-string-output-stream ...
     [java] ;      Autoloaded make-string-output-stream (0.001 seconds)
     [java] ;     SYSTEM::%MAKE-STRING-OUTPUT-STREAM triggers autoloading of org.armedbear.lisp.StringOutputStream ...
     [java] ;      Autoloaded org.armedbear.lisp.StringOutputStream (0.001 seconds)
     [java] ;     Loaded /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/jvm-instructions.lisp (0.069 seconds)
     [java] ;     Loading /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/jvm.lisp ...
     [java] ;     Loaded /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/jvm.lisp (0.135 seconds)
     [java] ;     Loading /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/compiler-pass1.lisp ...
     [java] ;     Loaded /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/compiler-pass1.lisp (0.091 seconds)
     [java] ;    COMMON-LISP:COERCE triggers autoloading of coerce ...
     [java] ;     Autoloaded coerce (0.004 seconds)
     [java] ;    COMMON-LISP:MAKE-SEQUENCE triggers autoloading of make-sequence ...
     [java] ;     Autoloaded make-sequence (0.004 seconds)
     [java] ;    Loaded /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/compiler-pass2.lisp (1.167 seconds)
     [java] ;   Loaded /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp/compile-file.lisp (1.211 seconds)
     [java] ; Autoloaded compile-system (1.226 seconds)
     [java] ;EXTENSIONS:PROBE-DIRECTORY triggers autoloading of org.armedbear.lisp.probe_file ...
     [java] ; Autoloaded org.armedbear.lisp.probe_file (0.002 seconds)
     [java] ;SYSTEM::%TIME triggers autoloading of org.armedbear.lisp.Time ...
     [java] ; Autoloaded org.armedbear.lisp.Time (0.002 seconds)
     [java] ;COMMON-LISP:LOAD triggers autoloading of load ...
     [java] ; Autoloaded load (0.002 seconds)
     [java] ;COMMON-LISP:FILE-WRITE-DATE triggers autoloading of org.armedbear.lisp.file_write_date ...
     [java] ; Autoloaded org.armedbear.lisp.file_write_date (0.0 seconds)
     [java] ; Loading /opt/CYC_JRTL_with_CommonLisp/platform/build/classes/org/armedbear/lisp/defstruct.abcl ...
     [java] ; SYSTEM::MAKE-FASL-CLASS-LOADER triggers autoloading of org.armedbear.lisp.FaslClassLoader ...
     [java] ;  Autoloaded org.armedbear.lisp.FaslClassLoader (0.001 seconds)
     [java] ; Loaded /opt/CYC_JRTL_with_CommonLisp/platform/build/classes/org/armedbear/lisp/defstruct.abcl (0.153 seconds)
     [java] ; Loading /opt/CYC_JRTL_with_CommonLisp/platform/build/classes/org/armedbear/lisp/coerce.abcl ...
     [java] ; Loaded /opt/CYC_JRTL_with_CommonLisp/platform/build/classes/org/armedbear/lisp/coerce.abcl (0.013 seconds)
     [java] ; Loading /opt/CYC_JRTL_with_CommonLisp/platform/build/classes/org/armedbear/lisp/open.abcl ...
     [java] ; Loaded /opt/CYC_JRTL_with_CommonLisp/platform/build/classes/org/armedbear/lisp/open.abcl (0.008 seconds)
     [java] ; Loading /opt/CYC_JRTL_with_CommonLisp/platform/build/classes/org/armedbear/lisp/dump-form.abcl ...
     [java] ; Loaded /opt/CYC_JRTL_with_CommonLisp/platform/build/classes/org/armedbear/lisp/dump-form.abcl (0.035 seconds)
     [java] ; Loading /opt/CYC_JRTL_with_CommonLisp/platform/build/classes/org/armedbear/lisp/compiler-types.abcl ...
     [java] ; Loaded /opt/CYC_JRTL_with_CommonLisp/platform/build/classes/org/armedbear/lisp/compiler-types.abcl (0.079 seconds)
     [java] ; Loading /opt/CYC_JRTL_with_CommonLisp/platform/build/classes/org/armedbear/lisp/compile-file.abcl ...
     [java] ; Loaded /opt/CYC_JRTL_with_CommonLisp/platform/build/classes/org/armedbear/lisp/compile-file.abcl (0.206 seconds)
     [java] ; Loading /opt/CYC_JRTL_with_CommonLisp/platform/build/classes/org/armedbear/lisp/precompiler.abcl ...
     [java] ; Loaded /opt/CYC_JRTL_with_CommonLisp/platform/build/classes/org/armedbear/lisp/precompiler.abcl (0.425 seconds)
     [java] ; Loading /opt/CYC_JRTL_with_CommonLisp/platform/build/classes/org/armedbear/lisp/compiler-pass1.abcl ...
     [java] ; SYSTEM::MAKE-MEMORY-CLASS-LOADER triggers autoloading of org.armedbear.lisp.MemoryClassLoader ...
     [java] ;  Autoloaded org.armedbear.lisp.MemoryClassLoader (0.002 seconds)
     [java] ; SYSTEM::%MAKE-BYTE-ARRAY-OUTPUT-STREAM triggers autoloading of org.armedbear.lisp.ByteArrayOutputStream ...
     [java] ;  Autoloaded org.armedbear.lisp.ByteArrayOutputStream (0.002 seconds)
     [java] ; SYSTEM::MAKE-FILL-POINTER-OUTPUT-STREAM triggers autoloading of org.armedbear.lisp.FillPointerOutputStream ...
     [java] ;  Autoloaded org.armedbear.lisp.FillPointerOutputStream (0.003 seconds)
     [java] ; COMMON-LISP:LOGIOR triggers autoloading of org.armedbear.lisp.logior ...
     [java] ;  Autoloaded org.armedbear.lisp.logior (0.0 seconds)
     [java] ; COMMON-LISP:LOGAND triggers autoloading of org.armedbear.lisp.logand ...
     [java] ;  Autoloaded org.armedbear.lisp.logand (0.001 seconds)
     [java] ; COMMON-LISP:WRITE-SEQUENCE triggers autoloading of write-sequence ...
     [java] ;  Autoloaded write-sequence (0.002 seconds)
     [java] ; SYSTEM::EXPAND-DEFTYPE triggers autoloading of deftype ...
     [java] ;  Autoloaded deftype (0.003 seconds)
     [java] ; COMMON-LISP:STREAM-ELEMENT-TYPE triggers autoloading of org.armedbear.lisp.stream_element_type ...
     [java] ;  Autoloaded org.armedbear.lisp.stream_element_type (0.001 seconds)
     [java] ; Loaded /opt/CYC_JRTL_with_CommonLisp/platform/build/classes/org/armedbear/lisp/compiler-pass1.abcl (0.368 seconds)
     [java] ; Loading /opt/CYC_JRTL_with_CommonLisp/platform/build/classes/org/armedbear/lisp/compiler-pass2.abcl ...
     [java] ; Loaded /opt/CYC_JRTL_with_CommonLisp/platform/build/classes/org/armedbear/lisp/compiler-pass2.abcl (1.105 seconds)
     [java] ; Loading /opt/CYC_JRTL_with_CommonLisp/platform/build/classes/org/armedbear/lisp/jvm-class-file.abcl ...
     [java] ; Loaded /opt/CYC_JRTL_with_CommonLisp/platform/build/classes/org/armedbear/lisp/jvm-class-file.abcl (2.528 seconds)
     [java] ; Loading /opt/CYC_JRTL_with_CommonLisp/platform/build/classes/org/armedbear/lisp/jvm.abcl ...
     [java] ; Loaded /opt/CYC_JRTL_with_CommonLisp/platform/build/classes/org/armedbear/lisp/jvm.abcl (2.048 seconds)
     [java] ; Loading /opt/CYC_JRTL_with_CommonLisp/platform/build/classes/org/armedbear/lisp/source-transform.abcl ...
     [java] ; Loaded /opt/CYC_JRTL_with_CommonLisp/platform/build/classes/org/armedbear/lisp/source-transform.abcl (0.011 seconds)
     [java] ; Loading /opt/CYC_JRTL_with_CommonLisp/platform/build/classes/org/armedbear/lisp/compiler-macro.abcl ...
     [java] ; Loaded /opt/CYC_JRTL_with_CommonLisp/platform/build/classes/org/armedbear/lisp/compiler-macro.abcl (0.012 seconds)
     [java] ; Loading /opt/CYC_JRTL_with_CommonLisp/platform/build/classes/org/armedbear/lisp/jvm-instructions.abcl ...
     [java] ; Loaded /opt/CYC_JRTL_with_CommonLisp/platform/build/classes/org/armedbear/lisp/jvm-instructions.abcl (0.317 seconds)
     [java] ; Loading /opt/CYC_JRTL_with_CommonLisp/platform/build/classes/org/armedbear/lisp/setf.abcl ...
     [java] ; Loaded /opt/CYC_JRTL_with_CommonLisp/platform/build/classes/org/armedbear/lisp/setf.abcl (0.09 seconds)
     [java] ; Loading /opt/CYC_JRTL_with_CommonLisp/platform/build/classes/org/armedbear/lisp/extensible-sequences-base.abcl ...
     [java] ; Loaded /opt/CYC_JRTL_with_CommonLisp/platform/build/classes/org/armedbear/lisp/extensible-sequences-base.abcl (0.01 seconds)
     [java] ; Loading /opt/CYC_JRTL_with_CommonLisp/platform/build/classes/org/armedbear/lisp/require.abcl ...
     [java] ; Loaded /opt/CYC_JRTL_with_CommonLisp/platform/build/classes/org/armedbear/lisp/require.abcl (0.015 seconds)
     [java] ; Loading /opt/CYC_JRTL_with_CommonLisp/platform/build/classes/org/armedbear/lisp/substitute.abcl ...
     [java] ; Loaded /opt/CYC_JRTL_with_CommonLisp/platform/build/classes/org/armedbear/lisp/substitute.abcl (0.018 seconds)
     [java] ; Loading /opt/CYC_JRTL_with_CommonLisp/platform/build/classes/org/armedbear/lisp/clos.abcl ...
     [java] ; Loaded /opt/CYC_JRTL_with_CommonLisp/platform/build/classes/org/armedbear/lisp/clos.abcl (2.702 seconds)
     [java] ; Loading /opt/CYC_JRTL_with_CommonLisp/platform/build/classes/org/armedbear/lisp/mop.abcl ...
     [java] ; Loaded /opt/CYC_JRTL_with_CommonLisp/platform/build/classes/org/armedbear/lisp/mop.abcl (0.031 seconds)
     [java] ; Loading /opt/CYC_JRTL_with_CommonLisp/platform/build/classes/org/armedbear/lisp/backquote.abcl ...
     [java] ; Loaded /opt/CYC_JRTL_with_CommonLisp/platform/build/classes/org/armedbear/lisp/backquote.abcl (0.044 seconds)
     [java] ; Loading /opt/CYC_JRTL_with_CommonLisp/platform/build/classes/org/armedbear/lisp/early-defuns.abcl ...
     [java] ; Loaded /opt/CYC_JRTL_with_CommonLisp/platform/build/classes/org/armedbear/lisp/early-defuns.abcl (0.087 seconds)
     [java] ; Loading /opt/CYC_JRTL_with_CommonLisp/platform/build/classes/org/armedbear/lisp/typep.abcl ...
     [java] ; Loaded /opt/CYC_JRTL_with_CommonLisp/platform/build/classes/org/armedbear/lisp/typep.abcl (0.019 seconds)
     [java] ; Loading /opt/CYC_JRTL_with_CommonLisp/platform/build/classes/org/armedbear/lisp/subtypep.abcl ...
     [java] ; Loaded /opt/CYC_JRTL_with_CommonLisp/platform/build/classes/org/armedbear/lisp/subtypep.abcl (0.052 seconds)
     [java] ; Loading /opt/CYC_JRTL_with_CommonLisp/platform/build/classes/org/armedbear/lisp/find.abcl ...
     [java] ; Loaded /opt/CYC_JRTL_with_CommonLisp/platform/build/classes/org/armedbear/lisp/find.abcl (0.075 seconds)
     [java] ; Loading /opt/CYC_JRTL_with_CommonLisp/platform/build/classes/org/armedbear/lisp/print.abcl ...
     [java] ; Loaded /opt/CYC_JRTL_with_CommonLisp/platform/build/classes/org/armedbear/lisp/print.abcl (0.037 seconds)
     [java] ; Loading /opt/CYC_JRTL_with_CommonLisp/platform/build/classes/org/armedbear/lisp/pprint-dispatch.abcl ...
     [java] ; EXTENSIONS:ASSQL triggers autoloading of org.armedbear.lisp.assql ...
     [java] ;  Autoloaded org.armedbear.lisp.assql (0.0 seconds)
     [java] ; Loaded /opt/CYC_JRTL_with_CommonLisp/platform/build/classes/org/armedbear/lisp/pprint-dispatch.abcl (0.153 seconds)
     [java] ; Loading /opt/CYC_JRTL_with_CommonLisp/platform/build/classes/org/armedbear/lisp/pprint.abcl ...
     [java] ; Loaded /opt/CYC_JRTL_with_CommonLisp/platform/build/classes/org/armedbear/lisp/pprint.abcl (0.547 seconds)
     [java] ; Loading /opt/CYC_JRTL_with_CommonLisp/platform/build/classes/org/armedbear/lisp/format.abcl ...
     [java] ; Loaded /opt/CYC_JRTL_with_CommonLisp/platform/build/classes/org/armedbear/lisp/format.abcl (0.768 seconds)
     [java] ; Loading /opt/CYC_JRTL_with_CommonLisp/platform/build/classes/org/armedbear/lisp/delete.abcl ...
     [java] ; Loaded /opt/CYC_JRTL_with_CommonLisp/platform/build/classes/org/armedbear/lisp/delete.abcl (0.047 seconds)
     [java] ; Loading /opt/CYC_JRTL_with_CommonLisp/platform/build/classes/org/armedbear/lisp/concatenate.abcl ...
     [java] ; Loaded /opt/CYC_JRTL_with_CommonLisp/platform/build/classes/org/armedbear/lisp/concatenate.abcl (0.005 seconds)
     [java] ; Loading /opt/CYC_JRTL_with_CommonLisp/platform/build/classes/org/armedbear/lisp/ldb.abcl ...
     [java] ; Loaded /opt/CYC_JRTL_with_CommonLisp/platform/build/classes/org/armedbear/lisp/ldb.abcl (0.014 seconds)
     [java] ; Loading /opt/CYC_JRTL_with_CommonLisp/platform/build/classes/org/armedbear/lisp/destructuring-bind.abcl ...
     [java] ; Loaded /opt/CYC_JRTL_with_CommonLisp/platform/build/classes/org/armedbear/lisp/destructuring-bind.abcl (0.033 seconds)
     [java] ; Loading /opt/CYC_JRTL_with_CommonLisp/platform/build/classes/org/armedbear/lisp/featurep.abcl ...
     [java] ; Loaded /opt/CYC_JRTL_with_CommonLisp/platform/build/classes/org/armedbear/lisp/featurep.abcl (0.014 seconds)
     [java] ; Loading /opt/CYC_JRTL_with_CommonLisp/platform/build/classes/org/armedbear/lisp/asdf.abcl ...
     [java] ; COMMON-LISP:MAP triggers autoloading of map ...
     [java] ;  Autoloaded map (0.001 seconds)
     [java] ; COMMON-LISP:PATHNAME-DIRECTORY triggers autoloading of pathnames ...
     [java] ;  Autoloaded pathnames (0.009 seconds)
     [java] ; COMMON-LISP:COMPILE-FILE-PATHNAME triggers autoloading of compile-file-pathname ...
     [java] ;  Autoloaded compile-file-pathname (0.0 seconds)
     [java] ; COMMON-LISP:LISP-IMPLEMENTATION-VERSION triggers autoloading of org.armedbear.lisp.lisp_implementation_version ...
     [java] ;  Autoloaded org.armedbear.lisp.lisp_implementation_version (0.001 seconds)
     [java] ; SYSTEM::MAKE-CASE-FROB-STREAM triggers autoloading of org.armedbear.lisp.CaseFrobStream ...
     [java] ;  Autoloaded org.armedbear.lisp.CaseFrobStream (0.002 seconds)
     [java] ; COMMON-LISP:DOCUMENTATION triggers autoloading of documentation ...
     [java] ;  Autoloaded documentation (0.013 seconds)
     [java] ; Loaded /opt/CYC_JRTL_with_CommonLisp/platform/build/classes/org/armedbear/lisp/asdf.abcl (6.445 seconds)
     [java] ; Loading /opt/CYC_JRTL_with_CommonLisp/platform/build/classes/org/armedbear/lisp/abcl-contrib.abcl ...
     [java] ; Loaded /opt/CYC_JRTL_with_CommonLisp/platform/build/classes/org/armedbear/lisp/abcl-contrib.abcl (0.286 seconds)
     [java] ; Generating autoloads...
     [java] ;COMMON-LISP:DIRECTORY triggers autoloading of directory ...
     [java] ; Autoloaded directory (0.003 seconds)
     [java] ;SYSTEM::MAKE-FILE-STREAM triggers autoloading of org.armedbear.lisp.FileStream ...
     [java] ; Autoloaded org.armedbear.lisp.FileStream (0.001 seconds)
     [java] ; Removing multi-homed symbols
     [java] (("clos" MAKE-INSTANCE) ("clos" INITIALIZE-INSTANCE) ("clos" SHARED-INITIALIZE) ("clos" MOP:COMPUTE-CLASS-PRECEDENCE-LIST) ("clos" MAKE-LOAD-FORM) ("clos" DESCRIBE-OBJECT) ("package" SYSTEM::ENSURE-AVAILABLE-SYMBOLS) ("print-object" PRINT-OBJECT) ("format" PRINT-OBJECT) ("defpackage" SYSTEM::ENSURE-AVAILABLE-SYMBOLS) ("asm-runtime-class" INITIALIZE-INSTANCE) ("describe" DESCRIBE-OBJECT) ("java" MAKE-LOAD-FORM) ("java" PRINT-OBJECT) ("java" MOP:VALIDATE-SUPERCLASS) ("java" MOP:COMPUTE-CLASS-PRECEDENCE-LIST) ("java" MAKE-INSTANCE) ("jvm" PRINT-OBJECT) ("mop" MOP:VALIDATE-SUPERCLASS) ("mop" SHARED-INITIALIZE)) ; Removing multi-homed symbols
     [java] (("delete" SYSTEM::REAL-COUNT) ("defsetf" DEFSETF) ("define-modify-macro" INCF) ("define-modify-macro" DECF) ("nsubstitute" SYSTEM::REAL-COUNT) ("setf" INCF) ("setf" DECF) ("setf" DEFSETF) ("remove" SYSTEM::REAL-COUNT)) ; Removing multi-homed symbols
     [java] (("java-collections" SEQUENCE:ELT) ("java-collections" SEQUENCE:ITERATOR-ELEMENT) ("extensible-sequences" SEQUENCE:ELT) ("extensible-sequences" SEQUENCE:ITERATOR-ELEMENT)) ; Removing multi-homed symbols
     [java] NIL ; Removing multi-homed symbols
     [java] NIL ; Removing multi-homed symbols
     [java] NIL ; Removing multi-homed symbols
     [java] NIL ; Compiling /opt/CYC_JRTL_with_CommonLisp/platform/build/classes/org/armedbear/lisp/autoloads-gen.lisp ...
     [java] ; (IN-PACKAGE :FORMAT)
     [java] ; (DOLIST (SYSTEM::FS #) ...)
     [java] ;COMMON-LISP:FILE-LENGTH triggers autoloading of org.armedbear.lisp.file_length ...
     [java] ; Autoloaded org.armedbear.lisp.file_length (0.0 seconds)
     [java] ; (IN-PACKAGE :FORMAT)
     [java] ; (DOLIST (SYSTEM::FS #) ...)
     [java] ; (IN-PACKAGE :LOOP)
     [java] ; (DOLIST (SYSTEM::FS #) ...)
     [java] ; (IN-PACKAGE :LOOP)
     [java] ; (DOLIST (SYSTEM::FS #) ...)
     [java] ; (IN-PACKAGE :MOP)
     [java] ; (IN-PACKAGE :MOP)
     [java] ; (DOLIST (SYSTEM::FS #) ...)
     [java] ; (IN-PACKAGE :MOP)
     [java] ; (DOLIST (SYSTEM::FS #) ...)
     [java] ; (IN-PACKAGE :XP)
     [java] ; (IN-PACKAGE :XP)
     [java] ; (DOLIST (SYSTEM::FS #) ...)
     [java] ; (IN-PACKAGE :XP)
     [java] ; (DOLIST (SYSTEM::FS #) ...)
     [java] ; (IN-PACKAGE :PROFILER)
     [java] ; (IN-PACKAGE :PROFILER)
     [java] ; (DOLIST (SYSTEM::FS #) ...)
     [java] ; (IN-PACKAGE :PROFILER)
     [java] ; (DOLIST (SYSTEM::FS #) ...)
     [java] ; (IN-PACKAGE :JAVA)
     [java] ; (IN-PACKAGE :JAVA)
     [java] ; (DOLIST (SYSTEM::FS #) ...)
     [java] ; (IN-PACKAGE :JAVA)
     [java] ; (DOLIST (SYSTEM::FS #) ...)
     [java] ; (IN-PACKAGE :JAVA)
     [java] ; (DOLIST (SYSTEM::FS #) ...)
     [java] ; (IN-PACKAGE :JVM)
     [java] ; (IN-PACKAGE :JVM)
     [java] ; (DOLIST (SYSTEM::FS #) ...)
     [java] ; (IN-PACKAGE :JVM)
     [java] ; (DOLIST (SYSTEM::FS #) ...)
     [java] ; (IN-PACKAGE :JVM)
     [java] ; (DOLIST (SYSTEM::FS #) ...)
     [java] ; (IN-PACKAGE :EXTENSIONS)
     [java] ; (IN-PACKAGE :EXTENSIONS)
     [java] ; (DOLIST (SYSTEM::FS #) ...)
     [java] ; (IN-PACKAGE :EXTENSIONS)
     [java] ; (DOLIST (SYSTEM::FS #) ...)
     [java] ; (IN-PACKAGE :EXTENSIONS)
     [java] ; (DOLIST (SYSTEM::FS #) ...)
     [java] ; (IN-PACKAGE :THREADS)
     [java] ; (IN-PACKAGE :THREADS)
     [java] ; (DOLIST (SYSTEM::FS #) ...)
     [java] ; (IN-PACKAGE :THREADS)
     [java] ; (DOLIST (SYSTEM::FS #) ...)
     [java] ; (IN-PACKAGE :TOP-LEVEL)
     [java] ; (DOLIST (SYSTEM::FS #) ...)
     [java] ; (IN-PACKAGE :SYSTEM)
     [java] ; (IN-PACKAGE :SYSTEM)
     [java] ; (DOLIST (FS #) ...)
     [java] ; (IN-PACKAGE :SYSTEM)
     [java] ; (DOLIST (FS #) ...)
     [java] ; (IN-PACKAGE :SYSTEM)
     [java] ; (DOLIST (FS #) ...)
     [java] ; (IN-PACKAGE :CL)
     [java] ; (IN-PACKAGE :CL)
     [java] ; (DOLIST (SYSTEM::FS #) ...)
     [java] ; (IN-PACKAGE :CL)
     [java] ; (DOLIST (SYSTEM::FS #) ...)
     [java] ; (IN-PACKAGE :CL)
     [java] ; (DOLIST (SYSTEM::FS #) ...)
     [java] ; (IN-PACKAGE :CL)
     [java] ; (DOLIST (SYSTEM::FS #) ...)
     [java] ;COMMON-LISP:DELETE-FILE triggers autoloading of org.armedbear.lisp.delete_file ...
     [java] ; Autoloaded org.armedbear.lisp.delete_file (0.0 seconds)
     [java] ; Wrote /opt/CYC_JRTL_with_CommonLisp/platform/build/classes/org/armedbear/lisp/autoloads-gen.abcl (0.24 seconds)
     [java] ;COMMON-LISP:FILL triggers autoloading of fill ...
     [java] 25.8 seconds real time
     [java] 7057783 cons cells
     [java] ; Autoloaded fill (0.001 seconds)
     [java] ;COMMON-LISP:REPLACE triggers autoloading of replace ...
     [java] ; Autoloaded replace (0.003 seconds)

abcl.compile:
     [echo] Compiled ABCL with Java version: 1.8.0_191

abcl.version.src.0:

abcl.version.src.1:

abcl.version.src.2:

abcl.version.src.3:

abcl.version.src:

abcl.stamp.version.uptodate:

abcl.stamp.version.generate:

abcl.stamp.version.0:

abcl.stamp.version.1:

abcl.stamp.version.2:

abcl.stamp.version:
     [echo] ABCL implementation version: 1.5.0-uabcl-dev

abcl.stamp.hostname:
     [echo] abcl.hostname: gitlab

abcl.stamp:

abcl.jar.uptodate:

abcl.contrib:
      [jar] Building jar: /opt/CYC_JRTL_with_CommonLisp/platform/dist/abcl-contrib.jar
     [echo]
     [echo] Packaged contribs in /opt/CYC_JRTL_with_CommonLisp/platform/dist/abcl-contrib.jar. To use contribs, ensure that
     [echo] this file is in the same directory as 'abcl.jar', and then
     [echo]
     [echo]   CL-USER> (require 'abcl-contrib)
     [echo]
     [echo] will place all the contribs in the ASDF registry.
     [echo]
     [echo] To load a contrib, something like
     [echo]
     [echo]   CL-USER> (require 'jss)
     [echo]
     [echo] will compile (if necessary) and load JSS.

abcl-contrib.jar:

abcl.jar:
      [jar] Building jar: /opt/CYC_JRTL_with_CommonLisp/platform/dist/abcl.jar

abcl.wrapper.unix:

abcl.wrapper.windows:

abcl.wrapper:
     [copy] Copying 1 file to /opt/CYC_JRTL_with_CommonLisp/platform
     [echo] Created executable ABCL wrapper in 'abcl'
     [echo] N.B. This wrapper requires '/opt/CYC_JRTL_with_CommonLisp/platform/dist/abcl.jar' not be moved.

BUILD SUCCESSFUL
Total time: 41 seconds


Success!?
root@gitlab:/opt/CYC_JRTL_with_CommonLisp/platform#
~~~~

# Starting

~~~~
root@gitlab:/opt/CYC_JRTL_with_CommonLisp/platform# ./run-cyc-java.sh

CLASSPATH=lib/slf4j-api-1.7.5.jar:lib/slf4j-log4j12-1.7.5.jar:/usr/lib/jvm/java-8-openjdk-amd64/lib/tools.jar:/usr/lib/jvm/java-8-openjdk-amd64/lib/sa-jdi.jar:lib/org.appdapter.lib.bind.jena-1.2.3.jar:lib/owlapi-osgidistribution-4.1.4.jar:lib/kshared-2.0.jar:lib/axis-1.4.jar:lib/org.appdapter.bundle.core-1.1.6-SNAPSHOT.jar:lib/JGoSVG.jar:lib/glite-security-delegation-java.jar:lib/itinnov-grid-types-omii1.jar:lib/itinnov-grid-service-types-omii1.jar:lib/services_AdvertServiceEntry_stubs.jar:lib/wss4j-1.5.0-itinnov-2.jar:lib/org.osgi.core-4.2.0.jar:lib/org.openl.lib.poi.dev-5.9.4.1.jar:lib/commons-lang-2.4.jar:lib/unicode_panel.jar:lib/srm.jar:lib/cog-provider-gt4_0_0-2.3.jar:lib/edtftpj-1.5.2.jar:lib/j2ssh-core-0.2.9.jar:lib/looks.jar:lib/castor-0.9.6.jar:lib/glite-security-trustmanager.jar:lib/xpp3-1.1.3.4d_b4_min.jar:lib/org.apache.servicemix.specs.activation-api-1.1-1.8.0.jar:lib/hamcrest-core-1.1.jar:lib/commons-codec-1.6.jar:lib/jgraph.jar:lib/cog-abstraction-common-2.1.jar:lib/javassist-3.12.1.GA.jar:lib/cog-resources-1.0.jar:lib/postgresql-9.1-901.jdbc4.jar:lib/SgeAdaptor.jar:lib/cyc.jar:lib/lb.jar:lib/wsrf_core_stubs.jar:lib/log4j-1.2.12.jar:lib/jetty-continuation-8.0.4.v20111024.jar:lib/guava-12.0-sources.jar:lib/glite-jdl-api-java.jar:lib/owlsyntax.jar:lib/owlim-big-3.1.a7.jar:lib/jcalendar.jar:lib/jce-jdk13-131.jar:lib/gram-utils.jar:lib/commons-lang3-3.1.jar:lib/hivemind-jmx-1.1.1.jar:lib/xmlsec.jar:lib/LocalAdaptor.jar:lib/cog-certrequest-1.0.jar:lib/pddl4j.jar:lib/ext.bundle.osgi.common-1.1.6-SNAPSHOT.jar:lib/rhino-1.7.7.1.jar:lib/services_IndexServiceProxyService_stubs.jar:lib/cog-provider-gt2-2.2.jar:lib/naming-common.jar:lib/commons-digester.jar:lib/syntax.jar:lib/MercuryAdaptor.jar:lib/wsdl4j.jar:lib/cog-gridfaces-1.0.jar:lib/gram-stubs.jar:lib/cog-provider-gt2ft-1.0.jar:lib/concurrent.jar:lib/itinnov-grid-client-helpers-omii1.jar:lib/itinnov-grid-client-cli-omii1.1.jar:lib/jdom.jar:lib/jcommon-1.0.16.jar:lib/ecj-3.5.1.jar:lib/org.apache.servicemix.bundles.lucene-3.0.3_2.jar:lib/guava-12.0.jar:lib/GridsamAdaptor.jar:lib/org.appdapter.bundle.xload-1.2.4-20160803.212610-8.jar:lib/customSysParam.jar:lib/j2ssh-common-0.2.2.jar:lib/ext.bundle.jena_all_2_10_1-1.1.6-SNAPSHOT.jar:lib/icu4j_3.4.4.jar:lib/cog-url.jar:lib/gson-2.3.1.jar:lib/reflections-0.9.8.jar:lib/xml-apis-1.4.01.jar:lib/ordi-model-0.5.jar:lib/itinnov-grid-client-echo-omii1.jar:lib/wms3.1.jar:lib/arq-extra.jar:lib/JGo.jar:lib/cryptix32.jar:lib/cog-provider-condor-2.0.jar:lib/ZorillaAdaptor.jar:lib/axis-jaxrpc-1.4.jar:lib/jetty-http-8.0.4.v20111024.jar:lib/org.appdapter.lib.remote-1.2.4-20160803.212630-10.jar:lib/itinnov-grid-service-utils-omii1.jar:lib/jakarta-regexp-1.2.jar:lib/JGoInstruments.jar:lib/junit-4.10.jar:lib/smartsockets-1.51.jar:lib/bsf-api-3.1.jar:lib/asm-all-3.1.jar:lib/BrowserLauncher2-1_3.jar:lib/jfreechart-1.0.13.jar:lib/ext.bundle.xml.dom4j_161-1.1.6-SNAPSHOT.jar:lib/jsp-api-2.1-glassfish-2.1.v20100127.jar:lib/2p.jar:lib/xbean-2.1.0.jar:lib/hivemind-1.1.1.jar:lib/globus_delegation_stubs.jar:lib/puretls.jar:lib/cog-axis.jar:lib/GliteAdaptor.jar:lib/org.apache.servicemix.bundles.xmlresolver-1.2_3.jar:lib/jide-oss-3.5.5.jar:lib/wss4j.jar:lib/globus_wsrf_rft.jar:lib/itinnov-gridservit-0.3.0.jar:lib/bsf-all-3.1.jar:lib/antlr-2.7.5.jar:lib/forms-1.3.0.jar:lib/jsr305-1.3.9.jar:lib/jetty-util-8.0.4.v20111024.jar:lib/xstream-1.1.1-patched.jar:lib/httpclient-osgi-4.3.1.jar:lib/jep-2.4.1.jar:lib/cog-gridshell-1.0.jar:lib/kazuki.jar:lib/ext.bundle.xml.xerces-1.1.6-SNAPSHOT.jar:lib/jacl-1.2.6.jar:lib/SshTrileadAdaptor.jar:lib/wsrf_core.jar:lib/ordi-trree-adapter-3.1.a6.jar:lib/ublsupport.jar:lib/subl.jar:lib/runnersFramework-2.0.jar:lib/jetty-io-8.0.4.v20111024.jar:lib/commons-httpclient-3.1.jar:lib/wsrf_tools.jar:lib/cryptix.jar:lib/GenericAdaptor.jar:lib/commons-discovery-0.4.jar:lib/cog-jglobus.jar:lib/cog-provider-clref-gt3_2_1.jar:lib/procyon-core-0.5.33-enigma.jar:lib/jaas.jar:lib/cog-provider-ssh-2.1.jar:lib/junit-4.5.jar:lib/cog-karajan-0.33.jar:lib/graphlayout-1.2.1.jar:lib/glite-security-util-java.jar:lib/xalan.jar:lib/bsf-utils-3.1.jar:lib/stax-api-1.0.1.jar:lib/swingx-1.6.jar:lib/jgss.jar:lib/scala-compiler-2.10.2.jar:lib/cog-grapheditor-0.47.jar:lib/jena-dig.jar:lib/tcljava-1.2.6.jar:lib/miglayout-core-4.2.jar:lib/docking-frames-common.jar:lib/bcprov-jdk15-133.jar:lib/jetty-xml-8.0.4.v20111024.jar:lib/wsrf_mds_usefulrp_schema_stubs.jar:lib/javax.xml.soap-api-1.3.6.jar:lib/jetty-server-8.0.4.v20111024.jar:lib/org.appdapter.bundle.debug-1.1.6-SNAPSHOT.jar:lib/backport-util-concurrent.jar:lib/gridsam-schema-2.0.1.jar:lib/miglayout-swing-4.2.jar:lib/cog-util-0.91.jar:lib/org.appdapter.bundle.fileconv-1.1.6-SNAPSHOT.jar:lib/org.apache.servicemix.bundles.xerces-2.11.0_1.jar:lib/mail.jar:lib/commons-math-3.0-SNAPSHOT.jar:lib/cog-provider-local-2.0.jar:lib/scala-reflect-2.10.2.jar:lib/cog-provider-clref-gt4_0_0.jar:lib/globus_delegation_service.jar:lib/cog-provider-webdav-1.0.jar:lib/SftpTrileadAdaptor.jar:lib/org.apache.servicemix.bundles.junit-4.7_3.jar:lib/GlobusAdaptor.jar:lib/org.osgi.core-1.4.0.jar:lib/java-json.jar:lib/wsrf_provider_jce.jar:lib/CommandlineSshAdaptor.jar:lib/commons-logging-1.1.3.jar:lib/cog-certmanagement-1.0.jar:lib/cog-provider-gt3_2_1-2.0.jar:lib/cog-trap-1.0.jar:lib/naming-resources.jar:lib/owlapi-distribution-4.1.4.jar:lib/globus_wsrf_rendezvous_service.jar:lib/gram-client.jar:lib/jetty-servlet-8.0.4.v20111024.jar:lib/orphanNodesAlg.jar:lib/drmaa.jar:lib/servlet.jar:lib/com.springsource.org.apache.log4j-1.2.16.jar:lib/addressing-1.0.jar:lib/JFlex.jar:lib/globus_wsrf_mds_aggregator_stubs.jar:lib/javaff_lrta_bounded_children_heap-0.0.1-SNAPSHOT.jar:lib/jakarta-slide-webdavlib-2.0.jar:lib/zoni.jar:lib/cycSparqlEndpoint.jar:lib/SftpAdaptor.jar:lib/itinnov-grid-client-staterepos-omii1.1.jar:lib/globus_wsrf_rft_stubs.jar:lib/xercesImpl.jar:lib/h2-1.3.157.jar:lib/json.jar:lib/servlet-api-3.0.20100224.jar:lib/jetty-security-8.0.4.v20111024.jar:lib/scala-library-2.10.2.jar:lib/hivemind-lib-1.1.1.jar:lib/JGoLayout.jar:lib/jfreechart-1.0.0.jar:lib/globus_wsrf_rendezvous_stubs.jar:lib/itinnov-grid-utils-omii1.jar:lib/docking-frames-core.jar:lib/cryptix-asn1.jar:lib/openrdf-sesame-2.2.4-onejar.jar:lib/naming-java.jar:lib/JGoWeb.jar:lib/java_websocket.jar:lib/procyon-compilertools-0.5.33-enigma.jar:lib/ext.bundle.apache_httpclient-1.1.6-SNAPSHOT.jar:lib/naming-factory.jar:lib/commonj.jar:lib/com.springsource.com.ibm.icu-3.4.5.jar:lib/opensaml.jar:lib/cog-jobmanager.jar:lib/commons-vfs-1.0.jar:lib/wstx-asl-3.2.9.jar:lib/KoalaAdaptor.jar:lib/itinnov-grid-comms-omii1.1.jar:lib/iri.jar:lib/xml-apis.jar:lib/xml4j.jar:lib/cog-setup-0.91.jar:lib/activation.jar:lib/wsrf_mds_index_stubs.jar:lib/commons-vfs2-2.1.jar:lib/httpcore-osgi-4.3.jar:lib/trilead-ssh2-build213-RK.jar:lib/junit.jar:lib/itinnov-grid-client-swing-omii1.jar:lib/org.appdapter.lib.core-1.1.6-SNAPSHOT.jar:lib/commons-beanutils.jar:lib/kaon2.jar:lib/bsf.jar:lib/ext.bundle.openconverters-1.1.6-SNAPSHOT.jar:lib/cog-abstraction-examples-2.1.jar:lib/ekitspell.jar:lib/commons-cli-1.0.jar:lib/omii-security-utils-1.1.jar:lib/SftpGanymedAdaptor.jar:lib/org.osgi.compendium-4.2.0.jar:lib/gridsam-core-2.0.1.jar:lib/jaxrpc.jar:lib/globus_wsrf_rft_client.jar:lib/jaxen-1.1.1.jar:lib/ublsupport/ublsupport.jar:lib/ganymed-ssh2-build211beta4.jar:lib/jetty-webapp-8.0.4.v20111024.jar:lib/gridsam-client.jar:lib/commons-collections-3.0.jar:lib/ext.bundle.math.jscience_50SNAP-1.0.9.jar:lib/jsp-2.1-glassfish-2.1.v20100127.jar:lib/org.apache.servicemix.bundles.javax.mail-1.4.1_4.jar:lib/dom4j-1.6.1.jar:ext/owlim-big-3.1.a7.jar:ext/concurrent.jar:ext/ordi-model-0.5.jar:ext/asm-all-3.1.jar:ext/ordi-trree-adapter-3.1.a6.jar:ext/junit-4.5.jar:ext/javagat/adaptors/SshTrileadAdaptor/SshTrileadAdaptor.jar:ext/javagat/adaptors/SshTrileadAdaptor/trilead-ssh2-build213-RK.jar:ext/javagat/adaptors/MercuryAdaptor/MercuryAdaptor.jar:ext/javagat/adaptors/GenericAdaptor/GenericAdaptor.jar:ext/javagat/adaptors/SftpAdaptor/j2ssh-core-0.2.9.jar:ext/javagat/adaptors/SftpAdaptor/jce-jdk13-131.jar:ext/javagat/adaptors/SftpAdaptor/SftpAdaptor.jar:ext/javagat/adaptors/SftpGanymedAdaptor/SftpGanymedAdaptor.jar:ext/javagat/adaptors/SftpGanymedAdaptor/ganymed-ssh2-build211beta4.jar:ext/javagat/adaptors/CommandlineSshAdaptor/CommandlineSshAdaptor.jar:ext/javagat/adaptors/LocalAdaptor/LocalAdaptor.jar:ext/javagat/adaptors/SgeAdaptor/SgeAdaptor.jar:ext/javagat/adaptors/SgeAdaptor/drmaa.jar:ext/javagat/castor-1.1.1-xml.jar:ext/javagat/commons-logging-1.1.jar:ext/javagat/GAT-API.jar:ext/javagat/GAT-engine.jar:ext/javagat/log4j-1.2.13.jar:ext/javagat/xmlParserAPIs.jar:ext/servlet.jar:ext/GAT/Adaptors/SshTrileadAdaptor/SshTrileadAdaptor.jar:ext/GAT/Adaptors/SshTrileadAdaptor/trilead-ssh2-build213-RK.jar:ext/GAT/Adaptors/SftpTrileadAdaptor/SftpTrileadAdaptor.jar:ext/GAT/Adaptors/SftpTrileadAdaptor/trilead-ssh2-build213-RK.jar:ext/GAT/Adaptors/GridsamAdaptor/itinnov-grid-types-omii1.jar:ext/GAT/Adaptors/GridsamAdaptor/itinnov-grid-service-types-omii1.jar:ext/GAT/Adaptors/GridsamAdaptor/wss4j-1.5.0-itinnov-2.jar:ext/GAT/Adaptors/GridsamAdaptor/axis-1.2.1-itinnov-1.jar:ext/GAT/Adaptors/GridsamAdaptor/xmlsec.jar:ext/GAT/Adaptors/GridsamAdaptor/itinnov-grid-client-helpers-omii1.jar:ext/GAT/Adaptors/GridsamAdaptor/itinnov-grid-client-cli-omii1.1.jar:ext/GAT/Adaptors/GridsamAdaptor/GridsamAdaptor.jar:ext/GAT/Adaptors/GridsamAdaptor/itinnov-grid-client-echo-omii1.jar:ext/GAT/Adaptors/GridsamAdaptor/itinnov-grid-service-utils-omii1.jar:ext/GAT/Adaptors/GridsamAdaptor/xbean-2.1.0.jar:ext/GAT/Adaptors/GridsamAdaptor/itinnov-gridservit-0.3.0.jar:ext/GAT/Adaptors/GridsamAdaptor/xalan.jar:ext/GAT/Adaptors/GridsamAdaptor/gridsam-schema-2.0.1.jar:ext/GAT/Adaptors/GridsamAdaptor/servlet.jar:ext/GAT/Adaptors/GridsamAdaptor/addressing-1.0.jar:ext/GAT/Adaptors/GridsamAdaptor/itinnov-grid-client-staterepos-omii1.1.jar:ext/GAT/Adaptors/GridsamAdaptor/itinnov-grid-utils-omii1.jar:ext/GAT/Adaptors/GridsamAdaptor/saaj.jar:ext/GAT/Adaptors/GridsamAdaptor/itinnov-grid-comms-omii1.1.jar:ext/GAT/Adaptors/GridsamAdaptor/endorsed/saaj.jar:ext/GAT/Adaptors/GridsamAdaptor/activation.jar:ext/GAT/Adaptors/GridsamAdaptor/itinnov-grid-client-swing-omii1.jar:ext/GAT/Adaptors/GridsamAdaptor/stax-api-1.0.jar:ext/GAT/Adaptors/GridsamAdaptor/commons-cli-1.0.jar:ext/GAT/Adaptors/GridsamAdaptor/omii-security-utils-1.1.jar:ext/GAT/Adaptors/GridsamAdaptor/gridsam-core-2.0.1.jar:ext/GAT/Adaptors/GridsamAdaptor/gridsam-client.jar:ext/GAT/Adaptors/MercuryAdaptor/MercuryAdaptor.jar:ext/GAT/Adaptors/GenericAdaptor/GenericAdaptor.jar:ext/GAT/Adaptors/GlobusAdaptor/services_AdvertServiceEntry_stubs.jar:ext/GAT/Adaptors/GlobusAdaptor/cog-provider-gt4_0_0-2.3.jar:ext/GAT/Adaptors/GlobusAdaptor/castor-0.9.6.jar:ext/GAT/Adaptors/GlobusAdaptor/xpp3-1.1.3.4d_b4_min.jar:ext/GAT/Adaptors/GlobusAdaptor/cog-abstraction-common-2.1.jar:ext/GAT/Adaptors/GlobusAdaptor/cog-resources-1.0.jar:ext/GAT/Adaptors/GlobusAdaptor/wsrf_core_stubs.jar:ext/GAT/Adaptors/GlobusAdaptor/gram-utils.jar:ext/GAT/Adaptors/GlobusAdaptor/xmlsec.jar:ext/GAT/Adaptors/GlobusAdaptor/cog-certrequest-1.0.jar:ext/GAT/Adaptors/GlobusAdaptor/axis.jar:ext/GAT/Adaptors/GlobusAdaptor/services_IndexServiceProxyService_stubs.jar:ext/GAT/Adaptors/GlobusAdaptor/cog-provider-gt2-2.2.jar:ext/GAT/Adaptors/GlobusAdaptor/naming-common.jar:ext/GAT/Adaptors/GlobusAdaptor/commons-digester.jar:ext/GAT/Adaptors/GlobusAdaptor/cog-gridfaces-1.0.jar:ext/GAT/Adaptors/GlobusAdaptor/gram-stubs.jar:ext/GAT/Adaptors/GlobusAdaptor/cog-provider-gt2ft-1.0.jar:ext/GAT/Adaptors/GlobusAdaptor/concurrent.jar:ext/GAT/Adaptors/GlobusAdaptor/antlr.jar:ext/GAT/Adaptors/GlobusAdaptor/j2ssh-common-0.2.2.jar:ext/GAT/Adaptors/GlobusAdaptor/cog-url.jar:ext/GAT/Adaptors/GlobusAdaptor/cog-provider-condor-2.0.jar:ext/GAT/Adaptors/GlobusAdaptor/jakarta-regexp-1.2.jar:ext/GAT/Adaptors/GlobusAdaptor/globus_delegation_stubs.jar:ext/GAT/Adaptors/GlobusAdaptor/cog-axis.jar:ext/GAT/Adaptors/GlobusAdaptor/wss4j.jar:ext/GAT/Adaptors/GlobusAdaptor/globus_wsrf_rft.jar:ext/GAT/Adaptors/GlobusAdaptor/xstream-1.1.1-patched.jar:ext/GAT/Adaptors/GlobusAdaptor/cog-gridshell-1.0.jar:ext/GAT/Adaptors/GlobusAdaptor/wsrf_core.jar:ext/GAT/Adaptors/GlobusAdaptor/wsrf_tools.jar:ext/GAT/Adaptors/GlobusAdaptor/cog-jglobus.jar:ext/GAT/Adaptors/GlobusAdaptor/cog-provider-clref-gt3_2_1.jar:ext/GAT/Adaptors/GlobusAdaptor/jaas.jar:ext/GAT/Adaptors/GlobusAdaptor/cog-provider-ssh-2.1.jar:ext/GAT/Adaptors/GlobusAdaptor/cog-karajan-0.33.jar:ext/GAT/Adaptors/GlobusAdaptor/xalan.jar:ext/GAT/Adaptors/GlobusAdaptor/jgss.jar:ext/GAT/Adaptors/GlobusAdaptor/cog-grapheditor-0.47.jar:ext/GAT/Adaptors/GlobusAdaptor/wsrf_mds_usefulrp_schema_stubs.jar:ext/GAT/Adaptors/GlobusAdaptor/backport-util-concurrent.jar:ext/GAT/Adaptors/GlobusAdaptor/cog-util-0.91.jar:ext/GAT/Adaptors/GlobusAdaptor/cog-provider-local-2.0.jar:ext/GAT/Adaptors/GlobusAdaptor/cog-provider-clref-gt4_0_0.jar:ext/GAT/Adaptors/GlobusAdaptor/globus_delegation_service.jar:ext/GAT/Adaptors/GlobusAdaptor/cog-provider-webdav-1.0.jar:ext/GAT/Adaptors/GlobusAdaptor/GlobusAdaptor.jar:ext/GAT/Adaptors/GlobusAdaptor/wsrf_provider_jce.jar:ext/GAT/Adaptors/GlobusAdaptor/cog-certmanagement-1.0.jar:ext/GAT/Adaptors/GlobusAdaptor/cog-provider-gt3_2_1-2.0.jar:ext/GAT/Adaptors/GlobusAdaptor/cog-trap-1.0.jar:ext/GAT/Adaptors/GlobusAdaptor/naming-resources.jar:ext/GAT/Adaptors/GlobusAdaptor/globus_wsrf_rendezvous_service.jar:ext/GAT/Adaptors/GlobusAdaptor/gram-client.jar:ext/GAT/Adaptors/GlobusAdaptor/addressing-1.0.jar:ext/GAT/Adaptors/GlobusAdaptor/globus_wsrf_mds_aggregator_stubs.jar:ext/GAT/Adaptors/GlobusAdaptor/jakarta-slide-webdavlib-2.0.jar:ext/GAT/Adaptors/GlobusAdaptor/globus_wsrf_rft_stubs.jar:ext/GAT/Adaptors/GlobusAdaptor/xercesImpl.jar:ext/GAT/Adaptors/GlobusAdaptor/globus_wsrf_rendezvous_stubs.jar:ext/GAT/Adaptors/GlobusAdaptor/naming-java.jar:ext/GAT/Adaptors/GlobusAdaptor/naming-factory.jar:ext/GAT/Adaptors/GlobusAdaptor/commonj.jar:ext/GAT/Adaptors/GlobusAdaptor/opensaml.jar:ext/GAT/Adaptors/GlobusAdaptor/saaj.jar:ext/GAT/Adaptors/GlobusAdaptor/cog-jobmanager.jar:ext/GAT/Adaptors/GlobusAdaptor/xml-apis.jar:ext/GAT/Adaptors/GlobusAdaptor/xml4j.jar:ext/GAT/Adaptors/GlobusAdaptor/cog-setup-0.91.jar:ext/GAT/Adaptors/GlobusAdaptor/activation.jar:ext/GAT/Adaptors/GlobusAdaptor/wsrf_mds_index_stubs.jar:ext/GAT/Adaptors/GlobusAdaptor/j2ssh-core-0.2.2.jar:ext/GAT/Adaptors/GlobusAdaptor/junit.jar:ext/GAT/Adaptors/GlobusAdaptor/commons-beanutils.jar:ext/GAT/Adaptors/GlobusAdaptor/cog-abstraction-examples-2.1.jar:ext/GAT/Adaptors/GlobusAdaptor/commons-cli-1.0.jar:ext/GAT/Adaptors/GlobusAdaptor/globus_wsrf_rft_client.jar:ext/GAT/Adaptors/GlobusAdaptor/commons-collections-3.0.jar:ext/GAT/Adaptors/GlobusAdaptor/xml-apis-1.1.jar:ext/GAT/Adaptors/ZorillaAdaptor/ZorillaAdaptor.jar:ext/GAT/Adaptors/ZorillaAdaptor/smartsockets-1.51.jar:ext/GAT/Adaptors/ZorillaAdaptor/zoni.jar:ext/GAT/Adaptors/GliteAdaptor/axis-1.4.jar:ext/GAT/Adaptors/GliteAdaptor/glite-security-delegation-java.jar:ext/GAT/Adaptors/GliteAdaptor/srm.jar:ext/GAT/Adaptors/GliteAdaptor/glite-security-trustmanager.jar:ext/GAT/Adaptors/GliteAdaptor/lb.jar:ext/GAT/Adaptors/GliteAdaptor/wsrf_core_stubs.jar:ext/GAT/Adaptors/GliteAdaptor/glite-jdl-api-java.jar:ext/GAT/Adaptors/GliteAdaptor/cog-jglobus-1.4.jar:ext/GAT/Adaptors/GliteAdaptor/gram-stubs.jar:ext/GAT/Adaptors/GliteAdaptor/cog-url.jar:ext/GAT/Adaptors/GliteAdaptor/wms3.1.jar:ext/GAT/Adaptors/GliteAdaptor/cog-axis.jar:ext/GAT/Adaptors/GliteAdaptor/GliteAdaptor.jar:ext/GAT/Adaptors/GliteAdaptor/wss4j.jar:ext/GAT/Adaptors/GliteAdaptor/wsrf_core.jar:ext/GAT/Adaptors/GliteAdaptor/glite-security-util-java.jar:ext/GAT/Adaptors/GliteAdaptor/servlet.jar:ext/GAT/Adaptors/GliteAdaptor/addressing-1.0.jar:ext/GAT/Adaptors/GliteAdaptor/globus_wsrf_mds_aggregator_stubs.jar:ext/GAT/Adaptors/GliteAdaptor/saaj.jar:ext/GAT/Adaptors/GliteAdaptor/activation.jar:ext/GAT/Adaptors/GliteAdaptor/log4j-1.2.13.jar:ext/GAT/Adaptors/CommandlineSshAdaptor/CommandlineSshAdaptor.jar:ext/GAT/Adaptors/shared/wsdl4j.jar:ext/GAT/Adaptors/shared/cryptix32.jar:ext/GAT/Adaptors/shared/puretls.jar:ext/GAT/Adaptors/shared/commons-logging-1.1.jar:ext/GAT/Adaptors/shared/commons-httpclient-3.1.jar:ext/GAT/Adaptors/shared/cryptix.jar:ext/GAT/Adaptors/shared/bcprov-jdk15-133.jar:ext/GAT/Adaptors/shared/mail.jar:ext/GAT/Adaptors/shared/commons-codec-1.3.jar:ext/GAT/Adaptors/shared/cryptix-asn1.jar:ext/GAT/Adaptors/shared/jaxrpc.jar:ext/GAT/Adaptors/shared/commons-discovery.jar:ext/GAT/Adaptors/KoalaAdaptor/kshared-2.0.jar:ext/GAT/Adaptors/KoalaAdaptor/mysql-connector-java-3.1.13-bin.jar:ext/GAT/Adaptors/KoalaAdaptor/runnersFramework-2.0.jar:ext/GAT/Adaptors/KoalaAdaptor/cog-jglobus.jar:ext/GAT/Adaptors/KoalaAdaptor/KoalaAdaptor.jar:ext/GAT/Adaptors/KoalaAdaptor/log4j-1.2.13.jar:ext/GAT/Adaptors/LocalAdaptor/LocalAdaptor.jar:ext/GAT/Adaptors/SgeAdaptor/SgeAdaptor.jar:ext/GAT/Adaptors/SgeAdaptor/drmaa.jar:ext/openrdf-sesame-2.2.4-onejar.jar:ext/iri.jar:ext/ublsupport/ublsupport.jar

;
;;;Running toplevel:  ./abclc --eval (init-cyc-server)
;
VM settings:
    Min. Heap Size: 4.88G
    Max. Heap Size: 7.81G
    Ergonomics Machine Class: server
    Using VM: OpenJDK 64-Bit Server VM

DEBUG: First SUBLFILE
Armed Bear Common Lisp 1.5.0-uabcl-dev (built Sun Jan 06 2019 06:09:48 UTC)
Java 1.8.0_191 Oracle Corporation
OpenJDK 64-Bit Server VM
Low-level initialization completed in 0.484 seconds.
Startup completed in 3.318 seconds.
Warn: Redefining {dynamic special built-in-function CL:* -pf_multiply- ====> CL:NIL}
Warn: COMMON-LISP:* NOT redefining #<Primitive.pf_multiply CL:* "&rest numbers" {31304F14}> with #<SubLCompiledFunction CL:*  {34A3D150}>
 Loading implementation classes ...
 ......... 10% ......... 20% ......... 30% ......... 40% ......... 50%
 ......... 60% ......... 70% ......... 80% ......... 90% ......... 100%
 Done.
Low memory situations will be triggered when post-gc usage exceeds 6900MB(90% of 7667MB) for Heap memory pool CMS Old Gen
Low memory situations will be triggered when post-gc usage exceeds 6900MB(90% of 7667MB) for Heap memory pool CMS Old Gen
;;; loading init/jrtl-release-init.lisp ...
;;; loading init/jrtl-init.lisp ...
Warning: No KB is loaded.  System KB initializations will not be run.
Initializing Cyc 10.152303 (ResearchCyc (custom))

;;; Loading KB from units/7166/ at 01/06/2019 12:20:42
Loading special objects ... DONE (0:00)
Initializing HL backing store caches from units/7166/.
;;; Loading essential KB at 01/06/2019 12:20:42
Freeing clause-strucs ... DONE (0:00)

...<SNIP>...

;;; Load of KB 7166 completed (0:37) at 01/06/2019 12:21:19

;;; KB 7166 statistics
FORTs                   :    638756
 Constants              :    336790
  cached indexing       :         0  (0%)
 NARTs                  :    301966
  cached indexing       :         0  (0%)
  cached HL formulas    :         0  (0%)
Assertions              :   9042563
 KB Assertions          :   8469860
  cached                :         0  (0%)
 Bookkeeping Assertions :    572703
Deductions              :  11218595
  cached                :         0  (0%)
KB HL supports          :   1348309
  cached                :         0  (0%)
Unrepresented terms     :   1100717
  cached indexing       :         0  (0%)
;;; ... init/jrtl-init.lisp loaded; SHA-1: 812c4ab520a056eb78386388c585f7257c4159bb
;;; loading init/release-specific-init.lisp ...
;;; ... init/release-specific-init.lisp loaded; SHA-1: 71853c6197a6a7f222db0f1978c7cb232b87c5ee
;;; ... init/jrtl-release-init.lisp loaded; SHA-1: b842badd04c2375521d8f293d4332d4e1b8f4f53
;;; loading init/services-init.lisp ...
;;; loading init/cyc-init.lisp ...
;;; ... init/cyc-init.lisp loaded; SHA-1: 3d4c68038ac3cc282490fe8fa44241eaafd92f3b
;;; loading init/port-init.lisp ...
Initializing Cyc 10.152303 (ResearchCyc (custom))
Initializing HL backing store caches from units/7166/.
Initializing Cyc 10.152303 (ResearchCyc (custom))
Initializing HL backing store caches from units/7166/.
Enabling base TCP services to port 3600.
Jan 06, 2019 12:21:26 PM com.sun.jersey.api.core.PackagesResourceConfig init
INFO: Scanning for root resource and provider classes in the packages:
  com.cyc.tool.sksi.ws
Jan 06, 2019 12:21:26 PM com.sun.jersey.api.core.ScanningResourceConfig logClasses
INFO: Root resource classes found:
  class com.cyc.tool.sksi.ws.ConfigWS
  class com.cyc.tool.sksi.ws.SKSISupportedStructuredKnowledgeSourceTypeWS
  class com.cyc.tool.sksi.ws.SKSISupportedDatabaseServerProgramWS
  class com.cyc.tool.sksi.ws.SchemaModelWS
  class com.cyc.tool.sksi.ws.TermWS
  class com.cyc.tool.sksi.ws.LoggerWS
Jan 06, 2019 12:21:26 PM com.sun.jersey.api.core.ScanningResourceConfig logClasses
INFO: Provider classes found:
  class com.cyc.tool.sksi.ws.ObjectMapperProvider
Jan 06, 2019 12:21:26 PM com.sun.jersey.server.impl.application.WebApplicationImpl _initiate
INFO: Initiating Jersey application, version 'Jersey: 1.8 06/24/2011 12:17 PM'
Creating com.cyc.tool.sksi.serialization.SMTSerializerModule
Jan 06, 2019 12:21:32 PM com.sun.jersey.api.core.PackagesResourceConfig init
INFO: Scanning for root resource and provider classes in the packages:
  com.cyc.webservices.scgws
Jan 06, 2019 12:21:32 PM com.sun.jersey.api.core.ScanningResourceConfig logClasses
INFO: Root resource classes found:
  class com.cyc.webservices.scgws.ScgWSResource
Jan 06, 2019 12:21:32 PM com.sun.jersey.api.core.ScanningResourceConfig init
INFO: No provider classes found.
Jan 06, 2019 12:21:32 PM com.sun.jersey.server.impl.application.WebApplicationImpl _initiate
INFO: Initiating Jersey application, version 'Jersey: 1.8 06/24/2011 12:17 PM'
;;; ... init/port-init.lisp loaded; SHA-1: 24ad0071622d957b943a2de6e1c73a4e5369f9dc
;;; ... init/services-init.lisp loaded; SHA-1: 04c956031b071ac76712ebbb490c9847ea32ff96
Warning: Attempt to redefine: {CYC:START-SPARQL-SERVER -SubLCompiledFunction-}
Jan 06, 2019 12:21:34 PM eu.larkc.core.orchestrator.CycUtil addConst
INFO: adding constant: wsl-ClassificationRoot
Jan 06, 2019 12:21:35 PM eu.larkc.core.orchestrator.CycUtil addAssertion
INFO: adding assertion: (#$isa #$wsl-ClassificationRoot #$Collection) MT: #$BaseKB
Jan 06, 2019 12:21:38 PM eu.larkc.core.orchestrator.CycUtil addConst
INFO: adding constant: wsl-NonFunctionalParameter
Jan 06, 2019 12:21:38 PM eu.larkc.core.orchestrator.CycUtil addAssertion
INFO: adding assertion: (#$isa #$wsl-NonFunctionalParameter #$Collection) MT: #$BaseKB
Jan 06, 2019 12:21:38 PM eu.larkc.core.orchestrator.CycUtil addConst
INFO: adding constant: larkc-Plugin

...<SNIP>...

Jan 06, 2019 12:21:47 PM eu.larkc.core.orchestrator.CycUtil addAssertion
INFO: adding assertion: (#$isa #$larkc-hasCostPerInvocation #$BinaryPredicate) MT: #$BaseKB
Jan 06, 2019 12:21:47 PM eu.larkc.core.orchestrator.CycUtil addAssertion
INFO: adding assertion: (#$arg1Isa #$larkc-hasCostPerInvocation #$larkc-Plugin) MT: #$BaseKB
Jan 06, 2019 12:21:47 PM eu.larkc.core.orchestrator.CycUtil addAssertion
INFO: adding assertion: (#$arg2Isa #$larkc-hasCostPerInvocation #$larkc-Cost) MT: #$BaseKB
Jan 06, 2019 12:21:47 PM eu.larkc.core.metadata.PluginRegistry loadPlugins
WARNING: No plug-ins in the plugins directory in the platform's home directory. Using only plugins.ini
Jan 06, 2019 12:21:47 PM eu.larkc.core.metadata.PluginRegistry loadPlugins
SEVERE: Decider for this instance of the LarKC platform is not specified. Platform cannot run without the decider! Pleas check ./conf/plugins.ini file.

...LarKC SPARQL server started on port 8000.
HTTP server listening on port 3602.  Connect via URL http://gitlab:3602/cgi-bin/cg?cb-start

SPARQL server started on port 3615.
Jetty server started on port 3603
Ready for services.
Type ":help" for a list of available commands.
CL-USER(1): (cyc-repl)
CYC(1): (find-constant "isa")
[Time: 516.207 µsecs]
#$isa
CYC(2): (quit)
Exiting SubL read loop...

quitOnExit = false
#$isa
CL-USER(2):


~~~~

