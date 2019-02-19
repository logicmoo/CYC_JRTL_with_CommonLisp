#!/bin/bash

echo "$0 $@"
stty sane


if [ $# -eq 0 ]
  then
    
    export JSRCDIR=.

    (cls 2>/dev/null)
    clear
    echo "No arguments supplied outping to $JSRCDIR"
    echo ""
    #find $JSRCDIR -name "*.java" -delete -print
    echo ""
 find jsrc*/ -name "*.pl.am" -delete -print
    echo ""

find ./jsrc-gen1 -type f -name "*.pl" ! -path '*compiler*' -exec $0 $JSRCDIR "{}" jsrc-gen1 \;
find ./jsrc-gen2 -type f -name "*.pl" ! -path '*compiler*' -exec $0 $JSRCDIR "{}" jsrc-gen2 \;
#find ./jsrc-gen1 -type f -name "*.pl" -path '*compiler*' -exec $0 $JSRCDIR "{}" jsrc-gen1 \;
#find ./jsrc-gen2/tabling_dra -maxdepth 1 -type f -name "dra.pl" ! -path '*-*' -exec $0 $JSRCDIR "{}" jsrc-gen2 \;
 #find ./prolog/compiler -type f -name "*.pl" ! -path '*-*' -exec $0 $JSRCDIR "{}" jsrc-gen1-minimal \;

 #find ./library -type f -name "*.pl" ! -path '*-*' ! -path '*/http/*' ! -path '*/pldoc/*'  ! -path '*/doc_*'  ! -path '*/semweb/*' -exec $0 "{}" \;
 #find ./boot -type f -name "*.pl" ! -path '*-*' -exec $0 "{}" \;

    # $0 ./am2j.pl
    # $0 ./pl2am.pl
   
 
  else

    export BCMD="swipl -l ./jsrc-gen1/compiler/am2j.pl -- --plfile $2 --dir $1/$3"	  
    echo "$BCMD"
    stty sane
    $BCMD
    stty sane

fi

