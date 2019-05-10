#!/bin/bash
java -Xmx512M -Xms512M -jar larkc_demonstrator.jar

if [ -a ordii-trree ] ; then
    rm -r ordii-trree
fi

