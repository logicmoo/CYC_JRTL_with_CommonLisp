SET CLASSPATH="build\eclipse-classes;extra-classes;D:\eclipse\plugins\org.junit_4.12.0.v201504281640\junit.jar;lib\ant-1.6.5.jar;lib\asm-all-3.1.jar;lib\commons-math-3.0-SNAPSHOT.jar;lib\customSysParam.jar;lib\cycSparqlEndpoint.jar;lib\ecj-3.5.1.jar;lib\jetty-continuation-8.0.4.v20111024.jar;lib\jetty-http-8.0.4.v20111024.jar;lib\jetty-io-8.0.4.v20111024.jar;lib\jetty-security-8.0.4.v20111024.jar;lib\jetty-server-8.0.4.v20111024.jar;lib\jetty-servlet-8.0.4.v20111024.jar;lib\jetty-util-8.0.4.v20111024.jar;lib\jetty-webapp-8.0.4.v20111024.jar;lib\jetty-xml-8.0.4.v20111024.jar;lib\jsp-2.1-glassfish-2.1.v20100127.jar;lib\jsp-api-2.1-glassfish-2.1.v20100127.jar;lib\junit.jar;lib\kaon2.jar;lib\servlet-api-3.0.20100224.jar;C:\Users\Administrator\.m2\repository\org\apache\axis\axis-jaxrpc\1.4\axis-jaxrpc-1.4.jar;D:\workspace\virtstoryteller\lib\ng4j-0.8\axis.jar;C:\pf\swipl\lib\jpl.jar"
SET MAIN_CLASS=com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLMain
SET JAVA_OPTS="-Xmx12g -XX:+DoEscapeAnalysis -XX:+UseCompressedOops -XX:+UseConcMarkSweepGC -agentlib:jdwp=transport=dt_socket,address=8787,server=y,suspend=n"
java -Djava.util.Arrays.useLegacyMergeSort=true -Djava.library.path=C:\pf\swipl\bin -Dfile.encoding=Cp1252 -classpath %CLASSPATH% %MAIN_CLASS% -f "(progn (load \"init/jrtl-release-init.lisp\")  (load \"init/port-init.lisp\"))"
@REM jdk8 Initialization time = 86.539 secs.
