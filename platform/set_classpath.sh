#CLASSPATH=/usr/share/ant/lib/ant-launcher.jar:/usr/share/ant/lib/ant-junit.jar:/usr/share/ant/lib/ant-swing.jar:/usr/share/ant/lib/ant-jsch.jar:/usr/share/ant/lib/ant-junit4.jar:/usr/share/ant/lib/ant-apache-xalan2.jar:/usr/share/ant/lib/ant-commons-logging.jar:/usr/share/ant/lib/ant-jdepend.jar:/usr/share/ant/lib/ant-antlr.jar:/usr/share/ant/lib/ant-apache-bsf.jar:/usr/share/ant/lib/ant.jar:/usr/share/ant/lib/ant-javamail.jar:/usr/share/ant/lib/ant-apache-log4j.jar:/usr/share/ant/lib/ant-apache-regexp.jar:/usr/share/ant/lib/ant-apache-resolver.jar:/usr/share/ant/lib/ant-apache-bcel.jar:/usr/share/ant/lib/junit.jar:/usr/share/ant/lib/ant-commons-net.jar:/usr/share/ant/lib/ant-launcher.jar:/usr/share/ant/lib/ant-jmf.jar:/usr/share/ant/lib/ant-xz.jar:/usr/share/ant/lib/ant-testutil.jar:/usr/share/ant/lib/ant-apache-oro.jar:/usr/lib/jvm/java-8-openjdk-amd64/lib/tools.jar
unset CLASSPATH

CLASSPATH=/usr/lib/jvm/java-8-openjdk-amd64/lib/tools.jar:/usr/lib/jvm/java-8-openjdk-amd64/lib/sa-jdi.jar

CPR=lib

CLASSPATH=$CLASSPATH:$(find "lib" -name '*.jar' -not -name 'ant-*jar' -not -name 'slf4*jar' -printf '%p:' | sed 's/:$//' | sed 's|/opt/CYC_JRTL_with_CommonLisp/platform/||')

CLASSPATH=$CLASSPATH:$(find "ext" -name '*.jar' -not -name 'ant.jar'  -not -name 'slf4*jar' -printf '%p:' | sed 's/:$//' | sed 's|/opt/CYC_JRTL_with_CommonLisp/platform/||')

# CLASSPATH=lib/slf4j/slf4j-api-1.5.3.jar:lib/slf4j/slf4j-log4j12-1.5.3.jar:$CLASSPATH

CLASSPATH=lib/slf4j-api-1.7.5.jar:lib/slf4j-log4j12-1.7.5.jar:$CLASSPATH

export CLASSPATH