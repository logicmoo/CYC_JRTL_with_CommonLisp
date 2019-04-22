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
~~~~

# Prerequisites

I started from a bare Ubuntu 19.04 (Disco Dingo) 64-bit PC (AMD64) server install image onto a VMWare 11 Machine
~~~~
 http://cdimage.ubuntu.com/releases/19.04/release/ubuntu-19.04-server-amd64.iso
~~~~



Here is my install log
~~~~

root@ubuntu:~# apt-get install software-properties-common network-tools openssh-server git curl 
root@ubuntu:~# apt-get install swi-prolog  # installs 7.6.4
root@ubuntu:~# apt-get install ca-certificates-java java-common libnspr4 libnss3 libpcsclite1
root@ubuntu:~# wget http://security.ubuntu.com/ubuntu/pool/main/o/openjdk-8/openjdk-8-jre-headless_8u191-b12-2ubuntu0.16.04.1_amd64.deb
root@ubuntu:~# wget http://security.ubuntu.com/ubuntu/pool/main/o/openjdk-8/openjdk-8-jdk-headless_8u191-b12-2ubuntu0.16.04.1_amd64.deb
root@ubuntu:~# dpkg -i openjdk-8-jre-headless_8u191-b12-2ubuntu0.16.04.1_amd64.deb
root@ubuntu:~# dpkg -i openjdk-8-jdk-headless_8u191-b12-2ubuntu0.16.04.1_amd64.deb
root@ubuntu:~# apt-get install ant 

root@ubuntu:~# file /etc/alternatives/java /etc/alternatives/javac
/etc/alternatives/java:  symbolic link to /usr/lib/jvm/java-11-openjdk-amd64/bin/java
/etc/alternatives/javac: symbolic link to /usr/lib/jvm/java-8-openjdk-amd64/bin/javac
root@ubuntu:~#  update-alternatives --config java
There are 2 choices for the alternative java (providing /usr/bin/java).

  Selection    Path                                            Priority   Status
------------------------------------------------------------
* 0            /usr/lib/jvm/java-11-openjdk-amd64/bin/java      1111      auto mode
  1            /usr/lib/jvm/java-11-openjdk-amd64/bin/java      1111      manual mode
  2            /usr/lib/jvm/java-8-openjdk-amd64/jre/bin/java   1081      manual mode

Press <enter> to keep the current choice[*], or type selection number: 2
update-alternatives: using /usr/lib/jvm/java-8-openjdk-amd64/jre/bin/java to provide /usr/bin/java (java) in manual mode
root@ubuntu:~# file /etc/alternatives/java /etc/alternatives/javac
/etc/alternatives/java:  symbolic link to /usr/lib/jvm/java-8-openjdk-amd64/jre/bin/java
/etc/alternatives/javac: symbolic link to /usr/lib/jvm/java-8-openjdk-amd64/bin/javac
root@ubuntu:~# java -version
openjdk version "1.8.0_191"
OpenJDK Runtime Environment (build 1.8.0_191-8u191-b12-2ubuntu0.16.04.1-b12)
OpenJDK 64-Bit Server VM (build 25.191-b12, mixed mode)
~~~~

# Building

Clone the git repo
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
~~~~


Build the platform
~~~~
root@gitlab:/opt/CYC_JRTL_with_CommonLisp# cd platform
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
;;;Running toplevel:  ./abclc --opencyc --eval (init-cyc-server)
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
Initializing Cyc 10.152303 (OpenCyc (custom))

;;; Loading KB from units/5022/ at 01/06/2019 12:20:42
Loading special objects ... DONE (0:00)
Initializing HL backing store caches from units/5022/.
;;; Loading essential KB at 01/06/2019 12:20:42
Freeing clause-strucs ... DONE (0:00)

...<SNIP>...

;;; Load of KB 5022 completed (0:37) at 01/06/2019 12:21:19

;;; KB 5022 statistics
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
Initializing Cyc 10.152303 (OpenCyc (custom))
Initializing HL backing store caches from units/5022/.
Initializing Cyc 10.152303 (OpenCyc (custom))
Initializing HL backing store caches from units/5022/.
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
WARNING: No plug-ins in the plugins directory in the platforms home directory. Using only plugins.ini
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

# Extra Features

