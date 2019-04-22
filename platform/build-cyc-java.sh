#!/bin/bash

path_to_executable=$(which swipl)
 if [ -x "$path_to_executable" ] ; then
    echo "It's here: $path_to_executable"
 else
    sudo apt-get install \
         build-essential autoconf curl chrpath pkg-config \
         ncurses-dev libreadline-dev libedit-dev \
         libunwind-dev \
         libgmp-dev \
         libssl-dev \
         unixodbc-dev \
         zlib1g-dev libarchive-dev \
         libossp-uuid-dev \
         libxext-dev libice-dev libjpeg-dev libxinerama-dev libxft-dev \
         libxpm-dev libxt-dev \
         libdb-dev \
         libpcre3-dev \
         libyaml-dev \
         junit
    sudo apt-add-repository ppa:swi-prolog/devel -y
    sudo apt-get update
    sudo apt-get install swi-prolog
    sudo apt-install swi-prolog
 fi

echo ""
echo ""
echo "Removing previous Build..."

rm -rf ./dist/
rm -rf ./target/

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
echo "Success!? THINK SO!"

chmod 555 *.sh
chmod 555 ./abclc
chmod 555 ./data/scg-repo-v2  -R
chmod 777 transcripts/5022/






