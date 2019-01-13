#!/usr/bin/env bash

reset
stty sane
$( cls >/dev/null 2>&1)

./from_swipl.pl $@
stty sane

$(return >/dev/null 2>&1)
if [ "$?" -eq "0" ]
then
    return $RESULT_CODE
else
    exit $RESULT_CODE
fi


