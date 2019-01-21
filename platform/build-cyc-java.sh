#!/bin/bash

echo ""
echo ""
echo "Removing previous Build..."

rm -rf ./dist/
rm -rf ./build/

echo "Done."

echo ""
echo " Sourcing our CLASSPATH"
source set_classpath.sh
echo ""
echo CLASSPATH=$CLASSPATH
echo ""

echo ""
echo ""
echo "Ignore the below ant failure with code 255.."
echo ""
echo ""
echo "Starting build"

ant

echo ""
echo ""
echo "Ignore the above ant failure with code 255.."
echo ""
echo ""
echo "Starting final build"

ant

echo ""
echo ""
echo "Success!?"

chmod 555 *.sh
chmod 555 ./abclc
chmod 555 ./data/scg-repo-v2  -R
chmod 777 transcripts/7166/