Once started
~~~~
LarKC SPARQL server started on port 8000.
HTTP server listening on port 3602.  Connect via URL http://gitlab:3602/cgi-bin/cg?cb-start
SPARQL server started on port 3615.
Jetty server started on port 3603
Ready for services.
Type ":help" for a list of available commands.
~~~~
Runs trival lisp code
~~~~
U(1): (cl:load "e2c/d")
=======================
Loading GATE 2.3, Common Lisp version of 2004-12-20...
=======================
=======================
Welcome to GATE 2.3, Common Lisp version of 2004-12-20
=======================
=======================
Loading DAYDREAMER 3.5, Common Lisp version of 2004-12-20...
=======================
Adding rule ENTERTAINMENT-THEME
Adding rule ENTERTAINMENT-PLAN1
Adding rule ENTERTAINMENT-INF1
Adding rule M-MOVIE-ALONE-PLAN
Adding rule MTRANS-MOVIE-PLAN
Adding rule LOVERS-THEME
Adding rule LOVERS-PLAN
Adding rule ACQUAINTED-PLAN
Adding rule M-CONVERSATION-PLAN
Adding rule MTRANS-ACCEPTABLE-INF1
Adding rule MTRANS-ACCEPTABLE-INF2
Adding rule MTRANS-ACCEPTABLE-INF3
Adding rule M-AGREE-PLAN
Adding rule LOVERS-THEME-PLAN
Adding rule M-DATE-PLAN
Adding rule ENABLE-FUTURE-VPROX-PLAN1
Adding rule ENABLE-FUTURE-VPROX-PLAN2
Adding rule FRIDAY-NIGHT-PLAN
Adding rule NOT-LOVERS-PLAN1
Adding rule M-BREAK-UP-PLAN1
Adding rule M-BREAK-UP-PLAN2
Adding rule AT-PLAN
Adding rule PTRANS-PLAN
Adding rule BELIEVE-PLAN1
Adding rule BELIEVE-PLAN2
Adding rule MTRANS-PLAN2
Adding rule VPROX-PLAN1
Adding rule VPROX-INF
Adding rule POS-ATTITUDE-PLAN2
Adding rule POS-ATTITUDE-PLAN3
Adding rule ROMANTIC-INTEREST-PLAN1
Adding rule ROMANTIC-INTEREST-PLAN2
Adding rule STAR-PLAN
Adding rule M-STUDY-PLAN
Adding rule RATIONALIZATION-THEME
Adding rule RATIONALIZATION-PLAN1
Adding rule RATIONALIZATION-INF1
Adding rule RATIONALIZATION-PLAN2
Adding rule LEADTO-PLAN1
Adding rule OTHER-RULE1
Adding rule ACTING-JOB-THEME
Adding rule RPROX-PLAN
Adding rule PTRANS1-PLAN
Adding rule JOB-FAILURE
Adding rule LOVERS-P-GOAL
Adding rule WELL-DRESSED-PLAN2
Adding rule RATIONALIZATION-PLAN3
Adding rule MINIMIZATION-PLAN
Adding rule REVENGE-THEME
Adding rule REVENGE-PLAN1
Adding rule FAILED-REL-GOAL-PLAN1
Adding rule BELIEF-PERS-ATTR-PLAN1
Adding rule BELIEF-PERS-ATTR-PLAN3
Adding rule KNOW-TELNO-RULE1
Adding rule KNOW-TELNO-RULE2
Adding rule NEG-ATTITUDE-INF
Adding rule SOCIAL-ESTEEM-FAILURE
Adding rule WELL-DRESSED-PLAN1
Adding rule WEARING-PLAN
Adding rule M-PUTON-PLAN
Adding rule VPROX-PLAN2
Adding rule VPROX-PLAN4
Adding rule M-PHONE-PLAN1
Adding rule M-PHONE-PLAN2
Adding rule KNOW-PLAN2
Adding rule KNOW-PLAN3
Adding rule MTRANS-PLAN1
Adding rule VPROX-REFLEXIVE-PLAN
Adding rule BELIEVE-BELIEVE-INF
Defining episode...
Assert #{OB.1978: (SUCCEEDED-GOAL (RPROX MOVIE-STAR1 CAIRO))} in CX.3
Assert #{OB.1980: (INTENDS linked-from (SUCCEEDED-GOAL (ACTING-EMPLOY actor MOVIE-STAR1 PARAMOUNT)) linked-to (SUCCEEDED-GOAL (RPROX MOVIE-STAR1 CAIRO)) seq? 'T)} in CX.3
Assert #{OB.1975: (SUCCEEDED-GOAL (ACTING-EMPLOY actor MOVIE-STAR1 PARAMOUNT))} in CX.3
Generating rule automatically.
Adding rule EPISODIC-RULE.1:
(RULE subgoal (RPROX ?var2298:PERSON ?var2299:CITY) goal (ACTING-EMPLOY actor ?var2298:PERSON ?var2300:ORGANIZATION) is 'PLAN-ONLY plausibility 0.7)
Make episode for goal #{OB.1975: (SUCCEEDED-GOAL (ACTING-EMPLOY actor MOVIE-STAR1 PARAMOUNT))}
Storing #{EPISODE.1: (EPISODE rule EPISODIC-RULE.1 goal (SUCCEEDED-GOAL (ACTING-EMPLOY actor MOVIE-STAR1 PARAMOUNT)) context CX.3 realism 0.7 desirability 1.0)} under #{EPISODIC-RULE.1: (RULE subgoal (RPROX ?var2298:PERSON ?var2299:CITY) goal (ACTING-EMPLOY actor ?var2298:PERSON ?var2300:ORGANIZATION) is 'PLAN-ONLY plausibility 0.7)}
Defining episode...
Assert #{OB.2012: (SUCCEEDED-GOAL (PTRANS ME HOME BAR1-LOC ME))} in CX.4
Assert #{OB.2014: (INTENDS linked-from (SUCCEEDED-GOAL (AT ME BAR1-LOC)) linked-to (SUCCEEDED-GOAL (PTRANS ME HOME BAR1-LOC ME)) rule AT-PLAN seq? 'T)} in CX.4
Assert #{OB.2010: (SUCCEEDED-GOAL (AT ME BAR1-LOC))} in CX.4
Make episode for goal #{OB.2010: (SUCCEEDED-GOAL (AT ME BAR1-LOC))}
Storing #{EPISODE.2: (EPISODE rule AT-PLAN goal (SUCCEEDED-GOAL (AT ME BAR1-LOC)) context CX.4 realism 1.0 desirability 1.0)} under #{AT-PLAN: (RULE subgoal (PTRANS ?PERSON ?LOCATION1 ?LOCATION2 ?PERSON) goal (AT ?PERSON ?LOCATION2) delete (AT ?PERSON ?LOCATION1) initial (AT ?PERSON ?LOCATION1) plausibility 1.0)}
Assert #{OB.2016: (INTENDS linked-from (SUCCEEDED-GOAL (LOVERS ME CHRIS)) linked-to (SUCCEEDED-GOAL (AT ME BAR1-LOC)) seq? 'T)} in CX.4
Assert #{OB.2017: (SUCCEEDED-GOAL (AT CHRIS BAR1-LOC))} in CX.4
Assert #{OB.2019: (INTENDS linked-from (SUCCEEDED-GOAL (LOVERS ME CHRIS)) linked-to (SUCCEEDED-GOAL (AT CHRIS BAR1-LOC)) seq? 'T)} in CX.4
Assert #{OB.2008: (SUCCEEDED-GOAL (LOVERS ME CHRIS))} in CX.4
Generating rule automatically.
Adding rule EPISODIC-RULE.2:
(RULE subgoal (RSEQ (AT ?var2302:PERSON ?var2303:LOCATION) (AT ?var2304:PERSON ?var2303:LOCATION)) goal (LOVERS ?var2302:PERSON ?var2304:PERSON) is 'PLAN-ONLY plausibility 0.7)
Make episode for goal #{OB.2008: (SUCCEEDED-GOAL (LOVERS ME CHRIS))}
Storing #{EPISODE.3: (EPISODE rule EPISODIC-RULE.2 goal (SUCCEEDED-GOAL (LOVERS ME CHRIS)) context CX.4 realism 0.7 desirability 1.0)} under #{EPISODIC-RULE.2: (RULE subgoal (RSEQ (AT ?var2302:PERSON ?var2303:LOCATION) (AT ?var2304:PERSON ?var2303:LOCATION)) goal (LOVERS ?var2302:PERSON ?var2304:PERSON) is 'PLAN-ONLY plausibility 0.7)}
Assert #{OB.2031: (INTENDS linked-from (SUCCEEDED-GOAL (LEADTO ante (FAILED-GOAL (LOVERS ME IRVING)) conseq (SUCCEEDED-GOAL (LOVERS ME CHRIS)))) linked-to (SUCCEEDED-GOAL (LOVERS ME CHRIS)) seq? 'T)} in CX.4
Assert #{OB.2002: (SUCCEEDED-GOAL (LEADTO ante (FAILED-GOAL (LOVERS ME IRVING)) conseq (SUCCEEDED-GOAL (LOVERS ME CHRIS))))} in CX.4
Generating rule automatically.
Adding rule EPISODIC-RULE.3:
(RULE subgoal (LOVERS ?var2302:PERSON ?var2304:PERSON) goal (LEADTO ante (FAILED-GOAL (LOVERS ?var2302:PERSON ?var2305:PERSON)) conseq (SUCCEEDED-GOAL (LOVERS ?var2302:PERSON ?var2304:PERSON))) is 'PLAN-ONLY plausibility 0.7)
Make episode for goal #{OB.2002: (SUCCEEDED-GOAL (LEADTO ante (FAILED-GOAL (LOVERS ME IRVING)) conseq (SUCCEEDED-GOAL (LOVERS ME CHRIS))))}
Storing #{EPISODE.4: (EPISODE rule EPISODIC-RULE.3 goal (SUCCEEDED-GOAL (LEADTO ante (FAILED-GOAL (LOVERS ME IRVING)) conseq (SUCCEEDED-GOAL (LOVERS ME CHRIS)))) context CX.4 realism 0.7 desirability 1.0)} under #{EPISODIC-RULE.3: (RULE subgoal (LOVERS ?var2302:PERSON ?var2304:PERSON) goal (LEADTO ante (FAILED-GOAL (LOVERS ?var2302:PERSON ?var2305:PERSON)) conseq (SUCCEEDED-GOAL (LOVERS ?var2302:PERSON ?var2304:PERSON))) is 'PLAN-ONLY plausibility 0.7)}
Assert #{OB.2042: (INTENDS linked-from (SUCCEEDED-GOAL (LEADTO ante (FAILED-GOAL (LOVERS ME IRVING)) conseq (SUCCEEDED-GOAL))) linked-to (SUCCEEDED-GOAL (LEADTO ante (FAILED-GOAL (LOVERS ME IRVING)) conseq (SUCCEEDED-GOAL (LOVERS ME CHRIS)))) seq? 'T)} in CX.4
Assert #{OB.1997: (SUCCEEDED-GOAL (LEADTO ante (FAILED-GOAL (LOVERS ME IRVING)) conseq (SUCCEEDED-GOAL)))} in CX.4
Generating rule automatically.
Adding rule EPISODIC-RULE.4:
(RULE subgoal (LEADTO ante (FAILED-GOAL (LOVERS ?var2302:PERSON ?var2305:PERSON)) conseq (SUCCEEDED-GOAL (LOVERS ?var2302:PERSON ?var2304:PERSON))) goal (LEADTO ante (FAILED-GOAL (LOVERS ?var2302:PERSON ?var2305:PERSON)) conseq (SUCCEEDED-GOAL)) is 'PLAN-ONLY plausibility 0.7)
Make episode for goal #{OB.1997: (SUCCEEDED-GOAL (LEADTO ante (FAILED-GOAL (LOVERS ME IRVING)) conseq (SUCCEEDED-GOAL)))}
Storing #{EPISODE.5: (EPISODE rule EPISODIC-RULE.4 goal (SUCCEEDED-GOAL (LEADTO ante (FAILED-GOAL (LOVERS ME IRVING)) conseq (SUCCEEDED-GOAL))) context CX.4 realism 0.7 desirability 1.0)} under #{EPISODIC-RULE.4: (RULE subgoal (LEADTO ante (FAILED-GOAL (LOVERS ?var2302:PERSON ?var2305:PERSON)) conseq (SUCCEEDED-GOAL (LOVERS ?var2302:PERSON ?var2304:PERSON))) goal (LEADTO ante (FAILED-GOAL (LOVERS ?var2302:PERSON ?var2305:PERSON)) conseq (SUCCEEDED-GOAL)) is 'PLAN-ONLY plausibility 0.7)}
=======================
Welcome to DAYDREAMER 3.5, Common Lisp version of 2004-12-20
=======================
T
U(2): (Daydreamer)
DAYDREAMER 3.5, Common Lisp version of 2004-12-20
Initialize DAYDREAMER
Performing first-time initialization
Creating primal reality...
Assert #{OB.1995: (KNOW CHRIS BAR1-LOC)} in CX.5
Assert #{OB.1994: (KNOW ME BAR1-LOC)} in CX.5
Assert #{OB.1992: (AT BAR1 BAR1-LOC)} in CX.5
Assert #{VENICE: (CITY "Venice Beach")} in CX.5
Assert #{OB.1781: (KNOW MOVIE-STAR1 (TELNO MOVIE-STAR1))} in CX.5
Assert #{OB.1710: (EMPLOYMENT actor CARMELITA1 organization (INSURANCE-COMPANY "State Farm"))} in CX.5
Assert #{OB.1679: (AT RAINCOAT1 HOME)} in CX.5
Assert #{OB.1662: (AT CHIC-OUTFIT1 HOME)} in CX.5
Assert #{OB.1647: (RICH MOVIE-STAR1)} in CX.5
Assert #{OB.1646: (POS-ATTITUDE MOVIE-STAR1)} in CX.5
Assert #{OB.1503: (MOVIE-STAR MOVIE-STAR1)} in CX.5
Assert #{OB.1412: (WEARING ME (NECKLACE))} in CX.5
Assert #{OB.1350: (BELIEVE MOVIE-STAR1 (RPROX MOVIE-STAR1 LOS-ANGELES))} in CX.5
Assert #{OB.1349: (RPROX MOVIE-STAR1 LOS-ANGELES)} in CX.5
Assert #{OB.1348: (RPROX ME LOS-ANGELES)} in CX.5
Assert #{OB.1347: (RPROX MY-JOB LOS-ANGELES)} in CX.5
Assert #{OB.1346: (EMPLOYMENT actor ME MY-BOSS organization MY-JOB)} in CX.5
Assert #{OB.1200: (STAR MOVIE-STAR1 'SOME-LEVEL)} in CX.5
Assert #{OB.594: (KNOW ME NUART-LOCATION)} in CX.5
Assert #{OB.395: (KNOW ME HOME)} in CX.5
Assert #{OB.394: (ADDRESS ME HOME)} in CX.5
Assert #{OB.393: (AT ME HOME)} in CX.5
Assert #{OB.376: (KNOW ME OUTSIDE)} in CX.5
Assert #{OB.372: (AT MAIL1 OUTSIDE)} in CX.5
Assert #{OB.290: (AT NUART-THEATER NUART-LOCATION)} in CX.5
Assert #{OB.285: (ROMANTIC-INTEREST MOVIE-STAR1)} in CX.5

Creating initial reality context...
#{CX.5: (CX)} --> #{CX.6: (CX)}
Assert #{OB.241: (ENTERTAINMENT 0.1)} in CX.6
Assert #{OB.242: (LOVE-RECEIVING 0.1)} in CX.6
Assert #{FOOD-NEED: (FOOD 1.0)} in CX.6
Assert #{MONEY-NEED: (MONEY 1.0)} in CX.6
Assert #{OB.245: (POSSESSIONS 1.0)} in CX.6
Assert #{OB.246: (SEX 1.0)} in CX.6
Assert #{OB.247: (LOVE-GIVING 1.0)} in CX.6
Assert #{OB.248: (COMPANIONSHIP 1.0)} in CX.6
State changes from SUSPENDED to DAYDREAMING
Run inferences in #{CX.6: (CX)}, bp = (#{ME: (FEMALE-PERSON "Sarah")})
******************
BELIEF-PERS-ATTR-PLAN1 BELIEF-PERS-ATTR-PLAN1 fired as inference in CX.6
-------------------------------------------------------
IF   person is STAR
THEN person BELIEVE person is STAR
-------------------------------------------------------

?LEVEL = SOME-LEVEL
?PERSON = #{MOVIE-STAR1: (MALE-ACTOR "Harrison" "Ford")}
?SELF = #{ME: (FEMALE-PERSON "Sarah")}
Assert #{OB.2205: (BELIEVE MOVIE-STAR1 (STAR MOVIE-STAR1 'SOME-LEVEL))} in CX.6
Assert #{OB.2207: (DEPENDENCY linked-from (STAR MOVIE-STAR1 'SOME-LEVEL) linked-to (BELIEVE MOVIE-STAR1 (STAR MOVIE-STAR1 'SOME-LEVEL)) weight 1.0 offset 0.0 decay 0.0 rule BELIEF-PERS-ATTR-PLAN1)} in CX.6
******************
WELL-DRESSED-PLAN2 WELL-DRESSED-PLAN2 fired as inference in CX.6
-------------------------------------------------------
IF   self WEARING necklace
THEN self is WELL-DRESSED
-------------------------------------------------------

?SELF = #{ME: (FEMALE-PERSON "Sarah")}
Assert #{OB.2209: (WELL-DRESSED ME)} in CX.6
Assert #{OB.2210: (DEPENDENCY linked-from (WEARING ME (NECKLACE)) linked-to (WELL-DRESSED ME) weight 0.1 offset 0.0 decay 0.0 rule WELL-DRESSED-PLAN2)} in CX.6
******************
LOVERS-THEME LOVERS-THEME fired as inference in CX.6
-------------------------------------------------------
IF   self not LOVERS with anyone
THEN ACTIVE-GOAL for LOVERS with some person
-------------------------------------------------------

?SELF = #{ME: (FEMALE-PERSON "Sarah")}
******************
Activate top-level goal #{OB.2212: (ACTIVE-GOAL (LOVERS ME ?MALE-PERSON))} in #{CX.6: (CX)}
Assert #{OB.2212: (ACTIVE-GOAL (LOVERS ME ?MALE-PERSON))} in CX.6
==================================================
 I want to be going out with someone.
==================================================
Add dependency from #{OB.2214: (POS-EMOTION 0.9)} to #{OB.2212: (ACTIVE-GOAL (LOVERS ME ?MALE-PERSON) ^OB.2212)} in #{CX.6: (CX)}
Assert #{OB.2215: (DEPENDENCY linked-from (POS-EMOTION 0.9) linked-to (ACTIVE-GOAL (LOVERS ME ?MALE-PERSON) ^OB.2212) weight 1.0 offset 0.0 decay 0.0)} in CX.6
Assert #{OB.2214: (POS-EMOTION 0.9)} in CX.6
==================================================
 I feel really interested in going out with
 someone.
==================================================
Personal goal concern OB.2212: LOVERS motiv 0.9 status HALTED
******************
ENTERTAINMENT-THEME ENTERTAINMENT-THEME fired as inference in CX.6
-------------------------------------------------------
IF   level of satisfaction of ENTERTAINMENT need
     below threshold
THEN ACTIVE-GOAL for ENTERTAINMENT
-------------------------------------------------------

?SELF = #{ME: (FEMALE-PERSON "Sarah")}
******************
Activate top-level goal #{OB.2217: (ACTIVE-GOAL (ENTERTAINMENT (UPROC 'NEED-SATISFIED?)))} in #{CX.6: (CX)}
Assert #{OB.2217: (ACTIVE-GOAL (ENTERTAINMENT (UPROC 'NEED-SATISFIED?)))} in CX.6
==================================================
 I want to be entertained.
==================================================
Add dependency from #{OB.2219: (POS-EMOTION 0.6)} to #{OB.2217: (ACTIVE-GOAL (ENTERTAINMENT (UPROC 'NEED-SATISFIED?)) ^OB.2217)} in #{CX.6: (CX)}
Assert #{OB.2220: (DEPENDENCY linked-from (POS-EMOTION 0.6) linked-to (ACTIVE-GOAL (ENTERTAINMENT (UPROC 'NEED-SATISFIED?)) ^OB.2217) weight 1.0 offset 0.0 decay 0.0)} in CX.6
Assert #{OB.2219: (POS-EMOTION 0.6)} in CX.6
==================================================
 I feel interested in being entertained.
==================================================
Personal goal concern OB.2217: ENTERTAINMENT motiv 0.6 status RUNABLE
Personal goal concern OB.2212: LOVERS motiv 0.9 status HALTED
Running emotion-driven control loop...
:Switching to new top-level goal #{OB.2217: (ACTIVE-GOAL (ENTERTAINMENT (UPROC 'NEED-SATISFIED?)) ^OB.2217)}
----------------------CX.6--------------------
Running rules for #{OB.2217: (ACTIVE-GOAL (ENTERTAINMENT (UPROC 'NEED-SATISFIED?)) ^OB.2217)}
setting last sprout concept = #{OB.2212: (ACTIVE-GOAL (LOVERS ME ?MALE-PERSON) ^OB.2212)} in #{CX.5: (CX)}
Run inferences in #{CX.6: (CX)}, bp = (#{ME: (FEMALE-PERSON "Sarah")})
Running p-goals in #{CX.6: (CX)}
Running plans in #{CX.6: (CX)} for #{OB.2217: (ACTIVE-GOAL (ENTERTAINMENT (UPROC 'NEED-SATISFIED?)) ^OB.2217)} bp (#{ME: (FEMALE-PERSON "Sarah")})
Run plan for #{OB.2217: (ACTIVE-GOAL (ENTERTAINMENT (UPROC 'NEED-SATISFIED?)) ^OB.2217)} in #{CX.6: (CX)}
Try fact plans
Try rules and episodes
Find candidate rules for obj #{OB.2218: (ENTERTAINMENT (UPROC 'NEED-SATISFIED?))} in #{CX.6: (CX)}
Order candidates ((#{ENTERTAINMENT-PLAN1: (RULE subgoal (M-MOVIE ?Self) goal (ENTERTAINMENT) is 'PLAN-ONLY-NO-AUTO plausibility 1.0)} (T (SELF #{ME: (FEMALE-PERSON "Sarah")}))))
Run generic plan #{ENTERTAINMENT-PLAN1: (RULE subgoal (M-MOVIE ?Self) goal (ENTERTAINMENT) is 'PLAN-ONLY-NO-AUTO plausibility 1.0)} for #{OB.2217: (ACTIVE-GOAL (ENTERTAINMENT (UPROC 'NEED-SATISFIED?)) ^OB.2217)} in #{CX.6: (CX)}
#{CX.6: (CX)} --> #{CX.7: (CX)}
Debugging being delayed for broadcast at a later time.
ENTERTAINMENT-PLAN1 Debugging resumed.
Pruning possibilities from (#{CX.7: (CX)})
:----------------------CX.7--------------------
Running rules for #{OB.2217: (ACTIVE-GOAL (ENTERTAINMENT (UPROC 'NEED-SATISFIED?)) ^OB.2217)}
setting last sprout concept = #{OB.2229: (ACTIVE-GOAL (M-MOVIE ME) (ACTIVE-GOAL (ENTERTAINMENT (UPROC 'NEED-SATISFIED?)) ^OB.2217))} in #{CX.6: (CX)}
Broadcasting delayed debugs.
******************
ENTERTAINMENT-PLAN1 fired as plan
for #{OB.2217: (ACTIVE-GOAL (ENTERTAINMENT (UPROC 'NEED-SATISFIED?)) ^OB.2217)}
in CX.6 sprouting CX.7
-------------------------------------------------------
IF   ACTIVE-GOAL for ENTERTAINMENT
THEN ACTIVE-GOAL for M-MOVIE with self
-------------------------------------------------------
...<SNIP>...
:----------------------CX.71--------------------
Running rules for #{OB.3433: (ACTIVE-GOAL (REVENGE ME MOVIE-STAR1 (FAILED-GOAL (LOVERS ME MOVIE-STAR1) ^OB.2212)) ^OB.3433)}
setting last sprout concept = #{OB.4234: (BELIEVE MOVIE-STAR1 (FAILED-GOAL (LOVERS ME MOVIE-STAR1)))} in #{CX.70: (CX)}
setting last sprout concept = #{OB.4234: (BELIEVE MOVIE-STAR1 (FAILED-GOAL (LOVERS ME MOVIE-STAR1)))} in #{CX.69: (CX)}
setting last sprout concept = #{OB.4234: (BELIEVE MOVIE-STAR1 (FAILED-GOAL (LOVERS ME MOVIE-STAR1)))} in #{CX.48: (CX)}
Broadcasting delayed debugs.
Retract #{OB.4260: (ORDERING)} in CX.71
Assert #{OB.4314: (ORDERING)} in CX.71
Subgoal relaxation, #{OB.4236: (ACTIVE-GOAL (BELIEVE MOVIE-STAR1 (FAILED-GOAL (LOVERS ME MOVIE-STAR1))) (ACTIVE-GOAL (REVENGE ME MOVIE-STAR1 (FAILED-GOAL ^OB.2677 ^OB.2212)) ^OB.3433))} succeeds

Assert #{OB.4234: (BELIEVE MOVIE-STAR1 (FAILED-GOAL (LOVERS ME MOVIE-STAR1)))} in CX.71
==================================================
 Say he fails at going out with me.
==================================================
******************
Goal #{OB.4236: (ACTIVE-GOAL (BELIEVE MOVIE-STAR1 (FAILED-GOAL (LOVERS ME MOVIE-STAR1))) (ACTIVE-GOAL (REVENGE ME MOVIE-STAR1 (FAILED-GOAL ^OB.2677 ^OB.2212)) ^OB.3433))} succeeds in #{CX.71: (CX)}
Retract #{OB.4236: (ACTIVE-GOAL (BELIEVE MOVIE-STAR1 (FAILED-GOAL (LOVERS ME MOVIE-STAR1))) (ACTIVE-GOAL (REVENGE ME MOVIE-STAR1 (FAILED-GOAL ^OB.2677 ^OB.2212)) ^OB.3433))} in CX.71
Assert #{OB.4315: (ACTIVE-GOAL (BELIEVE MOVIE-STAR1 (FAILED-GOAL (LOVERS ME MOVIE-STAR1))))} in CX.71
Retract #{OB.4237: (INTENDS linked-from (ACTIVE-GOAL (REVENGE ME MOVIE-STAR1 (FAILED-GOAL (LOVERS ME MOVIE-STAR1) ^OB.2212)) ^OB.3433) linked-to (ACTIVE-GOAL (BELIEVE MOVIE-STAR1 (FAILED-GOAL ^OB.2677)) ^OB.3433) rule REVENGE-PLAN1 seq? 'T)} in CX.71
Assert #{OB.4319: (INTENDS linked-from (ACTIVE-GOAL (REVENGE ME MOVIE-STAR1 (FAILED-GOAL (LOVERS ME MOVIE-STAR1) ^OB.2212)) ^OB.3433) linked-to (ACTIVE-GOAL (BELIEVE MOVIE-STAR1 (FAILED-GOAL (LOVERS ME MOVIE-STAR1)))) rule REVENGE-PLAN1 seq? 'T)} in CX.71
Retract #{OB.4315: (ACTIVE-GOAL (BELIEVE MOVIE-STAR1 (FAILED-GOAL (LOVERS ME MOVIE-STAR1))) (ACTIVE-GOAL (REVENGE ME MOVIE-STAR1 (FAILED-GOAL (LOVERS ME MOVIE-STAR1) ^OB.2212)) ^OB.3433))} in CX.71
Assert #{OB.4315: (SUCCEEDED-GOAL (BELIEVE MOVIE-STAR1 (FAILED-GOAL (LOVERS ME MOVIE-STAR1))) (ACTIVE-GOAL (REVENGE ME MOVIE-STAR1 (FAILED-GOAL (LOVERS ME MOVIE-STAR1) ^OB.2212)) ^OB.3433))} in CX.71
End of delayed broadcast.
Subgoals of #{OB.3433: (ACTIVE-GOAL (REVENGE ME MOVIE-STAR1 (FAILED-GOAL (LOVERS ME MOVIE-STAR1) ^OB.2212)) ^OB.3433)} completed
******************
Goal #{OB.3433: (ACTIVE-GOAL (REVENGE ME MOVIE-STAR1 (FAILED-GOAL (LOVERS ME MOVIE-STAR1) ^OB.2212)) ^OB.3433)} succeeds in #{CX.71: (CX)}
Replace obj of #{OB.3433: (ACTIVE-GOAL (REVENGE ME MOVIE-STAR1 (FAILED-GOAL (LOVERS ME MOVIE-STAR1) ^OB.2212)) ^OB.3433)} with (T)
Retract #{OB.3433: (ACTIVE-GOAL (REVENGE ME MOVIE-STAR1 (FAILED-GOAL (LOVERS ME MOVIE-STAR1))) ^OB.3433)} in CX.71
Assert #{OB.3433: (SUCCEEDED-GOAL (REVENGE ME MOVIE-STAR1 (FAILED-GOAL (LOVERS ME MOVIE-STAR1))) ^OB.3433)} in CX.71
Assert #{OB.4320: (REVENGE ME MOVIE-STAR1 (FAILED-GOAL (LOVERS ME MOVIE-STAR1)))} in CX.71
==================================================
 I get even with him.
==================================================
Run inferences in #{CX.71: (CX)}, bp = (#{ME: (FEMALE-PERSON "Sarah")})
Running p-goals in #{CX.71: (CX)}
Running plans in #{CX.71: (CX)} for #{OB.3433: (SUCCEEDED-GOAL (REVENGE ME MOVIE-STAR1 (FAILED-GOAL (LOVERS ME MOVIE-STAR1))) ^OB.3433)} bp (#{ME: (FEMALE-PERSON "Sarah")})
Terminating planning for top-level goal #{OB.3433: (SUCCEEDED-GOAL (REVENGE ME MOVIE-STAR1 (FAILED-GOAL (LOVERS ME MOVIE-STAR1))) ^OB.3433)}
Leaf context #{CX.71: (CX)}
[OB.3433: (SG. (REVENGE ME MOVIE-STAR1 (FAILED-GOAL (LOVERS ME MOVIE-STAR1))))]
  [OB.4238: (SG. (BELIEVE MOVIE-STAR1 (ACTIVE-GOAL (LOVERS ME MOVIE-STAR1))))]
  [OB.4268: (SG. (MTRANS MOVIE-STAR1 MOVIE-STAR1 ME (BELIEVE MOVIE-STAR1 (ACTIVE-GOAL (LOVERS ME MOVIE-STAR1)))))]
    [OB.4264: (SG. (VPROX ME MOVIE-STAR1))]
  [OB.4315: (SG. (BELIEVE MOVIE-STAR1 (FAILED-GOAL (LOVERS ME MOVIE-STAR1))))]
Personal goal concern OB.3454: LOVERS motiv 0.9 status HALTED
Removing motivating emotions of #{OB.3433: (SUCCEEDED-GOAL (REVENGE ME MOVIE-STAR1 (FAILED-GOAL (LOVERS ME MOVIE-STAR1))) ^OB.3433)} in #{CX.68: (CX)}
Retract #{OB.3438: (DEPENDENCY linked-from (NEG-EMOTION 0.05) linked-to (SUCCEEDED-GOAL (REVENGE ME MOVIE-STAR1 (FAILED-GOAL (LOVERS ME MOVIE-STAR1))) ^OB.3433) weight 1.0 offset 0.0 decay 0.0)} in CX.68
Retract #{OB.3437: (NEG-EMOTION 0.05)} in CX.68
Retract #{OB.3435: (DEPENDENCY linked-from (POS-EMOTION 0.25 MOVIE-STAR1) linked-to (SUCCEEDED-GOAL (REVENGE ME MOVIE-STAR1 (FAILED-GOAL (LOVERS ME MOVIE-STAR1))) ^OB.3433) weight 1.0 offset 0.0 decay 0.0)} in CX.68
Emotional responses for #{OB.3433: (SUCCEEDED-GOAL (REVENGE ME MOVIE-STAR1 (FAILED-GOAL (LOVERS ME MOVIE-STAR1))) ^OB.3433)} in #{CX.71: (CX)}
Add dependency from #{OB.3433: (SUCCEEDED-GOAL (REVENGE ME MOVIE-STAR1 (FAILED-GOAL (LOVERS ME MOVIE-STAR1))) ^OB.3433)} to #{OB.4418: (POS-EMOTION)} in #{CX.68: (CX)}
Assert #{OB.4419: (DEPENDENCY linked-from (SUCCEEDED-GOAL (REVENGE ME MOVIE-STAR1 (FAILED-GOAL (LOVERS ME MOVIE-STAR1))) ^OB.3433) linked-to (POS-EMOTION) weight 0.73333335 offset 0.0 decay 0.0)} in CX.68
Assert #{OB.4418: (POS-EMOTION 0.22000001)} in CX.68
==================================================
 Possibly I feel a bit pleased about getting
 even with him.
==================================================
Run inferences in #{CX.68: (CX)}, bp = (#{ME: (FEMALE-PERSON "Sarah")})
Store episode #{OB.3433: (SUCCEEDED-GOAL (REVENGE ME MOVIE-STAR1 (FAILED-GOAL (LOVERS ME MOVIE-STAR1))) ^OB.3433)} in #{CX.71: (CX)}
Assess scenario desirability in #{CX.71: (CX)}
Scenario desirability = 0.0
Store goal of episode #{OB.3433: (SUCCEEDED-GOAL (REVENGE ME MOVIE-STAR1 (FAILED-GOAL (LOVERS ME MOVIE-STAR1))) ^OB.3433)}, realism 0.73333335
Store goal of episode #{OB.4238: (SUCCEEDED-GOAL (BELIEVE MOVIE-STAR1 (ACTIVE-GOAL (LOVERS ME MOVIE-STAR1))) (SUCCEEDED-GOAL (REVENGE ME MOVIE-STAR1 (FAILED-GOAL (LOVERS ME MOVIE-STAR1))) ^OB.3433))}, realism 1.0
Store goal of episode #{OB.4268: (SUCCEEDED-GOAL (MTRANS MOVIE-STAR1 MOVIE-STAR1 ME (BELIEVE MOVIE-STAR1 (ACTIVE-GOAL (LOVERS ME MOVIE-STAR1)))) (SUCCEEDED-GOAL (REVENGE ME MOVIE-STAR1 (FAILED-GOAL (LOVERS ME MOVIE-STAR1))) ^OB.3433))}, realism 1.0
Store goal of episode #{OB.4264: (SUCCEEDED-GOAL (VPROX ME MOVIE-STAR1) (SUCCEEDED-GOAL (REVENGE ME MOVIE-STAR1 (FAILED-GOAL (LOVERS ME MOVIE-STAR1))) ^OB.3433))}, realism 1.0
Make episode for goal #{OB.4268: (SUCCEEDED-GOAL (MTRANS MOVIE-STAR1 MOVIE-STAR1 ME (BELIEVE MOVIE-STAR1 (ACTIVE-GOAL (LOVERS ME MOVIE-STAR1)))) (SUCCEEDED-GOAL (REVENGE ME MOVIE-STAR1 (FAILED-GOAL (LOVERS ME MOVIE-STAR1))) ^OB.3433))}
Storing #{EPISODE.23: (EPISODE rule MTRANS-PLAN2 goal (SUCCEEDED-GOAL (MTRANS MOVIE-STAR1 MOVIE-STAR1 ME (BELIEVE MOVIE-STAR1 (ACTIVE-GOAL (LOVERS ME MOVIE-STAR1)))) (SUCCEEDED-GOAL (REVENGE ME MOVIE-STAR1 (FAILED-GOAL (LOVERS ME MOVIE-STAR1))) ^OB.3433)) context CX.71 realism 1.0 desirability 1.0)} under #{MTRANS-PLAN2: (RULE subgoal (VPROX ?PERSON2 ?PERSON1) goal (MTRANS ?PERSON1 ?PERSON1 ?PERSON2 (UOR (UAND ?MENTAL-STATE (UOR (UPROC 'IS-VAR?) (UNOT ?KNOWABLE))) (NOT (UAND ?MENTAL-STATE (UOR (UPROC 'IS-VAR?) (UNOT ?KNOWABLE)))))) is 'ACTION-PLAN plausibility 1.0)}
Store goal of episode #{OB.4315: (SUCCEEDED-GOAL (BELIEVE MOVIE-STAR1 (FAILED-GOAL (LOVERS ME MOVIE-STAR1))) (SUCCEEDED-GOAL (REVENGE ME MOVIE-STAR1 (FAILED-GOAL (LOVERS ME MOVIE-STAR1))) ^OB.3433))}, realism 0.2
Make episode for goal #{OB.3433: (SUCCEEDED-GOAL (REVENGE ME MOVIE-STAR1 (FAILED-GOAL (LOVERS ME MOVIE-STAR1))) ^OB.3433)}
Storing #{EPISODE.24: (EPISODE rule REVENGE-PLAN1 goal (SUCCEEDED-GOAL (REVENGE ME MOVIE-STAR1 (FAILED-GOAL (LOVERS ME MOVIE-STAR1))) ^OB.3433) context CX.71 realism 0.73333335 desirability 0.0)} under #{REVENGE-PLAN1: (RULE subgoal (RSEQ (BELIEVE ?Other (ACTIVE-GOAL ?POS-RELATIONSHIP)) (MTRANS ?Other ?Other ?Self (BELIEVE ?Other (ACTIVE-GOAL ?POS-RELATIONSHIP))) (BELIEVE ?Other (FAILED-GOAL ?POS-RELATIONSHIP))) goal (REVENGE ?Self ?Other (FAILED-GOAL ?POS-RELATIONSHIP)) is 'PLAN-ONLY plausibility 1.0)}
Storing #{EPISODE.24: (EPISODE rule REVENGE-PLAN1 goal (SUCCEEDED-GOAL (REVENGE ME MOVIE-STAR1 (FAILED-GOAL (LOVERS ME MOVIE-STAR1))) ^OB.3433) context CX.71 realism 0.73333335 desirability 0.0)} under #{OB.4418: (POS-EMOTION 0.22000001)}
Assert #{OB.4418: (POS-EMOTION 0.22000001)} in EPISODIC-MEMORY
Storing #{EPISODE.24: (EPISODE rule REVENGE-PLAN1 goal (SUCCEEDED-GOAL (REVENGE ME MOVIE-STAR1 (FAILED-GOAL (LOVERS ME MOVIE-STAR1))) ^OB.3433) context CX.71 realism 0.73333335 desirability 0.0)} under #{HOME: (LOCATION "home")}
Storing #{EPISODE.24: (EPISODE rule REVENGE-PLAN1 goal (SUCCEEDED-GOAL (REVENGE ME MOVIE-STAR1 (FAILED-GOAL (LOVERS ME MOVIE-STAR1))) ^OB.3433) context CX.71 realism 0.73333335 desirability 0.0)} under #{NUART-THEATER: (THEATER "the Nuart")}
Storing #{EPISODE.24: (EPISODE rule REVENGE-PLAN1 goal (SUCCEEDED-GOAL (REVENGE ME MOVIE-STAR1 (FAILED-GOAL (LOVERS ME MOVIE-STAR1))) ^OB.3433) context CX.71 realism 0.73333335 desirability 0.0)} under #{BAR1-LOC: (LOCATION "Mom's")}
Storing #{EPISODE.24: (EPISODE rule REVENGE-PLAN1 goal (SUCCEEDED-GOAL (REVENGE ME MOVIE-STAR1 (FAILED-GOAL (LOVERS ME MOVIE-STAR1))) ^OB.3433) context CX.71 realism 0.73333335 desirability 0.0)} under #{OB.1418: (NECKLACE)}
Assert #{OB.1418: (NECKLACE)} in EPISODIC-MEMORY
Storing #{EPISODE.24: (EPISODE rule REVENGE-PLAN1 goal (SUCCEEDED-GOAL (REVENGE ME MOVIE-STAR1 (FAILED-GOAL (LOVERS ME MOVIE-STAR1))) ^OB.3433) context CX.71 realism 0.73333335 desirability 0.0)} under #{NUART-LOCATION: (LOCATION "the Nuart")}
Storing #{EPISODE.24: (EPISODE rule REVENGE-PLAN1 goal (SUCCEEDED-GOAL (REVENGE ME MOVIE-STAR1 (FAILED-GOAL (LOVERS ME MOVIE-STAR1))) ^OB.3433) context CX.71 realism 0.73333335 desirability 0.0)} under #{IRVING: (MALE-PERSON "Irving")}
Assert #{IRVING: (MALE-PERSON "Irving")} in EPISODIC-MEMORY
Storing #{EPISODE.24: (EPISODE rule REVENGE-PLAN1 goal (SUCCEEDED-GOAL (REVENGE ME MOVIE-STAR1 (FAILED-GOAL (LOVERS ME MOVIE-STAR1))) ^OB.3433) context CX.71 realism 0.73333335 desirability 0.0)} under #{CHRIS: (MALE-PERSON "Chris")}
Assert #{CHRIS: (MALE-PERSON "Chris")} in EPISODIC-MEMORY
Storing #{EPISODE.24: (EPISODE rule REVENGE-PLAN1 goal (SUCCEEDED-GOAL (REVENGE ME MOVIE-STAR1 (FAILED-GOAL (LOVERS ME MOVIE-STAR1))) ^OB.3433) context CX.71 realism 0.73333335 desirability 0.0)} under #{PARAMOUNT: (ORGANIZATION "Paramount Pictures")}
Assert #{PARAMOUNT: (ORGANIZATION "Paramount Pictures")} in EPISODIC-MEMORY
Storing #{EPISODE.24: (EPISODE rule REVENGE-PLAN1 goal (SUCCEEDED-GOAL (REVENGE ME MOVIE-STAR1 (FAILED-GOAL (LOVERS ME MOVIE-STAR1))) ^OB.3433) context CX.71 realism 0.73333335 desirability 0.0)} under #{OB.3014: (MOVIES MOVIE-STAR1)}
Storing #{EPISODE.24: (EPISODE rule REVENGE-PLAN1 goal (SUCCEEDED-GOAL (REVENGE ME MOVIE-STAR1 (FAILED-GOAL (LOVERS ME MOVIE-STAR1))) ^OB.3433) context CX.71 realism 0.73333335 desirability 0.0)} under #{MOVIE-STAR1: (MALE-ACTOR "Harrison" "Ford")}
Activate index #{REVENGE-PLAN1: (RULE subgoal (RSEQ (BELIEVE ?Other (ACTIVE-GOAL ?POS-RELATIONSHIP)) (MTRANS ?Other ?Other ?Self (BELIEVE ?Other (ACTIVE-GOAL ?POS-RELATIONSHIP))) (BELIEVE ?Other (FAILED-GOAL ?POS-RELATIONSHIP))) goal (REVENGE ?Self ?Other (FAILED-GOAL ?POS-RELATIONSHIP)) is 'PLAN-ONLY plausibility 1.0)}
Index #{OB.3014: (MOVIES MOVIE-STAR1)} fades
Activate index #{HOME: (LOCATION "home")}
Index #{EPISODIC-RULE.4: (RULE subgoal (LEADTO ante (FAILED-GOAL (LOVERS ?var2302:PERSON ?var2305:PERSON)) conseq (SUCCEEDED-GOAL (LOVERS ?var2302:PERSON ?var2304:PERSON))) goal (LEADTO ante (FAILED-GOAL (LOVERS ?var2302:PERSON ?var2305:PERSON)) conseq (SUCCEEDED-GOAL)) is 'PLAN-ONLY plausibility 0.7)} fades
Activate index #{NUART-THEATER: (THEATER "the Nuart")}
Index #{RATIONALIZATION-PLAN2: (RULE subgoal (LEADTO ante (FAILED-GOAL ?STATE) conseq (SUCCEEDED-GOAL)) goal (RATIONALIZATION (UAND (FAILED-GOAL ?STATE) (UPROC 'NOT-INFERRED-TOP-LEVEL-GOAL?))) is 'PLAN-ONLY-NO-AUTO plausibility 0.98)} fades
Index #{BAR1-LOC: (LOCATION "Mom's")} already active
Activate index #{OB.1418: (NECKLACE)}
Index #{BAR1-LOC: (LOCATION "Mom's")} fades
Index #{NUART-LOCATION: (LOCATION "the Nuart")} already active
Activate index #{IRVING: (MALE-PERSON "Irving")}
Index #{NUART-LOCATION: (LOCATION "the Nuart")} fades
Activate index #{CHRIS: (MALE-PERSON "Chris")}
Index #{MOVIE-STAR1: (MALE-ACTOR "Harrison" "Ford")} fades
Activate index #{PARAMOUNT: (ORGANIZATION "Paramount Pictures")}
Index #{REVENGE-PLAN1: (RULE subgoal (RSEQ (BELIEVE ?Other (ACTIVE-GOAL ?POS-RELATIONSHIP)) (MTRANS ?Other ?Other ?Self (BELIEVE ?Other (ACTIVE-GOAL ?POS-RELATIONSHIP))) (BELIEVE ?Other (FAILED-GOAL ?POS-RELATIONSHIP))) goal (REVENGE ?Self ?Other (FAILED-GOAL ?POS-RELATIONSHIP)) is 'PLAN-ONLY plausibility 1.0)} fades
Activate index #{OB.3014: (MOVIES MOVIE-STAR1)}
Index #{HOME: (LOCATION "home")} fades
Activate index #{MOVIE-STAR1: (MALE-ACTOR "Harrison" "Ford")}
Index #{NUART-THEATER: (THEATER "the Nuart")} fades
Assert #{OB.3433: (SUCCEEDED-GOAL (REVENGE ME MOVIE-STAR1 (FAILED-GOAL (LOVERS ME MOVIE-STAR1))) ^OB.3433)} in CX.68
Assert #{OB.4320: (REVENGE ME MOVIE-STAR1 (FAILED-GOAL (LOVERS ME MOVIE-STAR1)))} in CX.68
#{CX.68: (CX)} --> #{CX.72: (CX)}
:Taking optional object or concept input
Enter concepts in #{CX.72: (CX)}
Parser>
End of parser input
No more goals to run; switching to performance mode
State changes from DAYDREAMING to PERFORMANCE
Emotion #{OB.3085: (POS-EMOTION 0.14528356)} below threshold.
Retract #{OB.3085: (POS-EMOTION 0.14528356)} in CX.72
:No more goals to run; switching to daydreaming mode
State changes from PERFORMANCE to DAYDREAMING
:Taking optional object or concept input
Enter concepts in #{CX.72: (CX)}
Parser>
End of parser input
No more goals to run; switching to performance mode
State changes from DAYDREAMING to PERFORMANCE
DAYDREAMER terminates
T
U(3):


