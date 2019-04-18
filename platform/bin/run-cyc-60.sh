#!/bin/sh
#
# $Id: run-cyc-60.sh 148919 2014-01-17 23:02:04Z daves $
# Assumes that java 1.6 or higher is in your path

#Set AGENT_LIB_PORT to 0 in order to disable remote debugging
AGENT_LIB_PORT=3679
PORT_OFFSET=60
MAIN_CLASS=com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLMain
#Set INIT_FORM to "(progn)" in order to disable initializations
#INIT_FORM="(progn)"
INIT_FORM="(progn (load \"init/jrtl-release-init.lisp\") \
  (cinc *base-tcp-port* ${PORT_OFFSET}) \
  (load \"init/port-init.lisp\"))"
BASEDIR=`dirname $0`
$BASEDIR/cyc-runner.sh "${INIT_FORM}" "${AGENT_LIB_PORT}" "${MAIN_CLASS}" "$@"
