#!/bin/sh
#
# $Id: run-cyc-base-port.sh 148919 2014-01-17 23:02:04Z daves $
# Assumes that java 1.6 or higher is in your path
# Accepts a BASE_PORT (e.g. 3600), and optionally, other args to send to the Cyc server.

if [ -z $1 ]
then
  echo "Usage: run-cyc-base-port.sh BASE-PORT [CYC-ARGS ...]"
  exit 1
fi

BASE_PORT=$1
shift
#Set AGENT_LIB_PORT to 0 in order to disable remote debugging
AGENT_LIB_PORT=$((BASE_PORT + 19))

MAIN_CLASS=com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLMain
#Set INIT_FORM to "(progn)" in order to disable initializations
#INIT_FORM="(progn)"
INIT_FORM="(progn (load \"init/jrtl-release-init.lisp\") \
  (csetq *base-tcp-port* ${BASE_PORT}) \
  (load \"init/port-init.lisp\"))"
BASEDIR=`dirname $0`
$BASEDIR/cyc-runner.sh "${INIT_FORM}" "${AGENT_LIB_PORT}" "${MAIN_CLASS}" "$@"
