#CLASSPATH=/usr/share/ant/lib/ant-launcher.jar:/usr/share/ant/lib/ant-junit.jar:/usr/share/ant/lib/ant-swing.jar:/usr/share/ant/lib/ant-jsch.jar:/usr/share/ant/lib/ant-junit4.jar:/usr/share/ant/lib/ant-apache-xalan2.jar:/usr/share/ant/lib/ant-commons-logging.jar:/usr/share/ant/lib/ant-jdepend.jar:/usr/share/ant/lib/ant-antlr.jar:/usr/share/ant/lib/ant-apache-bsf.jar:/usr/share/ant/lib/ant.jar:/usr/share/ant/lib/ant-javamail.jar:/usr/share/ant/lib/ant-apache-log4j.jar:/usr/share/ant/lib/ant-apache-regexp.jar:/usr/share/ant/lib/ant-apache-resolver.jar:/usr/share/ant/lib/ant-apache-bcel.jar:/usr/share/ant/lib/junit.jar:/usr/share/ant/lib/ant-commons-net.jar:/usr/share/ant/lib/ant-launcher.jar:/usr/share/ant/lib/ant-jmf.jar:/usr/share/ant/lib/ant-xz.jar:/usr/share/ant/lib/ant-testutil.jar:/usr/share/ant/lib/ant-apache-oro.jar:/usr/lib/jvm/java-8-openjdk-amd64/lib/tools.jar



export PRJS=${BASH_SOURCE[0]}
export LARKC_HOME=$(dirname $( readlink -f "$PRJS" ))
if [ -z "$SWI_HOME" ]; then
  export SWI_HOME=$(dirname $(dirname $(dirname `readlink -f \`which swipl\``)))
fi

([[ -n $ZSH_EVAL_CONTEXT && $ZSH_EVAL_CONTEXT =~ :file$ ]] || 
 [[ -n $KSH_VERSION && $(cd "$(dirname -- "$0")" &&
    printf '%s' "${PWD%/}/")$(basename -- "$0") != "${.sh.file}" ]] || 
 [[ -n $BASH_VERSION ]] && (return 0 2>/dev/null)) && sourced=1 || sourced=0

if [ ${sourced} -eq 0 ]; then
 echo "ERROR: this script much no be exectured source instead!"
 echo "like#  source $0 " 
 echo "ERROR: 9"
 return 2>/dev/null || exit
fi

if [ ! -z "${BASH_ALIASES[alisp]}" ]; then
 echo ""
 echo LD_LIBRARY_PATH=$LD_LIBRARY_PATH
 return 0;
fi

export CODE_ROOT=$LARKC_HOME/site-lisp/3t
export TOOL_ROOT=$CODE_ROOT/tools
. $CODE_ROOT/bin/set_env_dci.sh

alias abcl='$LARKC_HOME/abclc --abcl '
alias alisp='$LARKC_HOME/abclc --alisp '
alias larkc='$LARKC_HOME/abclc '

unset CLASSPATH
unset LD_LIBRARY_PATH

if [ -z "$JAVA_HOME" ]; then
   export JAVA_HOME=$(readlink -f `which javac` | sed "s:/bin/javac::")
fi

if [ -z "$LD_PRELOAD" ]; then
export LD_PRELOAD=`find $SWI_HOME /usr/lib -name libswipl.so -print -quit`
fi


if [ -z "$LD_LIBRARY_PATH" ]; then
  export LD_LIBRARY_PATH=$JAVA_HOME/lib:`find $SWI_HOME -type f -name 'libjpl*' | sed -r 's|/[^/]+$||' |sort |uniq`:/usr/lib/guile/2.2/extensions:.
fi

if [ -z "$CLASSPATH" ]; then

CLASSPATH=$JAVA_HOME/lib/tools.jar


CPR=$LARKC_HOME/lib

CLASSPATH=$CLASSPATH:$(find $LARKC_HOME/lib -name '*.jar' -not -name 'ant-*jar' -not -name 'slf4*jar' -printf '%p:' | sed 's/:$//' )

#CLASSPATH=$CLASSPATH:$(find "lib" -name '*.jar' -not -name 'ant-*jar' -not -name 'slf4*jar' -printf '%p:' | sed 's/:$//' | sed 's|$LARKC_HOME/||')

CLASSPATH=$CLASSPATH:$(find $LARKC_HOME/ext -name '*.jar' -not -name 'ant.jar'  -not -name 'slf4*jar' -printf '%p:' | sed 's/:$//' )

#CLASSPATH=$CLASSPATH:$(find "ext" -name '*.jar' -not -name 'ant.jar'  -not -name 'slf4*jar' -printf '%p:' | sed 's/:$//' | sed 's|$LARKC_HOME/||')

# CLASSPATH=lib/slf4j/slf4j-api-1.5.3.jar:lib/slf4j/slf4j-log4j12-1.5.3.jar:$CLASSPATH

CLASSPATH=$CPR/slf4j-api-1.7.5.jar:$CPR/slf4j-log4j12-1.7.5.jar:$CLASSPATH

# hides the unhacked version
# cat /dev/null > jpl.jar

CLASSPATH=$LARKC_HOME/target/classes:$LARKC_HOME/dist/abcl-contrib.jar:$CLASSPATH


CLASSPATH=$LARKC_HOME/jpl.jar:$CLASSPATH

export CLASSPATH

fi


export LD_LIBRARY_PATH=`find $JAVA_HOME -type f -name 'libjvm*' | sed -r 's|/[^/]+$||' |sort |uniq`:$LD_LIBRARY_PATH

echo LD_LIBRARY_PATH=$LD_LIBRARY_PATH
echo JAVA_HOME=$JAVA_HOME
echo LD_PRELOAD=$LD_PRELOAD
echo LARKC_HOME=$LARKC_HOME
echo SWI_HOME=$SWI_HOME


echo "while sleep 1; do ./run-cyc-java.sh; done"
echo "true ; while [ $? -ne 4 ]; do sleep 1 ; ./From_Prolog.sh ; done"

