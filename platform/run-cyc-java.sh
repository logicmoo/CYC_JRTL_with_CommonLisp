# "-Xbootclasspath:C:/pf/java/jdk1.8.0_102/jre/lib/resources.jar:C:/pf/java/jdk1.8.0_102/jre/lib/rt.jar:C:/pf/java/jdk1.8.0_102/jre/lib/jsse.jar:C:/pf/java/jdk1.8.0_102/jre/lib/jce.jar:C:/pf/java/jdk1.8.0_102/jre/lib/charsets.jar:C:/pf/java/jdk1.8.0_102/jre/lib/jfr.jar:C:/Program Files/java/jdk/lib/sa-jdi.jar:C:/Program Files/java/jdk/lib/tools.jar" 
export PRJS=${BASH_SOURCE[0]}
export PRJ=$( dirname "$SOURCE" )

if [ -z "$SWI_HOME" ]; then
  export SWI_HOME=$(dirname $(dirname $(dirname `readlink -f \`which swipl\``)))
fi

echo SWI_HOME=$SWI_HOME

export CLASSPATH_ABCL=$PRJ/powerloom-4.0.9.beta/native/java/lib/castor-core.jar:$PRJ/powerloom-4.0.9.beta/native/java/lib/castor.jar:$PRJ/powerloom-4.0.9.beta/native/java/lib/commons-logging.jar:$PRJ/platform/lib/servlet-api-3.0.20100224.jar:$PRJ/rcyc/build/eclipse-classes:D:/eclipse/plugins/org.junit_4.12.0.v201504281640/junit.jar:$PRJ/platform/ext/javagat/commons-logging-1.1.jar:$PRJ/platform/ext/javagat/GAT-API.jar:$PRJ/platform/ext/javagat/GAT-engine.jar:$PRJ/platform/ext/javagat/log4j-1.2.13.jar:$HOME/.m2/repository/axis/axis/1.4/axis-1.4.jar:$HOME/.m2/repository/org/apache/axis/axis-jaxrpc/1.4/axis-jaxrpc-1.4.jar:$PRJ/platform/lib/jetty-continuation-8.0.4.v20111024.jar:$PRJ/platform/lib/jsp-2.1-glassfish-2.1.v20100127.jar:$PRJ/platform/lib/jsp-api-2.1-glassfish-2.1.v20100127.jar:$PRJ/platform/lib/junit-4.5.jar:$PRJ/platform/lib/openrdf-sesame-2.2.4-onejar.jar:$PRJ/platform/lib/ordi-model-0.5.jar:$PRJ/platform/lib/ordi-trree-adapter-3.1.a6.jar:$PRJ/platform/lib/owlim-big-3.1.a7.jar:$PRJ/platform/ext/javagat/castor-1.1.1-xml.jar:$PRJ/BeanShell/lib/bsf-all-3.1.jar:$PRJ/BeanShell/lib/bsf.jar:$PRJ/BeanShell/lib/bsf-utils-3.1.jar:$PRJ/BeanShell/lib/bsf-api-3.1.jar:$PRJ/platform/lib/asm-all-3.1.jar:$PRJ/platform/lib/concurrent.jar:$PRJ/platform/lib/iri.jar:$PRJ/rcyc/extra-classes:$PRJ/rcyc/lib/ant-1.6.5.jar:$PRJ/rcyc/lib/commons-math-3.0-SNAPSHOT.jar:$PRJ/rcyc/lib/customSysParam.jar:$PRJ/rcyc/lib/cycSparqlEndpoint.jar:$PRJ/rcyc/lib/ecj-3.5.1.jar:$PRJ/rcyc/lib/jetty-continuation-8.0.4.v20111024.jar:$PRJ/rcyc/lib/jetty-http-8.0.4.v20111024.jar:$PRJ/rcyc/lib/jetty-io-8.0.4.v20111024.jar:$PRJ/rcyc/lib/jetty-security-8.0.4.v20111024.jar:$PRJ/rcyc/lib/jetty-server-8.0.4.v20111024.jar:$PRJ/rcyc/lib/jetty-servlet-8.0.4.v20111024.jar:$PRJ/rcyc/lib/jetty-util-8.0.4.v20111024.jar:$PRJ/rcyc/lib/jetty-webapp-8.0.4.v20111024.jar:$PRJ/rcyc/lib/jetty-xml-8.0.4.v20111024.jar:$PRJ/rcyc/lib/jsp-2.1-glassfish-2.1.v20100127.jar:$PRJ/rcyc/lib/jsp-api-2.1-glassfish-2.1.v20100127.jar:$PRJ/rcyc/lib/junit.jar:$PRJ/rcyc/lib/asm-all-3.1.jar:$PRJ/rcyc/lib/servlet-api-3.0.20100224.jar:$PRJ/powerloom-4.0.9.beta/native/java/lib/stella.jar

./abclc --eval "(init-cyc-server)" $@

